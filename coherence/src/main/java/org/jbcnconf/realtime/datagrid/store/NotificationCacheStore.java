package org.jbcnconf.realtime.datagrid.store;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.tangosol.net.cache.CacheStore;
import com.tangosol.util.Base;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.jbcnconf.realtime.common.model.datagrid.StockKey;
import org.jbcnconf.realtime.common.model.datagrid.StockValue;
import org.jbcnconf.realtime.common.model.kafka.StockNotifyValue;

import java.util.*;


public class NotificationCacheStore extends Base implements CacheStore<StockKey, StockValue>{

    private Producer<String, String> producer;

    private String cacheName = "STOCK";

    @Override
    public void store(StockKey stockKey, StockValue stockValue) {
        produceMessage(stockValue,stockKey.hashCode());
    }

    @Override
    public void storeAll(Map<? extends StockKey, ? extends StockValue> stockMap){

        Map<StockKey, StockValue> notifMap = new HashMap();
        for (Map.Entry<? extends StockKey, ? extends StockValue> entry : stockMap.entrySet()) {
            produceMessage(entry.getValue(),entry.getKey().hashCode());

        }

    }

    @Override
    public void erase(StockKey stockKey) {}

    @Override
    public void eraseAll(Collection<? extends StockKey> stockKeys) {}

    @Override
    public StockValue load(StockKey stockKey) {
        return null;
    }

    @Override
    public Map<StockKey, StockValue> loadAll(Collection<? extends StockKey> collection) {
        return null;
    }

    private void produceMessage(StockValue stockValue, int hashcode){
        try {
            System.out.println(stockValue.toString());
            final Properties props = new Properties();
            props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "kafka:9092");
            props.put(ProducerConfig.CLIENT_ID_CONFIG, "coherence");
            props.put(ProducerConfig.ACKS_CONFIG, "all");
            props.put(ProducerConfig.RETRIES_CONFIG, 0);
            props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
            props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);

            producer = new KafkaProducer<String, String>(props);
            StockNotifyValue stockNotifyValue = new StockNotifyValue(System.currentTimeMillis(), stockValue.getStoreId(),stockValue.getSku(),stockValue.getRfidLocationId(),stockValue.getQuantity() );
            ObjectMapper objectMapper = new ObjectMapper();
            final ProducerRecord<String, String> record = new ProducerRecord<String, String>(cacheName, String.valueOf(stockValue.getStoreId()), objectMapper.writeValueAsString(stockNotifyValue));
            producer.send(record);
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            producer.flush();
            producer.close();
        }
    }
}

package org.jbcnconf.realtime.processor.kafka;


import org.jbcnconf.realtime.processor.process.StockCalculation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.jbcnconf.realtime.common.model.kafka.RfidEvent;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * Message Listener to consume kafka records
 *
 * @author Miguel Garcia
 */
@Service
public class MessageEventConsumer {

    @Value( "${spring.kafka.bootstrap}" )
    private String bootstrap;

    @Value( "${spring.kafka.groupid}" )
    private String groupId;

    @Value( "${spring.coherence.stock}" )
    private String cacheName;

    @Autowired
    StockCalculation stockCalculation;

    /**
     * @param rfidEvent
     */
    @KafkaListener(topics="${spring.kafka.topic}")
    public void onMessage(RfidEvent rfidEvent) {

        try {
            stockCalculation.processStock(rfidEvent.getStoreId(), rfidEvent.getSku(), rfidEvent.getFrom(), rfidEvent.getTo(), cacheName);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

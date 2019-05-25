package org.jbcnconf.realtime.processor.process;

import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;
import org.jbcnconf.realtime.common.datagrid.processor.AddStockEntryProcessor;
import org.jbcnconf.realtime.common.datagrid.processor.RemoveStockEntryProcessor;
import org.jbcnconf.realtime.common.model.datagrid.StockKey;
import org.jbcnconf.realtime.common.model.datagrid.StockValue;
import org.springframework.stereotype.Component;

/**
 * Stock Calculation process, there are two procedure to increase and decrease operations
 *
 * @author Miguel Garcia
 */
@Component("stockCalculation")
public class StockCalculation {

    public StockCalculation(){};

    /**
     * @param storeId
     * @param sku
     * @param from
     * @param to
     * @param cacheName
     */
    public void processStock(Integer storeId, Long sku, Integer from, Integer to, String cacheName){

        try{

            addStock(storeId, sku,to,cacheName);
            removeStock(storeId, sku,from,cacheName);

        }catch(Exception ex){
            ex.printStackTrace();
        }

    }

    /**
     * @param storeId
     * @param sku
     * @param to
     * @param cacheName
     */
    public void addStock(Integer storeId, Long sku, Integer to, String cacheName){

        NamedCache cache  = CacheFactory.getCache(cacheName);

        if(to != null) {

            // There is a new item in location to.
            StockKey key = new StockKey(storeId, sku,to);
            StockValue value = new StockValue(storeId, sku,to,1);

            // It's the first item in this location
            if (cache.containsKey(key)) {
                // Add item
                cache.invoke(key, new AddStockEntryProcessor(key.getStoreId()));
            } else {
                // there is already an item in this location
                cache.put(key, value);
            }
        }

    };

    /**
     * @param storeId
     * @param sku
     * @param from
     * @param cacheName
     */
    public void removeStock(Integer storeId, Long sku, Integer from, String cacheName){

        if(from != null){
            NamedCache cache  = CacheFactory.getCache(cacheName);
            // There's one less item in the location from.
            StockKey key = new StockKey(storeId, sku,from);
            StockValue value = new StockValue(storeId, sku,from,-1);

            // It's the first item in this location
            if(cache.containsKey(key)) {
                // Remove an item
                cache.invoke(key, new RemoveStockEntryProcessor(key.getStoreId()));
            }else{
                // there is already an item in this location
                cache.put(key,value);
            }
        }

    }

}

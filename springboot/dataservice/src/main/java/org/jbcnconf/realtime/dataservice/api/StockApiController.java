package org.jbcnconf.realtime.dataservice.api;

import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;
import com.tangosol.util.Filter;
import com.tangosol.util.ValueExtractor;

import com.tangosol.util.extractor.ReflectionExtractor;
import com.tangosol.util.filter.EqualsFilter;
import org.jbcnconf.realtime.common.model.datagrid.StockValue;
import org.jbcnconf.realtime.dataservice.model.RfidLocation;
import org.jbcnconf.realtime.dataservice.model.Sku;
import org.jbcnconf.realtime.dataservice.model.Stock;
import org.jbcnconf.realtime.dataservice.model.StockResponseWrapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.jbcnconf.realtime.dataservice.utils.GenericMetadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Value;

import javax.servlet.http.HttpServletRequest;


import java.util.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-08T05:59:09.630Z")

@Controller
public class StockApiController implements StockApi {

    @Value("${api.version}")
    private String version;

    @Value("${spring.coherence.stock}")
    private String cacheName;

    private static final Logger log = LoggerFactory.getLogger(StockApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public StockApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<StockResponseWrapper> stockStoreIdGet(@ApiParam(value = "Store Id",required=true) @PathVariable("storeId") Integer storeId) {
        long initRequest = System.currentTimeMillis();
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                StockResponseWrapper stockResponseWrapper = new StockResponseWrapper();
                Stock stock = new Stock();
                stock.setStoreId(storeId);
                Map<Long, List<RfidLocation>> map = new HashMap<>();
                NamedCache stockCache = CacheFactory.getCache(cacheName);
                //Extract a derived value from the target object that is passed as an argument to the extract method
                ValueExtractor extractor = new ReflectionExtractor("getStoreId");
                //Query to look up stock store by sku
                Filter filter = new EqualsFilter(extractor, storeId);
                for (Iterator iter = stockCache.entrySet(filter).iterator(); iter.hasNext(); )
                {
                    // Create a map to model the response, to provide stock information by stock, skus arrays.
                    // Each sku has a list of locations and the stock in each one
                    Map.Entry entry = (Map.Entry)iter.next();
                    StockValue stockValue = (StockValue) entry.getValue();
                    RfidLocation rfidLocation = new RfidLocation();
                    rfidLocation.setRfidLocationId(stockValue.getRfidLocationId());
                    rfidLocation.setQuantity(stockValue.getQuantity());
                    List<RfidLocation> list;
                    // If sku exist then get the list and add new sku/location/quantity
                    // else create a new list and add the first sku/location/quantity
                    if(map.containsKey(stockValue.getSku())){
                        list = map.get(stockValue.getSku());
                    }else{
                        list = new ArrayList<>();
                        map.put(stockValue.getSku(),list);
                    }
                    list.add(rfidLocation);
                }

                // Create response entity
                List<Sku> skus = new ArrayList<>();
                map.forEach((k, v) -> {
                        Sku sku = new Sku();
                        sku.setSku(k);
                        sku.setRfidLocations(v);
                        skus.add(sku);
                    });
                stock.setSkus(skus);
                stockResponseWrapper.addDataItem(stock);
                // Metadata information
                stockResponseWrapper.setMetadata(GenericMetadata.getMetadata(this.version, initRequest, request.getRequestURL().toString()));

                return new ResponseEntity<StockResponseWrapper>(stockResponseWrapper,HttpStatus.OK);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<StockResponseWrapper>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        return new ResponseEntity<StockResponseWrapper>(HttpStatus.NOT_IMPLEMENTED);
    }

}

package org.jbcnconf.realtime.common.model.datagrid;

import java.util.Objects;
import com.tangosol.io.pof.annotation.Portable;
import com.tangosol.io.pof.annotation.PortableProperty;


/**
 * Key of stock entity, this entity has the stock of a product at each store location. The key is composed by Store Id, SKU and location
 *
 * @author Miguel Garcia
 */
@Portable
public class StockKey  {

    private static final long serialVersionUID = 187441115425351168L;

    @PortableProperty(0)
    private Integer storeId;

    @PortableProperty(1)
    private Long sku;

    @PortableProperty(2)
    private Integer rfidLocationId;

    public StockKey() {}

    /**
     * @param storeId
     * @param sku
     * @param rfidLocationId
     */
    public StockKey(Integer storeId, Long sku, Integer rfidLocationId) {
        this.storeId = storeId;
        this.sku = sku;
        this.rfidLocationId = rfidLocationId;
    }

    /**
     * @return
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @return
     */
    public Integer getStoreId() {
        return storeId;
    }

    /**
     * @param storeId
     */
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    /**
     * @return
     */
    public Long getSku() {
        return sku;
    }

    /**
     * @param sku
     */
    public void setSku(Long sku) {
        this.sku = sku;
    }

    /**
     * @return
     */
    public Integer getRfidLocationId() {
        return rfidLocationId;
    }

    /**
     * @param rfidLocationId
     */
    public void setRfidLocationId(Integer rfidLocationId) {
        this.rfidLocationId = rfidLocationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockKey stockKey = (StockKey) o;
        return storeId == stockKey.storeId &&
                rfidLocationId == stockKey.rfidLocationId &&
                Objects.equals(sku, stockKey.sku);
    }



    @Override
    public String toString() {
        return "StockKey{" +
                "storeId=" + storeId +
                ", sku='" + sku + '\'' +
                ", rfidLocationId=" + rfidLocationId +
                '}';
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + storeId.hashCode();
        result = prime * result + sku.hashCode();
        result = prime * result + rfidLocationId.hashCode();
        return result;
    }
}

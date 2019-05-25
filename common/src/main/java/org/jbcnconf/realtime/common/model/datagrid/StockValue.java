package org.jbcnconf.realtime.common.model.datagrid;

import java.util.Objects;

import com.tangosol.io.pof.annotation.Portable;
import com.tangosol.io.pof.annotation.PortableProperty;


/**
 * Stock  value entity, this entity has the stock of a product at each store location.
 *
 * @author Miguel Garcia
 */
@Portable
public class StockValue {

    private static final long serialVersionUID = 1874340015425351168L;

    @PortableProperty(0)
    private int storeId;

    @PortableProperty(1)
    private long sku;

    @PortableProperty(2)
    private int rfidLocationId;

    @PortableProperty(3)
    private int quantity;

    public StockValue(){}

    /**
     * @param storeId
     * @param sku
     * @param rfidLocationId
     * @param quantity
     */
    public StockValue(int storeId, long sku, int rfidLocationId, int quantity) {
        this.storeId = storeId;
        this.sku = sku;
        this.rfidLocationId = rfidLocationId;
        this.quantity = quantity;
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
    public int getStoreId() {
        return storeId;
    }

    /**
     * @param storeId
     */
    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    /**
     * @return
     */
    public long getSku() {
        return sku;
    }

    /**
     * @param sku
     */
    public void setSku(long sku) {
        this.sku = sku;
    }

    /**
     * @return
     */
    public int getRfidLocationId() {
        return rfidLocationId;
    }

    /**
     * @param rfidLocationId
     */
    public void setRfidLocationId(int rfidLocationId) {
        this.rfidLocationId = rfidLocationId;
    }

    /**
     * @return
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Increases by one unit the stock
     */
    public void addStock(){
        this.quantity++;
    }

    /**
     * Decreases by one unit the stock
     */
    public void removeStock(){
        this.quantity--;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockValue that = (StockValue) o;
        return storeId == that.storeId &&
                rfidLocationId == that.rfidLocationId &&
                quantity == that.quantity &&
                Objects.equals(sku, that.sku);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeId, sku, rfidLocationId, quantity);
    }

    @Override
    public String toString() {
        return "StockNotifyValue{" +
                "storeId=" + storeId +
                ", sku='" + sku + '\'' +
                ", rfidLocationId=" + rfidLocationId +
                ", quantity=" + quantity +
                '}';
    }
}

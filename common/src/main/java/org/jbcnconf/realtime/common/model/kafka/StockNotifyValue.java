package org.jbcnconf.realtime.common.model.kafka;

import java.io.Serializable;
import java.util.Objects;


/**
 *  Message for the notification of stock status of each item
 *
 * @author Miguel Garcia
 */
public class StockNotifyValue implements Serializable {

    private static final long serialVersionUID = 8874340015425351168L;

    private Long id;

    private Integer storeId;

    private Long sku;

    private Integer rfidLocationId;

    private Integer quantity;

    public StockNotifyValue(){}

    /**
     * @param id
     * @param storeId
     * @param sku
     * @param rfidLocationId
     * @param quantity
     */
    public StockNotifyValue(Long id, Integer storeId, Long sku, Integer rfidLocationId, Integer quantity) {
        this.id = id;
        this.storeId = storeId;
        this.sku = sku;
        this.rfidLocationId = rfidLocationId;
        this.quantity = quantity;
    }


    /**
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
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

    /**
     * @return
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * @param quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockNotifyValue that = (StockNotifyValue) o;
        return id == that.id &&
                storeId == that.storeId &&
                rfidLocationId == that.rfidLocationId &&
                quantity == that.quantity &&
                Objects.equals(sku, that.sku);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, storeId, sku, rfidLocationId, quantity);
    }

    @Override
    public String toString() {
        return "StockNotifyValue{" +
                "id=" + id +
                ", storeId=" + storeId +
                ", sku='" + sku + '\'' +
                ", rfidLocationId=" + rfidLocationId +
                ", quantity=" + quantity +
                '}';
    }
}

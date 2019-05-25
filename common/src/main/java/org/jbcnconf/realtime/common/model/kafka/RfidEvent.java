package org.jbcnconf.realtime.common.model.kafka;

import java.io.Serializable;
import java.util.Objects;


/**
 * Kafka rfid event entity, when an article moves it generates a change event from one location to another
 *
 * @author Miguel Garcia
 */
public class RfidEvent implements Serializable {

    private static final long serialVersionUID = 587441115425351168L;

    private Long id;

    private Integer storeId;

    private Long sku;

    private Integer from;

    private Integer to;

    public RfidEvent(){}

    /**
     * @param id
     * @param storeId
     * @param sku
     * @param from
     * @param to
     */
    public RfidEvent(Long id, Integer storeId, Long sku, Integer from, Integer to) {
        this.id = id;
        this.storeId = storeId;
        this.sku = sku;
        this.from = from;
        this.to = to;
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
    public Integer getFrom() {
        return from;
    }

    /**
     * @param from
     */
    public void setFrom(Integer from) {
        this.from = from;
    }

    /**
     * @return
     */
    public Integer getTo() {
        return to;
    }

    /**
     * @param to
     */
    public void setTo(Integer to) {
        this.to = to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RfidEvent rfidEvent = (RfidEvent) o;
        return id == rfidEvent.id &&
                storeId == rfidEvent.storeId &&
                from == rfidEvent.from &&
                to == rfidEvent.to &&
                Objects.equals(sku, rfidEvent.sku);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, storeId, sku, from, to);
    }

    @Override
    public String toString() {
        return "EventValue{" +
                "id=" + id +
                ", storeId=" + storeId +
                ", sku='" + sku + '\'' +
                ", from=" + from +
                ", to=" + to +
                '}';
    }
}

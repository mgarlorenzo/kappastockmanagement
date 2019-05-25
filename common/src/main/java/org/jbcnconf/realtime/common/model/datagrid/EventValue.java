package org.jbcnconf.realtime.common.model.datagrid;

import com.tangosol.io.pof.annotation.Portable;
import com.tangosol.io.pof.annotation.PortableProperty;

import java.io.Serializable;
import java.util.Objects;



/**
 * Value entity of movement event, when an article moves it generates a change event from one location to another
 *
 * @author Miguel Garcia
 */
@Portable
public class EventValue implements Serializable {

    private static final long serialVersionUID = 287441115425351168L;

    @PortableProperty(0)
    private Long id;

    @PortableProperty(1)
    private Integer storeId;

    @PortableProperty(2)
    private Long sku;

    @PortableProperty(3)
    private Integer from;

    @PortableProperty(4)
    private Integer to;

    /**
     * @param id
     * @param storeId
     * @param sku
     * @param from
     * @param to
     */
    public EventValue(Long id, Integer storeId, Long sku, Integer from, Integer to) {
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
        EventValue eventValue = (EventValue) o;
        return id == eventValue.id &&
                storeId == eventValue.storeId &&
                from == eventValue.from &&
                to == eventValue.to &&
                Objects.equals(sku, eventValue.sku);
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

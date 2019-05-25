package org.jbcnconf.realtime.common.model.datagrid;

import java.util.Objects;

import com.tangosol.io.pof.annotation.Portable;

import java.io.Serializable;

/**
 * Key of movement event entity, when an article moves it generates a change event from one location to another
 *
 * @author Miguel Garcia
 */
@Portable
public class EventKey implements Serializable {

    private static final long serialVersionUID = 3874340015425351168L;

    private Integer storeId;

    private Long id;

    /**
     * @param storeId
     * @param id
     */
    public EventKey(Integer storeId, Long id) {
        this.storeId = storeId;
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
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventKey eventKey = (EventKey) o;
        return storeId == eventKey.storeId &&
                id == eventKey.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeId, id);
    }

    @Override
    public String toString() {
        return "EventKey{" +
                "storeId=" + storeId +
                ", id=" + id +
                '}';
    }
}

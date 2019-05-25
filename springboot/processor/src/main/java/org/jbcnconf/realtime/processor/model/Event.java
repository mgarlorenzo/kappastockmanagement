package org.jbcnconf.realtime.processor.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * Event
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-04-30T14:31:01.066Z[GMT]")
public class Event   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("storeId")
  private Integer storeId = null;

  @JsonProperty("sku")
  private Long sku = null;

  @JsonProperty("from")
  private Integer from = null;

  @JsonProperty("to")
  private Integer to = null;

  public Event id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Event Id
   * @return id
  **/
  @ApiModelProperty(value = "Event Id")

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Event store(Integer store) {
    this.storeId = store;
    return this;
  }

  /**
   * Store id code
   * @return storeId
  **/
  @ApiModelProperty(value = "Store id code")

  public Integer getStoreId() {
    return storeId;
  }

  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }

  public Event sku(Long sku) {
    this.sku = sku;
    return this;
  }

  /**
   * Location From code
   * @return from
   **/
  @ApiModelProperty(value = "Location from")

  public Integer getFrom() {
    return from;
  }

  public void setFrom(Integer from) {
    this.from = from;
  }

  public Event from(Integer from) {
    this.from = from;
    return this;
  }

  /**
   * Store id code
   * @return storeId
   **/
  @ApiModelProperty(value = "Location to")

  public Integer getTo() {
    return to;
  }

  public void setTo(Integer to) {
    this.to = to;
  }

  public Event to(Integer to) {
    this.to = to;
    return this;
  }

  /**
   * Business product type code
   * @return sku
  **/
  @ApiModelProperty(value = "Business product type code")

  public Long getSku() {
    return sku;
  }

  public void setSku(Long sku) {
    this.sku = sku;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.id, event.id) &&
        Objects.equals(this.storeId, event.storeId) &&
        Objects.equals(this.sku, event.sku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, storeId, sku, from, to);
  }



  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  @Override
  public String toString() {
    return "Event{" +
            "id=" + id +
            ", storeId=" + storeId +
            ", sku=" + sku +
            ", from=" + from +
            ", to=" + to +
            '}';
  }
}

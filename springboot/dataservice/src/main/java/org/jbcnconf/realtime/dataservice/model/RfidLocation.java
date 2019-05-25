package org.jbcnconf.realtime.dataservice.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RfidLocation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-09T17:36:18.993Z")

public class RfidLocation   {
  @JsonProperty("rfidLocationId")
  private Integer rfidLocationId = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  public RfidLocation rfidLocationId(Integer rfidLocationId) {
    this.rfidLocationId = rfidLocationId;
    return this;
  }

  /**
   * Location id
   * @return rfidLocationId
  **/
  @ApiModelProperty(value = "Location id")


  public Integer getRfidLocationId() {
    return rfidLocationId;
  }

  public void setRfidLocationId(Integer rfidLocationId) {
    this.rfidLocationId = rfidLocationId;
  }

  public RfidLocation quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Stock quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "Stock quantity")


  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RfidLocation rfidLocation = (RfidLocation) o;
    return Objects.equals(this.rfidLocationId, rfidLocation.rfidLocationId) &&
        Objects.equals(this.quantity, rfidLocation.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rfidLocationId, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RfidLocation {\n");
    
    sb.append("    rfidLocationId: ").append(toIndentedString(rfidLocationId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("}");
    return sb.toString();
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
}


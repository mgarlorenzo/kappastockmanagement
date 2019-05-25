package org.jbcnconf.realtime.dataservice.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Sku
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-09T17:49:38.390Z")

public class Sku   {
  @JsonProperty("sku")
  private Long sku = null;

  @JsonProperty("rfidLocations")
  @Valid
  private List<RfidLocation> rfidLocations = null;

  public Sku sku(Long sku) {
    this.sku = sku;
    return this;
  }

  /**
   * Unique number assigned to a product
   * @return sku
  **/
  @ApiModelProperty(value = "Unique number assigned to a product")


  public Long getSku() {
    return sku;
  }

  public void setSku(Long sku) {
    this.sku = sku;
  }

  public Sku rfidLocations(List<RfidLocation> rfidLocations) {
    this.rfidLocations = rfidLocations;
    return this;
  }

  public Sku addRfidLocationsItem(RfidLocation rfidLocationsItem) {
    if (this.rfidLocations == null) {
      this.rfidLocations = new ArrayList<RfidLocation>();
    }
    this.rfidLocations.add(rfidLocationsItem);
    return this;
  }

  /**
   * Items location
   * @return rfidLocations
  **/
  @ApiModelProperty(value = "Items location")

  @Valid

  public List<RfidLocation> getRfidLocations() {
    return rfidLocations;
  }

  public void setRfidLocations(List<RfidLocation> rfidLocations) {
    this.rfidLocations = rfidLocations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sku sku = (Sku) o;
    return Objects.equals(this.sku, sku.sku) &&
        Objects.equals(this.rfidLocations, sku.rfidLocations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku, rfidLocations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sku {\n");
    
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    rfidLocations: ").append(toIndentedString(rfidLocations)).append("\n");
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


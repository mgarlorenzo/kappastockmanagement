package org.jbcnconf.realtime.dataservice.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Stock
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-09T17:36:18.993Z")

public class Stock   {
  @JsonProperty("storeId")
  private Integer storeId = null;

  @JsonProperty("skus")
  @Valid
  private List<Sku> skus = null;

  public Stock storeId(Integer storeId) {
    this.storeId = storeId;
    return this;
  }

  /**
   * Store id
   * @return storeId
  **/
  @ApiModelProperty(value = "Store id")


  public Integer getStoreId() {
    return storeId;
  }

  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }

  public Stock sku(List<Sku> sku) {
    this.skus = sku;
    return this;
  }

  public Stock addSkuItem(Sku skuItem) {
    if (this.skus == null) {
      this.skus = new ArrayList<Sku>();
    }
    this.skus.add(skuItem);
    return this;
  }

  /**
   * Business product type code
   * @return skus
  **/
  @ApiModelProperty(value = "Business product type code")

  @Valid

  public List<Sku> getSkus() {
    return skus;
  }

  public void setSkus(List<Sku> skus) {
    this.skus = skus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stock stock = (Stock) o;
    return Objects.equals(this.storeId, stock.storeId) &&
        Objects.equals(this.skus, stock.skus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, skus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stock {\n");
    
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    skus: ").append(toIndentedString(skus)).append("\n");
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


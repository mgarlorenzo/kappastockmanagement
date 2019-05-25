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
 * StockResponseWrapper
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-09T17:36:18.993Z")

public class StockResponseWrapper   {
  @JsonProperty("data")
  @Valid
  private List<Stock> data = null;

  @JsonProperty("metadata")
  private Metadata metadata = null;

  public StockResponseWrapper data(List<Stock> data) {
    this.data = data;
    return this;
  }

  public StockResponseWrapper addDataItem(Stock dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<Stock>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Response data wrapper
   * @return data
  **/
  @ApiModelProperty(value = "Response data wrapper")

  @Valid

  public List<Stock> getData() {
    return data;
  }

  public void setData(List<Stock> data) {
    this.data = data;
  }

  public StockResponseWrapper metadata(Metadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Metadata getMetadata() {
    return metadata;
  }

  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockResponseWrapper stockResponseWrapper = (StockResponseWrapper) o;
    return Objects.equals(this.data, stockResponseWrapper.data) &&
        Objects.equals(this.metadata, stockResponseWrapper.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockResponseWrapper {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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


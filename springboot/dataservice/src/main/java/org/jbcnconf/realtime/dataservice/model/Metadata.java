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
 * Metadata
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-09T17:36:18.993Z")

public class Metadata   {
  @JsonProperty("apiVersion")
  private String apiVersion = null;

  @JsonProperty("items_count")
  private Long itemsCount = null;

  @JsonProperty("items_from")
  private Long itemsFrom = null;

  @JsonProperty("items_to")
  private Long itemsTo = null;

  @JsonProperty("items_total")
  private Long itemsTotal = null;

  @JsonProperty("links")
  @Valid
  private List<Link> links = null;

  @JsonProperty("page")
  private Long page = null;

  @JsonProperty("pages_total")
  private Long pagesTotal = null;

  @JsonProperty("requestTimestamp")
  private String requestTimestamp = null;

  @JsonProperty("responseTimestamp")
  private String responseTimestamp = null;

  @JsonProperty("self")
  private String self = null;

  public Metadata apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Get apiVersion
   * @return apiVersion
  **/
  @ApiModelProperty(value = "")


  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public Metadata itemsCount(Long itemsCount) {
    this.itemsCount = itemsCount;
    return this;
  }

  /**
   * Get itemsCount
   * @return itemsCount
  **/
  @ApiModelProperty(value = "")


  public Long getItemsCount() {
    return itemsCount;
  }

  public void setItemsCount(Long itemsCount) {
    this.itemsCount = itemsCount;
  }

  public Metadata itemsFrom(Long itemsFrom) {
    this.itemsFrom = itemsFrom;
    return this;
  }

  /**
   * Get itemsFrom
   * @return itemsFrom
  **/
  @ApiModelProperty(value = "")


  public Long getItemsFrom() {
    return itemsFrom;
  }

  public void setItemsFrom(Long itemsFrom) {
    this.itemsFrom = itemsFrom;
  }

  public Metadata itemsTo(Long itemsTo) {
    this.itemsTo = itemsTo;
    return this;
  }

  /**
   * Get itemsTo
   * @return itemsTo
  **/
  @ApiModelProperty(value = "")


  public Long getItemsTo() {
    return itemsTo;
  }

  public void setItemsTo(Long itemsTo) {
    this.itemsTo = itemsTo;
  }

  public Metadata itemsTotal(Long itemsTotal) {
    this.itemsTotal = itemsTotal;
    return this;
  }

  /**
   * Get itemsTotal
   * @return itemsTotal
  **/
  @ApiModelProperty(value = "")


  public Long getItemsTotal() {
    return itemsTotal;
  }

  public void setItemsTotal(Long itemsTotal) {
    this.itemsTotal = itemsTotal;
  }

  public Metadata links(List<Link> links) {
    this.links = links;
    return this;
  }

  public Metadata addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<Link>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }

  public Metadata page(Long page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")


  public Long getPage() {
    return page;
  }

  public void setPage(Long page) {
    this.page = page;
  }

  public Metadata pagesTotal(Long pagesTotal) {
    this.pagesTotal = pagesTotal;
    return this;
  }

  /**
   * Get pagesTotal
   * @return pagesTotal
  **/
  @ApiModelProperty(value = "")


  public Long getPagesTotal() {
    return pagesTotal;
  }

  public void setPagesTotal(Long pagesTotal) {
    this.pagesTotal = pagesTotal;
  }

  public Metadata requestTimestamp(String requestTimestamp) {
    this.requestTimestamp = requestTimestamp;
    return this;
  }

  /**
   * Get requestTimestamp
   * @return requestTimestamp
  **/
  @ApiModelProperty(value = "")


  public String getRequestTimestamp() {
    return requestTimestamp;
  }

  public void setRequestTimestamp(String requestTimestamp) {
    this.requestTimestamp = requestTimestamp;
  }

  public Metadata responseTimestamp(String responseTimestamp) {
    this.responseTimestamp = responseTimestamp;
    return this;
  }

  /**
   * Get responseTimestamp
   * @return responseTimestamp
  **/
  @ApiModelProperty(value = "")


  public String getResponseTimestamp() {
    return responseTimestamp;
  }

  public void setResponseTimestamp(String responseTimestamp) {
    this.responseTimestamp = responseTimestamp;
  }

  public Metadata self(String self) {
    this.self = self;
    return this;
  }

  /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")


  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metadata metadata = (Metadata) o;
    return Objects.equals(this.apiVersion, metadata.apiVersion) &&
        Objects.equals(this.itemsCount, metadata.itemsCount) &&
        Objects.equals(this.itemsFrom, metadata.itemsFrom) &&
        Objects.equals(this.itemsTo, metadata.itemsTo) &&
        Objects.equals(this.itemsTotal, metadata.itemsTotal) &&
        Objects.equals(this.links, metadata.links) &&
        Objects.equals(this.page, metadata.page) &&
        Objects.equals(this.pagesTotal, metadata.pagesTotal) &&
        Objects.equals(this.requestTimestamp, metadata.requestTimestamp) &&
        Objects.equals(this.responseTimestamp, metadata.responseTimestamp) &&
        Objects.equals(this.self, metadata.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, itemsCount, itemsFrom, itemsTo, itemsTotal, links, page, pagesTotal, requestTimestamp, responseTimestamp, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metadata {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    itemsCount: ").append(toIndentedString(itemsCount)).append("\n");
    sb.append("    itemsFrom: ").append(toIndentedString(itemsFrom)).append("\n");
    sb.append("    itemsTo: ").append(toIndentedString(itemsTo)).append("\n");
    sb.append("    itemsTotal: ").append(toIndentedString(itemsTotal)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pagesTotal: ").append(toIndentedString(pagesTotal)).append("\n");
    sb.append("    requestTimestamp: ").append(toIndentedString(requestTimestamp)).append("\n");
    sb.append("    responseTimestamp: ").append(toIndentedString(responseTimestamp)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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


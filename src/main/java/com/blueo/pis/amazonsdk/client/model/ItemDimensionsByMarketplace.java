/*
 * Selling Partner API for Catalog Items
 * The Selling Partner API for Catalog Items provides programmatic access to information about items in the Amazon catalog.  For more information, refer to the [Catalog Items API Use Case Guide](doc:catalog-items-api-v2022-04-01-use-case-guide).
 *
 * OpenAPI spec version: 2022-04-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.blueo.pis.amazonsdk.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.blueo.pis.amazonsdk.client.model.Dimensions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Dimensions associated with the item in the Amazon catalog for the indicated Amazon marketplace.
 */
@ApiModel(description = "Dimensions associated with the item in the Amazon catalog for the indicated Amazon marketplace.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-06-23T14:54:15.256+08:00")
public class ItemDimensionsByMarketplace {
  @SerializedName("marketplaceId")
  private String marketplaceId = null;

  @SerializedName("item")
  private Dimensions item = null;

  @SerializedName("package")
  private Dimensions _package = null;

  public ItemDimensionsByMarketplace marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * Amazon marketplace identifier.
   * @return marketplaceId
  **/
  @ApiModelProperty(required = true, value = "Amazon marketplace identifier.")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public ItemDimensionsByMarketplace item(Dimensions item) {
    this.item = item;
    return this;
  }

   /**
   * Dimensions of an Amazon catalog item.
   * @return item
  **/
  @ApiModelProperty(value = "Dimensions of an Amazon catalog item.")
  public Dimensions getItem() {
    return item;
  }

  public void setItem(Dimensions item) {
    this.item = item;
  }

  public ItemDimensionsByMarketplace _package(Dimensions _package) {
    this._package = _package;
    return this;
  }

   /**
   * Dimensions of an Amazon catalog item in its packaging.
   * @return _package
  **/
  @ApiModelProperty(value = "Dimensions of an Amazon catalog item in its packaging.")
  public Dimensions getPackage() {
    return _package;
  }

  public void setPackage(Dimensions _package) {
    this._package = _package;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemDimensionsByMarketplace itemDimensionsByMarketplace = (ItemDimensionsByMarketplace) o;
    return Objects.equals(this.marketplaceId, itemDimensionsByMarketplace.marketplaceId) &&
        Objects.equals(this.item, itemDimensionsByMarketplace.item) &&
        Objects.equals(this._package, itemDimensionsByMarketplace._package);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceId, item, _package);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDimensionsByMarketplace {\n");
    
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


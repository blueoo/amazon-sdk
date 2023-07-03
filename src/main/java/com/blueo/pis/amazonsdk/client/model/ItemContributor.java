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
import com.blueo.pis.amazonsdk.client.model.ItemContributorRole;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Individual contributor to the creation of an item, such as an author or actor.
 */
@ApiModel(description = "Individual contributor to the creation of an item, such as an author or actor.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-06-23T14:54:15.256+08:00")
public class ItemContributor {
  @SerializedName("role")
  private ItemContributorRole role = null;

  @SerializedName("value")
  private String value = null;

  public ItemContributor role(ItemContributorRole role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(required = true, value = "")
  public ItemContributorRole getRole() {
    return role;
  }

  public void setRole(ItemContributorRole role) {
    this.role = role;
  }

  public ItemContributor value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Name of the contributor, such as Jane Austen.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "Name of the contributor, such as Jane Austen.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemContributor itemContributor = (ItemContributor) o;
    return Objects.equals(this.role, itemContributor.role) &&
        Objects.equals(this.value, itemContributor.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemContributor {\n");
    
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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


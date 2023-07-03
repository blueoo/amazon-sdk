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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Description of a brand that can be used to get more fine-grained search results.
 */
@ApiModel(description = "Description of a brand that can be used to get more fine-grained search results.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-06-23T14:54:15.256+08:00")
public class BrandRefinement {
  @SerializedName("numberOfResults")
  private Integer numberOfResults = null;

  @SerializedName("brandName")
  private String brandName = null;

  public BrandRefinement numberOfResults(Integer numberOfResults) {
    this.numberOfResults = numberOfResults;
    return this;
  }

   /**
   * The estimated number of results that would still be returned if refinement key applied.
   * @return numberOfResults
  **/
  @ApiModelProperty(required = true, value = "The estimated number of results that would still be returned if refinement key applied.")
  public Integer getNumberOfResults() {
    return numberOfResults;
  }

  public void setNumberOfResults(Integer numberOfResults) {
    this.numberOfResults = numberOfResults;
  }

  public BrandRefinement brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }

   /**
   * Brand name. For display and can be used as a search refinement.
   * @return brandName
  **/
  @ApiModelProperty(required = true, value = "Brand name. For display and can be used as a search refinement.")
  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandRefinement brandRefinement = (BrandRefinement) o;
    return Objects.equals(this.numberOfResults, brandRefinement.numberOfResults) &&
        Objects.equals(this.brandName, brandRefinement.brandName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfResults, brandName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandRefinement {\n");
    
    sb.append("    numberOfResults: ").append(toIndentedString(numberOfResults)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
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


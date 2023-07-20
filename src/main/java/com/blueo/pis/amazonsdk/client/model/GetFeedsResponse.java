/*
 * Selling Partner API for Feeds
 * The Selling Partner API for Feeds lets you upload data to Amazon on behalf of a selling partner.
 *
 * OpenAPI spec version: 2021-06-30
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.blueo.pis.amazonsdk.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.blueo.pis.amazonsdk.client.model.FeedList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Response schema.
 */
@ApiModel(description = "Response schema.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-03T18:21:37.837+08:00")
public class GetFeedsResponse {
  @SerializedName("feeds")
  private FeedList feeds = null;

  @SerializedName("nextToken")
  private String nextToken = null;

  public GetFeedsResponse feeds(FeedList feeds) {
    this.feeds = feeds;
    return this;
  }

   /**
   * The feeds.
   * @return feeds
  **/
  @ApiModelProperty(required = true, value = "The feeds.")
  public FeedList getFeeds() {
    return feeds;
  }

  public void setFeeds(FeedList feeds) {
    this.feeds = feeds;
  }

  public GetFeedsResponse nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * Returned when the number of results exceeds pageSize. To get the next page of results, call the getFeeds operation with this token as the only parameter.
   * @return nextToken
  **/
  @ApiModelProperty(value = "Returned when the number of results exceeds pageSize. To get the next page of results, call the getFeeds operation with this token as the only parameter.")
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFeedsResponse getFeedsResponse = (GetFeedsResponse) o;
    return Objects.equals(this.feeds, getFeedsResponse.feeds) &&
        Objects.equals(this.nextToken, getFeedsResponse.nextToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeds, nextToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFeedsResponse {\n");
    
    sb.append("    feeds: ").append(toIndentedString(feeds)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
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

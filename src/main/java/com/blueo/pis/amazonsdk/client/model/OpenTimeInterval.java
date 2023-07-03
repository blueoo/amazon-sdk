/*
 * Selling Partner API for Orders
 * The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools. The Orders API only supports orders that are less than two years old. Orders more than two years old will not show in the API response.
 *
 * OpenAPI spec version: v0
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
 * The time when the business opens or closes.
 */
@ApiModel(description = "The time when the business opens or closes.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-06-23T18:40:28.557+08:00")
public class OpenTimeInterval {
  @SerializedName("Hour")
  private Integer hour = null;

  @SerializedName("Minute")
  private Integer minute = null;

  public OpenTimeInterval hour(Integer hour) {
    this.hour = hour;
    return this;
  }

   /**
   * The hour when the business opens or closes.
   * @return hour
  **/
  @ApiModelProperty(value = "The hour when the business opens or closes.")
  public Integer getHour() {
    return hour;
  }

  public void setHour(Integer hour) {
    this.hour = hour;
  }

  public OpenTimeInterval minute(Integer minute) {
    this.minute = minute;
    return this;
  }

   /**
   * The minute when the business opens or closes.
   * @return minute
  **/
  @ApiModelProperty(value = "The minute when the business opens or closes.")
  public Integer getMinute() {
    return minute;
  }

  public void setMinute(Integer minute) {
    this.minute = minute;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenTimeInterval openTimeInterval = (OpenTimeInterval) o;
    return Objects.equals(this.hour, openTimeInterval.hour) &&
        Objects.equals(this.minute, openTimeInterval.minute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hour, minute);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenTimeInterval {\n");
    
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    minute: ").append(toIndentedString(minute)).append("\n");
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


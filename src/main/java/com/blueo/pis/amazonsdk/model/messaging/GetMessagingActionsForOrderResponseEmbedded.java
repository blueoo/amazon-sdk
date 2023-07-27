/*
 * Selling Partner API for Messaging
 * With the Messaging API you can build applications that send messages to buyers. You can get a list of message types that are available for an order that you specify, then call an operation that sends a message to the buyer for that order. The Messaging API returns responses that are formed according to the <a href=https://tools.ietf.org/html/draft-kelly-json-hal-08>JSON Hypertext Application Language</a> (HAL) standard.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.blueo.pis.amazonsdk.model.messaging;

import java.util.Objects;
import java.util.Arrays;
import com.blueo.pis.amazonsdk.model.messaging.GetMessagingActionResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GetMessagingActionsForOrderResponseEmbedded
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-27T12:09:50.804+08:00")
public class GetMessagingActionsForOrderResponseEmbedded {
  @SerializedName("actions")
  private List<GetMessagingActionResponse> actions = new ArrayList<GetMessagingActionResponse>();

  public GetMessagingActionsForOrderResponseEmbedded actions(List<GetMessagingActionResponse> actions) {
    this.actions = actions;
    return this;
  }

  public GetMessagingActionsForOrderResponseEmbedded addActionsItem(GetMessagingActionResponse actionsItem) {
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/
  @ApiModelProperty(required = true, value = "")
  public List<GetMessagingActionResponse> getActions() {
    return actions;
  }

  public void setActions(List<GetMessagingActionResponse> actions) {
    this.actions = actions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMessagingActionsForOrderResponseEmbedded getMessagingActionsForOrderResponseEmbedded = (GetMessagingActionsForOrderResponseEmbedded) o;
    return Objects.equals(this.actions, getMessagingActionsForOrderResponseEmbedded.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMessagingActionsForOrderResponseEmbedded {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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


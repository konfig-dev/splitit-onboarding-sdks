/*
 * Splitit.OnBoarding.Api.V2
 * Splitit's Onboarding API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.splitit.client.model;

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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.splitit.client.JSON;

/**
 * SelfOnBoardingErrorResponse
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SelfOnBoardingErrorResponse {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_ERROR_CODE = "errorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private Integer errorCode;

  public static final String SERIALIZED_NAME_PARAM_NAME = "paramName";
  @SerializedName(SERIALIZED_NAME_PARAM_NAME)
  private String paramName;

  public static final String SERIALIZED_NAME_TRACE_ID = "traceId";
  @SerializedName(SERIALIZED_NAME_TRACE_ID)
  private String traceId;

  public SelfOnBoardingErrorResponse() {
  }

  public SelfOnBoardingErrorResponse message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public SelfOnBoardingErrorResponse errorCode(Integer errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }


  public SelfOnBoardingErrorResponse paramName(String paramName) {
    
    this.paramName = paramName;
    return this;
  }

   /**
   * Get paramName
   * @return paramName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getParamName() {
    return paramName;
  }


  public void setParamName(String paramName) {
    this.paramName = paramName;
  }


  public SelfOnBoardingErrorResponse traceId(String traceId) {
    
    this.traceId = traceId;
    return this;
  }

   /**
   * Get traceId
   * @return traceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTraceId() {
    return traceId;
  }


  public void setTraceId(String traceId) {
    this.traceId = traceId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelfOnBoardingErrorResponse selfOnBoardingErrorResponse = (SelfOnBoardingErrorResponse) o;
    return Objects.equals(this.message, selfOnBoardingErrorResponse.message) &&
        Objects.equals(this.errorCode, selfOnBoardingErrorResponse.errorCode) &&
        Objects.equals(this.paramName, selfOnBoardingErrorResponse.paramName) &&
        Objects.equals(this.traceId, selfOnBoardingErrorResponse.traceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, errorCode, paramName, traceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelfOnBoardingErrorResponse {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    paramName: ").append(toIndentedString(paramName)).append("\n");
    sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("message");
    openapiFields.add("errorCode");
    openapiFields.add("paramName");
    openapiFields.add("traceId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SelfOnBoardingErrorResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SelfOnBoardingErrorResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SelfOnBoardingErrorResponse is not found in the empty JSON string", SelfOnBoardingErrorResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SelfOnBoardingErrorResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SelfOnBoardingErrorResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("paramName") != null && !jsonObj.get("paramName").isJsonNull()) && !jsonObj.get("paramName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paramName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paramName").toString()));
      }
      if ((jsonObj.get("traceId") != null && !jsonObj.get("traceId").isJsonNull()) && !jsonObj.get("traceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `traceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("traceId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SelfOnBoardingErrorResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SelfOnBoardingErrorResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SelfOnBoardingErrorResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SelfOnBoardingErrorResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<SelfOnBoardingErrorResponse>() {
           @Override
           public void write(JsonWriter out, SelfOnBoardingErrorResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SelfOnBoardingErrorResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SelfOnBoardingErrorResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SelfOnBoardingErrorResponse
  * @throws IOException if the JSON string is invalid with respect to SelfOnBoardingErrorResponse
  */
  public static SelfOnBoardingErrorResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SelfOnBoardingErrorResponse.class);
  }

 /**
  * Convert an instance of SelfOnBoardingErrorResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


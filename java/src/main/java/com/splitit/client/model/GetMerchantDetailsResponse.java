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
 * GetMerchantDetailsResponse
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GetMerchantDetailsResponse {
  public static final String SERIALIZED_NAME_PUBLIC_NAME = "publicName";
  @SerializedName(SERIALIZED_NAME_PUBLIC_NAME)
  private String publicName;

  public static final String SERIALIZED_NAME_LEGAL_NAME = "legalName";
  @SerializedName(SERIALIZED_NAME_LEGAL_NAME)
  private String legalName;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_MERCHANT_TEMP_ID = "merchantTempId";
  @SerializedName(SERIALIZED_NAME_MERCHANT_TEMP_ID)
  private String merchantTempId;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_MERCHANT_STATUS = "merchantStatus";
  @SerializedName(SERIALIZED_NAME_MERCHANT_STATUS)
  private String merchantStatus;

  public GetMerchantDetailsResponse() {
  }

  public GetMerchantDetailsResponse publicName(String publicName) {
    
    this.publicName = publicName;
    return this;
  }

   /**
   * Get publicName
   * @return publicName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPublicName() {
    return publicName;
  }


  public void setPublicName(String publicName) {
    this.publicName = publicName;
  }


  public GetMerchantDetailsResponse legalName(String legalName) {
    
    this.legalName = legalName;
    return this;
  }

   /**
   * Get legalName
   * @return legalName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLegalName() {
    return legalName;
  }


  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }


  public GetMerchantDetailsResponse phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public GetMerchantDetailsResponse merchantTempId(String merchantTempId) {
    
    this.merchantTempId = merchantTempId;
    return this;
  }

   /**
   * Get merchantTempId
   * @return merchantTempId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getMerchantTempId() {
    return merchantTempId;
  }


  public void setMerchantTempId(String merchantTempId) {
    this.merchantTempId = merchantTempId;
  }


  public GetMerchantDetailsResponse email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public GetMerchantDetailsResponse merchantStatus(String merchantStatus) {
    
    this.merchantStatus = merchantStatus;
    return this;
  }

   /**
   * Get merchantStatus
   * @return merchantStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getMerchantStatus() {
    return merchantStatus;
  }


  public void setMerchantStatus(String merchantStatus) {
    this.merchantStatus = merchantStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMerchantDetailsResponse getMerchantDetailsResponse = (GetMerchantDetailsResponse) o;
    return Objects.equals(this.publicName, getMerchantDetailsResponse.publicName) &&
        Objects.equals(this.legalName, getMerchantDetailsResponse.legalName) &&
        Objects.equals(this.phoneNumber, getMerchantDetailsResponse.phoneNumber) &&
        Objects.equals(this.merchantTempId, getMerchantDetailsResponse.merchantTempId) &&
        Objects.equals(this.email, getMerchantDetailsResponse.email) &&
        Objects.equals(this.merchantStatus, getMerchantDetailsResponse.merchantStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicName, legalName, phoneNumber, merchantTempId, email, merchantStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMerchantDetailsResponse {\n");
    sb.append("    publicName: ").append(toIndentedString(publicName)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    merchantTempId: ").append(toIndentedString(merchantTempId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    merchantStatus: ").append(toIndentedString(merchantStatus)).append("\n");
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
    openapiFields.add("publicName");
    openapiFields.add("legalName");
    openapiFields.add("phoneNumber");
    openapiFields.add("merchantTempId");
    openapiFields.add("email");
    openapiFields.add("merchantStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("publicName");
    openapiRequiredFields.add("legalName");
    openapiRequiredFields.add("phoneNumber");
    openapiRequiredFields.add("merchantTempId");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("merchantStatus");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetMerchantDetailsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetMerchantDetailsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetMerchantDetailsResponse is not found in the empty JSON string", GetMerchantDetailsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetMerchantDetailsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetMerchantDetailsResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetMerchantDetailsResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("publicName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publicName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publicName").toString()));
      }
      if (!jsonObj.get("legalName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legalName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legalName").toString()));
      }
      if (!jsonObj.get("phoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumber").toString()));
      }
      if (!jsonObj.get("merchantTempId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantTempId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantTempId").toString()));
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (!jsonObj.get("merchantStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantStatus").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetMerchantDetailsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetMerchantDetailsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetMerchantDetailsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetMerchantDetailsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetMerchantDetailsResponse>() {
           @Override
           public void write(JsonWriter out, GetMerchantDetailsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetMerchantDetailsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetMerchantDetailsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetMerchantDetailsResponse
  * @throws IOException if the JSON string is invalid with respect to GetMerchantDetailsResponse
  */
  public static GetMerchantDetailsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetMerchantDetailsResponse.class);
  }

 /**
  * Convert an instance of GetMerchantDetailsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


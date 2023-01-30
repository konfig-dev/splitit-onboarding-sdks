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


package com.konfigthis.splitit.client.model;

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

import com.konfigthis.splitit.client.JSON;

/**
 * GetMerchantResponse
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GetMerchantResponse {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LEGAL_NAME = "legalName";
  @SerializedName(SERIALIZED_NAME_LEGAL_NAME)
  private String legalName;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_ANNUAL_SALES = "annualSales";
  @SerializedName(SERIALIZED_NAME_ANNUAL_SALES)
  private String annualSales;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_MERCHANT_TEMP_ID = "merchantTempId";
  @SerializedName(SERIALIZED_NAME_MERCHANT_TEMP_ID)
  private String merchantTempId;

  public GetMerchantResponse() {
  }

  public GetMerchantResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetMerchantResponse legalName(String legalName) {
    
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


  public GetMerchantResponse phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public GetMerchantResponse country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public GetMerchantResponse annualSales(String annualSales) {
    
    this.annualSales = annualSales;
    return this;
  }

   /**
   * Get annualSales
   * @return annualSales
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAnnualSales() {
    return annualSales;
  }


  public void setAnnualSales(String annualSales) {
    this.annualSales = annualSales;
  }


  public GetMerchantResponse status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public GetMerchantResponse merchantTempId(String merchantTempId) {
    
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

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the GetMerchantResponse instance itself
   */
  public GetMerchantResponse putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMerchantResponse getMerchantResponse = (GetMerchantResponse) o;
    return Objects.equals(this.name, getMerchantResponse.name) &&
        Objects.equals(this.legalName, getMerchantResponse.legalName) &&
        Objects.equals(this.phone, getMerchantResponse.phone) &&
        Objects.equals(this.country, getMerchantResponse.country) &&
        Objects.equals(this.annualSales, getMerchantResponse.annualSales) &&
        Objects.equals(this.status, getMerchantResponse.status) &&
        Objects.equals(this.merchantTempId, getMerchantResponse.merchantTempId)&&
        Objects.equals(this.additionalProperties, getMerchantResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, legalName, phone, country, annualSales, status, merchantTempId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMerchantResponse {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    annualSales: ").append(toIndentedString(annualSales)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    merchantTempId: ").append(toIndentedString(merchantTempId)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("legalName");
    openapiFields.add("phone");
    openapiFields.add("country");
    openapiFields.add("annualSales");
    openapiFields.add("status");
    openapiFields.add("merchantTempId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("legalName");
    openapiRequiredFields.add("phone");
    openapiRequiredFields.add("country");
    openapiRequiredFields.add("annualSales");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("merchantTempId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetMerchantResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetMerchantResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetMerchantResponse is not found in the empty JSON string", GetMerchantResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetMerchantResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("legalName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legalName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legalName").toString()));
      }
      if (!jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if (!jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if (!jsonObj.get("annualSales").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `annualSales` to be a primitive type in the JSON string but got `%s`", jsonObj.get("annualSales").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("merchantTempId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantTempId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantTempId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetMerchantResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetMerchantResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetMerchantResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetMerchantResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetMerchantResponse>() {
           @Override
           public void write(JsonWriter out, GetMerchantResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public GetMerchantResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetMerchantResponse instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetMerchantResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetMerchantResponse
  * @throws IOException if the JSON string is invalid with respect to GetMerchantResponse
  */
  public static GetMerchantResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetMerchantResponse.class);
  }

 /**
  * Convert an instance of GetMerchantResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


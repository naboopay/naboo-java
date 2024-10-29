/*
 * NabooApi V1
 * Here you have the first version of the naboo api to create checkout automatically
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import org.openapitools.client.model.Wallet;

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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * GetAccountResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-29T10:23:31.575940Z[Africa/Freetown]", comments = "Generator version: 7.9.0")
public class GetAccountResponse {
  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "account_number";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private BigDecimal balance;

  public static final String SERIALIZED_NAME_ACCOUNT_IS_ACTIVATE = "account_is_activate";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_IS_ACTIVATE)
  private Boolean accountIsActivate;

  public static final String SERIALIZED_NAME_METHOD_OF_PAYMENT = "method_of_payment";
  @SerializedName(SERIALIZED_NAME_METHOD_OF_PAYMENT)
  private Wallet methodOfPayment;

  public static final String SERIALIZED_NAME_LOYALTY_CREDIT = "loyalty_credit";
  @SerializedName(SERIALIZED_NAME_LOYALTY_CREDIT)
  private Integer loyaltyCredit;

  public GetAccountResponse() {
  }

  public GetAccountResponse accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Get accountNumber
   * @return accountNumber
   */
  @javax.annotation.Nonnull
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public GetAccountResponse balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   * @return balance
   */
  @javax.annotation.Nonnull
  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }


  public GetAccountResponse accountIsActivate(Boolean accountIsActivate) {
    this.accountIsActivate = accountIsActivate;
    return this;
  }

  /**
   * Get accountIsActivate
   * @return accountIsActivate
   */
  @javax.annotation.Nonnull
  public Boolean getAccountIsActivate() {
    return accountIsActivate;
  }

  public void setAccountIsActivate(Boolean accountIsActivate) {
    this.accountIsActivate = accountIsActivate;
  }


  public GetAccountResponse methodOfPayment(Wallet methodOfPayment) {
    this.methodOfPayment = methodOfPayment;
    return this;
  }

  /**
   * Get methodOfPayment
   * @return methodOfPayment
   */
  @javax.annotation.Nonnull
  public Wallet getMethodOfPayment() {
    return methodOfPayment;
  }

  public void setMethodOfPayment(Wallet methodOfPayment) {
    this.methodOfPayment = methodOfPayment;
  }


  public GetAccountResponse loyaltyCredit(Integer loyaltyCredit) {
    this.loyaltyCredit = loyaltyCredit;
    return this;
  }

  /**
   * Get loyaltyCredit
   * @return loyaltyCredit
   */
  @javax.annotation.Nonnull
  public Integer getLoyaltyCredit() {
    return loyaltyCredit;
  }

  public void setLoyaltyCredit(Integer loyaltyCredit) {
    this.loyaltyCredit = loyaltyCredit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccountResponse getAccountResponse = (GetAccountResponse) o;
    return Objects.equals(this.accountNumber, getAccountResponse.accountNumber) &&
        Objects.equals(this.balance, getAccountResponse.balance) &&
        Objects.equals(this.accountIsActivate, getAccountResponse.accountIsActivate) &&
        Objects.equals(this.methodOfPayment, getAccountResponse.methodOfPayment) &&
        Objects.equals(this.loyaltyCredit, getAccountResponse.loyaltyCredit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, balance, accountIsActivate, methodOfPayment, loyaltyCredit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountResponse {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    accountIsActivate: ").append(toIndentedString(accountIsActivate)).append("\n");
    sb.append("    methodOfPayment: ").append(toIndentedString(methodOfPayment)).append("\n");
    sb.append("    loyaltyCredit: ").append(toIndentedString(loyaltyCredit)).append("\n");
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
    openapiFields.add("account_number");
    openapiFields.add("balance");
    openapiFields.add("account_is_activate");
    openapiFields.add("method_of_payment");
    openapiFields.add("loyalty_credit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account_number");
    openapiRequiredFields.add("balance");
    openapiRequiredFields.add("account_is_activate");
    openapiRequiredFields.add("method_of_payment");
    openapiRequiredFields.add("loyalty_credit");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetAccountResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetAccountResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetAccountResponse is not found in the empty JSON string", GetAccountResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetAccountResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetAccountResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetAccountResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_number").toString()));
      }
      // validate the required field `method_of_payment`
      Wallet.validateJsonElement(jsonObj.get("method_of_payment"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetAccountResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetAccountResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetAccountResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetAccountResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetAccountResponse>() {
           @Override
           public void write(JsonWriter out, GetAccountResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetAccountResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetAccountResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetAccountResponse
   * @throws IOException if the JSON string is invalid with respect to GetAccountResponse
   */
  public static GetAccountResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAccountResponse.class);
  }

  /**
   * Convert an instance of GetAccountResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


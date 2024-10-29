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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * TransactionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-29T10:23:31.575940Z[Africa/Freetown]", comments = "Generator version: 7.9.0")
public class TransactionResponse {
  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_METHOD_OF_PAYMENT = "method_of_payment";
  @SerializedName(SERIALIZED_NAME_METHOD_OF_PAYMENT)
  private List<String> methodOfPayment = new ArrayList<>();

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount = 0;

  public static final String SERIALIZED_NAME_AMOUNT_TO_PAY = "amount_to_pay";
  @SerializedName(SERIALIZED_NAME_AMOUNT_TO_PAY)
  private Integer amountToPay = 0;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_TRANSACTION_STATUS = "transaction_status";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_STATUS)
  private String transactionStatus = "pending";

  public static final String SERIALIZED_NAME_IS_ESCROW = "is_escrow";
  @SerializedName(SERIALIZED_NAME_IS_ESCROW)
  private Boolean isEscrow = false;

  public static final String SERIALIZED_NAME_IS_MERCHANT = "is_merchant";
  @SerializedName(SERIALIZED_NAME_IS_MERCHANT)
  private Boolean isMerchant = false;

  public static final String SERIALIZED_NAME_CHECKOUT_URL = "checkout_url";
  @SerializedName(SERIALIZED_NAME_CHECKOUT_URL)
  private String checkoutUrl;

  public TransactionResponse() {
  }

  public TransactionResponse orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Get orderId
   * @return orderId
   */
  @javax.annotation.Nonnull
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public TransactionResponse methodOfPayment(List<String> methodOfPayment) {
    this.methodOfPayment = methodOfPayment;
    return this;
  }

  public TransactionResponse addMethodOfPaymentItem(String methodOfPaymentItem) {
    if (this.methodOfPayment == null) {
      this.methodOfPayment = new ArrayList<>();
    }
    this.methodOfPayment.add(methodOfPaymentItem);
    return this;
  }

  /**
   * Get methodOfPayment
   * @return methodOfPayment
   */
  @javax.annotation.Nonnull
  public List<String> getMethodOfPayment() {
    return methodOfPayment;
  }

  public void setMethodOfPayment(List<String> methodOfPayment) {
    this.methodOfPayment = methodOfPayment;
  }


  public TransactionResponse amount(Integer amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  @javax.annotation.Nullable
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public TransactionResponse amountToPay(Integer amountToPay) {
    this.amountToPay = amountToPay;
    return this;
  }

  /**
   * Get amountToPay
   * @return amountToPay
   */
  @javax.annotation.Nullable
  public Integer getAmountToPay() {
    return amountToPay;
  }

  public void setAmountToPay(Integer amountToPay) {
    this.amountToPay = amountToPay;
  }


  public TransactionResponse currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @javax.annotation.Nonnull
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public TransactionResponse createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public TransactionResponse transactionStatus(String transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

  /**
   * Get transactionStatus
   * @return transactionStatus
   */
  @javax.annotation.Nullable
  public String getTransactionStatus() {
    return transactionStatus;
  }

  public void setTransactionStatus(String transactionStatus) {
    this.transactionStatus = transactionStatus;
  }


  public TransactionResponse isEscrow(Boolean isEscrow) {
    this.isEscrow = isEscrow;
    return this;
  }

  /**
   * Get isEscrow
   * @return isEscrow
   */
  @javax.annotation.Nullable
  public Boolean getIsEscrow() {
    return isEscrow;
  }

  public void setIsEscrow(Boolean isEscrow) {
    this.isEscrow = isEscrow;
  }


  public TransactionResponse isMerchant(Boolean isMerchant) {
    this.isMerchant = isMerchant;
    return this;
  }

  /**
   * Get isMerchant
   * @return isMerchant
   */
  @javax.annotation.Nullable
  public Boolean getIsMerchant() {
    return isMerchant;
  }

  public void setIsMerchant(Boolean isMerchant) {
    this.isMerchant = isMerchant;
  }


  public TransactionResponse checkoutUrl(String checkoutUrl) {
    this.checkoutUrl = checkoutUrl;
    return this;
  }

  /**
   * Get checkoutUrl
   * @return checkoutUrl
   */
  @javax.annotation.Nonnull
  public String getCheckoutUrl() {
    return checkoutUrl;
  }

  public void setCheckoutUrl(String checkoutUrl) {
    this.checkoutUrl = checkoutUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionResponse transactionResponse = (TransactionResponse) o;
    return Objects.equals(this.orderId, transactionResponse.orderId) &&
        Objects.equals(this.methodOfPayment, transactionResponse.methodOfPayment) &&
        Objects.equals(this.amount, transactionResponse.amount) &&
        Objects.equals(this.amountToPay, transactionResponse.amountToPay) &&
        Objects.equals(this.currency, transactionResponse.currency) &&
        Objects.equals(this.createdAt, transactionResponse.createdAt) &&
        Objects.equals(this.transactionStatus, transactionResponse.transactionStatus) &&
        Objects.equals(this.isEscrow, transactionResponse.isEscrow) &&
        Objects.equals(this.isMerchant, transactionResponse.isMerchant) &&
        Objects.equals(this.checkoutUrl, transactionResponse.checkoutUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, methodOfPayment, amount, amountToPay, currency, createdAt, transactionStatus, isEscrow, isMerchant, checkoutUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionResponse {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    methodOfPayment: ").append(toIndentedString(methodOfPayment)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    amountToPay: ").append(toIndentedString(amountToPay)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    isEscrow: ").append(toIndentedString(isEscrow)).append("\n");
    sb.append("    isMerchant: ").append(toIndentedString(isMerchant)).append("\n");
    sb.append("    checkoutUrl: ").append(toIndentedString(checkoutUrl)).append("\n");
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
    openapiFields.add("order_id");
    openapiFields.add("method_of_payment");
    openapiFields.add("amount");
    openapiFields.add("amount_to_pay");
    openapiFields.add("currency");
    openapiFields.add("created_at");
    openapiFields.add("transaction_status");
    openapiFields.add("is_escrow");
    openapiFields.add("is_merchant");
    openapiFields.add("checkout_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("order_id");
    openapiRequiredFields.add("method_of_payment");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("checkout_url");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TransactionResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TransactionResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionResponse is not found in the empty JSON string", TransactionResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TransactionResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransactionResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransactionResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("method_of_payment") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("method_of_payment").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `method_of_payment` to be an array in the JSON string but got `%s`", jsonObj.get("method_of_payment").toString()));
      }
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if (!jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if ((jsonObj.get("transaction_status") != null && !jsonObj.get("transaction_status").isJsonNull()) && !jsonObj.get("transaction_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transaction_status").toString()));
      }
      if (!jsonObj.get("checkout_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `checkout_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checkout_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionResponse>() {
           @Override
           public void write(JsonWriter out, TransactionResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransactionResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TransactionResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TransactionResponse
   * @throws IOException if the JSON string is invalid with respect to TransactionResponse
   */
  public static TransactionResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionResponse.class);
  }

  /**
   * Convert an instance of TransactionResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

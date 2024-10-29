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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets Wallet
 */
@JsonAdapter(Wallet.Adapter.class)
public enum Wallet {
  
  WAVE("WAVE"),
  
  ORANGE_MONEY("ORANGE_MONEY"),
  
  FREE_MONEY("FREE_MONEY");

  private String value;

  Wallet(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Wallet fromValue(String value) {
    for (Wallet b : Wallet.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Wallet> {
    @Override
    public void write(final JsonWriter jsonWriter, final Wallet enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Wallet read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Wallet.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Wallet.fromValue(value);
  }
}

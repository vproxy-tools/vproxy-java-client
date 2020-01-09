/*
 * vproxy
 * The vproxy http controller api.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package vproxy.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets Rule
 */
@JsonAdapter(Rule.Adapter.class)
public enum Rule {
  
  ALLOW("allow"),
  
  DENY("deny");

  private String value;

  Rule(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Rule fromValue(String text) {
    for (Rule b : Rule.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<Rule> {
    @Override
    public void write(final JsonWriter jsonWriter, final Rule enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Rule read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Rule.fromValue(String.valueOf(value));
    }
  }
}

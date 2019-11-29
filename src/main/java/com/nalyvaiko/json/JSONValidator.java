package com.nalyvaiko.json;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JSONValidator {

  private JSONValidator() {
  }

  public static boolean validateJSONFile(File jsonFile, File jsonSchema) {
    try (InputStream jsonSchemaInput = new BufferedInputStream(
        new FileInputStream(jsonSchema));
        InputStream jsonFileInput = new BufferedInputStream(
            new FileInputStream(jsonFile))) {

      JSONObject jsonObject = new JSONObject(new JSONTokener(jsonSchemaInput));
      JSONArray jsonArray = new JSONArray(new JSONTokener(jsonFileInput));

      Schema schemaCheck = SchemaLoader.builder().schemaJson(jsonObject)
          .draftV7Support().build()
          .load().build();
      schemaCheck.validate(jsonArray);
    } catch (IOException exception) {
      exception.printStackTrace();
    }
    return true;
  }
}

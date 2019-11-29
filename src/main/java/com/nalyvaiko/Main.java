package com.nalyvaiko;

import com.nalyvaiko.comparator.BankComparator;
import com.nalyvaiko.json.JSONParser;
import com.nalyvaiko.json.JSONValidator;
import java.io.File;

public class Main {

  public static void main(String[] args) {
    File jsonFile = new File("src\\main\\resources\\bankDepositsJSON.json");
    File jsonSchemaFile = new File(
        "src\\main\\resources\\bankDepositsJSONSchema.json");

    JSONValidator.validateJSONFile(jsonFile, jsonSchemaFile);

    JSONParser jsonParser = new JSONParser();
    jsonParser.parseJSONFile(jsonFile).stream()
        .sorted(new BankComparator())
        .forEach(System.out::println);

  }
}


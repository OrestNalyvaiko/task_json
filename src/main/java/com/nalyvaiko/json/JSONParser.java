package com.nalyvaiko.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nalyvaiko.model.Bank;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class JSONParser {

  private ObjectMapper objectMapper;

  public JSONParser() {
    objectMapper = new ObjectMapper();
  }

  public List<Bank> parseJSONFile(File jsonFile) {
    Bank[] bank = new Bank[0];
    try {
      bank = objectMapper.readValue(jsonFile, Bank[].class);
    } catch (IOException exception) {
      exception.printStackTrace();
    }
    return Arrays.asList(bank);
  }
}

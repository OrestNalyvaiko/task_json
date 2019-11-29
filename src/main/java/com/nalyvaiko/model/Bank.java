package com.nalyvaiko.model;

public class Bank {

  private String name;
  private String country;
  private Type type;
  private String depositor;
  private String accountID;
  private double amountOnDeposit;
  private double profitability;
  private int timeConstraints;

  public double getAmountOnDeposit() {
    return amountOnDeposit;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public String getDepositor() {
    return depositor;
  }

  public void setDepositor(String depositor) {
    this.depositor = depositor;
  }

  public String getAccountID() {
    return accountID;
  }

  public void setAccountID(String accountID) {
    this.accountID = accountID;
  }

  public void setAmountOnDeposit(double amountOnDeposit) {
    this.amountOnDeposit = amountOnDeposit;
  }

  public double getProfitability() {
    return profitability;
  }

  public void setProfitability(double profitability) {
    this.profitability = profitability;
  }

  public int getTimeConstraints() {
    return timeConstraints;
  }

  public void setTimeConstraints(int timeConstraints) {
    this.timeConstraints = timeConstraints;
  }

  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Bank");
    stringBuilder.append("\nName: ");
    stringBuilder.append(name);
    stringBuilder.append("\nCountry: ");
    stringBuilder.append(country);
    stringBuilder.append("\nType: ");
    stringBuilder.append(type);
    stringBuilder.append("\nDepositor: ");
    stringBuilder.append(depositor);
    stringBuilder.append("\nAccount ID: ");
    stringBuilder.append(accountID);
    stringBuilder.append("\nAmount on deposit: ");
    stringBuilder.append(amountOnDeposit);
    stringBuilder.append("\nProfitability: ");
    stringBuilder.append(profitability);
    stringBuilder.append("%");
    stringBuilder.append("\nTime constraints: ");
    stringBuilder.append(timeConstraints);
    stringBuilder.append("\n\n");
    return stringBuilder.toString();
  }

}

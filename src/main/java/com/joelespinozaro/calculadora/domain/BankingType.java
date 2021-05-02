package com.joelespinozaro.calculadora.domain;

public class BankingType {
    private int bankingTypeId;
    private String description;

    public int getBankingTypeId() {
        return bankingTypeId;
    }

    public void setBankingTypeId(int bankingTypeId) {
        this.bankingTypeId = bankingTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

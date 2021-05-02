package com.joelespinozaro.calculadora.domain;

public class Banking {
    private int bankingId;
    private String name;
    private String address;
    private String phoneNumber;
    private int bankingTypeId;
    private BankingType bankingType;

    public int getBankingId() {
        return bankingId;
    }

    public void setBankingId(int bankingId) {
        this.bankingId = bankingId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getBankingTypeId() {
        return bankingTypeId;
    }

    public void setBankingTypeId(int bankingTypeId) {
        this.bankingTypeId = bankingTypeId;
    }

    public BankingType getBankingType() {
        return bankingType;
    }

    public void setBankingType(BankingType bankingType) {
        this.bankingType = bankingType;
    }
}

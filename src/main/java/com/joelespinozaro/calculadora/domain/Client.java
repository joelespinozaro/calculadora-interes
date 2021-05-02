package com.joelespinozaro.calculadora.domain;

public class Client {
    private int clientId;
    private String client;
    private String cardIdNumber;
    private String address;

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getCardIdNumber() {
        return cardIdNumber;
    }

    public void setCardIdNumber(String cardIdNumber) {
        this.cardIdNumber = cardIdNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

package com.joelespinozaro.calculadora.domain;

public class FinancialService {
    private int financialServiceId;
    private int recommendationId;
    private int clientId;
    private Double rate;
    private Double capital;
    private int period;
    private Recommendation recommendation;
    private Client client;
    private Double capitalFinal;

    public int getFinancialServiceId() {
        return financialServiceId;
    }

    public void setFinancialServiceId(int financialServiceId) {
        this.financialServiceId = financialServiceId;
    }

    public int getRecommendationId() {
        return recommendationId;
    }

    public void setRecommendationId(int recommendationId) {
        this.recommendationId = recommendationId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getCapital() {
        return capital;
    }

    public void setCapital(Double capital) {
        this.capital = capital;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public Recommendation getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(Recommendation recommendation) {
        this.recommendation = recommendation;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setCapitalFinal(Double capitalFinal) {
        this.capitalFinal = capitalFinal;
    }

    public Double getCapitalFinal() {
        return capitalFinal;
    }
}

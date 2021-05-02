package com.joelespinozaro.calculadora.domain;

public class Recommendation {
    private int recommendationId;
    private int advisorId;
    private int bankingId;
    private Banking banking;
    private Advisor advisor;

    public int getRecommendationId() {
        return recommendationId;
    }

    public void setRecommendationId(int recommendationId) {
        this.recommendationId = recommendationId;
    }

    public int getAdvisorId() {
        return advisorId;
    }

    public void setAdvisorId(int advisorId) {
        this.advisorId = advisorId;
    }

    public int getBankingId() {
        return bankingId;
    }

    public void setBankingId(int bankingId) {
        this.bankingId = bankingId;
    }

    public Banking getBanking() {
        return banking;
    }

    public void setBanking(Banking banking) {
        this.banking = banking;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }
}

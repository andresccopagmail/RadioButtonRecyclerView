package com.example.radiobutton;

public class OffersModel {

    private String offer;
    private int amount;

    public OffersModel() {
    }

    public OffersModel(String offer, int amount) {
        this.offer = offer;
        this.amount = amount;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

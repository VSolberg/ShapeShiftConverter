package com.vsolberg;

public enum KryptosekkenType {

    TRADE("Handel"),
    AFFILIATION("Erverv"),
    MINING("Mining"),
    INCOME("Inntekt"),
    INTEREST("Renteinntekt"),
    LOSS("Tap"),
    CONSUMPTION("Forbruk"),
    INBOUND_TRANSFER("Overføring-Inn"),
    OUTBOUND_TRANSFER("Overføring-Ut"),
    INNBOUND_GIFT("Gave-Inn"),
    OUTBOUND_GIFT("Gave-Ut"),
    LOSS_WITHOUT_DEDUCTION("Tap-uten-fradrag");

    private String csvValue;

    KryptosekkenType(String csvValue) {
        this.csvValue = csvValue;
    }

    public String getCsvValue() {
        return csvValue;
    }
}

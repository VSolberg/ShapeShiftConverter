package com.vsolberg;

import java.time.format.DateTimeFormatter;

import static com.vsolberg.Constants.EMPTY_FIELD;
import static com.vsolberg.Constants.ExchangeNames.SHAPESHIFT_EXCHANGE;
import static com.vsolberg.Constants.KRYPTOSEKKEN_TIMESTAMP_FORMAT;

public class KryptosekkenTransaction {

    private String timestamp;
    private KryptosekkenType type;
    private String inputAmount;
    private String inputCurrency;
    private String outputAmount;
    private String outputCurrency;
    private String minerFeeAmount;
    private String minerFeeCurrency;
    private String exchangeUsed;
    private String comment;

    public static KryptosekkenTransaction fromShapeshiftTransaction(ShapeshiftTransaction input) {
        KryptosekkenTransaction transaction = new KryptosekkenTransaction();

        transaction.setTimestamp(input.getTimestamp().format(DateTimeFormatter.ofPattern(KRYPTOSEKKEN_TIMESTAMP_FORMAT)));
        transaction.setType(KryptosekkenType.TRADE);
        transaction.setInputAmount(input.getOutputAmount());
        transaction.setInputCurrency(input.getOutputCurrency());
        transaction.setOutputAmount(input.getInputAmount());
        transaction.setOutputCurrency(input.getInputCurrency());
        transaction.setMinerFeeAmount(EMPTY_FIELD); //miner fee has already been deducted by shapeshift, leaving empty to avoid a double deduction
        transaction.setMinerFeeCurrency(EMPTY_FIELD);
        transaction.setExchangeUsed(SHAPESHIFT_EXCHANGE);
        transaction.setComment(input.getStatus());

        return transaction;
    }

    @Override
    public String toString() {
        return this.getTimestamp() + "," +
                this.getType().getCsvValue() + "," +
                this.getInputAmount() + "," +
                this.getInputCurrency() + "," +
                this.getOutputAmount() + "," +
                this.getOutputCurrency() + "," +
                this.getMinerFeeAmount() + "," +
                this.getMinerFeeCurrency() + "," +
                this.getExchangeUsed() + "," +
                this.getComment();
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public KryptosekkenType getType() {
        return type;
    }

    public void setType(KryptosekkenType type) {
        this.type = type;
    }

    public String getInputAmount() {
        return inputAmount;
    }

    public void setInputAmount(String inputAmount) {
        this.inputAmount = inputAmount;
    }

    public String getInputCurrency() {
        return inputCurrency;
    }

    public void setInputCurrency(String inputCurrency) {
        this.inputCurrency = inputCurrency;
    }

    public String getOutputAmount() {
        return outputAmount;
    }

    public void setOutputAmount(String outputAmount) {
        this.outputAmount = outputAmount;
    }

    public String getOutputCurrency() {
        return outputCurrency;
    }

    public void setOutputCurrency(String outputCurrency) {
        this.outputCurrency = outputCurrency;
    }

    public String getMinerFeeAmount() {
        return minerFeeAmount;
    }

    public void setMinerFeeAmount(String minerFeeAmount) {
        this.minerFeeAmount = minerFeeAmount;
    }

    public String getMinerFeeCurrency() {
        return minerFeeCurrency;
    }

    public void setMinerFeeCurrency(String minerFeeCurrency) {
        this.minerFeeCurrency = minerFeeCurrency;
    }

    public String getExchangeUsed() {
        return exchangeUsed;
    }

    public void setExchangeUsed(String exchangeUsed) {
        this.exchangeUsed = exchangeUsed;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}

package com.vsolberg;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

import static com.vsolberg.Constants.ShapeshiftFileIndexes.*;

public class ShapeshiftTransaction {

    private String id;
    private String status;
    private OffsetDateTime timestamp;
    private String rate;
    private String minerFee;
    private String inputAmount;
    private String inputCurrency;
    private String inputAddress;
    private String inputTxId;
    private String outputAmount;
    private String outputCurrency;
    private String outputAddress;
    private String outputTxId;
    private String refundAddress;
    private String refundCurrency;
    private String refundTxId;

    public static ShapeshiftTransaction fromCsvLine(String line) {
        ShapeshiftTransaction transaction = new ShapeshiftTransaction();
        List<String> csvParts = Arrays.asList(line.split(","));

        transaction.setId(getCsvPart(csvParts, ID));
        transaction.setStatus(getCsvPart(csvParts, STATUS));
        transaction.setTimestamp(OffsetDateTime.parse(getCsvPart(csvParts, TIMESTAMP), DateTimeFormatter.ISO_OFFSET_DATE_TIME));
        transaction.setRate(getCsvPart(csvParts, RATE));
        transaction.setMinerFee(getCsvPart(csvParts, MINER_FEE));
        transaction.setInputAmount(getCsvPart(csvParts, INPUT_AMOUNT));
        transaction.setInputCurrency(getCsvPart(csvParts, INPUT_CURRENCY));
        transaction.setInputAddress(getCsvPart(csvParts, INPUT_ADDRESS));
        transaction.setInputTxId(getCsvPart(csvParts, INPUT_TX_ID));
        transaction.setOutputAmount(getCsvPart(csvParts, OUTPUT_AMOUNT));
        transaction.setOutputCurrency(getCsvPart(csvParts, OUTPUT_CURRENCY));
        transaction.setOutputAddress(getCsvPart(csvParts, OUTPUT_ADDRESS));
        transaction.setOutputTxId(getCsvPart(csvParts, OUTPUT_TX_ID));
        transaction.setRefundAddress(getCsvPart(csvParts, REFUND_ADDRESS));
        transaction.setRefundCurrency(getCsvPart(csvParts, REFUND_CURRENCY));
        transaction.setRefundTxId(getCsvPart(csvParts, REFUND_TX_ID));

        return transaction;
    }

    private static String getCsvPart(List<String> csvParts, int index) {
        return csvParts.size() <= index ? null : csvParts.get(index);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getMinerFee() {
        return minerFee;
    }

    public void setMinerFee(String minerFee) {
        this.minerFee = minerFee;
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

    public String getInputAddress() {
        return inputAddress;
    }

    public void setInputAddress(String inputAddress) {
        this.inputAddress = inputAddress;
    }

    public String getInputTxId() {
        return inputTxId;
    }

    public void setInputTxId(String inputTxId) {
        this.inputTxId = inputTxId;
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

    public String getOutputAddress() {
        return outputAddress;
    }

    public void setOutputAddress(String outputAddress) {
        this.outputAddress = outputAddress;
    }

    public String getOutputTxId() {
        return outputTxId;
    }

    public void setOutputTxId(String outputTxId) {
        this.outputTxId = outputTxId;
    }

    public String getRefundAddress() {
        return refundAddress;
    }

    public void setRefundAddress(String refundAddress) {
        this.refundAddress = refundAddress;
    }

    public String getRefundCurrency() {
        return refundCurrency;
    }

    public void setRefundCurrency(String refundCurrency) {
        this.refundCurrency = refundCurrency;
    }

    public String getRefundTxId() {
        return refundTxId;
    }

    public void setRefundTxId(String refundTxId) {
        this.refundTxId = refundTxId;
    }
}

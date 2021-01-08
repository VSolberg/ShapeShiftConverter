package com.vsolberg;

public class Constants {

    public static final String KRYPTOSEKKEN_TIMESTAMP_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String SHAPESHIFT_FILE_HEADER = "id,status,timestamp,rate,minerFee,inputAmount,inputCurrency,inputAddress,inputTxid,outputAmount,outputCurrency,outputAddress,outputTxid,refundAddress,refundCurrency,refundTxid";
    public static final String KRYPTOSEKKEN_FILE_HEADER = "Tidspunkt,Type,Inn,Inn-Valuta,Ut,Ut-Valuta,Gebyr,Gebyr-Valuta,Marked,Notat";

    public static final String EMPTY_FIELD = "";

    public static class ShapeshiftFileIndexes {
        public static final int ID = 0;
        public static final int STATUS = 1;
        public static final int TIMESTAMP = 2;
        public static final int RATE = 3;
        public static final int MINER_FEE = 4;
        public static final int INPUT_AMOUNT = 5;
        public static final int INPUT_CURRENCY = 6;
        public static final int INPUT_ADDRESS = 7;
        public static final int INPUT_TX_ID = 8;
        public static final int OUTPUT_AMOUNT = 9;
        public static final int OUTPUT_CURRENCY = 10;
        public static final int OUTPUT_ADDRESS = 11;
        public static final int OUTPUT_TX_ID = 12;
        public static final int REFUND_ADDRESS = 13;
        public static final int REFUND_CURRENCY = 14;
        public static final int REFUND_TX_ID = 15;
    }

    public static class ExchangeNames {
        public static final String SHAPESHIFT_EXCHANGE = "ShapeShift";
    }

}

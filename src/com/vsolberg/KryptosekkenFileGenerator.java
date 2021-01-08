package com.vsolberg;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

import static com.vsolberg.Constants.KRYPTOSEKKEN_FILE_HEADER;

public class KryptosekkenFileGenerator {

    public static void createKryptosekkenCsvFile(List<ShapeshiftTransaction> shapeshiftTransactions, String outputFilePath) throws IOException {
        List<KryptosekkenTransaction> transactions = shapeshiftTransactions.stream().map(KryptosekkenTransaction::fromShapeshiftTransaction).collect(Collectors.toList());
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(outputFilePath))));

        writer.write(KRYPTOSEKKEN_FILE_HEADER);

        for (KryptosekkenTransaction transaction : transactions) {
            writer.write(System.lineSeparator());
            writer.write(transaction.toString());
        }

        writer.flush();
        writer.close();
    }

}

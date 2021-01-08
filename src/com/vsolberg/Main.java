package com.vsolberg;

import java.io.IOException;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        String shapeShiftFilePath = args[0];
        String kryptoSekkenOutputPath = args[1];

        ShapeshiftFileParser parser = new ShapeshiftFileParser(Paths.get(shapeShiftFilePath));
        KryptosekkenFileGenerator.createKryptosekkenCsvFile(parser.getTransactions(), kryptoSekkenOutputPath);
    }
}

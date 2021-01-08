package com.vsolberg;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static com.vsolberg.Constants.SHAPESHIFT_FILE_HEADER;

public class ShapeshiftFileParser {

    private List<ShapeshiftTransaction> transactions = new ArrayList<>();

    public ShapeshiftFileParser(Path csvFilePath) {
        try(Stream<String> lines = Files.lines(csvFilePath)) {
            lines.forEach(line -> {
                if(isHeaderLine(line)) return;

                ShapeshiftTransaction transaction = ShapeshiftTransaction.fromCsvLine(line);

                if(transaction.getStatus().equals("complete")) transactions.add(transaction);
            });
        } catch (IOException ex) {
            throw new RuntimeException("Failed to parse shapeshift CSV file! Reason: " + ex.getMessage());
        }
    }

    private boolean isHeaderLine(String line) {
        return line.contains(SHAPESHIFT_FILE_HEADER);
    }

    public List<ShapeshiftTransaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<ShapeshiftTransaction> transactions) {
        this.transactions = transactions;
    }
}

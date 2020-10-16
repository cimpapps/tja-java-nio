package com.thejavacademy.nio;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesOperationsExample {

  public static void main(String[] args) throws IOException {

    // Reading
    Path txPath = Paths.get("transactions.csv");
    byte[] bytes = Files.readAllBytes(txPath); // 1 - so easy
    System.out.println(new String(bytes));
    List<String> transactionLines = Files.readAllLines(txPath);// 2 - much easier
    System.out.println(transactionLines);
    try (InputStream inputStream = Files.newInputStream(txPath)) {
    } //3 with InputStream classic inputStream.readByte until -1
    try (BufferedReader bufferedReader = Files.newBufferedReader(txPath)) {
    } //4 with BufferedReader readline until null

    // Writing
    Files.write(txPath, bytes); // 1
    Files.write(txPath, transactionLines); // 2
    try (BufferedWriter bufferedWriter = Files.newBufferedWriter(txPath)) { //3
      for (String transactionLine : transactionLines) {
        bufferedWriter.write(transactionLine);
        bufferedWriter.newLine();
      }
    }

    Path copy = Paths.get(txPath.toString() + "_copy");
    Files.copy(txPath, Files.newOutputStream(copy));
    Files.move(copy, Paths.get("bla", copy.toString()));
  }
}

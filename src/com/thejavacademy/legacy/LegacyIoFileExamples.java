package com.thejavacademy.legacy;

import java.io.File;
import java.io.IOException;

public class LegacyIoFileExamples {
  public static void main(String[] args) throws IOException {
    File file = new File("a.csv");
    // create file
    if (!file.exists()) {
      System.out.println("creating a file");
      file.createNewFile();
    }
    System.out.println("file is file " + file.isFile()); // true
    System.out.println("file is dir " + file.isDirectory()); // false
    // create directory;
    File directory = new File("bla");
    if (!directory.exists()) {
      System.out.println("creating a directory");
      directory.mkdir();
    }
    System.out.println("dir is file " + directory.isFile()); // false
    System.out.println("dir is dir " + directory.isDirectory()); // true
    // move a file
    file.renameTo(new File("mydir/bla.txt"));
    // delete a file
    file.delete();
    directory.delete();
  }
}

package com.thejavacademy.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsCreateExample {

    public static void main(String... args) {
        Path pathA = Paths.get("a"); // relative path
        System.out.println(pathA);

        Path pathAAbs = Paths.get("/a");
        System.out.println(pathAAbs);


        Path pathAbc = Paths.get("a/b/c");
        System.out.println(pathAbc);
        Path testPath = testVarArgs("a", "b", "c");
        System.out.println(testPath);
        Path pathAbcComposed = Paths.get("a", "/b", "c");
        System.out.println(pathAbcComposed);

    }


    public static Path testVarArgs(String arg, String... args) {
       return Paths.get(arg, args);
    }
}

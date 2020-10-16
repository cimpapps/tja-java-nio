package com.thejavacademy.nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsResolveExample {

    public static void main(String[] args) {
        Path a = Paths.get("a");
        Path b = Paths.get("b");

        boolean directory = Files.isDirectory(a);
        System.out.println();

        Path absA = Paths.get("/a");
        Path absB = Paths.get("/b");

        //Compose relative path
        System.out.println(a.resolve(b));
        System.out.println(b.resolve(a));

        //Compose abs paths
        System.out.println(absA.resolve(absB));
        System.out.println(absB.resolve(absA));

        //Compose rel with abs
        System.out.println(b.resolve(absA));
        System.out.println(absA.resolve(b));

    }
}

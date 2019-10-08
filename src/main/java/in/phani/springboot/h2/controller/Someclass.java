package in.phani.springboot.h2.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Someclass {
    public void someMethod() throws IOException {
        Path path = Paths.get("somenfileName");
        BufferedReader reader = Files.newBufferedReader(path);
        Files.lines(path).forEach(System.out::println);
    }
}

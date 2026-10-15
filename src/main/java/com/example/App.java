package com.example;

import java.io.IOException;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class App {
    public static void main(String[] args) {

        File sourceFile = new File("source.txt");
        File destFile = new File("dest.txt");

        try {
            Files.copy(
                sourceFile.toPath(),
                destFile.toPath(),
                StandardCopyOption.REPLACE_EXISTING
            );

            System.out.println("File has been copied successfully.");

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}


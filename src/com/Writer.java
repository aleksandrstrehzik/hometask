package com;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class Writer {

    public void print(String b) throws IOException {
        File toFile = Path.of("resources", "sortedText.txt").toFile();
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(toFile))) {
            bufferedWriter.write(b);
        }
    }
}

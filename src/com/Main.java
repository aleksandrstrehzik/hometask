package com;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = Path.of("resources", "text.txt").toFile();
        Reader reader = new Reader();
        String sort = reader.sort(reader.read(file));
        Writer writer = new Writer();
        writer.print(sort);

    }
}

package com;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Reader {


    public String read (File file) throws IOException {
        String s;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            s = br.lines()
                    .collect(Collectors.joining("\n"));
        }
        return s;
    }
    public String sort (String s){
        String[] split = s.split("\n");
        Arrays.sort(split);
        return Arrays.toString(split);
    }
}

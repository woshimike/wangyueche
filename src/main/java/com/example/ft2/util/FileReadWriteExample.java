package com.example.ft2.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteExample {
    public static void main(String[] args) {
        String inputFileName = "input123231231123.txt";
        String outputFileName = "outpu123123t.txt";
        String outputFileName2 = "outpu123123t.txt";
        String outputFileName3 = "outpu123123t.txt";

        /**
         *
         * sdfjlsdjf加点住是吧
         */
        try (BufferedReader br = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileName))) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
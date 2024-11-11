package io.buffered;

import java.io.FileInputStream;
import java.io.IOException;

import static io.buffered.BufferedConst.FILE_NAME;

public class ReadFileV1 {

    public static void main(String[] args) throws IOException {

        long startTime = System.currentTimeMillis();
        int fileSize = 0;
        int data;
        try (FileInputStream fis = new FileInputStream(FILE_NAME)) {
            while ((data = fis.read()) != -1) {
                fileSize ++;
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("File read: " + FILE_NAME);
        System.out.println("File size: " + fileSize / 1024 / 1024 + "MB");
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
    }
}

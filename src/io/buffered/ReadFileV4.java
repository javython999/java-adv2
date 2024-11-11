package io.buffered;

import java.io.FileInputStream;
import java.io.IOException;

import static io.buffered.BufferedConst.FILE_NAME;

public class ReadFileV4 {

    public static void main(String[] args) throws IOException {

        long startTime = System.currentTimeMillis();
        int fileSize = 0;
        byte[] data;
        try (FileInputStream fis = new FileInputStream(FILE_NAME)) {
            data = fis.readAllBytes();
        }

        long endTime = System.currentTimeMillis();

        System.out.println("File read: " + FILE_NAME);
        System.out.println("File size: " + data.length / 1024 / 1024 + "MB");
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
    }
}

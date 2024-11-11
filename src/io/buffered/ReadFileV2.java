package io.buffered;

import java.io.FileInputStream;
import java.io.IOException;

import static io.buffered.BufferedConst.BUFFER_SIZE;
import static io.buffered.BufferedConst.FILE_NAME;

public class ReadFileV2 {

    public static void main(String[] args) throws IOException {

        long startTime = System.currentTimeMillis();
        int fileSize = 0;
        int size;
        byte[] buffer = new byte[BUFFER_SIZE];

        try (FileInputStream fis = new FileInputStream(FILE_NAME)) {
            while ((size = fis.read(buffer)) != -1) {
                fileSize += size;
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("File read: " + FILE_NAME);
        System.out.println("File size: " + fileSize / 1024 / 1024 + "MB");
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
    }
}

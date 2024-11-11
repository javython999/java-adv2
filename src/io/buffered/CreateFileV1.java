package io.buffered;

import java.io.FileOutputStream;
import java.io.IOException;

import static io.buffered.BufferedConst.FILE_NAME;
import static io.buffered.BufferedConst.FILE_SIZE;

public class CreateFileV1 {

    public static void main(String[] args) throws IOException {

        long startTime = System.currentTimeMillis();

        try (FileOutputStream fos = new FileOutputStream(FILE_NAME)) {
            for (int i = 0; i < FILE_SIZE; i++) {
                fos.write(1);
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("File create: " + FILE_NAME);
        System.out.println("File size: " + FILE_SIZE / 1024 / 1024 + "MB");
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
    }
}

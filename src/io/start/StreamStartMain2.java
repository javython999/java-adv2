package io.start;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class StreamStartMain2 {

    public static void main(String[] args) throws IOException {
        byte[] input = {65, 66, 67, 68};
        try (FileOutputStream fos = new FileOutputStream("temp/hello.dat")) {
            fos.write(input);
        }

        byte[] buffer = new byte[10];
        try (FileInputStream fis = new FileInputStream("temp/hello.dat")) {
            int readCount = fis.read(buffer, 0, buffer.length);
            System.out.println("readCount = " + readCount);
            System.out.println(Arrays.toString(buffer));
        }
    }
}

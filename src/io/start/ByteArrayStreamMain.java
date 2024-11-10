package io.start;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayStreamMain {

    public static void main(String[] args) throws IOException {
        byte[] input = {1, 2, 3};

        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            baos.write(input);
        }

        try (ByteArrayInputStream bais = new ByteArrayInputStream(input)) {
            byte[] readAllBytes = bais.readAllBytes();
            System.out.println(Arrays.toString(readAllBytes));
        }
    }
}

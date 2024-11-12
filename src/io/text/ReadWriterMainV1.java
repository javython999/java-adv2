package io.text;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

import static io.text.TextConst.FILE_NAME;
import static java.nio.charset.StandardCharsets.UTF_8;

public class ReadWriterMainV1 {

    public static void main(String[] args) throws IOException {
        String writeString = "ABC";

        byte[] bytes = writeString.getBytes(UTF_8);
        System.out.println("write String: " + writeString);
        System.out.println("write bytes: " + Arrays.toString(bytes));

        try (FileOutputStream fos = new FileOutputStream(FILE_NAME)) {
            fos.write(bytes);
        }

        try (FileInputStream fis = new FileInputStream(FILE_NAME)) {
            byte[] readAllBytes = fis.readAllBytes();

            System.out.println("read bytes: " + Arrays.toString(readAllBytes));

            // byte -> String utf-8 디코딩
            String readString = new String(readAllBytes, UTF_8);
            System.out.println("read String: " + readString);
        }

    }
}

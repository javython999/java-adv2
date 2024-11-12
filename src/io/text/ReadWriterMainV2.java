package io.text;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static io.text.TextConst.FILE_NAME;
import static java.nio.charset.StandardCharsets.UTF_8;

public class ReadWriterMainV2 {

    public static void main(String[] args) throws IOException {
        String writeString = "ABC";
        System.out.println("write String: " + writeString);

        try (FileOutputStream fos = new FileOutputStream(FILE_NAME);
             OutputStreamWriter osw = new OutputStreamWriter(fos, UTF_8)) {
            osw.write(writeString);
        }

        StringBuilder content = new StringBuilder();
        try (FileInputStream fis = new FileInputStream(FILE_NAME);
             InputStreamReader isr = new InputStreamReader(fis, UTF_8)) {

            int ch;
            while ((ch = isr.read()) != -1) {
                content.append((char) ch);
            }
        }
        System.out.println("read String: " + content);

    }
}

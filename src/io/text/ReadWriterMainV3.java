package io.text;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import static io.text.TextConst.FILE_NAME;
import static java.nio.charset.StandardCharsets.UTF_8;

public class ReadWriterMainV3 {

    public static void main(String[] args) throws IOException {
        String writeString = "ABC";
        System.out.println("write String: " + writeString);

        try (FileWriter fw = new FileWriter(FILE_NAME, UTF_8)) {
            fw.write(writeString);
        }

        StringBuilder content = new StringBuilder();
        try (FileReader fr = new FileReader(FILE_NAME, UTF_8)) {
            int ch;
            while ((ch = fr.read()) != -1) {
                content.append((char) ch);
            }
        }
        System.out.println("read String: " + content);

    }
}

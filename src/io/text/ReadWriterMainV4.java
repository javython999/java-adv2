package io.text;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static io.text.TextConst.FILE_NAME;
import static java.nio.charset.StandardCharsets.UTF_8;

public class ReadWriterMainV4 {

    private static final int BUFFER_SIZE = 8192;

    public static void main(String[] args) throws IOException {
        String writeString = "ABC\n가나다";
        System.out.println("== Write String ==");
        System.out.println(writeString);

        try (FileWriter fw = new FileWriter(FILE_NAME, UTF_8); BufferedWriter bfw = new BufferedWriter(fw, BUFFER_SIZE)) {
            bfw.write(writeString);
        }

        StringBuilder content = new StringBuilder();
        String line;
        try (FileReader fr = new FileReader(FILE_NAME, UTF_8); BufferedReader bfr = new BufferedReader(fr, BUFFER_SIZE)) {
            while ((line = bfr.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        System.out.println("== Read String ==");
        System.out.println(content);

    }
}

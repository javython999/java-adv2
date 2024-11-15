package io.file.text;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

import static java.nio.charset.StandardCharsets.UTF_8;

public class RealTextV1 {

    private static final String PATH = "temp/hello2.txt";

    public static void main(String[] args) throws IOException {

        String writeString = "abc\n가나다";
        System.out.println("== Write String ==");
        System.out.println(writeString);

        Path path = Path.of(PATH);

        Files.writeString(path, writeString, UTF_8);

        System.out.println("== Read String ==");
        /*
        String readString = Files.readString(path, UTF_8);
        System.out.println(readString);
        */

        try (Stream<String> lineStream = Files.lines(path, UTF_8)) {
            lineStream.forEach(System.out::println);
        }


    }
}
package io.start;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamStartMain1 {

    public static void main(String[] args) throws IOException {

        try (FileOutputStream fos = new FileOutputStream("temp/hello.dat")) {
            fos.write(65);
            fos.write(66);
            fos.write(67);
        }


        try (FileInputStream fis = new FileInputStream("temp/hello.dat")) {
            while (fis.available() > 0) {
                System.out.println(fis.read());
            }
        }


    }
}

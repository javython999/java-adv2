package io.file;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;

public class NewFilesMain {

    public static void main(String[] args) throws IOException {
        Path file = Path.of("temp/example.txt");
        Path directory = Path.of("temp/exampleDir");

        System.out.println("File exists: " + Files.exists(file));

        try {
            Files.createFile(file);
        } catch (FileAlreadyExistsException e) {
            System.out.println(file + " already exists");
        }

        try {
            Files.createDirectory(directory);
        } catch (FileAlreadyExistsException e) {
            System.out.println(directory + " already exists");
        }

        //Files.delete(file);
        //Files.delete(directory);

        System.out.println("Is regular file: " + Files.isRegularFile(file));
        System.out.println("Is directory: " + Files.isDirectory(directory));
        System.out.println("File Name: " + file.getFileName());
        System.out.println("File Size: " + Files.size(file));

        Path newFile = Path.of("temp/newExample.txt");
        Files.move(file, newFile, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File moved/renamed");

        System.out.println("Last modified: " + Files.getLastModifiedTime(newFile));

        BasicFileAttributes attrs = Files.readAttributes(newFile, BasicFileAttributes.class);

        System.out.println("===== Attributes =====");
        System.out.println("Creation time: " + attrs.creationTime());
        System.out.println("is directory: " + attrs.isDirectory());
        System.out.println("is regular file: " + attrs.isRegularFile());
        System.out.println("is symbolic link: " + attrs.isSymbolicLink());
        System.out.println("size: " + attrs.size());
    }
}

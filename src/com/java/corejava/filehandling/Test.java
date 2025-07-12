package com.java.corejava.filehandling;
import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        // File Handling

        // 1. File Creation
        File file = new File("test.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
        }

        // 2. Writing to a File
        try (FileWriter writer = new FileWriter("test.txt")) {
            writer.write("Hello, World!\n");
            writer.write("This is a test file.");
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }

        // 3. Reading from a File
        try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))) {
            String line;
            System.out.println("Reading from the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
        }

        // 4. Checking if a File Exists
        if (file.exists()) {
            System.out.println("File exists: " + file.getName());
        } else {
            System.out.println("File does not exist.");
        }

        // 5. Getting File Information
        if (file.exists()) {
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File Size in bytes: " + file.length());
        } else {
            System.out.println("File does not exist, cannot retrieve information.");
        }

        // 6. Renaming a File
        File newFile = new File("renamed_test.txt");
        if (file.renameTo(newFile)) {
            System.out.println("File renamed to: " + newFile.getName());
        } else {
            System.out.println("Failed to rename the file.");
        }

        // 7. Listing Files in a Directory
        File directory = new File(".");
        String[] filesList = directory.list();
        if (filesList != null) {
            System.out.println("Files in the directory:");
            for (String fileName : filesList) {
                System.out.println(fileName);
            }
        } else {
            System.out.println("The directory is empty or does not exist.");
        }

        // 8. Deleting a File
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file or file does not exist.");
        }
    }
}

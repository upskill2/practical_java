package com.practicaljava.lesson14.tryit;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ReadZipFile {

    public static final String PRACTICAL_JAVA_ZIP = "practical_java.zip";
    public static final String TEST_ZIP = "test.zip";

    public static void main(String[] args) throws IOException {

        ZipEntry entry;
        try {

            FileInputStream zipFile = new FileInputStream(PRACTICAL_JAVA_ZIP);
            ZipInputStream stream = new ZipInputStream(zipFile);

            while ((entry = stream.getNextEntry()) != null) {
                System.out.println("Files name in zip are: " + entry.getName());
            }
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {

            byte[] buffer = new byte[1024];

            FileInputStream fileInput = new FileInputStream("states.txt");

            FileOutputStream fileOutput = new FileOutputStream(TEST_ZIP);
            ZipOutputStream zipOutput = new ZipOutputStream(fileOutput);

            zipOutput.putNextEntry(new ZipEntry(PRACTICAL_JAVA_ZIP));

            int lenght;
            while ((lenght = fileInput.read(buffer)) > 0) {
                zipOutput.write(buffer, 0, lenght);
                System.out.println("\n");
                System.out.println("New zip file is " + TEST_ZIP);
            }
            fileInput.close();
            fileOutput.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

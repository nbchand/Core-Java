package com.infodev.extras.FileHandling;

import java.io.*;
import java.util.Scanner;

/**
 * Copies file from one directory to another
 *
 * @author Narendra
 * @version 1.0
 * @since 22/02/02
 */
public class FileCopy {

    /**
     * Takes fileName and its extension as parameters and copies that file from FileHandling-Source to FileHandling-Destination of Desktop
     *
     * @param fileName      Name of the file excluding the extension
     * @param fileExtension The dot(.) extension of the file
     */
    public static void copyFile(String fileName, String fileExtension) {
        //sets root directory location
        String rootDirectory = System.getProperty("user.home") + File.separator + "Desktop";
        //sets source folder and destination folder location
        String sourceFolderLocation = rootDirectory + File.separator + "FileHandling-Source";
        String destinationFolderLocation = rootDirectory + File.separator + "FileHandling-Destination";
        //sets source file and destination file location
        String sourceFileLocation = sourceFolderLocation + File.separator + fileName + fileExtension;
        String destinationFileLocation = destinationFolderLocation + File.separator + fileName + fileExtension;

        //declare filestream objects as null just to make them global so that they can be initialized in the try block and closed in the finally block
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            //instantiates a new File pointer which points to our source file
            File sourceFile = new File(sourceFileLocation);
            //if the source file is not found FileNotFoundException is thrown
            if (!sourceFile.exists()) {
                throw new FileNotFoundException();
            }
            //instantiates a fileInputStream objects which reads our source file
            fileInputStream = new FileInputStream(sourceFileLocation);
            //fileInputStream reads our source file and stores them into a byte array
            byte[] bytes = fileInputStream.readAllBytes();

            //instantiates a new File pointer which points to our destination file
            File destinationFile = new File(destinationFileLocation);

            //an integer which may be used to rename the file while copying if file with same name already exists
            int i = 0;
            //iterate the process of renaming the destination file if the same name is already in use
            while (destinationFile.exists()) {
                //increment the value of i so that file name becomes unique
                i++;
                //change the name of destination file by including the updated value of i
                destinationFileLocation = destinationFolderLocation + File.separator + fileName + "(" + i + ")" + fileExtension;
                //invoke previously instantiated file pointer to point to newly named destination file
                destinationFile = new File(destinationFileLocation);
            }
            //instantiate fileOutputStream object which writes to out destination file
            fileOutputStream = new FileOutputStream(destinationFile);
            //fileOutputStream object writes previously extracted bytes from the source file into the new destination file
            fileOutputStream.write(bytes);
            //print copying successful message
            System.out.println("File copied successfully.");
        } catch (FileNotFoundException exception) {
            System.out.println("Sorry, the requested file is not found");
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        } finally {
            try {
                //closes the FileStream objects to release all the resources consumed by them
                fileInputStream.close();
                fileOutputStream.close();
            } catch (Exception exception) {
                //displays null if the FileStream objects never get initialized
                System.out.println(exception.getMessage());
            }
        }
    }

    /**
     * Main method to take file info as input and invoke copy method
     *
     * @param args console arguments
     */
    public static void main(String[] args) {
        //displays information regarding the program
        System.out.println("This program copies a file from 'C:\\Users\\Nabin\\Desktop\\FileHandling-Source' folder to 'C:\\Users\\Nabin\\Desktop\\FileHandling-Destination' folder");
        System.out.println("Provide the name and extension of the file below.");
        System.out.println("(E.g if the filename is hello.png provide Filename = hello and File-extension = .png)");

        Scanner scanner = new Scanner(System.in);
        //takes file information as input
        System.out.print("Filename : ");
        String filename = scanner.next();
        System.out.print("File-extension : ");
        String file_extension = scanner.next();

        scanner.close();
        //invokes copy method which performs the copying mechanism
        copyFile(filename, file_extension);
    }
}

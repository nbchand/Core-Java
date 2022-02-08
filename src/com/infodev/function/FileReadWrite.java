/*
39.Write the simple java function that reads data from one file and writes the data to
another file.
 */
package com.infodev.function;

import java.io.*;
import java.util.Scanner;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-09
 */
public class FileReadWrite {
    /**
     * Reads content of one file and writes it to another file
     * @param readLocation Location of file from where data is to be read
     * @param writeLocation Location of file where we need to store data
     * @throws IOException
     */
    public static void readWriteFile(String readLocation, String writeLocation) throws IOException {
        FileReader fread = null;
        FileWriter fwrite = null;
        try{
            File readFile = new File(readLocation);
            fread = new FileReader(readFile);
            Scanner scanner = new Scanner(fread);

            File writeFile = new File(writeLocation);
            fwrite = new FileWriter(writeFile);
            fwrite.write(scanner.nextLine());
            System.out.println("Task successful");
        }catch (IOException e){
            System.out.println("File writing failed");
        }finally {
            fread.close();
            fwrite.close();
        }
    }

    /**
     * Initializes locations of files and perform read and write operation on them
     */
    public static void performTask() {
        String redFrom = "C:\\Users\\Nabin\\Desktop\\WICC\\WICC-Java\\src\\com\\infodev\\function\\files\\Hello.txt";
        String writeAt = "C:\\Users\\Nabin\\Desktop\\WICC\\WICC-Java\\src\\com\\infodev\\function\\files\\Duplicate.txt";
        try{
            readWriteFile(redFrom,writeAt);
        }catch (IOException e){
            System.out.println("File writing failed");
        }
    }
}

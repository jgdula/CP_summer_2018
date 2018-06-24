package pl.waw.sgh.Homework4;

import java.io.File;
import java.util.Scanner;

/**
 * Homework4:
 * Please write a program that given a file or folder calculates:
 * - the number of all files and folders (also in their subfolders)
 * - the total size of all files and folders.
 * <p>
 * Hint: Use recursion to implement the calculation on subfolders.
 */

public class Homework4 {

    public Homework4() {
        Scanner ss = new Scanner(System.in);
        System.out.println("Homework 4: \nPlease insert a directory path: ");
        String filePath = ss.nextLine();
        File file = new File(filePath);
        try {
            int count = getNumberOfFiles(file);
            System.out.printf("The number of all files in the folder (and its all subfolders) is: " + count + ".\n");
            long sizeInBytes = getSizeOfFiles(file);
            System.out.println("Total size: " + sizeInBytes + " bytes");
        } catch (Exception ex) {
            System.out.printf("Error during execution. \n" + ex.getMessage());
        }
    }

    private int getNumberOfFiles(File path) {
        int count = 0;
        // if path is not a directory, but a file
        if (path.isFile()) {
            return 1;
        }
        for (File file : path.listFiles()) {
            if (file.isFile()) {
                count++;
            }
            if (file.isDirectory()) {
                count += getNumberOfFiles(file);
            }
        }
        return count;
    }

    private long getSizeOfFiles(File path) {
        long size = 0;
        // if path is not a directory, but a file
        if (path.isFile()) {
            return path.length();
        }
        for (File file : path.listFiles()) {
            if (file.isFile()) {
                size += file.length();
            }
            if (file.isDirectory()) {
                size +=  getSizeOfFiles(file);
            }
        }
        return size;
    }

}
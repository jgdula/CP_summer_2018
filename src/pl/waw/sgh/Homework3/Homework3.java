package pl.waw.sgh.Homework3;

import java.io.File;
import java.util.Scanner;

/**
 * Please write a program that checks the Tick Tack Toe game table provided
 * as input in form of a text (CSV) file (ticktacktoe.txt).
 * The program should print if the game is over and if so who one (X,O or nobody).
 * <p>
 * Hints:
 * 1. It will simplify code if you use 1 and -1 to represent the X and O respectively
 * and 0 to represent an empty field.
 * 2. You may need to parse the values read from the file as text (String) into numbers.
 * To do that use:
 * String s = "55";
 * int a = Integer.parseInt(s);
 */

public class Homework3 {

    public Homework3() {
        int[][] arr = getBoard();
        if (arr == null)
            return;
        printBoard(arr);

        if (checkWin(arr, 1)) {
            System.out.printf("The X is a winner!");
        } else if (checkWin(arr, -1)) {
            System.out.printf("The O is a winner!");
        } else {
            System.out.printf("It's a draw. There is no winner.");
        }
    }

    private int[][] getBoard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Homework 3: \nPlease insert a path to the Tick Tack Toe file: ");
        String filePath = scanner.nextLine();
        File file = new File(filePath);
        int[][] arr = new int[3][3];

        try {
            scanner = new Scanner(file);
            int row = 0;
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] cells = line.split(",");
                for (int col = 0; col < cells.length; col++) {
                    arr[col][row] = Integer .parseInt(cells[col]);
                }
                row++;
            }
        } catch (Exception ex) {
            System.out.printf("Error during execution. \n" + ex.getMessage());
            return null;
        }
        return arr;
    }

    private void printBoard(int arr[][]) {
        System.out.println(arr[0][0] + " " + arr[1][0] + " " + arr[2][0]);
        System.out.println(arr[0][1] + " " + arr[1][1] + " " + arr[2][1]);
        System.out.println(arr[0][2] + " " + arr[1][2] + " " + arr[2][2]);
    }

    private boolean checkWin(int[][] arr, int player) {
        if (arr[0][0] == player && arr[0][1] == player && arr[0][2] == player ||
                arr[1][0] == player && arr[1][1] == player && arr[1][2] == player ||
                arr[2][0] == player && arr[2][1] == player && arr[2][2] == player ||
                arr[0][0] == player && arr[1][0] == player && arr[2][0] == player ||
                arr[0][1] == player && arr[1][1] == player && arr[2][1] == player ||
                arr[0][2] == player && arr[1][2] == player && arr[2][2] == player ||
                arr[0][0] == player && arr[1][1] == player && arr[2][2] == player ||
                arr[2][0] == player && arr[1][1] == player && arr[0][2] == player)
            return true;
        return false;
    }

}

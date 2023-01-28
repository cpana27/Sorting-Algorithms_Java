package utils;

import java.util.ArrayList;
import java.util.Scanner;

public class Utils {
    public static void swap(ArrayList<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    public static void printArray(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }

    public static int[] dynamicArray(int[] arr) {
        return null;
    }

    public static int userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 6");
        var i = scanner.nextInt();
        scanner.close();
        return i;
    }
}

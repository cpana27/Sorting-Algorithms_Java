package utils;

import java.util.ArrayList;
import algorithm.SortingAlgos;

public class Launcher {

    public static void launchBubbleSort(ArrayList<Integer> arr) {
        SortingAlgos launchAlgo = new SortingAlgos();
        launchAlgo.bubbleSort(arr);
        // Utils.printArray(arr);
    }

    public static void launchInsertionSort(ArrayList<Integer> arr) {
        SortingAlgos launchAlgo = new SortingAlgos();
        launchAlgo.insertionSort(arr);
        // Utils.printArray(arr);
    }

    public static void launchMergeSort(ArrayList<Integer> arr) {
        SortingAlgos launchAlgo = new SortingAlgos();
        launchAlgo.mergeSort(arr);
        // Utils.printArray(arr);
    }

    public static void launchQuickSort(ArrayList<Integer> arr) {
        SortingAlgos launchAlgo = new SortingAlgos();
        launchAlgo.quickSort(arr, 0, arr.size() - 1);
        // Utils.printArray(arr);
    }

    public static void launchSlowSort(ArrayList<Integer> arr) {
        SortingAlgos launchAlgo = new SortingAlgos();
        launchAlgo.slowSort(arr);
        // Utils.printArray(arr);
    }

    public static void launchIntroSort(ArrayList<Integer> arr) {
        SortingAlgos launchAlgo = new SortingAlgos();
        launchAlgo.introSort(arr, 0, arr.size() - 1, 2 * (int) Math.log(arr.size()));
        // Utils.printArray(arr);
    }
}

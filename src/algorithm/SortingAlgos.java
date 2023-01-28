package algorithm;

import java.util.ArrayList;
import java.util.Random;

import utils.Utils;

public class SortingAlgos {

    public ArrayList<Integer> bubbleSort(ArrayList<Integer> arr) {
        boolean isSorted = false;
        for (int i = 0; i < arr.size() - 1 && !isSorted; i++) {
            isSorted = true;
            for (int j = 0; j < arr.size() - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    Utils.swap(arr, j, j + 1);
                    isSorted = false;
                }
            }
        }
        return arr;
    }

    public ArrayList<Integer> insertionSort(ArrayList<Integer> arr) {
        for (int i = 1; i < arr.size(); i++) {
            int intergerToSort = arr.get(i);
            int j = i;
            while (j > 0 && arr.get(j - 1) > intergerToSort) {
                arr.set(j, arr.get(j - 1));
                j--;
            }
        }
        return null;
    }

    public void introSort(ArrayList<Integer> arr, int left, int right, int depth) {
        if (left < right) {
            if (depth == 0) {
                heapSort(arr, left, right);
            } else {
                int pivotIndex = partitionIntroSort(arr, left, right);
                introSort(arr, left, pivotIndex - 1, depth - 1);
                introSort(arr, pivotIndex + 1, right, depth - 1);
            }
        }
    }

    public static void sort(ArrayList<Integer> list) {
        final int MAX_DEPTH = (int) (2 * Math.log(Integer.MAX_VALUE));
        SortingAlgos introSort = new SortingAlgos();
        introSort.introSort(list, 0, list.size() - 1, MAX_DEPTH);
    }

    private static int partitionIntroSort(ArrayList<Integer> list, int left, int right) {
        int pivotIndex = new Random().nextInt(right - left + 1) + left;
        int pivot = list.get(pivotIndex);
        swap(list, pivotIndex, right);
        int storeIndex = left;
        for (int i = left; i < right; i++) {
            if (list.get(i) < pivot) {
                swap(list, i, storeIndex);
                storeIndex++;
            }
        }
        swap(list, storeIndex, right);
        return storeIndex;
    }

    private static void heapSort(ArrayList<Integer> list, int left, int right) {
        for (int i = (right - left + 1) / 2 - 1; i >= 0; i--) {
            heapify(list, i, right - left + 1, left);
        }
        for (int i = right - left; i >= 0; i--) {
            swap(list, left, left + i);
            heapify(list, 0, i, left);
        }
    }

    private static void heapify(ArrayList<Integer> list, int index, int size, int offset) {
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        if (left < size && list.get(left + offset) > list.get(largest + offset)) {
            largest = left;
        }
        if (right < size && list.get(right + offset) > list.get(largest + offset)) {
            largest = right;
        }
        if (largest != index) {
            swap(list, index + offset, largest + offset);
            heapify(list, largest, size, offset);
        }
    }

    private static void swap(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public void mergeSort(ArrayList<Integer> arr) {
        mergeSort(arr, 0, arr.size() - 1);
    }

    private static void mergeSort(ArrayList<Integer> list, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(list, left, middle);
            mergeSort(list, middle + 1, right);
            merge(list, left, middle, right);
        }
    }

    private static void merge(ArrayList<Integer> list, int left, int middle, int right) {
        ArrayList<Integer> leftList = new ArrayList<>(list.subList(left, middle + 1));
        ArrayList<Integer> rightList = new ArrayList<>(list.subList(middle + 1, right + 1));
        int i = 0, j = 0, k = left;
        while (i < leftList.size() && j < rightList.size()) {
            if (leftList.get(i) <= rightList.get(j)) {
                list.set(k, leftList.get(i));
                i++;
            } else {
                list.set(k, rightList.get(j));
                j++;
            }
            k++;
        }
        while (i < leftList.size()) {
            list.set(k, leftList.get(i));
            i++;
            k++;
        }
        while (j < rightList.size()) {
            list.set(k, rightList.get(j));
            j++;
            k++;
        }
    }

    public void quickSort(ArrayList<Integer> arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = arr.get(right);
        int partitionIndex = partitionQuickSort(arr, pivot, left, right);
        quickSort(arr, left, partitionIndex - 1);
        quickSort(arr, partitionIndex + 1, right);
    }

    private static int partitionQuickSort(ArrayList<Integer> list, int pivot, int left, int right) {
        int partitionIndex = left;
        for (int i = left; i < right; i++) {
            if (list.get(i) < pivot) {
                int temp = list.get(i);
                list.set(i, list.get(partitionIndex));
                list.set(partitionIndex, temp);
                partitionIndex++;
            }
        }
        int temp = list.get(partitionIndex);
        list.set(partitionIndex, list.get(right));
        list.set(right, temp);
        return partitionIndex;
    }

    public void slowSort(ArrayList<Integer> arr) {
        if (arr.size() < 2) {
            return;
        }
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
    }
}

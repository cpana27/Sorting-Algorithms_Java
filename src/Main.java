import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import utils.FileReader;
import utils.Utils;

public class Main {
    public static void main(String[] args) {
        var i = Utils.userInput();
        FileReader fileReader = new FileReader();
        ArrayList<Integer> arr = fileReader.readFile();

        switch (i) {
            case 1:
                Instant startBubbleSort = Instant.now();
                System.out.println("Bubble Sort");
                utils.Launcher.launchBubbleSort(arr);
                Instant endBubbleSort = Instant.now();
                Duration timeElapsed = Duration.between(startBubbleSort, endBubbleSort);
                System.out.println("Time taken: " + timeElapsed.toMillis() / 1000 + " seconds");
                break;
            case 2:
                Instant startInsertionSort = Instant.now();
                System.out.println("Insertion Sort");
                utils.Launcher.launchInsertionSort(arr);
                Instant endInsertionSort = Instant.now();
                Duration timeElapsedInsertion = Duration.between(startInsertionSort, endInsertionSort);
                System.out.println("Time taken: " + timeElapsedInsertion.toMillis() / 1000 + " seconds");
                break;
            case 3:
                Instant startMergeSort = Instant.now();
                System.out.println("Merge Sort");
                utils.Launcher.launchMergeSort(arr);
                Instant endMergeSort = Instant.now();
                Duration timeElapsedMerge = Duration.between(startMergeSort, endMergeSort);
                System.out.println("Time taken: " + timeElapsedMerge.toMillis() / 1000 + " seconds");
                break;
            case 4:
                Instant startQuickSort = Instant.now();
                System.out.println("Quick Sort");
                utils.Launcher.launchQuickSort(arr);
                Instant endQuickSort = Instant.now();
                Duration timeElapsedQuick = Duration.between(startQuickSort, endQuickSort);
                System.out.println("Time taken: " + timeElapsedQuick.toMillis() / 1000 + " seconds");
                break;
            case 5:
                Instant startSlowSort = Instant.now();
                System.out.println("Slow Sort");
                utils.Launcher.launchSlowSort(arr);
                Instant endSlowSort = Instant.now();
                Duration timeElapsedSlow = Duration.between(startSlowSort, endSlowSort);
                System.out.println("Time taken: " + timeElapsedSlow.toMillis() / 1000 + " seconds");
                break;
            case 6:
                Instant startIntroSort = Instant.now();
                System.out.println("Intro Sort");
                utils.Launcher.launchIntroSort(arr);
                Instant endIntroSort = Instant.now();
                Duration timeElapsedIntro = Duration.between(startIntroSort, endIntroSort);
                System.out.println("Time taken: " + timeElapsedIntro.toMillis() / 1000 + "seconds");
                break;
            default:
                System.out.println("Please enter a valid number");
                break;
        }
    }
}
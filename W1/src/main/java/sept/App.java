package sept;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Integer[][] arr = {
            {70, 61, 72, 83, 38},
            {7, 2, 76, 4, 99},
            {28, 9, 13, 78, 19},
            {68, 84, 41, 62, 18},
            {37, 57, 40, 13, 50}
        };

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Array " + (char)('a' + i) + " before sorting: " + Arrays.toString(arr[i]));
            BubbleSort.bubbleSort(arr[i]);
            System.out.println("Array " + (char)('a' + i) + " after sorting:  " + Arrays.toString(arr[i]));
            System.out.println();
        }
    }
}

import java.util.Arrays;
import java.util.Random;

public class Sorts {
    public static void selectionSort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int smallest = data[i];
            int smallIdx = i; //keeps track of smallest and the index its at
            for (int j = i; j < data.length; j++) {
                if (data[j] < smallest) {
                    smallest = data[j];
                    smallIdx = j; //if you find a smaller one, replace all var
                }
            }
            data[smallIdx] = data[i];
            data[i] = smallest; //do a swap swap thingy
        }
    }
    public static void bubbleSort(int[] data) {
        boolean isDone = false;
        while (!isDone) {
            isDone = true;
        }
    }
    public static void main(String[] args) {
        int totalWrongs = 0;

        int[] test1 = {7, 3, 9, 1, 6, 0, 4, 8, 2, 5};
        selectionSort(test1); //ans = [0,1,2,3,4,5,6,7,8,9]
        for (int i = 0; i < test1.length; i++) {
            if (i != test1[i]) {
                System.out.println("omg you failed test1 omg omg");
                System.exit(1);
            }
        }
        System.out.println();

        int[] test2 = new int[0]; //ans = []
        try {
            selectionSort(test2);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("aiyahh you failed test2");
            System.exit(1);
        }
        System.out.println();

        int[] test3 = {7, 3, 9, 1, 6, 0, 4, 8, 2, 5, 6, 2, 4, 1, 9, 0, 3, 7, 8, 5};
        selectionSort(test3); //ans = [0,0,1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9]
        for (int i = 0; i < test3.length; i++) {
            if (i / 2 != test3[i]) {
                System.out.println("omg you failed test3 omg omg");
                System.exit(1);
            }
        }
        System.out.println();

        int[] Ktest1 = {7, 5, 4, 2};
        selectionSort(Ktest1);
        System.out.println();
        int[] Ktest2 = {5, 1, 12, -5, 16, 2, 12, 14};
        selectionSort(Ktest2);
        System.out.println();
    }
}

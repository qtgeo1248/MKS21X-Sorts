import java.util.Arrays;
import java.util.Random;

public class Sort {
    public static void selectionsort(int[] ary) {
        for (int i = 0; i < ary.length; i++) {
            int smallest = ary[i];
            int smallIdx = i; //keeps track of smallest and the index its at
            for (int j = i; j < ary.length; j++) {
                if (ary[j] < smallest) {
                    smallest = ary[j];
                    smallIdx = j; //if you find a smaller one, replace all var
                }
            }
            ary[smallIdx] = ary[i];
            ary[i] = smallest; //do a swap swap thingy
        }
    }
    public static void main(String[] args) {
        int totalWrongs = 0;

        int[] test1 = {7, 3, 9, 1, 6, 0, 4, 8, 2, 5};
        selectionsort(test1); //ans = [0,1,2,3,4,5,6,7,8,9]
        for (int i = 0; i < test1.length; i++) {
            if (i != test1[i]) {
                System.out.println("omg you failed test1 omg omg");
                System.exit(1);
            }
        }

        int[] test2 = new int[0]; //ans = []
        try {
            selectionsort(test2);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("aiyahh you failed test2");
            System.exit(1);
        }

        int[] test3 = {7, 3, 9, 1, 6, 0, 4, 8, 2, 5, 6, 2, 4, 1, 9, 0, 3, 7, 8, 5};
        selectionsort(test3); //ans = [0,0,1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9]
        for (int i = 0; i < test3.length; i++) {
            if (i / 2 != test3[i]) {
                System.out.println("omg you failed test3 omg omg");
                System.exit(1);
            }
        }
        Random rng = new Random();
        for (int idx = 0; idx < 10000; idx++) {//tests 10000 times
            int[] key = new int[1000]; //each with 1000 elements :)))
            int[] test = new int[1000];
            for (int j = 0; j < key.length; j++) {
                int toAdd = rng.nextInt();
                key[j] = toAdd;
                test[j] = toAdd;
            }
            selectionsort(test);
            Arrays.sort(key); //built in sort
            boolean isEqual = true;
            for (int i = 0; i < key.length; i++) {
                if (key[i] != test[i]) {
                    isEqual = false;
                }
            }
            if (!isEqual) {
                totalWrongs++;
            }
        }
        System.out.println("How many wrongs: " + totalWrongs);
    }
}

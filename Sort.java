import java.util.Arrays;

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
        int[] ary = {7, 3, 9, 1, 6, 0, 4, 8, 2, 5};
        selectionsort(ary);
        System.out.println(Arrays.toString(ary));


    }
}

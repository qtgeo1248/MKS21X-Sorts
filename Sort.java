public class Sort {
    public static void selectionsort(int[] ary) {
        for (int i = 0; i < ary.length; i++) {
            int smallest = ary[i];
            int smallIdx = i;
            for (int j = i; j < ary.length; j++) {
                if (ary[j] < smallest) {
                    smallest = ary[j];
                    smallIdx = j;
                }
            }
        }
    }
    public static void main(String[] args) {
    }
}

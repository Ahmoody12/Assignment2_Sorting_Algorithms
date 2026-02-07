public class InsertionSort implements SortingAlgorithm{
    public int[] sorty(int[] input) {
        for (int i = 1; i < input.length; i++) {
            int m = input[i];
            int j = i - 1;
            while (j >= 0 && input[j] > m) {
                input[j + 1] = input[j];
                j--;
            }
            input[j + 1] = m;
        }
        return input;
    }
}

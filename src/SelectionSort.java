public class SelectionSort implements SortingAlgorithm{
    @Override
    public int[] sorty(int[] array){
        int small;
        int temp;
        for (int i = 0;i < array.length -1; i++){
            small = i;
            for (int j = i+1; j < array.length; j++){
                if (array[j] < array[small]){
                    small = j;
                }
            }
            temp = array[i];
            array [i] = array[small];
            array[small] = temp;
        }
        return array;
    }
}

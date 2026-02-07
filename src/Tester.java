import java.util.Random;

public class Tester {
    private Sortable sa;

    public Tester(Sortable sa) {
        this.sa = sa;
    }

    public double singleTest(int size) {
        int[] array = new int[size];
        Random number = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = number.nextInt();
        }

        long startTime = System.nanoTime();
        sa.sorty(arr);
        long endTime = System.nanoTime();
        //Searched up how many nanoseconds in a millisecond and divided by the number to get the milliseconds
        return (endTime - startTime)/1000000;
    }

    public double test(int interations, int size) {
        double FinalTime;

        for (int i = 0; i < interations; i++) {
            FinalTime += singleTest(size);
        }
        double avgTime = FinalTime / interations;

        return avgTime;
    }
}
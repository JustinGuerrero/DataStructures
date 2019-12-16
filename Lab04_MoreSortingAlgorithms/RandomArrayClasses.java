package Lab04_MoreSortingAlgorithms;

import Lab02.StopWatchCPU;

import java.util.Arrays;
import java.util.Random;

public class RandomArrayClasses {

    static Integer[] array1 = new Integer[1000000];
    static Integer[] array2 = new Integer[1000000];

    static Random rand = new Random();
    static Lab02.StopWatchCPU timer = new StopWatchCPU();



    public static void main(String[] args) {
        for (int i = 0; i < array1.length; i++) {
            array1[i] = rand.nextInt(10000);
        }
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];

        }
        //System.out.println(Arrays.toString(array1));
        //System.out.println(Arrays.toString(array2));
        MergeSort.sort(array1);
        System.out.println("Elapsed time for MergeSort " + timer.elapsedTime());

        QuickSort.sort(array2);
        System.out.println("Elapsed time for QuickSort " + timer.elapsedTime());

        //System.out.println(Arrays.toString(array1));
        //System.out.println(Arrays.toString(array2));

    }


}

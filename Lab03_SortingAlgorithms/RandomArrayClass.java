package Lab03_SortingAlgorithms;

import Lab02.StopWatchCPU;

import java.util.Random;
import java.util.Arrays;



public class RandomArrayClass {
    public static void main(String[] args) {
        Lab02.StopWatchCPU timer = new StopWatchCPU();
        Random rando = new Random();


        // Create three Integer arrays to fill with random numbers
        // Make the max size 5000 per MaryAnn

        Integer[] array1 = new Integer[5000];
        Integer[] array2 = new Integer[5000];
        Integer[] array3 = new Integer[5000];

        // Using for loop we will fill each array with random numbers bounded at 5000
        // as to try to avoid too much repitition for speed purposes.

        for (int i = 0; i < array1.length; i++) {
            array1[i] = rando.nextInt(5000);
            array2[i] = rando.nextInt(5000);
            array3[i] = rando.nextInt(5000);

        }
        // Call each function to sort an array and run the StopWatchCpu class to time the
        // speed of each given sort method.
        // the stars and dashes are added for seperation purposes.

        InsertionSort.sort(array1);
        System.out.println("elapsed time = " + timer.elapsedTime());

        System.out.println("****************-------------**************-------------");

        SelectionSort.sort(array2);
        System.out.println("elapsed time = " + timer.elapsedTime());

        System.out.println("****************--------------------*************---------");

        ShellSort.sort(array3);
        System.out.println("elapsed time = " + timer.elapsedTime());



    }
}

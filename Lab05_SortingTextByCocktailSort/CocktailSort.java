package Lab05_SortingTextByCocktailSort;


import java.util.Arrays;

public class CocktailSort {

    void MyFavoriteCocktail(Comparable array[]) {

        boolean swap = true;
        int start = 0;
        int end = array.length;

        while (swap == true) {
            // we must reset the boolean every time, just in case
            // the value from the loop throws us off upon entering
            // another iteration.
            swap = false;

            // the for loop will do a version of bubble sort here
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].compareTo(array[i + 1])>0) {
                    Comparable temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swap = true;
                }
            }

            if (swap == false)
                break;

            swap = false;

            end = end - 1;

            for (int i = end - 1; i > start; --i) {
                if (array[i].compareTo(array[i + 1])<0) {
                    Comparable temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swap = true;
                }
            }
            start = start + 1;
        }
        //System.out.println(Arrays.toString(array));
    }
}

package Lab05_SortingTextByCocktailSort;

import Lab02.StopWatchCPU;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ParseText {
    public static void main(String[] args) throws Exception {
        CocktailSort sazerac = new CocktailSort();

        File file = new File("manifesto.txt");
        File file2 = new File("reals.txt");
        Scanner src = new Scanner(file);
        Scanner src2 = new Scanner(file2);


        ArrayList temp = new ArrayList();
        while (src.hasNext()) {
            temp.add(src.next());
        }
        System.out.println(temp);

        String[] mani = new String[temp.size()];

        // ArrayList to Array Conversion
        for (int i = 0; i < temp.size(); i++)
            mani[i] = (String) temp.get(i);

        for (String x : mani)
            System.out.print(x + " ");

        StopWatchCPU timer = new StopWatchCPU();
        System.out.println(mani);
        sazerac.MyFavoriteCocktail(mani);
        System.out.println("This string has this many numbers" + mani.length);
        System.out.println("elapsed time = " + timer.elapsedTime());
        System.out.println(Arrays.toString(mani));
        System.out.println("");


        ArrayList temp2 = new ArrayList();
        while (src2.hasNextLine()) {
            temp2.add(src2.nextLine());
        }
        //System.out.println(temp2);

        String[] real = new String[temp2.size()];

        // ArrayList to Array Conversion
        for (int i = 0; i < temp2.size(); i++)
            real[i] = (String) temp2.get(i);

        for (String x : real)
            System.out.print(x + " ");

        StopWatchCPU timer2 = new StopWatchCPU();
        System.out.println("");
        System.out.println("This string has this many numbers" + real.length);
        sazerac.MyFavoriteCocktail(real);
        System.out.println(Arrays.toString(real));
        System.out.println("elapsed time = " + timer.elapsedTime());




    }
}


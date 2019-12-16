package Program_two_BinarySearchTree;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

public class ReadIt {
    BinarySearchTree bin = new BinarySearchTree();
    File file = new File("C:\\Users\\Justin Guerrero\\Documents\\CSCI 232\\classes.csv");

    public ReadIt() throws FileNotFoundException {
        BufferedReader csvReader = new BufferedReader(new FileReader(file));
        Object row = null;
       // MSUCOURSES msu = new MSUCOURSES((String) row);
        Queue q = new Queue();
        while(csvReader != null){

        }
    }



}

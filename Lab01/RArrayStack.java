package Lab01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class RArrayStack<E> {
    private E[] a, b;  // holds the items
    private int N;       // number of items in stack

    // create an empty stack with given capacity
    // Constructor is changed so it is not looking for a value, and
    // array has capacity of 8 per instructions
    public RArrayStack() {
        a = (E[]) new Object[8];
        N = 0;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public boolean isFull() {
        return N == a.length;
    }


    // the push function was modified to check if it's full
    // and call the resize function.
    public void push(E item) {
        if (!this.isFull()) {
            a[N++] = item;

        } else {
            this.resize(2);
            a[N++] = item;
        }
    }

    public E pop() {
        return a[--N];
    }

    public E peek() {
        return a[N - 1];
    }


    //resize function created to double the array size if the
    // array is full.

    public void resize(int capacity){
            capacity = a.length * capacity;
            b = (E[]) new Object[capacity];
            for (int i = 0; i < a.length ; i++) {
                b[i] = a[i];
            }
            a = b;
    }

    public Iterator<E> iterator() {
        return new ReverseArrayIterator();
    }

    public class ReverseArrayIterator implements Iterator<E> {
        private int i = N - 1;

        public boolean hasNext() {
            return i >= 0;
        }

        public E next() {
            if (!hasNext()) throw new NoSuchElementException();
            return a[i--];
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        /*
        Below we will create a constructor for each the TinyTale text and the numbers function
        they also will each have their own file scnners to import and read the file.
        I have mine reading from my computers memory so you might have to change to args[0]
        and read from command line however.
        after which you will see the call for push and pop.

         */
        RArrayStack newStack = new RArrayStack(){};
        RArrayStack newStack2 = new RArrayStack(){};

        String friend = null;
        String friend2 = null;


        File file = new File("C:\\Users\\Justin Guerrero\\Documents\\CSCI 232\\tinyTale.txt");
        Scanner src = new Scanner(file);

        File file2 = new File("C:\\Users\\Justin Guerrero\\Documents\\CSCI 232\\numbers.txt");
        Scanner src2 = new Scanner(file2);


        while (src.hasNextLine()) {
            friend = src.next();
            newStack.push(friend);
        }

        while(!newStack.isEmpty()){
            System.out.println(newStack.pop());
        }

        while (src2.hasNextLine()) {
            friend2 = src2.next();
            newStack2.push(friend2);
        }

        while(!newStack2.isEmpty()){
            System.out.println(newStack2.pop());
        }

    }
}
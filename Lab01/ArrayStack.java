package Lab01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ArrayStack<E> {
    private E[] a,b;  // holds the items
    private int N;       // number of items in stack

    // create an empty stack with given capacity
    public ArrayStack(int capacity) {
        a = (E[]) new Object[capacity];
        N = 0;
    }

    public ArrayStack() {

    }

    public boolean isEmpty() {
        return N == 0;
    }

    public boolean isFull() {
        return N == a.length;
    }

    public void push(E item) {
        a[N++] = item;
    }

    public E pop() {
        return a[--N];
    }

    public E peek() {
        return a[N - 1];
    }
    public Iterator<E> iterator() {
        return new ReverseArrayIterator();
    }

    public class ReverseArrayIterator implements Iterator<E> {
        private int i = N-1;

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


 */
        ArrayStack newStack = new ArrayStack(450){};
        ArrayStack newStack2 = new ArrayStack(300);
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

        System.out.println("----------------------------");


        while (src2.hasNextLine()) {
            friend2 = src2.next();
            newStack2.push(friend2);
        }

        while(!newStack2.isEmpty()){
            System.out.println(newStack2.pop());
        }



    }
}
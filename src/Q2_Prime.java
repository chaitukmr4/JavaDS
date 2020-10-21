import java.util.LinkedList;
import java.util.Queue;

public class Q2_Prime<T extends  Object> {
    private java.util.LinkedList<T> queue = new java.util.LinkedList<T>();

    //adding element to the queue
    public void add(T value){
        queue.addLast(value);
    }

    //remove the element from the queue
    public T remove(){
        return queue.removeFirst();
    }

    //check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    //get the size of the queue
    public int size(){
        return queue.size();
    }

    public static void main(String[] args){
        Q2_Prime<Integer> queuePrime = new Q2_Prime<Integer>();
        int i = 0;
        while (queuePrime.size() < 50) {
            if(isPrime(i) && i > 1) //the prime numbers start from 2 and the total queue should have 50 prime numbers
                queuePrime.add(i);
            i++;
        }

        System.out.println("The first 50 prime numbers ");
        while (!queuePrime.isEmpty()) // check if the queue is empty and print the values
            System.out.print(" "+ queuePrime.remove()); //remove the item from the queue

    }

    //Method to check if the given value is prime
    public static  boolean isPrime(int n) {
        for (int i = 2; i <= n/2 ; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
}

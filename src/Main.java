// https://docs.oracle.com/javase/7/docs/api/java/util/Queue.html

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<>();
        myQueue.offer("Jim");
        myQueue.offer("Tom");
        myQueue.offer("Mike");

        for(String element : myQueue){
            System.out.print(element + " ");
        }
        System.out.println("are in the queue and the 1st customer in the queue is " + myQueue.poll());


        for(String element : myQueue){
            System.out.print(element + " ");
        }
        System.out.println("are in the queue and the 1st customer in the queue is " + myQueue.element()); //返回第一个元素

        for(String element : myQueue){
            System.out.print(element + " ");
        }
        System.out.println("are in the queue and the 1st customer in the queue is " + myQueue.peek()); //返回第一个元素
    }
}

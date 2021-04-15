package Collection;
import javax.jws.soap.SOAPBinding;
import java.util.*;
public class Queue {
    public static void main(String[] args) {


        PriorityQueue<String> queue=new PriorityQueue<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("A");
        queue.offer("M");

        System.out.println(queue);

        System.out.println("queue.element() = " + queue.element()); //both gets the head element but this will throw exception if queue is empty
        System.out.println("queue.peek() = " + queue.peek()); //both gets the head element but this will throw null if queue is empty

        //return and remove

        queue.remove();
        queue.remove();
        System.out.println(queue);




        System.out.println("queue.poll() = " + queue.poll());

        System.out.println(queue);

        queue.remove();
        queue.poll();

        //System.out.println("queue.remove() = " + queue.remove()); //when there is no element throws exception
        System.out.println("queue.poll() = " + queue.poll());   //when there is no element throws null


    }
}

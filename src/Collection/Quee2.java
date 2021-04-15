package Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Quee2 {
    public static void main(String[] args) {

        PriorityQueue<Integer> mrt=new PriorityQueue<>();
        mrt.add(3);
        mrt.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println("  mrt  "+mrt);

        mrt.offer(25);
        System.out.println(mrt);

        System.out.println("mrt.element() = " + mrt.element());
        System.out.println("mrt.peek() = " + mrt.peek());

        System.out.println("mrt.remove() = " + mrt.remove());
        System.out.println("mrt.poll() = " + mrt.poll());
        System.out.println(mrt);
        Iterator<Integer> iterator = mrt.iterator();

        while (iterator.hasNext()){
            Integer each = iterator.next();
            System.out.println(each);
        }

        System.out.println(mrt);








    }
}

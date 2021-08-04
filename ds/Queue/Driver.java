import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
    Queue q = new Queue();
    int size = q.size();
    boolean isEmpty = q.isEmpty();

  System.out.println("Size:" + size);
  System.out.println("Is it empty?:" + isEmpty);

  q.enqueue("Sara");
  q.enqueue("Tanner");
  q.enqueue("Lyuba");
  q.enqueue("Michelle");
  /*System.out.println(q.front());
  */
  System.out.println("Queue before: " + q);
  System.out.println("Dequeueing: " + q.dequeue());
  System.out.println("Queue after dequeue: " + q);
  }//end of main
}
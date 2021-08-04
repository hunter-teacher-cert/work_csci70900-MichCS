import java.io.*;
import java.util.*;

/*Create a class that represents a queue. 
This class should use a linked list that you build (not the built in Java class) with at least two pointers. Your class should implement the following methods:





*/

public class Queue {
  //instance variable
  private Node front;
  //identify the number of items in the queue
  private int length;


  public Queue() //constructor (same name as class)
  {
    front = null; //instance variable (constructor)
  } //end of constructor
      //creating a new constructor so you can pass an argument the name of a node that already exists; 

  public Queue(Node myFirstNode) { //constructor that takes a paramater ex. to tell who is the first person on line
    front=myFirstNode;
  } //end of constructor

//size() <-- returns the number of items in the queue
  public int size(){
    return length;
  }

//isEmpty() <-- returns true if the queue is empty
  public boolean isEmpty() {
    if (front == null)
      return true; 
    return false;
  }


/*enqueue(value) <-- add value to the end of the queue 
Thoughts: Does this method return anything? If so, what?
1st scenario: There isn't a line - so add data to front
2nd scenario: There is a line - so extend the line( add data to back of line)*/
  public void enqueue(String value) {
    //initialize
    Node newNode=new Node (value); //constructor called to create object we are inserting

    //scenario 1: the queue is empty so far
    if (isEmpty())
    {
      front = newNode; //add an insert (1st scenario)
      length++;
      return;
    } 
    //scenario 2: there are already Nodes in the Queue  
    else {
      Node currentNode=front; //constructor. pointer. An object, placeholder. (alias)
      
    while (currentNode.getNext() != null){ //there is nothing after this node | "Do you have someone after you 'Are you empty?'"
	    currentNode = currentNode.getNext();
    } 
    //change the arrows so that currentNode's next points to newNode
      currentNode.setNext(newNode);
      length++;
    }
  
  }


  public String toString(){
    Node currentNode=front; //constructor. pointer. An object, placeholder. (alias)
    String result = "";
    while (currentNode != null){ //there is nothing after this node | "Do you have someone after you 'Are you empty?'"
    result += currentNode.getData() + " " ; //goes down the list
	  currentNode = currentNode.getNext();
    } 
    return result;
  }


  //x = front() <-- return but don't remove the value at the front
  public String front(){
    //check if front is null, if so, return null
       if (front == null)
      return null; 
    return front.getData();
  }

//x = dequeue() <-- remove and return the value at the front of the queue

    public String dequeue(){
//check if front is null, if so, return null
      if (front == null)
      return null;
      //declare and initialize a variable to hold the data at the front for returning later
      String hold = front.getData();
      //set the next of front to be the next Node after that
      Node next = front.getNext();
      front = next;
      //decrease the length
      length--;
      //return the variable with the data which we declared and initialized previously
      return hold;

    }

}
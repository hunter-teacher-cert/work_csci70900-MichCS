/**
Michelle Best, Dwayne Levene, Stephannia Kabanakis
   lab skeleton
   encapsulation / SuperArray
   SuperArray is a wrapper class for an array.
   Provides "pass-thru" accessibility to array capabilities:
   - get/set by index
   - get length
   Adds functionality:
   - dynamic capacity
   - auto-grow capacity if necessary
 **/
import java.io.*;
import java.util.*;
public class superArray{
  //instance vars
  private int[] data;           //where the actual data is stored
  private int numberElements;   //number of "meaningful" elements
  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  //overloaded constructor -- allows specification of initial capacity
  public superArray( int size ){
  this.data = new int [size];
  numberElements = 0;
  }
  //default constructor -- initializes capacity to 10
  public superArray(){
      numberElements = 0;
    this.data = new int [10];
  }
  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
  //Suggestion to accomplish this one first
  // test to see if we need to grow, then grow
  //This method checks to see if all the elements in the index are filled. If so, method will grow index.
  public void add( int value ){ //data = value
	  if (this.data.length == numberElements ) {
		  grow();
	  }
    // SIMPLE VERSION DOES NOT AUTO-GROW CAPACITY; INSERT MORE CODE HERE LATER
    // add item
	//view image attached in readme as an example. 
	  this.data[numberElements] = value; //Value is inserted in the index.
    // increment numberElements
	  numberElements++;
  }//end add()
  public void add(int index, int value){ //consider renaming method //current # of elements is 15
   if (numberElements == data.length){ // when the array is currently full/max - extend another index and element
     grow();
   }
   for(int i = numberElements; i > index; i--){ // starting at the last meaningful data point in array(15), moving left
     data[i] = data[i - 1]; // current now equals previous, i.e. shift each data point one index to the right
   }
   data[index] = value;// replace the value at the chosen index with the new value
   numberElements++; // increment numberElements
 }
  public void remove(int Index) {
 for(int i =Index; i< numberElements -1 ; i++) {
 data[i] = data[i+1];
 }
 data[numberElements-1]= 0;
 numberElements--;
  }
  //Is the index empty? 
  public boolean isEmpty(){
 boolean Empty = true;
 for (int i= 0; i<data.length; i++) {
     // if the current element is NOT 0, return false (will end method early)
     if (data[i] != 0){
     Empty = false;
     return Empty;
     }
 }return Empty;
  }
//Suggested 3rd task to complete
  //Getter
  public int get()
  {
 int Index = 0;
 for (int i=0; i<this.data.length; i++) {
 Index++;
 }
 return Index;
  }
//Suggested: 2nd complete this method
  public String toString()
  {
 String string = "{";
   for(int i = 0; i <= data.length-1; i++){ //When index is less than 15, add one. 
     string = string + data[i] + ","; 
   }
   return string + "}";
  }//end toString()
  //helper method for debugging/development phase
  public String debug()
  {
    String s = "";
    s = "Size: " + this.data.length;
    s = s + " LastItem: " + numberElements + "  Data: ";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }//end debug()
  private void grow()
  {
    // create a new array with extra space
    // Q: How did you decide how much to increase capacity by?
 int [] newArray  = new int[numberElements * 2]; //modify to anything
    // copy over all the elements from the old array to the new one
 for(int i=0; i<this.data.length; i++) {
 newArray[i] = this.data[i];  //new elements in index
 }
    // point data to the new array
 	this.data = newArray;
    // Q: How does this look when illustrated using encapsulation diagram?
 	// Answer: A new array is created using the old array's data.
  }//end grow()
}//end class
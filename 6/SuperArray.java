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
public class SuperArray {


  //instance vars
  private int[] data;           //where the actual data is stored
  private int numberElements;   //number of "meaningful" elements
  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  //overloaded constructor -- allows specification of initial capacity
  public superArray( int size ){
     this.data = new int [size]; //initializer
     numberElements = 0; //initializer
     } //end of constructor




  //default constructor -- initializes capacity to 10
  public superArray(){
      numberElements = 0; //initializer
      this.data = new int [10];//number of elements (array)
       }// end of constructor



  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
  //Suggestion to accomplish this one first
  // test to see if we need to grow, then grow



  //This method checks to see if all the elements in the index are filled. If so, method will grow index.
  public void add( int value ){ //data = value
	    if (this.data.length == numberElements ) {
		  grow();
	    } //end of if statement
    // SIMPLE VERSION DOES NOT AUTO-GROW CAPACITY; INSERT MORE CODE HERE LATER


    // add item
	//view image attached in readme as an example. 
	    this.data[numberElements] = value; //Value is inserted in the index.


    // increment numberElements
	    numberElements++;
       }//end add method


//To insert values in a specified index for the array
  public void add(int index, int value){ //consider renaming method         //current # of elements is 15
      if (numberElements == data.length){ // when the array is currently full/max - extend another index and element
      grow(); //calls the grow method
      } //end of if statement


      for(int i = numberElements; i > index; i--){ // starting at the        last meaningful data point in array(15), moving left
          data[i] = data[i - 1]; // current now equals previous, i.e. shift each data point one index to the right
          } //end of for loop



    data[index] = value;// replace the value at the chosen index with the new value
    numberElements++; // increment numberElements
  } //end of method


//To remove a number from the array
  public void remove(int Index) {
      for(int i =Index; i< numberElements -1 ; i++) {
      data[i] = data[i+1];
      } //end for loop

  //setting the last number to 0. (Since it removing numbers and shifting to the left)
  data[numberElements-1]= 0;
  numberElements--;
  } //end method
  //Is the index empty? 


//
  public boolean isEmpty(){
      boolean Empty = true;
      for (int i= 0; i<data.length; i++) {
      // if the current element is NOT 0, return false (will end method early)
      if (data[i] != 0){
      Empty = false;
      return Empty; //return "empty" if it is false
      } //end of if statement

      }return Empty; //end of for loop
  } //end of boolean method
  
  //Suggested 3rd task to complete
  //Getter Method - What is the index?
  public int get() {
     int Index = 0;
     for (int i=0; i<this.data.length; i++) {
    Index++;
    } //end of loop
    return Index;
  } //end of get method


//Suggested: 2nd complete this method
//To convert our array into text (meaningful or non-meaningful)
  public String toString(){
    String string = "{";
    for(int i = 0; i <= data.length-1; i++){ //When index is less than 15, add one. 
    string = string + data[i] + ","; 
    } //end of loop
    return string + "}";
  }//end toString() method
  //helper method for debugging/development phase


  //Debug method
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


  //Grower Method
  private void grow(){
    // create a new array with extra space
    // Q: How did you decide how much to increase capacity by?
  int [] newArray  = new int[numberElements * 2]; //modify to anything
    // copy over all the elements from the old array to the new one
    for(int i=0; i<this.data.length; i++) {
    newArray[i] = this.data[i];  //new elements in index
    } //end of loop

   
 	  this.data = newArray; // point data to the new array


  }//end grow() method
}//end class


    // Q: How does this look when illustrated using encapsulation diagram?
 	  // Answer: A new array is created using the old array's data.
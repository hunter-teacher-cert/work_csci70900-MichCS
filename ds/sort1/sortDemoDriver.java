import java.io.*;
import java.util.*;

public class SortDemoDriver { //call to the 1st constructor
    public static void main(String[] args) {

	SortDemo sd = new SortDemo(); //call to the second constructor
	System.out.println(sd);

	SortDemo sd2 = new SortDemo(20);
	System.out.println(sd2);
		
	/* part 2 test lines */
	/*
	  int i;
	i = sd.findSmallestIndex();
	System.out.println("sd["+"] = "+sd.get(i)+" : " + sd);
	i = sd2.findSmallestIndex();
	System.out.println("sd2["+"] = "+sd2.get(i)+" : " + sd2);
	*/
	
	/* part 3 test lines */
	/*
	  System.out.println(sd);
	  sd.sort();
	  System.out.println(sd);
	*/
    }
}
© 2021 GitHub, Inc.
Terms
Privacy
Security
Status
Docs
Contact GitHub
Pricing
API
Training
Blog
About
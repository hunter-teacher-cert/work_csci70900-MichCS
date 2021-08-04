/**
 * Team 
 * Michelle Best
 * Michelle Persaud
 * Eric Liu
 */

import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {
		boolean solved;
	
		
		//Start randomly on the user accessible board
		//test random start
		int boardSize = 5;
		Random rand = new Random();

		Knights k = new Knights(boardSize);
		solved = k.solve(4,4,1); //selecting a specific place where there is a solution
		

		
    }//end main()
}
package graphTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class graphTest{    
     public static void main(String []args){
    	 
    	int multiplier = 1;
        
        for (int i = 1; i < 5; i++) {
        	multiplier *= 10;
        	System.out.println("Testing Graph with size of " + multiplier);
        		for (int j = 0; j < 10; j++) {
        			System.out.println("Running Test " + j);
        			Graph g = new Graph(multiplier);
        			//g.printGraph();
        			System.out.println(g.findLargestSet());
        		}
        }
     }
}
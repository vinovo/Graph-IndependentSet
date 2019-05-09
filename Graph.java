package graphTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Graph {
    Node[] nodeLst;
    
    Graph(int size) {
    	generateGraph(size);
    }
    
    public void generateGraph(int size) {
    	nodeLst = new Node[size];
    	
        for (int i = 0; i < size; i++) {
        	nodeLst[i] = new Node(i, size);
        }
        
        // set up neighbors
        for (int i = 0; i < size; i++) {
        	for (int j = i + 1; j < size; j++) {
        		double x = Math.random();
        		
        		if (x > 0.5) {
        			nodeLst[i].neighbors[j] = true;
        			nodeLst[j].neighbors[i] = true;
        			nodeLst[i].neighborSize++;
        			nodeLst[j].neighborSize++;
        		}
        	}
        }
    }
    
    public int findLargestSet() {
    	ArrayList<Node> lst = new ArrayList<Node>(Arrays.asList(nodeLst));
    	int count = 0;
    	
    	while(!lst.isEmpty()) {
    		Collections.sort(lst);
    		
    		Node min = lst.get(0);
    		for (int i = 0; i < min.neighbors.length; i++) {
    			if (min.neighbors[i]) {
    				min.neighbors[i] = false;
    				//min.neighborSize--;
    				lst.remove(nodeLst[i]);
    			}
    		}
    		
    		lst.remove(min);
    		count++;
    	}
    	
    	return count;
    }
    
    public void printGraph() {
    	for (int i = 0; i < nodeLst.length; i++) {
    		System.out.println(nodeLst[i].neighborSize);
    	}
    	
    }
}
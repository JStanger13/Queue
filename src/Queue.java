import java.util.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Queue {

	
	private static int size;
	private static LinkedList<Integer> printQueue;
	
	public void Push(int x){ 
		//stick in the back of the linked list
		size++;
		printQueue.add(x);
	}
	
	public int Pop(){
		//Take out from the front of the linked list
		if(size > 0){
			size--;
			return printQueue.remove();
		} else {
			System.out.println("There are no more Jobs in Queue");
			return 0; 	
		}
	}
	
	public void Print(){
		Iterator<Integer> i = printQueue.iterator();
		
		System.out.println("Starting Queue");
		
		while(i.hasNext()){
			 int temp = i.next();
			 System.out.println(temp); 
		}
		
		System.out.println("Queue ended");
		
	}
	
	public static int GetSize(){
		return size;
	}

	public Queue(){
		size = 0;
		printQueue = new LinkedList<Integer>();	
	}
}
	


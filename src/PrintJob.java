import java.util.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


	
public class PrintJob {

	public static void main (String [] args){
		//call printNuum with value 8
		//printNum(8);		
		
		//call printNUm with a variable that has value 5
		
		//printNum(j);
		
		Stack q = new Stack();
		//call ReadFile w/ a variable that has the file name and print the boolean returned
		//by the function
		
		
		String vText = new String("src/text.txt");
			
		if(ReadFile(vText, q) == true){
			System.out.println("No errors found");
		}else{
			System.out.println("Your code has errors");
		}
		
	} 
	public static void printNum(int num){
		System.out.println(num);
	}
	
	public static boolean ReadFile(String Reading, Stack q){
		BufferedReader br;
		boolean status = true;
		try{
			br = new BufferedReader(new FileReader(Reading));
			try{
				String x;
				while ((x = br.readLine()) != null){
					// printing out each line in the file
					System.out.println("ReadFile(): " + x + "(" + x.length() + ")");
					
					//process each line and run the command specified in that line
					processLine(x, q);
				}
			}
			catch (IOException  e){
				e.printStackTrace();
				status = false;
			}
		}
		catch (FileNotFoundException e) {
			System.out.println(e);
			e.printStackTrace();
			status = false;
		}
		return status;
	}

	public static void processLine(String s, Stack q){
		//i.e. s = "push 100" or "pop" or "print"
			
		if(s.substring(0,2).equals("pu")){
			
			String letterNum = s.substring(5);
			int numLet = Integer.parseInt(letterNum);
			q.Push(numLet);
		}
		else if(s.equals("pop")){
			System.out.println("Now Popping " + q.Pop());			
		}
		else if(s.equals("print")){
			q.Print();
		}
		else{
			System.out.println("Command " + s + " not recognized");
		}
	}
}



package task1;

import java.util.ArrayList;
import java.util.List;


public class Round {

	public static void main(String[] args) {
		
		List <Integer> nums = new ArrayList<Integer>();
		
		if (args.length==0) {
			System.out.println("No args passed");
			System.exit(1);
		}else {
			nums.add(Integer.parseInt(args[0]));
			nums.add(Integer.parseInt(args[1]));
		}
	
		int size = nums.get(0);// size of massive
		if (size==0&&size<0) {
			System.out.println("massive is zero or less");
			System.exit(1);}
		
		int steps = nums.get(1); // steps to go
		if (steps==0&&steps<0) {
			System.out.println("step is zero or less");
			System.exit(1);}
		
		List <Integer> massive = new ArrayList<Integer>(); 
		for (int i = 1; i<size+1; i++) {
			massive.add(i);
		}//make massive with numbers based on data provided
		
		int finish = 0; //last number of iteration
		int start = massive.get(0); // first number of iteration
		
		int begin = massive.get(0); // first massive number
	
		List <Integer> answer = new ArrayList<Integer>(); // answer array to print
			
		while (begin!=finish){
			answer.add(start);
			finish = massive.get((start-1+steps-1)%size);
			start = finish;
			}// iterate over massive using proved steps
		

		for (Integer a:answer) {
			System.out.print(a);
		}
		
	}
	


}

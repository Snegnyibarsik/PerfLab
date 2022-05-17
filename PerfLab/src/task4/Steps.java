package task4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Steps {

	public static void main(String[] args) throws FileNotFoundException {
		List <Integer> nums = new ArrayList<Integer>();
		Scanner sc = new Scanner(new File(args[0]));
		
		do {
		nums.add(sc.nextInt());
		} while (sc.hasNext());
			
		List <Integer> dif = new ArrayList<Integer>();
				
		for (int j = 0; j<nums.size()-1; j++) {
				dif.add((nums.get(j)-nums.get(j+1)));
		}

		int stepPlus = 0;
		int stepMinus = 0;
		
		for (Integer i:dif) {
			if (i<0) {
				stepMinus = stepMinus +i;
			}else {
				stepPlus = stepPlus +i;
			}
		}
		
		if (stepPlus>Math.abs(stepMinus)) {
			System.out.println(stepPlus);
			}else {System.out.println(Math.abs(stepMinus));
		}
	
	}

}

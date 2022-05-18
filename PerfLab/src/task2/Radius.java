package task2;

import java.io.File;
import java.util.Scanner;

public class Radius {

	public static void main(String[] args) throws Exception {
		//curcle data
		float centerX = 0;
		float centerY = 0;
		float radius = 0;
		
		Scanner one = new Scanner(new File(args[0]));
				
		centerX = one.nextFloat();
		centerY = one.nextFloat();
		one.nextLine();
		radius = one.nextFloat();
		
		//point data
		float pointX = 0;
		float pointY = 0;
		
		
		Scanner two = new Scanner(new File(args[1]));
		do {
			pointX = two.nextFloat();
			pointY = two.nextFloat();
			System.out.println(check(centerX,centerY,radius,pointX,pointY));
		}while (two.hasNext());

	}
	
	public static int check (float x0, float y0, float r, float x1, float y1) {
		int result = 0;
		float interim = (float) Math.pow((x0-x1), 2) + (float) Math.pow((y0-y1), 2);
		float radiusInPow = (float) Math.pow(r, 2);
		
		if (interim==radiusInPow) {
			result = 0;
		}else if (interim<radiusInPow) {
			result = 1;
		}else {	result = 2;}
			
		return result;
			
	}

}

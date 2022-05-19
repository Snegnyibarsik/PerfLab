package task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Radius {

	public static void main(String[] args) throws Exception{
		
		float centerX = 0;
		float centerY = 0;
		float radius = 0; //circle data
		
		if (args.length==0) {
			System.out.println("No args passed");
			System.exit(1);
		}// if command line is empty
		
		Scanner one = new Scanner(new File(args[0]));
		
		if (one.hasNext()!=true) {
			System.out.println("No args passed");
			System.exit(1);
		}// if file is empty
		
		if (one.hasNextFloat()) {
		centerX = one.nextFloat();}
		else {System.out.println("No floats passed");
		System.exit(1);}//if no floats inside
		
		if (one.hasNextFloat()) {
			centerY = one.nextFloat();}
			else {System.out.println("No floats passed");
			System.exit(1);}//if no floats inside
		
		if (one.hasNext()) {		
		one.nextLine();
		if (one.hasNextFloat()) {
		radius = one.nextFloat();
		} else {System.out.println("No floats passed");
		System.exit(1);}}//if no floats inside
		
		if (radius<0!=false) {
			System.out.println("Radius is less than zero");
			System.exit(1);//if radius is negative
		}
		
		one.close();//all data for Radius captured
		
		
		
		float pointX = 0;
		float pointY = 0;//point data
		
		
		Scanner two = new Scanner(new File(args[1]));
		
		if (two.hasNext()!=true) {
			System.out.println("No args passed");
			System.exit(1);
		}// if file is empty
			
		
		try {
			do {
				pointX = two.nextFloat();
				pointY = two.nextFloat();
				System.out.println(check(centerX,centerY,radius,pointX,pointY));
			}while (two.hasNext());
		}catch (Exception e) {
			System.out.println("No floats passed");
		}// if passed arguments are not floats
		
		two.close();

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
			
	}// calculate position of the point relative to the circle 

}

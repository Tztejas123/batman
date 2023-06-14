package conditionalstatements;

import java.util.Scanner;

public class Sampleclass7 {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the Age: ");//accourding to this Age all statement always in Age//
		int Age=sc.nextInt();
		if (Age>1&&Age<18) {
			System.out.println("you are child");
		} else {
			System.out.println("you are adult");

		}/*if there are lots of statements then use if else channing we save image on home screen*/
	}

}

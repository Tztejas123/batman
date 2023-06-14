package conditionalstatements;

import java.util.Scanner;

public class Sampleprob1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");

		int i=sc.nextInt();
		
		//int b=50;
		if (i>49) {
			System.out.println("you are chutiya");
		}else if (i<49) {
			System.out.println("you are not ctutiya");
		}else {
			System.out.println("you are hushar");
		}
	}
}
package conditionalstatements;

import java.util.Scanner;

public class Conditionalstatements {//1. Write a Java program to get a number from the user and print whether it is positive or negative.//
	public static void main(String[] args) {
		System.out.println("Enter the input");//set a blue dot its called breakpoint and f11 for debug//Prints a String and then terminate the line. This method behaves asthough it invokes print(String) and then println().
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		
		if(i > 0)
		{
			System.out.println("number is Positive");
		}
		else if (i < 0) //(input < 0)negative//
		{
			System.out.println("number is negative");
		}
		else
		{
			System.out.println("number is zero");
		}
	}
}
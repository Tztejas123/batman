package conditionalstatements;

import java.util.Scanner;

public class Sampleclass5 {
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the age: ");
		int age=sc.nextInt();
		if (age>=1&&age<18) {//2 no condition true hogi tab hi ye println wali condition true hogi otherwise it will false//
			System.out.println("you are child");
		}
	}
 
}

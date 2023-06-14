package conditionalstatements;

import java.util.Scanner;

public class Sampleclass8 {//every time all three conditions shold be same means < this should come all 1st condition of every 1st statemsts and so on// 
	public static void main(String[] args) {//1st statement is greater and next statement is smaller
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age=sc.nextInt();
		if (age>1&&age<18) {
			System.out.println("you are child");
			
		} else if (age>=18&&age<50) {
			System.out.println("you are a man");
			
		} else if (age>=50&&age<70) {
			System.out.println("bhagwan ka name japo");
			
		}else{
			System.err.println("invalid age: "+age);

		}
	}

}
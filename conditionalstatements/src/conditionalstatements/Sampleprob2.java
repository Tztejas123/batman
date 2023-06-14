package conditionalstatements;

import java.util.Scanner;

public class Sampleprob2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();//curly braets shows scope matlab kahatak program run hoga mera//
		
		//int age =56;
		if (age>50) {//if this is true then println will run otherwise it will run next line//
			System.out.println("you are seniour citizen");//in conditional statements curly brakest are not complasary//
		}else if (age<56) {
			System.out.println("you are not seniour citizen");
		} else {
			System.out.println("chutiya");

		}//we canwrite any expression whose answer is boolean//
		System.out.println("continue");
		
	}

}

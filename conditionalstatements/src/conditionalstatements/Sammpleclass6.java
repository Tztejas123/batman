package conditionalstatements;

import java.util.Scanner;

/*if rain falls donts go to college else go to college
अगर बारिश गिरती है तो क्लास मत करो वरना क्लास में जाओ means yaha pe hum logo ne condition diya hya agar barish huyi to hi class may mat jao otherwise class may jao
means this 2 conditions are contteted through if and else connecter*/
public class Sammpleclass6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age=sc.nextInt();
		if (age>18) {
			System.out.println("you are adult");
			
		} else {
			System.out.println("you are child");
		}
	}
}
package conditionalstatements;

import java.util.Scanner;

public class Sampleclass11 {// syntax of switch case//
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value:");
		int digit = sc.nextInt();
		switch (digit) {// value may may aisi chije likhu jiske againt maychije match kr saku//ye by
						// default equalit check krta hay and jo chij campare krni hay n woh
		// cases may likhte jaoge
		case 0:
			System.out.println("zero");
			break;

		case 1:
			System.out.println("one");

			break;
		case 2:
			System.out.println("two");

			break;

		case 3:
			System.out.println("three");

			break;
		case 4:
			System.out.println("four");

			break;
		case 5:
			System.out.println("five");

			break;

		default:
			System.out.println("not given");
			break;
		}
	}

}

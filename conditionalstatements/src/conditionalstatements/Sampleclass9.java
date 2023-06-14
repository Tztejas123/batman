package conditionalstatements;
//import is a keyword//and ifwe write import.java.util.*; then util package ke sare class import ho jayege//* meaning all
import java.util.Scanner;//agar ye nikal du toh program compile hi nahi hoga//
//java by default search every classes in lang and if its present then there is not problem but if iss package may class nahi raha toh java easily give error//

public class Sampleclass9 {// school////is channeing may curlly braket na dalne ki vagj se koi fark nahi padta ans aa jayege//
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//kaha se input karna hay system se toh system.in use kiya
		System.out.println("Enter the Age");
		int age = sc.nextInt();//after entering age we need to catch age and usko pakd ke apne program may lane ke liye nextint name ki method use kiya jati hay 
		//console to program
		if (age > 1 && age <= 10) {
			System.out.println("you are child so go to child school");
		} else if (age >= 10 && age <= 15) {
			System.out.println("you go to school");

		} else if (age >= 15 && age < 21) {
			System.out.println("college student");

		} else if (age >= 21 && age <= 30) {
			System.out.println("govet prepaperation");

		} else {
			System.err.println("do a job");//err dalne se console pe jo msg aayega woh red colourd may aayega//

		}//out means normal information msg //
	}

}

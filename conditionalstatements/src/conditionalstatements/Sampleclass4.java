package conditionalstatements;

public class Sampleclass4 {
	public static void main(String[] args) {
		int age =52;
		if (age>55) {//this is false so println statement is not run// semicoloumn ki vajah se if statement terminate ho jayegi//
			System.out.println("you are seniour citizen");
			int r=age+6;
			//;semicolum hogi toh na toh na compile time and nahi run time pe error aayega statement excute hoge if true hoge//
		}//if remove bracket what will happen then ans is continue //that means curly braket is not cumpolsary is not need//
		//and if its true then both our println statement is run
		
		System.out.println("continue");//java may semicoloumn ka meaning termination hota hay and after that all statement consider as local block//
	}//ans only continue 
}//if 1 se jyada statement hoge tab hi curly braket use kare//
/*local block run tab hoga jub uska parent method or parent block run hoga tub*/
//!= this is called not equal to//
//this is double ampersand sign&& and ||  this called double bar  this sign or sign 
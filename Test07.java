package testing;

import java.util.Scanner;

public class Test07 {
	/*
	 * public static void main1(String[] roy){
	 * System.out.println("Hi from another main"); }
	 */
	public static void main(String[] args) {
//		Test07 ob1 = new Test07();
		char tasty;
		Scanner obj = new Scanner(System.in);
		do {
			System.out.println("for continue press y otherwise n");
			tasty = obj.next().charAt(0) ;
		}while(tasty == 'y');
		obj.close();
//		ob1.main();
	}
}

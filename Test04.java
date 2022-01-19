package testing;

import java.util.Scanner;

public class Test04 {
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a,b,c;
		a=100;
		b=200;
		c=300;
		
		int mark;
		Scanner ipon = new Scanner(System.in);
		System.out.println("Kindly enter the mark");
		mark = ipon.nextInt();
		if(mark==100) {
			System.out.println("A+");
		}

		else if(mark <100 && mark>=95) {
			System.out.println("A");
		}
		else if(mark <95 && mark>=85) {
			System.out.println("b");
		}
		else if(mark <85 && mark>=75) {
			System.out.println("c");
		}
		else if(mark <75 && mark>=70) {
			System.out.println("d");
		}
		else {System.out.println("Failed");}
		/*
		 * if(a<b) { if(a<c) { System.out.println("a is the smallest"); } }
		 */
		if(a<b || a<c) {
			System.out.println("A is the smallest");
		}
		if(b<a && b<c) {
			System.out.println("B is the smallest");
		}
		if(c<a && c<b) {
			System.out.println("C is the smallest");
		}
		ipon.close();
	}

}

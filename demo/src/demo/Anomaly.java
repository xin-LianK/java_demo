package demo;

import java.util.*;
//	try {
//	    // block of code to monitor for errors
//	}
//	catch (ExceptionType1 exOb) {
//	    // exception handler for ExceptionType1
//	}
//	catch (ExceptionType2 exOb) {
//	    // exception handler for ExceptionType2
//	}
//	// ...
//	finally {
//	    // block of code to be executed before try block ends
//	}

//		ExceptionType 是发生异常的类型
public class Anomaly {
//	public static void main(String[] args) {
//		int a = 0, b = 0, c = 0;
//		Random r = new Random();
//		
//		for(int i = 0; i<32000;i++) {
//			try {
//				b = r.nextInt();
//				c = r.nextInt();
//				a = 12345 / (b / c);
//			}catch(ArithmeticException e){
//				System.out.println("zero");
//				a = 0;
//			}
//			System.out.println("a:" + a);
//		}
//	}
	public static void main(String[] args) {
		try {
			int a = args.length;
			System.out.println("a = " + a);
			int b = 42/a;
			int c[] = { 1 };
			c[42] = 99;
		}catch(ArithmeticException e){
			System.out.println("Divide by 0:" + e);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index oob:" + e);
		}
		System.out.println("After try/catch blocks.");
	}
}

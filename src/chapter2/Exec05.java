package chapter2;

import java.util.Scanner;

public class Exec05 {
	public static int add( int x, int y ) {
		return x + y;
	}
	public static int subtraction( int x, int y ) {
		return x - y;
	}
	public static int multi( int x, int y ) {
		return x * y;
	}
	public static int divide( int x, int y ) {
		return x / y;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String first = null;
		int fir = 0;
		while( true ) {
			System.out.print("What is the first number? ");
			try {
				first = sc.nextLine();
				fir = Integer.parseInt(first);
				if ( fir < 0) {
					System.out.println("Your first input is negative.");
					continue;
				} else {
					break;
				}
			} catch ( Exception e ) {
				System.out.println("Your first input is invalid ");
				continue;
			}
		}
		
		String second = null;
		int sec = 0;
		while( true ) {
			System.out.print("What is the second number? ");
			try {
				second = sc.nextLine();
				sec = Integer.parseInt(second);
				if ( sec < 0) {
					System.out.println("Your second input is negative.");
					continue;
				} else {
					break;
				}
			} catch ( Exception e ) {
				System.out.println("Your second input is invalid ");
				continue;
			}
		}

		
		System.out.println(first + " + "+ second + " = " + add(fir,sec) + " \n"
		+ first + " - "+ second + " = " + subtraction(fir,sec) + " \n"
		+ first + " * "+ second + " = " + multi(fir,sec) + " \n"
		+ first + " / "+ second + " = " + divide(fir,sec) + " \n");
		
		
	}

}

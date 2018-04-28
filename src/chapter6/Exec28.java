package chapter6;

import java.util.Scanner;

public class Exec28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int scount = 0;
		int fcount = 0;
		while ( true ) {
			System.out.print("Enter a number: ");
			String input = sc.nextLine();
			try {
				if ( input.equals("quit")) {
					break;
				}
				sum = sum + Integer.parseInt(input);
				scount++;
			} catch ( Exception e ) {
				System.out.println("You do not input numbers. Please input only numbers.");
				fcount++;
				continue;
			}
		}
		int tcount = scount + fcount;
		System.out.println("The total is "+ sum+".");
		System.out.print(tcount +" times were tried. "+scount +" times were success. "
				+ "But "+ fcount+" times were fail.");
	}

}

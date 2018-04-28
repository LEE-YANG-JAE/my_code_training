package chapter3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exec12 {
	public static double calculateSimpleInterest(double principal, double rate, int years ) {
		return principal * ( 1+ rate*years);
	}
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#");
		Scanner sc = new Scanner(System.in);
		String input = null;
		double principal = 0;
		double value = 0;
		double rate = 0;
		int years = 0;
		
		while ( true ) {
			try {
				System.out.print("Enter the principal: ");
				input = sc.nextLine();
				principal = Double.parseDouble(input);
				break;
			} catch ( Exception e ) {
				System.out.println("You've typed wrong value. Please input number.");
				continue;
			}
		}
		while ( true ) {
			try {
				System.out.print("Enter the rate of interest: ");
				input = sc.nextLine();
				value = Double.parseDouble(input);
				rate = value / 100;
				break;
			} catch ( Exception e ) {
				System.out.println("You've typed wrong value. Please input number.");
				continue;
			}
		}
		while ( true ) {
			try {
				System.out.print("Enter the number of years: ");
				input = sc.nextLine();
				years = Integer.parseInt(input);
				break;
			} catch ( Exception e ) {
				System.out.println("You've typed wrong value. Please input number.");
				continue;
			}
		}
		double result = calculateSimpleInterest( principal,rate,years);
		System.out.println();
		for ( int i = 1; i < years+1; i++ ) {
			result = calculateSimpleInterest( principal,rate, i);
			System.out.println("After "+i+" years at "+value+"%, the investment will be worth $"+df.format(result));
		}
	}

}

package chapter3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exec13 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner sc = new Scanner(System.in);
		String input = null;
		int choose = 0;
		double principal = 0;
		double target = 0;
		double value = 0;
		double rate = 0;
		int years = 0;
		int peryears = 0;
		
		while ( true ) {
			System.out.println("Please choose what kind of things do you want");
			System.out.println("1. Target 2. Principal");
			input = sc.nextLine();
			if ( input.equals("1") ) {
				choose = 1;
			} else if  ( input.equals("2") ){
				choose = 2;
			} else {
				System.out.println("You typed other values. Please type 1 or 2");
				continue;
			}
			
			if ( choose == 1 ) {
				try {
					System.out.print("What is the principal amount? ");
					input = sc.nextLine();
					principal = Double.parseDouble(input);
					if ( principal < 0 ) {
						System.out.println("Please input positive value.");
						continue;
					}
					break;
				} catch ( Exception e ) {
					System.out.println("You've typed wrong value. Please input number.");
					continue;
				}
			} else if ( choose == 2 ) {
				try {
					System.out.print("What is the target amount? ");
					input = sc.nextLine();
					target = Double.parseDouble(input);
					if ( target < 0 ) {
						System.out.println("Please input positive value.");
						continue;
					}
					break;
				} catch ( Exception e ) {
					System.out.println("You've typed wrong value. Please input number.");
					continue;
				}
			}
			
		}
		while ( true ) {
			try {
				System.out.print("What is the rate: ");
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
				System.out.print("What is the number of years: ");
				input = sc.nextLine();
				years = Integer.parseInt(input);
				break;
			} catch ( Exception e ) {
				System.out.println("You've typed wrong value. Please input number.");
				continue;
			}
		}
		while ( true ) {
			try {
				System.out.print("What is the number of times the interest\n"
						+ "is compounded per year: ");
				input = sc.nextLine();
				peryears = Integer.parseInt(input);
				break;
			} catch ( Exception e ) {
				System.out.println("You've typed wrong value. Please input number.");
				continue;
			}
		}
		
		if ( choose == 1 ) {
			double result = principal * Math.pow(( 1 + ( rate / peryears ) ), peryears*years);
			System.out.println("$"+df.format(principal) +" invested at "+ value +"% for "+ years +" years compounded "+ peryears + " times per year is \n"
					+"$"+ df.format(result) );
		} else if ( choose ==2 ) {
			principal = target / Math.pow(( 1 + ( rate / peryears ) ), peryears*years);
			System.out.println("You should invest $" + df.format(principal)+ " for your target $"+target+" with "+ value +"% for "
			+ years +" years compounded "+ peryears + " times per year."  );
		}

	}

}

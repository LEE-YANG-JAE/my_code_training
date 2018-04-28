package chapter4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exec17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");
		String input, gender = null;
		double weight,amount,drinkingH = 0;
		
		while ( true ) {
			System.out.print("Please input your weight: ");
			try {
				input = sc.nextLine();
				weight = Double.parseDouble(input);
				if( weight > 0 ) {
					break;
				} else if ( weight < 0 ) {
					System.out.println("Please input positive number only ");
					continue;
				}
			} catch ( Exception e ) {
				System.out.println("Please input positive number only ");
				continue;
			}	
		}
		
		while( true ) {
			System.out.println("Please choose your gender: ");
			System.out.println("1.Man 2.Woman ");
			input = sc.nextLine();
			if ( input.equals("1") ) {
				gender = "man";
				break;
			} else if ( input.equals("2") ){
				gender = "woman";
				break;
			} else {
				System.out.println("Please input 1 or 2 only.");
				continue;
			}
		}
		
		while ( true ) {
			System.out.print("Please input your drinking amount: ");
			try {
				input = sc.nextLine();
				amount = Double.parseDouble(input);
				if( amount > 0 ) {
					break;
				} else if ( amount < 0 ) {
					System.out.println("Please input positive number only ");
					continue;
				}
			} catch ( Exception e ) {
				System.out.println("Please input positive number only ");
				continue;
			}	
		}
		
		while ( true ) {
			System.out.print("Please input the hours since you drank: ");
			try {
				input = sc.nextLine();
				drinkingH = Double.parseDouble(input);
				if( drinkingH > 0 ) {
					break;
				} else if ( drinkingH < 0 ) {
					System.out.println("Please input positive number only ");
					continue;
				}
			} catch ( Exception e ) {
				System.out.println("Please input positive number only ");
				continue;
			}	
		}
		double rate = ( gender == "man" )? 0.73 : 0.6;
		double erate = ( gender == "man" )? 0.58 : 0.49;
		double mr = ( gender == "man" )? 0.015 : 0.017;
		
		double bac =  ( amount * 5.14 / weight * rate) - 0.015 * drinkingH;
		double ebac =  ((0.806 * amount * 1.2) / (erate * weight ) - mr * drinkingH );
		
		System.out.println("Your BAC is "+ df.format(bac) );
		if ( bac >= 0.08 ) {
			System.out.println("It is not legal for you to drive.");
		} else {
			System.out.println("It is legal for you to drive.");
		}
		
		System.out.println();
		System.out.println("Your EBAC is "+ df.format(ebac) );
		if ( ebac >= 0.08 ) {
			System.out.println("It is not legal for you to drive in USA.");
		} else {
			System.out.println("It is legal for you to drive in USA.");
		}
		// Korea
		if ( ebac >= 0.05 ) {
			System.out.println("It is not legal for you to drive in Korea.");
		} else {
			System.out.println("It is legal for you to drive in Korea.");
		}
		if ( ebac >= 0.02 ) {
			System.out.println("It is not legal for you to drive in China.");
		} else {
			System.out.println("It is legal for you to drive in China.");
		}
	}
}

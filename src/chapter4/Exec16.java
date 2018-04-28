package chapter4;

import java.util.Scanner;

public class Exec16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = null;
		String country = null;
		int age = 0;
		int countrylimit = 0;
		while( true ) {
			System.out.println("Please choose the country you want to see.");
			/*There are more lists for minimum driving age 
			https://ipfs.io/ipfs/QmXoypizjW3WknFiJnKLwHCnL72vedxjQkDDP1mXWo6uco/wiki/List_of_countries_by_minimum_driving_age.html */			System.out.println("1.Korea 2.USA 3.United Kingdom ");
			input = sc.nextLine();
			if ( input.equals("1") ) {
				countrylimit = 18;
				country = "Korea";
				break;
			} else if ( input.equals("2") ) {
				countrylimit = 14;
				country = "USA";
				break;
			} else if ( input.equals("3") ) {
				countrylimit = 17;
				country = "United Kingdom";
				break;
			} else {
				System.out.println("You wrote wrong value. Please input only listed numbers");
				continue;
			}
		} 

		while( true ) {
			System.out.print("What is your age? ");
			try {
				input = sc.nextLine();
				age = Integer.parseInt(input);
				boolean check = ( age > 0 ) ? true : false;
				if ( check ) {
					break; 
				} else {
					System.out.println("You wrote wrong value. Please input only positive number");
				}
			} catch ( Exception e ) {
				System.out.println("You wrote wrong value. Please input only positive number");
			}
		}
		boolean check = ( age >= countrylimit ) ? true : false;
		
		if ( check ) {
			System.out.println("You are old enough to legally drive in "+ country + ".");
		} else {
			System.out.println("You are not old enough to legally drive in "+ country + ".");
		} 
		
	}

}

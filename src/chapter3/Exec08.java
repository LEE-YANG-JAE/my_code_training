package chapter3;

import java.util.Scanner;

public class Exec08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int people, pizzas, pieces = 0;
		String first, second, thrid = null;
		while ( true ) {
			try {
				System.out.print("How many people? ");
				first = sc.nextLine();
				people = Integer.parseInt(first);
				System.out.print("How many pizzas do you have? ");
				second = sc.nextLine();
				pizzas = Integer.parseInt(second);
				System.out.print("How many pieces are in a pizza? ");
				thrid = sc.nextLine();
				pieces = Integer.parseInt(thrid);
				if ( pieces % 2 != 0 ) {
					System.out.println("Wrong piece number. Please try again from the beggining.");
					continue;
				}
				break;
			} catch ( Exception e) {
				System.out.println("You entered wrong values. Please input again from the beginning.");
			}
		}

		
		int equal = 0, leftover = 0;
		if ( (people* pizzas) < pieces ) {
			equal = pieces / ( people * pizzas );
			leftover = pieces % ( people * pizzas );
		} else if ( (people* pizzas) > pieces ){
			equal = ( people * pizzas ) / pieces;
			leftover = ( people * pizzas ) % pieces ;
		}
		
		System.out.println(people + " people with " + pizzas +" pizzas");
		System.out.println("Each person gets " + equal + " pieces of pizza.");
		System.out.println("There are "+ leftover + " leftover pieces.");
		
	}

}

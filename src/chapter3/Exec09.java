package chapter3;

import java.util.Scanner;

public class Exec09 {

	public static void main(String[] args) {
		final int one_litter = 9;
		Scanner sc = new Scanner(System.in);
		String slength = null;
		int length =0;
		while ( true ) {
			try {
				System.out.print("What is the length of the celling? ");
				slength = sc.nextLine();
				length = Integer.parseInt(slength);
				if( length < 0 ) {
					System.out.println("Please input right positive number");
					continue;
				}
				break;
			} catch ( Exception e ) {
				System.out.println("Please input right positive number");
				continue;
			}
		}
		
		
		String swidth = null;
		int width =0;
		while ( true ) {
			try {
				System.out.print("What is the width of the celling? ");
				swidth = sc.nextLine();
				width = Integer.parseInt(swidth);
				if( width < 0 ) {
					System.out.println("Please input right positive number");
					continue;
				}
				break;
			} catch ( Exception e ) {
				System.out.println("Please input right positive number");
				continue;
			}
		}
		
		int square_meters = length * width;
		int n_litter = square_meters / one_litter;
		int left_over = square_meters % one_litter;
		
		if ( square_meters <= 9 ) {
			n_litter = 1;
			System.out.println("You will need to purchase " +n_litter+" liters of \n"
					+ "paint to cover "+square_meters+" square_meters");
			return;
		}
		if ( left_over < 9 || left_over > 0) {
			n_litter = n_litter + 1;
			System.out.println("You will need to purchase " +n_litter+" liters of \n"
					+ "paint to cover "+square_meters+" square_meters");
			return;
		}
		
	}

}

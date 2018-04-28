package chapter4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exec19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		String input, check, check2= null;
		double weight, height, bmi, bmi2;
		// 1 kg ==> 2.204623 lb
		// 1 lb ==> 0.453592 kg
		// 1 cm ==> 0.393701 in
		// 1 in ==> 2.54 cm
		// 1 ft ==> 12 in
		System.out.println("What kind of measure do you want?");
		System.out.println("1. lb/inch 2. International( kg / m )");
		while ( true ) {
			check = sc.nextLine();
			if ( check.equals("1") ) {
				System.out.println("You checked lb / inch method.");
				while( true ) {
					System.out.println("What kind of measure type do you want?");
					System.out.println("1. inch 2. ft");
					check2 = sc.nextLine();
					if ( check2.equals("1")) {
						break;
					} else if ( check2.equals("2") ) {
						System.out.println("Your ft will be changed into lb to calculate your BMI.");
						break;
					} else {
						System.out.println("Please input only 1 or 2");
						continue;
					}
				}
				break;
			} else if( check.equals("2") ){
				System.out.println("You checked international( kg / m ) method.");
				break;
			} else {
				System.out.println("Please input only 1 or 2");
				continue;
			}
		}
		
		while ( true ) {
			System.out.print("Press Input your weight: ");
			try {
				input = sc.nextLine();
				weight = Double.parseDouble(input);
				if ( weight < 0) {
					System.out.println("Please input positive number only.");
					continue;
				}
				break;
			} catch ( Exception e ) {
				System.out.println("Please input number only ");
				continue;
				}
			}
		
		while ( true ) {
			System.out.print("Press Input your height: ");
			try {
				input = sc.nextLine();
				height = Double.parseDouble(input);
				if ( check2.equals("2") ) {
					height = height * 12; // 1 ft ==> 12 in
				}
				if ( height < 0) {
					System.out.println("Please input positive number only.");
					continue;
				}
				break;
			} catch ( Exception e ) {
				System.out.println("Please input number only ");
				continue;
				}
			}
		
		if ( check.equals("1") ) {
			bmi = weight / ( height * height ) * 703; //  lb and inch
		} else {
			bmi = weight / ( height * height ); // kg and m universally
		}
		
		System.out.println("Your BMI is "+ df.format(bmi) );
		if ( bmi >= 18.5 && bmi < 25 ) {
			System.out.println("You are within the ideal weight range.");
		} else if ( bmi < 18.5 ) {
			System.out.println("You are thin. You need to get some weight to reach the ideal weight range.");
		} else if ( bmi >= 25 ) {
			System.out.println("You are overweight. You should see your doctor.");
		}
		
	}
}

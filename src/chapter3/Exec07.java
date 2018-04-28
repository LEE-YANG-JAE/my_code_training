package chapter3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exec07 {

	public static void main(String[] args) {
		final double feettometer = 0.09290304;
		final double metertofeet = 10.7639;
		Scanner sc = new Scanner(System.in);
		while ( true ) {
			System.out.print("What kind of calculation do you want? feet? or meter? ");
			String check = sc.nextLine();
			
			if ( check.equals("feet") ) {
				String first = null;
				int length = 0;
				while ( true ) {
					try {
						System.out.print("What is the length of the room in feet? ");
						first = sc.nextLine();
						length = Integer.parseInt(first);
						if ( length < 0) {
							System.out.println("Your input is nagative. Please input again.");
						} else {
							break;
						}
					} catch( Exception e ) {
						System.out.println("Your input is not a number.");
						continue;
					}
				}
				
				String second = null;
				int width = 0;
				while ( true ) {
					try {
						System.out.print("What is the width of the room in feet? ");
						second = sc.nextLine();
						width = Integer.parseInt(second);
						if ( width  < 0) {
							System.out.println("Your input is nagative. Please input again.");
						} else {
							break;
						}
					} catch( Exception e ) {
						System.out.println("Your input is not a number.");
						continue;
					}
				}
				
				System.out.println("You entered dimensions of "+length+" feet by "+ width +" feet");
				
				int dsquare = length * width;
				double dmeter = dsquare * feettometer;
				DecimalFormat df = new DecimalFormat("#.###");
				
				System.out.println("The area is \n"+dsquare+" square feet\n"+df.format(dmeter) + " square meters");
				return;
			} 
			
			else if ( check.equals("meter") ) {
				String first = null;
				int length = 0;
				while ( true ) {
					try {
						System.out.print("What is the length of the room in meter? ");
						first = sc.nextLine();
						length = Integer.parseInt(first);
						if ( length < 0) {
							System.out.println("Your input is nagative. Please input again.");
						} else {
							break;
						}
					} catch( Exception e ) {
						System.out.println("Your input is not a number.");
						continue;
					}
				}
				
				
				String second = null;
				int width = 0;
				while ( true ) {
					try {
						System.out.print("What is the width of the room in meter? ");
						second = sc.nextLine();
						width = Integer.parseInt(second);
						if ( width  < 0) {
							System.out.println("Your input is nagative. Please input again.");
						} else {
							break;
						}
					} catch( Exception e ) {
						System.out.println("Your input is not a number.");
						continue;
					}
				}
				
				System.out.println("You entered dimensions of "+length+" meter by "+ width +" meter");
				
				double dmeter = length * width;
				double dsquare = dmeter * metertofeet;
				DecimalFormat df = new DecimalFormat("#.###");
				
				System.out.println("The area is \n"+df.format(dmeter)+" square meters \n" + dsquare +" square feet");
				return;
			} else {
				System.out.println("Please input only feet or meter.");
			}
		}

	}

}

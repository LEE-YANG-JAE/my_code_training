package chapter4;

import java.util.Scanner;
//https://www.quora.com/What-is-the-difference-between-a-rules-engine-and-an-inference-engine-examples
public class Exec23 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Is the car silent when you turn the key? ");
		String input = sc.nextLine();
		if ( input.equals("y") ) {
			System.out.print("Are the battery terminals corroded? ");
			input = sc.nextLine();
			if ( input.equals("y") ) {
				System.out.print("Clean terminals and try again.");
				return;
			} else if ( input.equals("n") ) {
				System.out.print("Replace cables and try again.");
				return;
			}
		} else if ( input.equals("n") ) {
			System.out.print("Are there rattling noises from your car? ");
			input = sc.nextLine();
			if ( input.equals("y") ) {
				System.out.print("Replace batteries and try again.");
				return;
			} else if ( input.equals("n") ) {
				System.out.print("Isn't the engine working completely? ");
				input = sc.nextLine();
				if ( input.equals("y") ) {
					System.out.print("Check the connection status of the spark plug.");
					return;
				} else if ( input.equals("n") ) {
					System.out.print("Is the engine turend off right after working? ");
					input = sc.nextLine();
					if ( input.equals("y") ) {
						System.out.print("Is there fuel injection in your car? ");
						input = sc.nextLine();
						if ( input.equals("y") ) {
							System.out.print("Check the choke that can open or close properly.");
							return;
						} else if ( input.equals("n") ) {
							System.out.print("Ask the customer serivce center.");
							return;
						}
					}
				}
			}
		}
		
	}
}

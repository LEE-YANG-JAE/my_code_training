package chapter6;

import java.util.Scanner;

public class Exec31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = null;
		int age = 0;
		int pulse = 0;
		while ( true ) {
			System.out.print("Please input your Resting Pulse: ");
			input = sc.nextLine();
			try {
				pulse = Integer.parseInt(input);
				if ( pulse < 0 ) {
					System.out.println("Please input positvie number.");
				}
				break;
			} catch ( Exception e ) {
				System.out.println("Please input only number again.");
				continue;
			}
		}
		while ( true ) {
			System.out.print("Please input your Age: ");
			input = sc.nextLine();
			try {
				age = Integer.parseInt(input);
				if ( age < 0 ) {
					System.out.println("Please input positvie number.");
				}
				break;
			} catch ( Exception e ) {
				System.out.println("Please input only number again.");
				continue;
			}
		}
		System.out.println("Resting Pulse:"+ pulse +" Age: "+age);
		System.out.println("Intensity \t | Rate");
		System.out.println("-----------------|--------");
		double targetheartrate = 0;
		for ( double i = 55; i < 100 ; i = i + 5) {
			double j = i / 100;
			targetheartrate = ( ( (220 - age) - pulse ) * j ) + pulse;
			System.out.println(i+"%\t\t |"+ Math.round(targetheartrate) + " bpm");
		}
	}
}

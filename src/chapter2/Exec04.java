package chapter2;

import java.util.Scanner;

public class Exec04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a noun: ");
		String noun = sc.nextLine();
		
		System.out.print("Enter a verb: ");
		String verb = sc.nextLine();
		
		System.out.print("Enter an adjective: ");
		String adjective = sc.nextLine();
		
		System.out.print("Enter adverb: ");
		String adverb = sc.nextLine();
		
		System.out.print("Enter a noun2: ");
		String noun2 = sc.nextLine();

		System.out.printf("Do you %s your %s %s? %s is hilarious! \n", verb, adjective, adverb, noun2); // String Interpolation
	}

}

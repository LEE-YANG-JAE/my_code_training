package chapter2;

import java.util.Calendar;
import java.util.Scanner;

public class Exec06 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();   // Gets the current date and time
		int year = now.get(Calendar.YEAR);  
		
		System.out.print("What is your current age? ");
		Scanner sc = new Scanner(System.in);
		String sage = sc.nextLine();
		int age = Integer.parseInt(sage);
		
		System.out.print("At what age would you like to retire? ");
		String sretire = sc.nextLine();
		int retire = Integer.parseInt(sretire);
		int left = retire - age;
		if ( left < 0 ) {
			System.out.println("You are a good worker from your place. Because you pass the date of retirement!");
			return;
		}
		
		System.out.println("You have "+ left +" years left until you can retire.");
		
		int date = year + left;
		System.out.print("It's "+year+", so you can retire in "+date+".");
	}

}

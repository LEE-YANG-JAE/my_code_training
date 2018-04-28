package chapter3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exec11 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.00");
		Scanner sc = new Scanner(System.in);
		System.out.print("How many Euros are you exchanging? ");
		int euros = sc.nextInt();
		System.out.print("What is the exchange rate? ");
		double rate = sc.nextDouble();
		
		double result = euros * rate /100;
		System.out.println( euros + " Euros at an exchange rate of "+ rate + " is "
				+ df.format(result) );
	}

}

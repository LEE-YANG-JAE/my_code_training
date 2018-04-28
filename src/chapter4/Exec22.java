package chapter4;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Exec22 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		String input = null;
		int i = 1;
		while ( true ) {
			System.out.print("Enter the "+ i +" place number: ");
			input = sc.nextLine();
			if ( input.equals("Quit") || input.equals("quit")|| input.equals("")) {
				break;
			}
			try {
				list.add(Integer.parseInt(input));
				i++;
			} catch ( Exception e ) {
				System.out.println("Please input only numbers.");
				continue;
			}
		}
		int max = 0;
		for ( int j : list ) {
			if ( max < j ) {
				max = j;
			}
		}
		System.out.println("The largestNumber is "+ max +".");
		
	}
}

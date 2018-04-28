package chapter5;

import java.util.Scanner;

public class Exec24 {
	public static boolean isAnagram ( String first,  String second ) {
		boolean check = false;
		char [] firstarr = first.toCharArray();
		char [] secondarr = second.toCharArray();
		if ( firstarr.length != secondarr.length ) {
			return false;
		}
		
		for ( int i = 0; i < firstarr.length; i++ ) {
			for ( int j = 0; j < secondarr.length; j++ ) {
				if ( firstarr[i] == secondarr[j] ) {
					check = true;
					break;
				} else {
					check = false;
				}
			}
		}
		return check;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String first, second;
		boolean result = false;
		System.out.println("Enter two strings and I'll tell you if they are anagrams.");
		
		System.out.print("Enter the first string: ");
		first = sc.nextLine();
		
		System.out.print("Enter the second string: ");
		second = sc.nextLine();
		result = isAnagram(first, second);
		
		if ( result ) {
			System.out.print("\"" + first + "\" and \"" + second + "\" are anagrams." );
		} else {
			System.out.print("\"" + first + "\" and \"" + second + "\" are not anagrams." );
		}
		
	}

}

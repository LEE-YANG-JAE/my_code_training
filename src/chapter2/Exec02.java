package chapter2;

import java.util.Scanner;

public class Exec02 {

	public static void main(String[] args) {
		System.out.print("Whist is the input string? ");
		Scanner sc = new Scanner(System.in);
		String name = null;
		int nl = 0;
		while ( true ) {
			name = sc.nextLine();
			if( name.length() == 0 ) {
				System.out.println("Please input anything");
				System.out.print("Whist is the input string? ");
			} else {
				nl = name.length();
				break;
			}
		}
		System.out.println(name + " has " + nl +" characters.");
	}

}
//p.15 GUI 구현 예정

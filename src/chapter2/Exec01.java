package chapter2;

import java.util.Scanner;

public class Exec01 {
	public static void main(String[] args) {
		System.out.print("What is your name? ");
		Scanner sc = new Scanner(System.in);
		//System.out.print("Hello, "+ sc.next()+", nice to meet you!");
		String name = sc.nextLine();
		switch(name) {
		case "Brian":
			System.out.print("Hi, "+ name +", nice to meet you!");
			break;
		case "Conan":
			System.out.print("Hello, "+ name +", glad to meet you!");
			break;
		case "Bread":
			System.out.print("Hello, "+ name +", happy to meet you!");
			break;
		default :
			System.out.print("Hello, "+ name +", Welcome~");
			break;
		}
	}
}

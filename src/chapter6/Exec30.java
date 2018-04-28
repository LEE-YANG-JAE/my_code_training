package chapter6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exec30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for ( int i = 0; i < 13 ; i++ ) {
			for ( int j = 0; j < 13 ; j++ ) {
				System.out.println(i +" * "+j +" = "+ i*j);
			}
		}
		System.out.println();
		for ( int i = 0; i < 13 ; i++ ) {
			System.out.print("\t"+ i );
		}
		
		for ( int i = 0; i < 13 ; i++ ) {
			System.out.println();
			System.out.print(i);
			for ( int j = 0; j < 13; j++ ) {
				System.out.print("\t"+i*j);
		}
	}
		
	}
	
}

package chapter5;

import java.util.Scanner;

public class Exec25 {
	public static int passwordValidator( String password ) {
		int type = 1;
		char [] arr = password.toCharArray();
		int number_count = 0;
		int character_count = 0;
		int special_character_count = 0;
		
		if ( arr.length < 8 ) {
			for ( int i = 0; i < arr.length; i++) {
				if ( (int)arr[i] >= 48 && (int)arr[i] <= 57 ) {
					type = 0;
				}
				if ( ( (int)arr[i] >= 65 && (int)arr[i] <= 90 ) || ( (int)arr[i] >= 97 && (int)arr[i] <= 122 ) ) {
					type = 1;
				}
				if ( ((int)arr[i] >= 33 && (int)arr[i] <= 47) || ((int)arr[i] >= 58 && (int)arr[i] <= 64)
						|| ((int)arr[i] >= 92 && (int)arr[i] <= 96) || ((int)arr[i] >= 123 && (int)arr[i] <= 126) ) 
				{
					type = 1;
				}
			}
		}

		if ( arr.length >= 8 ){
			for ( int i = 0; i < arr.length; i++) {

				if ( ( (int)arr[i] >= 65 && (int)arr[i] <= 90 ) 
						|| ( (int)arr[i] >= 97 && (int)arr[i] <= 122 ) ) 
				{	
					character_count = character_count + 1;
					type = 1;
				}
				if ( arr[i] >= 48 && arr[i] <= 57 ) {
					number_count = number_count + 1;
					type = 1;
				}
				
				if ( ((int)arr[i] >= 33 && (int)arr[i] <= 47) || ((int)arr[i] >= 58 && (int)arr[i] <= 64)
						|| ((int)arr[i] >= 92 && (int)arr[i] <= 96) || ((int)arr[i] >= 123 && (int)arr[i] <= 126) ) 
				{
					special_character_count = special_character_count + 1;
					type = 1;
				}
				if ( number_count > 0  && special_character_count > 0 && character_count > 0) {
					type = 3;
				} else if ( number_count > 0 && character_count > 0) {
					type = 2;
				} else if ( number_count > 0 && special_character_count > 0) {
					type = 2;
				} else if ( character_count > 0 && special_character_count > 0) {
					type = 2;
				} 
			}	
		}
		return type;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while ( true ) {
			System.out.print("Plese input the password: ");
			
			String password = sc.nextLine();
			if( password.equals("quit") || password.equals("exit") ) {
				System.out.println("Bye bye~");
				break;
			}
			
			int result_number = passwordValidator(password);
			String [] result = {"very weak password.","weak password", "strong password.", "very strong password."};
			System.out.println("The password '" + password + "' is a " + result[result_number]);
			System.out.println();
			System.out.println("If you want to quit, Plase input quit or exit");
		}
	}
}

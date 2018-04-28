package chapter5;

import java.util.Scanner;

public class Exec27 {
	public static String first_name_validate(String first_name) {
		if ( first_name.equals("")  ) {
			return "The first name must be filled in.\n";
		} else if ( first_name.length() < 2 ) {
			return "\"" +first_name +"\" is not valid first name. It is too short.\n";
		}
		return "";
	}
	public static String last_name_validate(String last_name) {
		if ( last_name.equals("")  ) {
			return "The last name must be filled in.\n";
		} else if ( last_name.length() < 2 ) {
			return "\"" +last_name +"\" is not valid last name. It is too short.\n";
		}
		return "";
	}
	public static String zip_code_validate(String zip_code) {
		int number_count = 0;
		char [] arr = zip_code.toCharArray();
		for ( int i = 0; i < arr.length; i++ ) {
			if ( (int)arr[i] >= 48 && (int)arr[i] <= 57 ) {
				number_count += 1;
			}
		}
		if ( number_count != 5 ) {
			return "The ZIP code must be numeric.\n";
		}
		return "";
		
	}
	public static String id_validate(String id) {
		if ( id.length() > 7 ) {
			return "ID lenght is over 7.\n";
		}
		int char_count = 0;
		int number_count = 0;
		char [] arr = id.toCharArray();
		
		for ( int i = 0; i < 2; i++ ) {
			if ( ( (int)arr[i] >= 65 && (int)arr[i] <= 90 ) || ( (int)arr[i] >= 97 && (int)arr[i] <= 122 ) ) {
				char_count += 1;
			}
		}
		if ( char_count != 2) {
			return "You should write two Alphabet characters in the front before - .\n";
		}
		
		if ( id.indexOf("-") == -1 ) {
			return "There is no - in Id.\n";
		} else if ( id.indexOf("-") != 2 ) {
			return id + " is not a valid ID.";
		}
		
		for ( int i = 3; i < arr.length; i++ ) {
			if ( (int)arr[i] >= 48 && (int)arr[i] <= 57 ) {
				number_count += 1;
			}
		}
		if ( number_count != 4) {
			return "You should write four numbers in the back after - .\n";
		}
		
		return "";
	}
	
	public static void validateInput (String first_name, String last_name, String zip_code, String id) {
		
		String first_name_check = first_name_validate(first_name);
		String last_name_check = last_name_validate(last_name);
		String zip_code_check = zip_code_validate(zip_code);
		String id_check = id_validate(id);
		String total = first_name_check + last_name_check + zip_code_check  + id_check ;
		
		if ( total.equals("") ) {
			System.out.println("There were no errors found.");
		} else {
			System.out.println(first_name_check + last_name_check + zip_code_check + id_check );
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first name: ");
		String first_name = sc.nextLine();
		System.out.print("Enter the last name: ");
		String last_name = sc.nextLine();
		System.out.print("Enter the Zip Code: ");
		String zip_code= sc.nextLine();
		System.out.print("Enter an employee ID: ");
		String id = sc.nextLine();
		
		validateInput(first_name,last_name,zip_code,id);
	}

}

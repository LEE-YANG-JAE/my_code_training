package chapter5;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Exec27_1 {
	public static String first_name_validate(String first_name) {
		int number_count = 0;
		if ( first_name.equals("")  ) {
			return "The first name must be filled in.\n";
		} else if ( first_name.length() < 2 ) {
			return "\"" +first_name +"\" is not valid first name. It is too short.\n";
		}
		char [] arr = first_name.toCharArray();
		for ( int i = 0; i < arr.length; i++ ) {
			if ( (int)arr[i] >= 48 && (int)arr[i] <= 57 ) {
				number_count += 1;
			}
		}
		if ( number_count > 0 ) {
			return "\"" +first_name +"\" has a number(or numbers). So It is not valid.\n";
		}
		return "";
	}
	public static String last_name_validate(String last_name) {
		int number_count = 0;
		if ( last_name.equals("")  ) {
			return "The last name must be filled in.\n";
		} else if ( last_name.length() < 2 ) {
			return "\"" +last_name +"\" is not valid last name. It is too short.\n";
		}
		char [] arr = last_name.toCharArray();
		for ( int i = 0; i < arr.length; i++ ) {
			if ( (int)arr[i] >= 48 && (int)arr[i] <= 57 ) {
				number_count += 1;
			}
		}
		if ( number_count > 0 ) {
			return "\"" +last_name +"\" has a number(or numbers). So It is not valid.\n" ;
		}
		return "";
	}
	public static String zip_code_validate(String zip_code) {
		String regExp = "\\d{5}";
		boolean result = Pattern.matches(regExp, zip_code);
		if ( result ) {
			return "";
		} else {
			return zip_code + "is not a valid ZIP code. It must be 5 numeric.\n";
		}
	}
	public static String id_validate(String id) {
		String regExp = "[a-zA-Z][a-zA-Z]-\\d{4}";
		boolean result = Pattern.matches(regExp, id);
		if ( result ) {
			return "";
		} else {
			return id+ " is not a valid ID.\n";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = null;
		while ( true ) {
			System.out.print("Enter the first name: ");
			String first_name = sc.nextLine();
			result = first_name_validate(first_name);
			if ( result.equals("") ) {
				break;
			} else {
				System.out.println(result);
			}
		}
		
		while ( true ) {
			System.out.print("Enter the last name: ");
			String last_name = sc.nextLine();
			result = last_name_validate(last_name);
			if ( result.equals("") ) {
				break;
			} else {
				System.out.println(result);
			}
		}
		
		while ( true ) {
			System.out.print("Enter the Zip Code: ");
			String zip_code= sc.nextLine();
			result = zip_code_validate(zip_code);
			if ( result.equals("") ) {
				break;
			} else {
				System.out.println(result);
			}
		}
		
		while( true ) {
			System.out.print("Enter an employee ID: ");
			String id = sc.nextLine();
			result = id_validate(id);
			if ( result.equals("") ) {
				break;
			} else {
				System.out.println(result);
			}
		}

	}
}

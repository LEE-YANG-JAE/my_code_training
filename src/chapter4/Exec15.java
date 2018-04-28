package chapter4;

import java.io.Console;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Exec15 {
	// https://gist.github.com/craSH/5217757
	private static int workload = 12;

	public static String hashPassword(String password_plaintext) {
		String salt = BCrypt.gensalt(workload);
		String hashed_password = BCrypt.hashpw(password_plaintext, salt);

		return(hashed_password);
	}

	public static boolean checkPassword(String password_plaintext, String stored_hash) {
		boolean password_verified = false;

		if(null == stored_hash || !stored_hash.startsWith("$2a$"))
			throw new java.lang.IllegalArgumentException("Invalid hash provided for comparison");

		password_verified = BCrypt.checkpw(password_plaintext, stored_hash);

		return(password_verified);
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Map<String,String> map = new Hashtable <String,String>();
		map.put("Apple", "abc$123");
		String original_password = map.get("Apple");
		String hashing = hashPassword(original_password);
		map.put("Apple", hashing);
		
		map.put("Banana", "afefw");
		map.put("Kiwi", "sdz1123");
		
		System.out.print("Who are you? ");
	    String name = sc.nextLine();
	    // http://www.tutorialspoint.com/java/io/console_readpassword.htm
	    Console cnsl = System.console(); // only available in real Console
		char[] pwd = cnsl.readPassword("Password: ");
		String password = new String(pwd);
		
		boolean check = checkPassword(password, map.get(name)); // compare user's password and encrypted password
		
		if ( check ) {
			System.out.println("Welcome!");
		} else {
			System.out.println("That password is incorrect.");
		}
	}

}

package chapter2;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Exec03 {

	public static void main(String[] args) {
		Map<String, String> map =new Hashtable<String, String>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the quote? ");
		String quote = sc.nextLine();
		
		System.out.print("Who said it? ");
		String name = sc.nextLine();
		map.put(name, quote); // Using map to put
		
		StringBuffer sb = new StringBuffer();
		sb.append(name + " says, "+ "\"" + map.get(name) + ".\"");
		String fullsentence = sb.toString(); // String Concatenation
		
		System.out.println( fullsentence );
	}

}

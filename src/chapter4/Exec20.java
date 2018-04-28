package chapter4;

import java.text.DecimalFormat;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Exec20 {
	
	public static void main(String[] args) {
		// https://taxfoundation.org/state-and-local-sales-tax-rates-2015/
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		String input, state, county= null;
		double tax=0,ctax=0,ttax,total;
		int amount = 0;
		
		// to avoid overlapped if statement, using Map and array
		Map<String,Double> mstate = new Hashtable<String,Double>();
		Map<String,Double> mcounty = new Hashtable<String,Double>();
		String [] states = {"wisconsin","wi","illinois","il","new york","nc"};
		String [] counties = {"eau claire","dunn"};
		mstate.put("wisconsin", 0.05);
		mstate.put("wi", 0.05);
		mstate.put("illinois", 0.04);
		mstate.put("il", 0.04);
		mstate.put("new york", 0.0848);
		mstate.put("nc", 0.0848);
		
		mcounty.put("eau claire", 0.005);
		mcounty.put("dunn", 0.004);
		
		while ( true ) {
			System.out.print("What is the order amount? ");
			input = sc.nextLine();
			try {
				amount = Integer.parseInt(input);
				if ( amount < 0 ) {
					System.out.println("Please input positive number.");
					continue;
				}
				break;
			} catch ( Exception e) {
				System.out.println("Please input positive number.");
				continue;
			}
		}
		
		System.out.print("What state do you live in? ");
		input = sc.nextLine();
		state = input.toLowerCase();
		for ( int i = 0; i < states.length; i++ ) {
			if ( state.equals(states[i]) ) {
				tax = mstate.get(state);
				break;
			}
		}
		if ( tax == 0 ) {
			System.out.println("There is no state you want on this program.");
			return;
		}
		System.out.print("What county do you live in? ");
		input = sc.nextLine();
		county = input.toLowerCase();
		for ( int i = 0; i < counties.length; i++ ) {
			if ( county.equals(counties[i]) ) {
				ctax = mcounty.get(county);
				break;
			}
		}
		if ( ctax == 0 ) {
			System.out.println("Your county input is not included with additional county tax \n"
					+ "Or there is no in this program's county list ");
			System.out.println();
		}
		ttax = (amount* tax) + (amount* ctax);
		total = amount + ttax;
		if ( ctax != 0 ) {
			System.out.println("The state tax is $"+tax +".\""+"\nThe county tax is $"+ ctax+".\""
					+"\nThe total tax is $"+ ttax+"\"" + "\nThe total is $"+total);
		} else if ( ctax == 0 ){
			System.out.println("The total tax is $"+ttax + "\nThe total is $"+total);
		}
	}
}

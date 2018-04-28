package tutorial;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Tutorial {
	public static double tip(double bill, double percentage) {
		return bill * ( percentage / 100 );
	}
	public static double total(double bill, double tip) {
		return bill + tip;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double bill = 0;
	    while (true) {
	        try {
	        	System.out.print("What is the bill? ");
	            bill = Double.parseDouble(sc.next());
	            if ( bill < 0 ) {
	            	System.out.println("Your bill input is negative.");
	            	continue;
	            }
	            break;
	        } catch (Exception e) {
	        	System.out.println("Your bill input is invalid.");
	            continue;
	        }
	    }
	    
	    double percentage = 0;
	    while (true) {
	    	 try {
	    		 System.out.print("What is the tip percentage? ");
	    		 percentage = Double.parseDouble(sc.next());
		         if ( percentage < 0 ) {
		            System.out.println("Your percentage input is negative.");
		            continue;
		            }
	    		 break;
	    	 } catch (Exception e) {
		        System.out.println("Your percentage input is invalid.");
		        continue;
		     }
	    }
		double tip = tip(bill, percentage);
		double total = total(bill, tip);
		
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("The tip is $" + df.format(tip) );
		System.out.println("The total is $"+ df.format(total) );
	}

}

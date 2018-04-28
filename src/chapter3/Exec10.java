package chapter3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exec10 {

	public static void main(String[] args) {
		final double tax_rate = 0.055;
		Scanner sc = new Scanner(System.in);
		List<Exec10VO> list = new ArrayList<Exec10VO>();
		DecimalFormat df = new DecimalFormat("#.00");
		int i = 1;
		while(true) {
			try {
				Exec10VO vo = new Exec10VO();
				System.out.print("Price of item "+i+": ");
				vo.setPrice(sc.nextLine());
				if( vo.getPrice().equals("") ) {
					break;
				}
				vo.setDprice(Double.parseDouble(vo.getPrice()));
				if ( vo.getDprice() < 0 ) {
					System.out.println("Please input right positive number");
					continue;
				}
				
				System.out.print("Quantity of item "+i+": ");
				vo.setQuantity(sc.nextLine());
				if( vo.getQuantity().equals("") ) {
					break;
				}
				vo.setDquantity(Double.parseDouble(vo.getQuantity()));
				if ( vo.getDquantity() < 0 ) {
					System.out.println("Please input right positive number");
					continue;
				}
				list.add(vo);
				i++;
			} catch( Exception e ) {
				System.out.println("Please input right positive number");
				continue;
			}
		}
		double subtotal = 0;
		for( Exec10VO pvo : list ) {
			subtotal += pvo.getDprice() * pvo.getDquantity();
		}
		double tax = subtotal * tax_rate;
		double total = subtotal + tax;
		
		System.out.println("Subtotal: $"+ df.format(subtotal));
		System.out.println("Tax: $"+ df.format(tax));
		System.out.println("Total: $"+ df.format(total));

	}

}

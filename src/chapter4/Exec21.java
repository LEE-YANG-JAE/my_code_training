package chapter4;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Exec21 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer,String> map = new Hashtable<Integer,String>();
		
		String input = null;
		int number = 0;
		
		while ( true ) {
			System.out.println("Please choose the language you want to see");
			System.out.println("1 English 2.�ѱ���");
			input = sc.nextLine();
			if ( input.equals("1") ) {
				map.put(1, "January");
				map.put(2, "Feburary");
				map.put(3, "March");
				map.put(4, "April");
				map.put(5, "May");
				map.put(6, "June");
				map.put(7, "July");
				map.put(8, "August");
				map.put(9, "Setember");
				map.put(10, "October");
				map.put(11, "November");
				map.put(12, "December");
				
				while ( true ) {
					System.out.print("Please enter the number of the month: ");
					input = sc.nextLine();
					try {
						number = Integer.parseInt(input);
						if ( number >= 1 && number <= 12 ) {
							break;
						} else {
							System.out.println("Please enter the number of the month 1 to 12. ");
							continue;
						}
					} catch ( Exception e ) {
						System.out.println("Please enter the number of the month 1 to 12. ");
						continue;
					}
				}
				System.out.println("The name of the month is "+ map.get(number) + ".");
				break;
			} else if ( input.equals("2") ) {
				map.put(1, "1��");
				map.put(2, "2��");
				map.put(3, "3��");
				map.put(4, "4��");
				map.put(5, "5��");
				map.put(6, "6��");
				map.put(7, "7��");
				map.put(8, "8��");
				map.put(9, "9��");
				map.put(10, "10��");
				map.put(11, "11��");
				map.put(12, "12��");
				
				while ( true ) {
					System.out.print("���ڿ� �ش��ϴ� ���� �Է����ּ���: ");
					input = sc.nextLine();
					try {
						number = Integer.parseInt(input);
						if ( number >= 1 && number <= 12 ) {
							break;
						} else {
							System.out.println("1�� ���� 12�� ������ ���ڿ� �ش��ϴ� �޸� �Է����ּ���.");
							continue;
						}
					} catch ( Exception e ) {
						System.out.println("1�� ���� 12�� ������ ���ڿ� �ش��ϴ� �޸� �Է����ּ���.");
						continue;
					}
				}
				System.out.println("�ش��ϴ� ���� �̸��� "+ map.get(number) + " �Դϴ�.");
				break;
			} else {
				continue;
			}
		}
		
		
	}
}

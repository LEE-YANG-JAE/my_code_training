package chapter6; 

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exec32 {
	public static void guessgame() {
		Scanner sc = new Scanner(System.in);
		String input = null;
		List<Integer> list = new ArrayList<Integer>();
		int random = 0;
		while( true ) {
			System.out.print("Pick a difficulty level (1, 2 or 3): ");
			input = sc.nextLine();
			if ( input.equals("1") ) {
				random = (int)Math.round(Math.random() * 10);
				break;
			} else if ( input.equals("2") ) {
				random = (int)Math.round(Math.random() * 100);
				break;
			} else if ( input.equals("3") ) {
				random = (int)Math.round(Math.random() * 1000);
				break;
			} else {
				System.out.println("Please choose 1, 2, or 3 to play game.");
				continue;
			}
		}
		if( random == 0 ) {
			random += 1;
		}
		int count = 0;
		int fcount = 0;
		int guess = 0;
		
		while ( true ) {
			try {
				if ( count == 0) {
					System.out.print("I have my number. What's your guess? ");
					input = sc.nextLine();
					guess = Integer.parseInt(input);
					count++;
					list.add(guess);
				}

				if ( guess > random ) {
					System.out.print("Too high. Guess again: ");
					input = sc.nextLine();
					guess = Integer.parseInt(input);
					count++;
					for ( int value : list ) {
						if ( count >= 2 && value == guess  ) {
							System.out.print("Your input was the same before. Guess again: ");
							input = sc.nextLine();
							guess = Integer.parseInt(input);
							count++;
							while ( value == guess ) {
								System.out.print("Your input was the same before. Guess again: ");
								input = sc.nextLine();
								guess = Integer.parseInt(input);
								count++;
							}
							continue;
						}
					}
					list.add(guess);
					
				} else if ( guess < random ) {
					System.out.print("Too low. Guess again: ");
					input = sc.nextLine();
					guess = Integer.parseInt(input);
					count++;
					for ( int value : list ) {
						if ( count >= 2 && value == guess  ) {
							System.out.print("Your input was the same before. Guess again: ");
							input = sc.nextLine();
							guess = Integer.parseInt(input);
							count++;
							while ( value == guess ) {
								System.out.print("Your input was the same before. Guess again: ");
								input = sc.nextLine();
								guess = Integer.parseInt(input);
								count++;
							}
							continue;
						}
					}
					list.add(guess);
					
				}  else if ( guess == random ) {
					System.out.println("You got it in "+ count+" suesses!");
					System.out.println("You got it in "+ fcount+" fail!");
					if ( count == 1 ) {
						System.out.println("\"You're a mind reader!\"");
					} else if ( count >= 2 && count <= 4) {
						System.out.println("\"Most impressive.\"");
					} else if ( count >= 5 && count <= 6) {
						System.out.println("\"You can do better than that.\"");
					} else if ( count >= 7 ) {
						System.out.println("\"Better luck next time.\"");
					}
					break;
				}
			} catch ( Exception e ) {
				System.out.println("Please input only positive numbers.");
				fcount++;
				continue;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = null;
		System.out.println("Let's play Guess the Number.");
		guessgame();
		while ( true ) {
			System.out.print("Play again? ");
			input = sc.nextLine();
			if ( input.equals("y") ) {
				guessgame();
			} else if ( input.equals("n") ) {
				System.out.println("Goodbye!");
				break;
			} else {
				System.out.println("You should input only y or n");
			}
		}
	}
}

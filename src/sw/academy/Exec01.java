package sw.academy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exec01 {
	
	public static void main ( String[] args ) {
		int sum = 0;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int test_case_num = Integer.valueOf(input);
		
		for ( int i = 0; i < test_case_num ; i++ ) {
			String plus = sc.nextLine();
			String [] arrs = plus.split(" ");
			for ( String value : arrs ) {
				int changed = Integer.valueOf(value);
				if ( changed % 2 == 1) {
					sum = changed + sum;
				}
				map.put(i+1, sum);
			}
			sum = 0;
		}
		sc.close();
		for (int i = 1 ; i < test_case_num+1; i++ ) {
			System.out.println("#" + i + " " + map.get(i));
		}
	}
}
/*
https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5QSEhaA5sDFAUq&categoryId=AV5QSEhaA5sDFAUq&categoryType=CODE
1. 문제 이해 하기
요구사항 수집 : 10개의 수를 입력. 홀수들만 더함. 테스트 케이스 숫자로 1~10 번까지 테스트 가능하게.
문제 정의서 : 10개의 수를 입력 받아, 그 중에서 홀수만 더한 값을 출력하는 프로그램을 작성하라.
2. 입력, 출력, 프로세스 찾아내기
입력 : 테스트 케이스 숫자, 그리고 10개의 숫자
프로세스 : 테스트 케이스에 따라 10개의 숫자를 각각 입력된 값들 중 홀수만 더하기. 없으면 0 반환
출력 : #테스트 숫자 및 홀수만 더한 값
3. 테스트를 통해 디자인 다듬기 ( 최소한 4번 하기 )
첫번째
Inputs : 1
3 17 1 39 8 41 2 32 99 2
Expected Result : #1 200
Actual Result :  #1 200
두번째
Inputs : 2
3 17 1 39 8 41 2 32 99 2
22 8 5 123 7 2 63 7 3 46
Expected Result : 
#1 200
#2 208
Actual Result :  
#1 200
#2 208
세번째
Inputs : 3
3 17 1 39 8 41 2 32 99 2
22 8 5 123 7 2 63 7 3 46
6 63 2 3 58 76 21 33 8 1
Expected Result :  
#1 200
#2 208
#3 121
Actual Result : 
#1 200
#2 208
#3 121
네번째
Inputs : 2
22 8 5 123 7 2 63 7 3 46
6 63 2 3 58 76 21 33 8 1
Expected Result : 
#1 208
#2 121
Actual Result : 
#1 208
#2 121
4. 의사 코드로 알고리즘 작성하기
Initialize sum as 0
Initialize test_case_num
Initialize map Integer Integer
Prompt test_case_num
Initialize first number and Iterate from first number to test_case_num
Input String which is 10 numbers and has empty space between numbers.
Convert them into array
Sum 10 numbers which are not even number in each list.
Mapping with number key and sum.
Making sum to 0 to try next calculation.
Display from #1 to test_case_num sum numbers using map
*/

/*
양식
1. 문제 이해 하기
요구사항 수집 : 
문제 정의서 : 
2. 입력, 출력, 프로세스 찾아내기
입력 : 
프로세스 : 
출력 :
3. 테스트를 통해 디자인 다듬기 ( 최소한 4번 하기 )
첫번째
Inputs : 
Expected Result : 
Actual Result : 
두번째
Inputs : 
Expected Result : 
Actual Result : 
세번째
Inputs : 
Expected Result : 
Actual Result : 
네번째
Inputs : 
Expected Result : 
Actual Result : 
4. 의사 코드로 알고리즘 작성하기
*/

/*
*/
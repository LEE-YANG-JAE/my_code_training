package chapter7;

import java.util.Scanner;

public class Exec33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] prepared_answers = {"Yes","No","Maybe", "Ask again later", "You are a good guy"};
		
		System.out.print("What is your question? ");
		sc.nextLine();
		sc.close();
		int random_num = (int) Math.round(Math.random() * prepared_answers.length);
		
		System.out.println( prepared_answers[random_num] );
		
	}

}
/*1. 문제 이해 하기
요구사항 수집 : 사용자의 문장 입력, 가지고 있는 문장 리스트, 무작위로 출력해주는 기능
문제 정의서
Magic 8 Ball 게임은 사용자로부터 질문을 입력 받아 이에 대한 답을 
"Yes", "No", "Maybe", "Ask again later" 등 중에서 무작위로 대답해 주는 게임
2. 입력, 출력, 프로세스 찾아내기
입력 : 사용자 문장
프로세스 : 입력 문장 저장 후 랜덤 문장 출력
출력 : "Yes", "No", "Maybe", "Ask again later"
3. 테스트를 통해 디자인 다듬기 ( 최소한 4번 하기 )
첫번째
Inputs : Hi
Expected Result : Yes
Actual Result : Ask again later
두번째
Inputs : Am I handsome?
Expected Result : No
Actual Result : No
세번째
Inputs : Will I be rich?
Expected Result : Maybe
Actual Result : Ask again later
네번째
Inputs : Do you have your girl friend?
Expected Result : Ask again later
Actual Result : You are a good guy
4. 의사 코드로 알고리즘 작성하기
Magic8ball game
Prompt "What is your question? " and no store for input
Initialize prepared_sentences are "Yes", "No", "Maybe", "Ask again later" and so on...
Initialize random_number using random method within prepared_sentences's length.
Round random_number
Prompt for user_sentence "What's your question?"
Choose one of prepared_sentences randomly.
Display one of prepared_sentences
END*/

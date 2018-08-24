import java.text.DecimalFormat;
import java.util.Scanner;

class Stack {
	int top;
	int stackSize;
	String[] S;
	Stack(int stackSize) {
		top = -1;
		this.stackSize = stackSize;
		S = new String[stackSize];
	}
	
	boolean isEmpty() {
		if ( top == -1 ) return true;
		else return false;
	}
	
	void push(String item) {
		top++;
		S[top] = item;
	}
	
	String pop() {
		return S[top--];
	}
	
	String peek() {
		if(top > -1) return S[top];
		else return "";
	}
	
	void printStack() {
		for(int i = 0; i <= top; i++) {
			System.out.println(S[i] + " ");
		}
	}
}

class eqCalc {
	String eq, postEq;
	Stack S;
	
	eqCalc(String eq) {
		String[] eqArr = eq.split(" ");
		//String[] eqArr = checkSentence(eq);
		String temp;
		
		if( eqArr == null ){
			System.out.println("계산식을 다시 써주세요.");
		} else {
			this.eq = eq;
			int n = eqArr.length;
			S = new Stack(n);
			postEq = "";
			
			for(int i=0; i<n; i++) {
				if(eqArr[i].equals("(") == true) {
					S.push(eqArr[i]);
				}
				else if (eqArr[i].equals(")") == true) {
					while(true) {
						temp = S.pop();
						if(temp.equals("(") == false) {
							postEq += temp + " ";
						} else {
							break;
						}
					}
				}
				else if (eqArr[i].equals("{")) {
					S.push(eqArr[i]);
				}
				else if( eqArr[i].equals("}")) {
					while(true) {
						temp = S.pop();
						if(temp.equals("{") == false) {
							postEq += temp + " ";
						} else {
							break;
						}
					}
				}
				else if (eqArr[i].equals("[")) {
					S.push(eqArr[i]);
				}
				else if( eqArr[i].equals("]")) {
					while(true) {
						temp = S.pop();
						if(temp.equals("[") == false) {
							postEq += temp + " ";
						} else {
							break;
						}
					}
				}
				else if(eqArr[i].equals("+") == true || eqArr[i].equals("-") == true) {
					while(true){
						if(operYN(S.peek()) == true) {
							postEq += S.pop()+ " ";
						} else {
							break;
						}
					}
					S.push(eqArr[i]);
				}
				else if(eqArr[i].equals("*") == true || eqArr[i].equals("/") == true) {
					while(true) {
						if(S.peek().equals("*") == true || S.peek().equals("/") == true) {
							postEq += S.pop()+ " ";
						} else {
							break;
						}
					}
					S.push(eqArr[i]);
				}
				else {
					postEq += eqArr[i] + " ";
				}
			} // for end
			while(S.isEmpty() == false) {
				postEq += S.pop()+" ";
			}
		}
	}
	
	boolean operYN(String item) {
		if(item.equals("*")) return true;
		else if ( item.equals("/")) return true;
		else if ( item.equals("+")) return true;
		else if ( item.equals("-")) return true;
		else return false;
	}
	
	String getPostEq() {
		return postEq;
	}
	
	double getPostCalc() {
		String[] eqArr=postEq.split(" ");
		int n = eqArr.length;
		S=new Stack(n);
		double a;
		double b;
		double resultValue;
		String result="";
		String temp = "";
		
		for( int i = 0; i < n; i++ ){
			if(operYN(eqArr[i])==false) {
				S.push(eqArr[i]);
			}
			else {
				b=(double)Double.parseDouble(S.pop());
				a=(double)Double.parseDouble(S.pop());

				if(eqArr[i].equals("*")) {
					S.push(String.valueOf(a*b));
				} else if(eqArr[i].equals("/")) {
					S.push(String.valueOf(a/b)); 
				} else if(eqArr[i].equals("+")) {
					S.push(String.valueOf(a+b));
				} else if(eqArr[i].equals("-"))  {
					S.push(String.valueOf(a-b));
				}
			}
		}
		while(S.isEmpty()==false) {
			result += S.pop();
		}
		resultValue = (double)Double.parseDouble(result);
		DecimalFormat df = new DecimalFormat("#.##");
		temp = df.format(resultValue);
		resultValue = (double)Double.parseDouble(temp);
		return resultValue;
	}
	
	String[] checkSentence(String eq){
		int cnt = 0;
		String[] eqArr = null;
		int a = 10;
		System.out.println(eq);
		StringBuffer sb = new StringBuffer();
		char[] eqArray = eq.toCharArray();
		for(char value : eqArray){
			if( value == '+' || value == '-' || value == '*' || value == '/' 
					|| value == '(' || value == ')' || value == '{'  || value == '}'
					|| value == '[' || value == ']' || isStringDouble(String.valueOf(value)) ){
				sb.append(value);
			} else if ( value ==  ' '){
				continue;
			} else {
				eqArr = null;
				System.out.println(cnt + " 째에서 잘못 입력한 글자가 있습니다.");
				return eqArr;
			}
			cnt++;
		}
		String localeq = sb.toString();
		eqArr = localeq.split("");
		System.out.println(localeq);
		for (String test : eqArr) {
			System.out.print(test + " ");
		}
		System.out.println();
		return eqArr;
	}
	// 문자열이 실수 및 정수로 변환할 수 있는지 판단
	boolean isStringDouble(String s) {
		try {
		    Double.parseDouble(s);
		    return true;
		} catch (NumberFormatException e) {
		    return false;
		}
	}
}

public class Calculator {
	public static void main(String[] args) {
//		String A = "[ { ( 12.3 + 6 ) * 3 * ( 1 + 2 ) } / 6 ] + 3";
		String A = "20 - { ( 3 - 1 ) * 8 + 2 }";
		eqCalc calc = new eqCalc(A);
		System.out.println(calc.getPostEq());
		System.out.println(calc.getPostCalc());
		
		System.out.println("계산식을 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		String b = sc.nextLine();
		
		eqCalc calc2 = new eqCalc(b);
		System.out.println(calc2.getPostEq());
		System.out.println(calc2.getPostCalc());
//		Stack test = new Stack(5);
//		System.out.println(test.isEmpty());
//		test.push("1");
//		test.push("3");
//		System.out.println("////////");
//		System.out.println(test.peek());
//		System.out.println("////////");
//		test.push("7");
//		System.out.println(test.isEmpty());
//		System.out.println("////////");
//		test.printStack();
//		System.out.println("////////");
//		test.pop();
//		test.printStack();
	}
}

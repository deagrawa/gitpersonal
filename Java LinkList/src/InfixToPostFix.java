import java.io.IOException;

public class InfixToPostFix {

	public static void main(String[] args) throws IOException {
		char[] post = new char[256];
		infixToPostfixConversion(post);
		
	}

	public static int getPrecedence(char ch) {
		if(ch == '(') {
			return 0;
		}
		else if (ch == '+' || ch == '-') {
			return 3;
		}
		else if(ch == '*' || ch == '/') {
			return 5;
		}
		return -99;
	}

	public static void infixToPostfixConversion(char[] post) throws IOException {
		StackClass stack = new StackClass();
		char token = getToken();
		int h = 0;
		while(token != '\0') {
			if(token == '(') {
				stack.push(new NodeData('('));
			}
			else if(Character.isDigit(token)) {
				post[h++] = token;
			}
			else if(token == ')') {
				char tempData;
				while ((tempData = (char) stack.pop().data) != '(') {
					post[h++] = tempData;
				}
			}
			else {
				while (!stack.isEmpty() && (getPrecedence((char)stack.peek().data) >= getPrecedence(token))) {
					post[h++] = (char) stack.pop().data;
				}
				stack.push(new NodeData(token));
			}
			token = getToken();
		}
		while (!stack.isEmpty()) {
			post[h++] = (char)stack.pop().data;
		}
		printPostFix(post, h);
		
		
	}
	public static char getToken() throws IOException {
		int n;
		
		while ((n = System.in.read()) == ' ');
		if(n == '\r' || n == '\n') {
			return '\0';
		}
		return (char)n;
	}
	public static void printPostFix(char[] post, int count) {
		for (int i =0; i<count; ++i) {
			System.out.printf("%c", post[i]);
		}
	}
}

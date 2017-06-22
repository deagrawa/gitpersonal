package com.deepak.stackProblems;

import com.deepak.stack.CreateStack;

public class InfixToPostFix {

	CreateStack stack1;

	InfixToPostFix() {
		stack1 = new CreateStack();
	}

	public int conversion(char[] exp) {

		int i, k;
		for (i = 0, k = -1; i < exp.length; ++i) {
			if (StackUtill.isOperand(exp[i])) {
				exp[++k] = exp[i];
			} else if (exp[i] == '(') {
				stack1.push(exp[i]);
			} else if (exp[i] == ')') {
				while (!stack1.isEmpty() && stack1.peek() != '(') {
					exp[++k] = stack1.pop();
				}
				if (!stack1.isEmpty() && stack1.peek() != '(') {
					return -1;
				} else {
					stack1.pop();
				}
			} else {
				while (!stack1.isEmpty() && StackUtill.getPrec(exp[i]) <= StackUtill.getPrec(stack1.peek())) {
					exp[++k] = stack1.pop();
				}
				stack1.push(exp[i]);
			}
		}
		while (!stack1.isEmpty())
			exp[++k] = stack1.pop();

		exp[++k] = '\0';
		return 1;
	}

	public static void main(String[] args) {
		String exp1 = "a+b*(c^d-e)^(f+g*h)-i";
		char[] exp = exp1.toCharArray();
		InfixToPostFix in = new InfixToPostFix();
		in.conversion(exp);

		for (int i = 0; i < exp.length; ++i) {
			System.out.print(exp[i]);
		}

	}
}

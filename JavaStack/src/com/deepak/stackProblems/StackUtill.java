package com.deepak.stackProblems;

public class StackUtill {

	public static boolean isOperand(char ch) {
		if((ch >= 'a' && ch<='z') || (ch >= 'A' && ch<='Z')) {
			return true;
		}
		return false;
	}
	
	public static int getPrec(char ch) {
		switch(ch) {
		case '+':
		case '-':
			return 1;
		case '*' :
		case '/' :
			return 2;
		case '^' :
			return 3;
		}
		return -1;
	}
}

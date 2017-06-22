package com.string.problems;

import java.util.Stack;

public class PraenthesesProb {

	public static boolean CheckParentesis(String str)
	{
	    if (str.isEmpty())
	        return true;

	    Stack<Character> stack = new Stack<Character>();
	    for (int i = 0; i < str.length(); i++)
	    {
	        char current = str.charAt(i);
	        if (current == '{' || current == '(' || current == '[')
	        {
	            stack.push(current);
	        }


	        if (current == '}' || current == ')' || current == ']')
	        {
	            if (stack.isEmpty())
	                return false;

	           // char last = stack.peek();
	            if (current == '}' && stack.peek() == '{' || current == ')' && stack.peek() == '(' || current == ']' && stack.peek() == '[')
	                stack.pop();
	            else 
	                return false;
	        }

	    }

	    return stack.isEmpty();
	}
	public static void main(String[] args) {
		//System.out.println(PraenthesesProb.CheckParentesis("({()})"));
		System.out.println(PraenthesesProb.CheckParentesis("{}()"));
		

	}

}

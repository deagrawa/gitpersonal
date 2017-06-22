package com.deepak.stack;

public class CreateStack {

	public LocalStack st;
	
	class LocalStack {
		char data;
		LocalStack next;
		
		LocalStack(char item) {
			data = item;
			next = null;
		}
	}
	
	public CreateStack() {
		st = null;
	}
	public void push(char data) {
		LocalStack temp = new LocalStack(data);
		temp.next = this.st;
		this.st = temp;
	}
	public char pop() {
		
		char temp = this.st.data;
		this.st = this.st.next;
		
		return temp;
	}
	public char peek() {
		return this.st.data;
	}
	
	public boolean isEmpty() {
		if(this.st == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
}

package com.deepak.mediator;

public abstract class User {

	protected ChatMediator mediator;
	protected String name;
	
	User(ChatMediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}
	
	public abstract void sendMessage(String msg);
	public abstract void receiveMessage(String msg);
}

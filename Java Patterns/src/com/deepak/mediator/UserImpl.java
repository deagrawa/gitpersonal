package com.deepak.mediator;

public class UserImpl extends User{

	
	UserImpl(ChatMediator mediator, String name) {
		super(mediator, name);
		
	}

	@Override
	public void sendMessage(String msg) {
		System.out.println("message is going to send :" + msg);
		this.mediator.sendMessage(msg, this);
		
	}

	@Override
	public void receiveMessage(String msg) {
		System.out.println("message received by user : " + this.name + "  : " + msg);
		
	}

}

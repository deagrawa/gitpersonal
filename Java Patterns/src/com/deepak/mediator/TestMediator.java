package com.deepak.mediator;

public class TestMediator {

	public static void main(String[] args) {
		ChatMediator med = new ChatMediatorImpl();
		
		User u1 = new UserImpl(med, "u1");
		User u2 = new UserImpl(med, "u2");
		User u3 = new UserImpl(med, "u3");
		User u4 = new UserImpl(med, "u4");
		User u5 = new UserImpl(med, "u5");
		med.addUser(u1);
		med.addUser(u2);
		med.addUser(u3);
		med.addUser(u4);
		med.addUser(u5);
		
		u1.sendMessage("hello i am u1");

	}

}

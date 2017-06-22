package com.deepak.mediator;

public interface ChatMediator {

	void addUser(User user);
	public void sendMessage(String message, User user);
}

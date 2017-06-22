package com.deepak.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator{

	List<User>users;
	
	ChatMediatorImpl() {
		users = new ArrayList<>();
	}
	
	@Override
	public void addUser(User user) {
		users.add(user);
	}

	@Override
	public void sendMessage(String message, User user) {
		for(User u : this.users) {
			if(u!=user) {
				u.receiveMessage(message);
			}
		}
		
	}
	
}

package com.deepak.observer;

public class MyTopicSubscriber implements Observer{

	public String name;
	public Subject topic;
	MyTopicSubscriber (String name) {
		this.name = name;
	}
	
	@Override
	public void update() {
		String msg = topic.getUpdate(this);
		if(msg == null) {
			System.out.println("no update");
		}
		else {
			System.out.println(msg);
		}
		
	}

	@Override
	public void setSubject(Subject s) {
		this.topic = s;
		
	}

	
}

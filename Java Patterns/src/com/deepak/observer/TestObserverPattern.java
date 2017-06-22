package com.deepak.observer;

public class TestObserverPattern {

	public static void main(String[] args) {
		MySubject sub = new MySubject();
		
		Observer o1 = new MyTopicSubscriber("o1");
		Observer o2 = new MyTopicSubscriber("o2");
		Observer o3 = new MyTopicSubscriber("o3");

		sub.register(o1);
		sub.register(o2);
		sub.register(o3);
		
		o1.setSubject(sub);
		o2.setSubject(sub);
		o3.setSubject(sub);

		o1.update();
		
		sub.postMessage("New Message");
		
	}

}

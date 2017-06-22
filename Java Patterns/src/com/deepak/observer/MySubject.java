package com.deepak.observer;

import java.util.ArrayList;

public class MySubject implements Subject{

	public ArrayList<Observer> list;
	public String msg;
	
	public MySubject() {
		list = new ArrayList<Observer>();
		msg = null;
	}
	@Override
	public void register(Observer o) {
		list.add(o);
		
	}

	@Override
	public void unregister(Observer o) {
		list.remove(o);
	}

	@Override
	public void notifyAllObserver() {
		for(int i = 0; i <list.size(); ++i) {
			list.get(i).update();
		}	
	}

	@Override
	public String getUpdate(Observer o) {
		return this.msg;
	}
	
	public void postMessage(String msg) {
		this.msg = msg;
		this.notifyAllObserver();
	}
	
	

}

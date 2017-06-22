package com.deepak.observer;

public interface Subject {

	public void register(Observer o);
	public void unregister(Observer o);
	public void notifyAllObserver();
	public String getUpdate(Observer o);
}

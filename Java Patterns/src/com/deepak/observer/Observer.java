package com.deepak.observer;

public interface Observer {
	public void update();
	
	public void setSubject(Subject s);
}

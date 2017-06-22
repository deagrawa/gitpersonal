package com.deepak.decorator;

public class Decorator implements Car {
	
	protected Car car;
	
	Decorator(Car car) {
		this.car = car;
	}
	public void assemble() {
		car.assemble();
	}

}

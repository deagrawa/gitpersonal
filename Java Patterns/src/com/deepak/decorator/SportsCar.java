package com.deepak.decorator;

public class SportsCar extends Decorator{
	
	public SportsCar(Car car) {
		super(car);
	}
	public void assemble() {
		car.assemble();
		System.out.println("Sportes car");
	}
	
	

}

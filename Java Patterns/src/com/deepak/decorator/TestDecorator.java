package com.deepak.decorator;

public class TestDecorator {

	public static void main(String[] args) {
		Car car = new SportsCar(new CarBasic());
		car.assemble();
	}

}

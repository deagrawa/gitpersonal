package com.deepak.builder;

public class TestBuilder {

	public static void main(String[] args) {
		ComputerClass computer = new ComputerClass.ComputerBuilder("500GB", "2GB").setGraphicCard(true).setBlueTooth(true).build();
		System.out.println(computer.toString());

	}

}

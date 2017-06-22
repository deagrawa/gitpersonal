package com.deepak.builder;

public class ComputerClass {

	public String RAM;

	public String HDD;
	
	public boolean isGraphicsCardEnabled;
	public boolean isBluetoothEnabled;
	
	public String getRAM() {
		return RAM;
	}

	public String getHDD() {
		return HDD;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	
	private ComputerClass(ComputerBuilder computerBuilder) {
		this.RAM = computerBuilder.RAM;
		this.HDD = computerBuilder.HDD;
		this.isGraphicsCardEnabled = computerBuilder.isGraphicsCardEnabled;
		this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
	}
	
	public static class ComputerBuilder {
		
		private String RAM;
		private String HDD;
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;
		
		public ComputerBuilder(String RAM, String HDD) {
			this.RAM = RAM;
			this.HDD = HDD;
			
		}
		public ComputerBuilder setGraphicCard(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}
		public ComputerBuilder setBlueTooth(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		public ComputerClass build() {
			return new ComputerClass(this);
		}
	}
}

package com.deepak.singleton;

public class EagerSingletonStaticBlock {

	private static EagerSingletonStaticBlock singleton;
	
	private EagerSingletonStaticBlock() {
		System.out.println("object called");
		
	}
	
	static {
		try {
			singleton = new EagerSingletonStaticBlock();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static EagerSingletonStaticBlock getInstance () {
		return singleton;
	}
	
	public static void main(String[] args) {
		
		System.out.println("object creation done");

	}

}

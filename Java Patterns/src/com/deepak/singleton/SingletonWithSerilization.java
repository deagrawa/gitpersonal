package com.deepak.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonWithSerilization implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4837926908892230800L;


	private SingletonWithSerilization(){}
	
	private static class SingletonHelper {
		private static SingletonWithSerilization instance = new SingletonWithSerilization();
		
	}
	
	public static SingletonWithSerilization getInstance () {
		return SingletonHelper.instance;
	}
	
	protected Object readResolve(){
		return getInstance();
	}
	

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String fileName = "C:\\temp\\abc.ser";
		SingletonWithSerilization instance1 = null;
		
		
			
			SingletonWithSerilization instance = SingletonWithSerilization.getInstance();
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream (fileName));
			output.writeObject(instance);
			output.close();
			
			ObjectInputStream input = new ObjectInputStream (new FileInputStream(fileName));

			
				instance1 = (SingletonWithSerilization) input.readObject();
		
			
			input.close();
			
			System.out.println(instance.hashCode());
			System.out.println(instance1.hashCode());
			
			
		

	}

}

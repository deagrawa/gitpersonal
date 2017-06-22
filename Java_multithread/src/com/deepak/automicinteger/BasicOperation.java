package com.deepak.automicinteger;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author I309309
 *
 */
public class BasicOperation {
	
	public static void main (String[] args) {
		AtomicInteger atom = new AtomicInteger();
		//System.out.println(atom);
		
		System.out.println(atom.getAndAdd(10));
		System.out.println(atom.addAndGet(10));
	}

}

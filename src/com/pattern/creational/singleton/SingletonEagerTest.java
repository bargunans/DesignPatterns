package com.pattern.creational.singleton;

import java.util.Optional;

public class SingletonEagerTest {
	
	
	public static void main(String[] args) {
		
		/*
		 * LazilyInitializedSingleton inst =
		 * LazilyInitializedSingleton.getInstance().get();
		 * System.out.println("inst==>"+inst.hashCode()); LazilyInitializedSingleton
		 * inst1 = LazilyInitializedSingleton.getInstance().get();
		 * System.out.println("inst==>"+inst1.hashCode());
		 */
		
		
		EagerlyInitializedSingleton e1  = EagerlyInitializedSingleton.getInstance().get();
		System.out.println("e1==>"+e1.hashCode());
		EagerlyInitializedSingleton e2  = EagerlyInitializedSingleton.getInstance().get();
		System.out.println("e2==>"+e2.hashCode());
		
		System.out.println(EagerlyInitializedSingleton.class.getCanonicalName());
		
		
		
	}

}

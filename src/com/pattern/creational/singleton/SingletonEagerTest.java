package com.pattern.creational.singleton;

public class SingletonEagerTest {
	
	
	public static void main(String[] args) {
		
		LazilyInitializedSingleton inst = LazilyInitializedSingleton.getInstance().get();
		System.out.println("inst==>"+inst.hashCode());
		LazilyInitializedSingleton inst1 = LazilyInitializedSingleton.getInstance().get();
		System.out.println("inst==>"+inst1.hashCode());
	}

}

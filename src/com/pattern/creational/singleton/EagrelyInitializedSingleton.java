package com.pattern.creational.singleton;

public class EagrelyInitializedSingleton {

	private static EagrelyInitializedSingleton INSTANCE = new EagrelyInitializedSingleton();

	private EagrelyInitializedSingleton() {

	}

	public static EagrelyInitializedSingleton getInstance() {

		return INSTANCE;
	}

}

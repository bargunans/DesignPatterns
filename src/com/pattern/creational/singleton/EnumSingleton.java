package com.pattern.creational.singleton;

public enum EnumSingleton {

	INSTANCE;

	private EnumSingleton() {
	}

	public EnumSingleton getInstance() {
		return INSTANCE;
	}

}

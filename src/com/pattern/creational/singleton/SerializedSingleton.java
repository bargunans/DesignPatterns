package com.pattern.creational.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

	private static final long serialVersionUID = 1L;

	private SerializedSingleton() {
	}

	private static class SingletonHolder {
		private static final SerializedSingleton INSTANCE = new SerializedSingleton();
	}

	public static SerializedSingleton getInstance() {
		return SingletonHolder.INSTANCE;
	}

	public Object readResolve() {
		return getInstance();
	}

}

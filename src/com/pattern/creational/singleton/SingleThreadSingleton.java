package com.pattern.creational.singleton;

import java.util.Optional;

public class SingleThreadSingleton {

	private static Optional<SingleThreadSingleton> INSTANCE;

	private SingleThreadSingleton() {
	}

	public static synchronized Optional<SingleThreadSingleton> getInstance() {

		if (!INSTANCE.isPresent()) {
			INSTANCE = Optional.ofNullable(new SingleThreadSingleton());
		}
		return INSTANCE;
	}

}

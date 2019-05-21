package com.pattern.creational.singleton;

import java.util.Optional;

public class ReflectionSafeSingleton {

	private static Optional<ReflectionSafeSingleton> INSTANCE = Optional
			.ofNullable(new ReflectionSafeSingleton());

	private ReflectionSafeSingleton() {

		/*
		 * if (INSTANCE != null) { throw new
		 * IllegalStateException("Already instantiated"); }
		 */

	}

	public static Optional<ReflectionSafeSingleton> getInstance() {

		return INSTANCE;
	}

}

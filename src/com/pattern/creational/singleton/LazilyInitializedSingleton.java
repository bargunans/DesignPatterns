package com.pattern.creational.singleton;

import java.util.Optional;

public class LazilyInitializedSingleton {

	private static Optional<LazilyInitializedSingleton> INSTANCE = Optional.empty();

	private LazilyInitializedSingleton() {

	}

	public static Optional<LazilyInitializedSingleton> getInstance() {

		if (!INSTANCE.isPresent()) {
			INSTANCE = Optional.ofNullable(new LazilyInitializedSingleton());
		}

		return INSTANCE;
	}

}

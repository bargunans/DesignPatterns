package com.pattern.creational.singleton;

import java.util.Optional;

public class EagerlyInitializedSingleton {

	private static Optional<EagerlyInitializedSingleton> INSTANCE = Optional
			.ofNullable(new EagerlyInitializedSingleton());

	private EagerlyInitializedSingleton() {
	}

	public static Optional<EagerlyInitializedSingleton> getInstance() {

		return INSTANCE;
	}

}

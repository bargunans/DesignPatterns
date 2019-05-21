package com.pattern.creational.singleton;

import java.util.Optional;

public class MultiThreadedSingleton {

	private static Optional<MultiThreadedSingleton> INSTANCE = Optional.empty();

	private MultiThreadedSingleton() {
	}

	public static Optional<MultiThreadedSingleton> getInstance() {

		if (!INSTANCE.isPresent()) {
			synchronized (INSTANCE) {
				if (!INSTANCE.isPresent())
					INSTANCE = Optional.ofNullable(new MultiThreadedSingleton());
			}
		}
		return INSTANCE;
	}

}

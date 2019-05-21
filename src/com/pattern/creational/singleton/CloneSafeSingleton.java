package com.pattern.creational.singleton;

import java.util.Optional;

public class CloneSafeSingleton implements Cloneable {

	private static Optional<CloneSafeSingleton> INSTANCE = Optional.empty();

	private CloneSafeSingleton() {

	}

	public static Optional<CloneSafeSingleton> getInstance() {

		if (!INSTANCE.isPresent()) {
			INSTANCE = Optional.ofNullable(new CloneSafeSingleton());
		}

		return INSTANCE;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		throw new CloneNotSupportedException("Cloning is not allowed");
	}

}

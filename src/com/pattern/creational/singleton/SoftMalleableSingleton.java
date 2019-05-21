package com.pattern.creational.singleton;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;

public class SoftMalleableSingleton {

	private transient static Reference<SoftMalleableSingleton> INSTANCE;

	private SoftMalleableSingleton() {
	}

	/// case 1 initial reference to INSTANCE is null
	/// case 2 INSTANCE references an invalid object (was GC by JVM)
	/// case 3 INSTANCE references a valid object
	public static SoftMalleableSingleton getINSTANCE() {
		synchronized (SoftMalleableSingleton.class) {
			if ((INSTANCE == null) || (INSTANCE.get() == null)) {
				SoftMalleableSingleton SoftMalleableSingleton = new SoftMalleableSingleton();
				INSTANCE = new SoftReference<SoftMalleableSingleton>(SoftMalleableSingleton);
			}
			return INSTANCE.get();
		}
	}

}

package com.pattern.creational.singleton;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class WeakMalleableSingleton {

	private transient static Reference<WeakMalleableSingleton> INSTANCE;

	private WeakMalleableSingleton() {
	}
	/// case 1 initial reference to INSTANCE is null
	/// case 2 INSTANCE references an invalid object (was GC by JVM)
	/// case 3 INSTANCE references a valid object

	public static WeakMalleableSingleton getInstance() {
		synchronized (WeakMalleableSingleton.class) {
			if ((INSTANCE == null) || (INSTANCE.get() == null)) {
				WeakMalleableSingleton weakMalleableSingleton = new WeakMalleableSingleton();
				INSTANCE = new WeakReference<WeakMalleableSingleton>(weakMalleableSingleton);
			}
			return INSTANCE.get();
		}
	}

}

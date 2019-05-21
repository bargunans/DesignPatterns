package com.pattern.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionTest {

	public static void main(String[] args) {

		EagerlyInitializedSingleton rSingleton1 = EagerlyInitializedSingleton.getInstance().get();
		
		try {
			Class clazz = Class.forName("com.pattern.creational.singleton.EagerlyInitializedSingleton");

			Constructor<?> constructor = clazz.getDeclaredConstructor();
			constructor.setAccessible(true);
			EagerlyInitializedSingleton rSingleton2 = (EagerlyInitializedSingleton)constructor.newInstance();
			
		
		System.out.println("rSingleton1===>"+rSingleton1.hashCode());
		System.out.println("rSingleton2===>"+rSingleton2.hashCode());
		
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| ClassNotFoundException | NoSuchMethodException | SecurityException e) {

			e.printStackTrace();
		}

	}

}

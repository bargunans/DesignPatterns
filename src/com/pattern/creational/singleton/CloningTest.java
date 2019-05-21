package com.pattern.creational.singleton;

public class CloningTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		CloneSafeSingleton c1 = CloneSafeSingleton.getInstance().get();
		CloneSafeSingleton c2 = (CloneSafeSingleton) c1.clone();
	}

}

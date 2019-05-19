package com.pattern.creational.singleton;

public class FileLogger {

	private static FileLogger logger;

	// prevents instantiation from outside class
	private FileLogger() {
	}

	// Global point of access
	public static FileLogger getFileLogger() {
		if (logger == null) {
			logger = new FileLogger();
		}
		return logger;
	}

}

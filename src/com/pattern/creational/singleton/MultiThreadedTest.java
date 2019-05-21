package com.pattern.creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadedTest {
	
	static void CreateSingleton() {
		
		BillPughSingleton es = BillPughSingleton.getInstance();
		System.out.println("es==>"+es.hashCode());
	}
	
	public static void main(String[] args) {
		
		//System.out.println("dbl==>"+MultiThreadedSingleton.getInstance().get().hashCode());
		
		
		 ExecutorService es = Executors.newFixedThreadPool(2);
		 es.submit(MultiThreadedTest::CreateSingleton);
		 es.submit(MultiThreadedTest::CreateSingleton); 
		 es.shutdown();
		 
	}

}

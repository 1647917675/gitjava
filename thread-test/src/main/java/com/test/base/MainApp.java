package com.test.base;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Administrator
 *
 */
public class MainApp {

	public static void main(String[] args) {
		
		Runtime runtime = Runtime.getRuntime();
		
	    final List<String> tasks = new ArrayList<String>();
	    tasks.add("hello");
		System.out.println(tasks.size());
		System.err.println(tasks.get(0));
		runtime.addShutdownHook(new Thread(new  Runnable(){

			public void run() {
				System.err.println("this is hooks");
				tasks.remove(0);
				System.out.println(tasks.size());
			}
		}));
		System.out.println("this is the main");
		while(true){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

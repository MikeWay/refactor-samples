package com.mycompany.performance;

import java.util.ArrayList;
import java.util.List;

public class Container {
	
	private int m1Count;
	private int m2Count;
	private List<String[]> strings;
	
	public Container(){
		strings = new ArrayList<String[]>();
	}
	
	public int method1(){
		String message = String.format("Method 1 called %d times\n", m1Count++);
		strings.add(new String[50000]);
		return m1Count;
		
	}
	
	public int method2(){
		System.out.format("Method 2 called %d times\n", m2Count++);
		return m2Count;
		
	}	

	
}

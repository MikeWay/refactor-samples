package com.mycompany.numtowords;

public class NumToWordsConverter {

	private static final String digits[] = {"zero", "one", "two", "three",
			"four", "five", "six", "seven", "eight", "nine"};

	private static final String teens[] = {"ten", "eleven", "two", "three",
			"four", "five", "six", "seven", "eight", "nine"};
	
	public String convert(int i) {
		if(i >=0 && i < 10){
			return digits[i];
		} else if (i >=10 && i< 20){
			return teens[i-10];
		}
//		
//		tens = i / 10;
//		digits i % 10;
		return "out of range";
	}

}

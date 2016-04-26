package com.mycompany.numtowords;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)

public class TestNumToWordsConverter {
	
	private String expected;
	private int value;
	


	@Parameters
	public static Collection<Object[]>parameters(){
	Object[][]data = new Object[][]{
	{"zero",0} , {"one",1}, {"four",4}, {"nine", 9} ,
	{"ten", 10}};
		return Arrays.asList(data);
	}
	
	
	public TestNumToWordsConverter(String expected, int value) {
		super();
		this.expected = expected;
		this.value = value;
	}


	@Test
	public void testConvert() {
		String res = NumToWordsConverter.convert(this.value);
		assertEquals(this.expected, res);
		
	}

}

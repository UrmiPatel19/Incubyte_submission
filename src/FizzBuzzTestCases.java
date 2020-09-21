import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTestCases {

	
	@Test
	public void test1()
	{
		
		assertTrue(FizzBuzz.convertInNumber(1).equals("1"));
		assertTrue(FizzBuzz.convertInNumber(2).equals("2"));
	}
}

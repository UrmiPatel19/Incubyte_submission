import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTestCases {

	
	@Test
	public void testforNormalNumber()
	{
		
		assertTrue(FizzBuzz.convertToFizzBuzz(1).equals("1"));
		assertTrue(FizzBuzz.convertToFizzBuzz(2).equals("2"));
	}
	@Test
	public void testForFizz()
	{
		assertTrue(FizzBuzz.convertToFizzBuzz(3).equals("Fizz"));
		assertTrue(FizzBuzz.convertToFizzBuzz(6).equals("Fizz"));
	}
	@Test
	public void  testForBuzz()
	{
		assertTrue(FizzBuzz.convertToFizzBuzz(5).equals("Buzz"));
		assertTrue(FizzBuzz.convertToFizzBuzz(10).equals("Buzz"));
	}
	@Test
	public void testForFizzBuzz()
	{
		assertTrue(FizzBuzz.convertToFizzBuzz(15).equals("FizzBuzz"));
		assertTrue(FizzBuzz.convertToFizzBuzz(30).equals("FizzBuzz"));
	}
}

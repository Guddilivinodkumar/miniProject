package junit;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class TestClass {
   
	@SuppressWarnings("deprecation")
	@Test
	public void TestAddClass(){
		Add a = new Add();
		int actualResult = a.addNumbers(5, 7);
		int expectedResult=12;
		Assert.assertEquals(expectedResult, actualResult);
	}
}

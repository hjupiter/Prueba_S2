/*JAVA CALSERVICE*/
package ec.edu.espol;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Assert;


public class CalServiceTest {
	public CalService calservice;
	
	@Before
	public void setup () 
	{
		ICalculator cal = Mockito.mock(ICalculator.class);
		Mockito.when(cal.add(3, 3)).thenReturn(6);
		calservice = new CalService();
		calservice.setCal(cal);
	}
	
	@Test
	public void testAddTwoNumbers()
	{
		Assert.assertEquals(6, calservice.addTwoNumbers(3, 3));
	}
	
}


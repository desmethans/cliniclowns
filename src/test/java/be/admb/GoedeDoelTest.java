package be.admb;



import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class GoedeDoelTest {
	private GoedeDoel goedeDoel;
	
	
	@Before
	public void before() {
		goedeDoel = new GoedeDoel("red cuba");
	}
	
	@Test
	public void getNaam() {
		Assert.assertEquals("red cuba", goedeDoel.getNaam());
	}
	@Test
	public void storten() {
		goedeDoel.storten(BigDecimal.TEN);
		Assert.assertEquals(0, goedeDoel.getIngezameld().compareTo(BigDecimal.TEN));
	}
	

}

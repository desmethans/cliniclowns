package be.admb;



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
	

}

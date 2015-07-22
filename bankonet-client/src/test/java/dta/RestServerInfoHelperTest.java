/**
 * 
 */
package dta;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author ETY
 *
 */
public class RestServerInfoHelperTest {
	RestServerInfoHelper infohelp;
	
	@Before
	public void testBefore(){
		infohelp = new RestServerInfoHelper();
	}
	
	@Test
	public void testProtocol(){
		
		Assert.assertEquals("http", infohelp.getRestServerInfo().getProtocol());
		
	}
	
	
	@Test
	public void testHost(){

		Assert.assertEquals("localhost", infohelp.getRestServerInfo().getHost());
	}
	
	@Test
	public void testPort(){

		Assert.assertEquals("8080", infohelp.getRestServerInfo().getPort());
	}
}

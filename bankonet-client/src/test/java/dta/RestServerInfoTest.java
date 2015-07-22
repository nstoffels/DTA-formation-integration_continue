/**
 * 
 */
package dta;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author ETY
 *
 */
public class RestServerInfoTest {

		@Test
		public void testMaPremiereMethode(){
			//fail("encore plus raté");
			RestServerInfoHelper restserverinfohelper = new RestServerInfoHelper();
			String urlactuelle = restserverinfohelper.getRestServerInfo().getBaseUrl();
			
			
		}
		
		
		@Test
		public void testMaSecondeMethode(){
			//fail("oops");
//			RestServerInfoHelper restserverinfohelper = new RestServerInfoHelper();
//			String urlactuelle = restserverinfohelper.getRestServerInfo().getBaseUrl();
//			RestServerInfo restserverinfo = new RestServerInfo();
//			String urlactuelle1 = restserverinfo.getBaseUrl();
		}
		
		@Test
		public void testMaTroisèmeMethode(){
			//fail("oops cube");
			
		}
	
		
}

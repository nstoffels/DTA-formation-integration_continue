/**
 * 
 */
package dta;

import java.util.ResourceBundle;

/**
 * @author ETY
 *
 */
public class RestServerInfoHelper {
	/*
	 * 
	 * 
	 * Méthodes 
	 * 
	 * 
	 * 
	 * 
	 */
	public RestServerInfo getRestServerInfo(){
		
		ResourceBundle serverProps = ResourceBundle.getBundle("server");
		String protocol = serverProps.getString("protocol");
		String host = serverProps.getString("host");
		String port = serverProps.getString("port");
		
		RestServerInfo restserverinfo = new RestServerInfo();
		
		restserverinfo.setHost(host);
		restserverinfo.setPort(port);
		restserverinfo.setProtocol(protocol);
		
		return restserverinfo;
	}
	
}

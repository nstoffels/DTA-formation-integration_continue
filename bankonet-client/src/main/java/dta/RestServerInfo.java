/**
 * 
 */
package dta;

import java.util.ResourceBundle;

/**
 * @author ETY
 *
 */
public class RestServerInfo {

	private String port;
	
	private String host;
	
	private String protocol;
	/*
	 * 
	 * M�thode
	 * 
	 */
	
	public String getBaseUrl(){
		
		String url = (protocol+"://").concat(host+":").concat(port+"/appServer");
		return url;
	}
	
	/*
	 * 
	 * G�n�ration des Getter et Setter
	 * 
	 * 
	 */

	/**
	 * @return the port
	 */
	String getPort() {
		return port;
	}

	/**
	 * @param port the port to set
	 */
	void setPort(String port) {
		this.port = port;
	}

	/**
	 * @return the host
	 */
	String getHost() {
		return host;
	}

	/**
	 * @param host the host to set
	 */
	void setHost(String host) {
		this.host = host;
	}

	/**
	 * @return the protocol
	 */
	String getProtocol() {
		return protocol;
	}

	/**
	 * @param protocol the protocol to set
	 */
	void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	
	
	
}

/**
 * 
 */
package dta.ihm;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * @author ETY
 *
 */
public class ListerEmployesAction implements Action {

	/* (non-Javadoc)
	 * @see dta.ihm.Action#getId()
	 */
	public Integer getId() {
		// TODO Auto-generated method stub
		return 1;
	}

	/* (non-Javadoc)
	 * @see dta.ihm.Action#getMenu()
	 */
	public String getMenu() {
		// TODO Auto-generated method stub
		return "Lister les employés";
	}

	/* (non-Javadoc)
	 * @see dta.ihm.Action#execute()
	 */
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Liste des employés");

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/BankoMetier");
		Response res = target.path("/employes").request().get(); 
		if(res.getStatus() == 200){ 
			JSONArray jsonRes = new JSONArray(res.readEntity(String.class)); 
			for(int i=0; i<jsonRes.length(); i++){ 
				JSONObject obj = new JSONObject(jsonRes.get(i).toString()); 
				System.out.println("ID : " + obj.get("id") + ", NOM : " + obj.get("nom")); 
			} 
		} else { 
			System.out.println("Aucun employé trouvé"); 
		} 
		System.out.println(""); 

	}

}

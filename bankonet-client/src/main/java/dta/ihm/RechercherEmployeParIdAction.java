/**
 * 
 */
package dta.ihm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.json.JSONArray;
import org.json.JSONObject;

import dta.RestServerInfo;
import dta.RestServerInfoHelper;
import dta.model.Employe;

/**
 * @author ETY
 *
 */
public class RechercherEmployeParIdAction implements Action {

	/* (non-Javadoc)
	 * @see dta.ihm.Action#getId()
	 */
	public Integer getId() {
		// TODO Auto-generated method stub
		return 2;
	}

	/* (non-Javadoc)
	 * @see dta.ihm.Action#getMenu()
	 */
	public String getMenu() {
		// TODO Auto-generated method stub
		return "Rechercher un employer par Id";
	}

	/* (non-Javadoc)
	 * @see dta.ihm.Action#execute()
	 */
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("rechercher l'employé par identifiant");
		
		Scanner sc = new Scanner(System.in);

		Client client = ClientBuilder.newClient();
		List<Employe> liste = new ArrayList<Employe>();
		WebTarget target = client.target(new RestServerInfoHelper().getRestServerInfo().getBaseUrl());
		Invocation.Builder builder = target.path("api").path("personne").request();	
		
		System.out.println("entrez un Identifiant");
		Integer input = sc.nextInt();
		System.out.println("le client avec l'identifiant "+input+" est :");
		System.out.println(builder.get(Employe.class));
		
		Response res = target.path("/employes").request().get(); 
		if((res.getStatus() == 200)){ 
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

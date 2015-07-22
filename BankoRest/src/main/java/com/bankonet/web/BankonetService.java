/**
 * 
 */
package com.bankonet.web;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.bankonet.model.Client;

/**
 * @author ETY
 *
 */

@Stateless
public class BankonetService {


	@PersistenceContext(unitName="bankorest") private EntityManager em;
	
	
	
	/**
     * 
     * @return client
     */
    public List<Client> getNomClient(){
    	
    	
    	
    	String texteQuery = "Select c from Client as c";//le deux point signale une valeur
		TypedQuery<Client> query = em.createQuery(texteQuery, Client.class);
		List<Client> listClient = query.getResultList();
		
		
		
    	return listClient;
    }
    
    /**
     * 
     * @param nom
     */
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void createClient(String nom){

    	Client nouveau = new Client(nom);
    	em.persist(nouveau);	
    }
    
    /**
     * 
     * @param id
     * @param nom
     */
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void modifierClient(int id, String nom){
    	String texteQuery1 = "Select c.nom from Client as c";//le deux point signale une valeur
		Query query1 = em.createQuery(texteQuery1);
		List<String> listClient1 = (List<String>)query1.getResultList();
		
		//for()
    }
}

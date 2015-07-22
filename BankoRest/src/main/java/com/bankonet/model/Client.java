/**
 * 
 */
package com.bankonet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author ETY
 *
 */
@Entity
public class Client {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ID;
	
	private String nom;
	
	
	
	/**
	 * constructeur vide
	 */
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * 
	 * 
	 * génération des constructeurs
	 * 
	 */
	/**
	 * @param iD
	 */
	public Client(int iD) {
		super();
		ID = iD;
	}
	/**
	 * @param nom
	 */
	public Client(String nom) {
		super();
		this.nom = nom;
	}
	
	
	/*
	 * génération des getter et setter
	 * 
	 * 
	 */
	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	

	  
	
}

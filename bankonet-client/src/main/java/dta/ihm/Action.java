/**
 * 
 */
package dta.ihm;

/**
 * @author ETY
 *
 */
public interface Action {
	
	Integer getId();//identifiant d'un menu
	
	String getMenu();//texte d'un menu
	
	void execute();//méthode à invoquer dans l'action choisie
}

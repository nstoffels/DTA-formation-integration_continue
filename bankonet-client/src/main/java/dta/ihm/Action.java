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
	
	void execute();//m�thode � invoquer dans l'action choisie
}

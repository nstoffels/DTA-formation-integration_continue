/**
 * 
 */
package dta.ihm;

/**
 * @author ETY
 *
 */
public class ArreterProgrammeAction implements Action{
	
//	private Integer identifiant = 0;
//	private String menu = "Arrêter le programme";
	
	/* (non-Javadoc)
	 * @see dta.ihm.Action#getId()
	 */
	public Integer getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see dta.ihm.Action#getMenu()
	 */
	public String getMenu() {
		// TODO Auto-generated method stub
		return "Arrêter le programme";
		//return this.menu;
	}

	/* (non-Javadoc)
	 * @see dta.ihm.Action#execute()
	 */
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("extinction");
		System.exit(0);
	}

	
}

/**
 * 
 */
package dta;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import org.reflections.Reflections;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;

import dta.ihm.Action;
import dta.ihm.ArreterProgrammeAction;

/**
 * @author ETY
 *
 */
public class BankonetClientApp {

	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestServerInfoHelper restserverinfohelper = new RestServerInfoHelper(); // instanciation de la classe RestServerInfoHelper()
		String urlactuelle = restserverinfohelper.getRestServerInfo().getBaseUrl();//restserverinfohelper appel la classe getRestServerInfo() qui appel la méthode getBaseUrl() 
		RestServerInfo server = restserverinfohelper.getRestServerInfo();
		
		System.out.println(""+urlactuelle);
		
		Reflections reflections = new Reflections("dta");  
		Set<Class<? extends Action>> listedesclasses = reflections.getSubTypesOf(Action.class); 
	  
		  
		  
		 Scanner sc = new Scanner(System.in); 
//		 Integer choix = sc.nextInt();
		 List<Action> liste = new ArrayList<Action>(); 
//		 sc.close();
		 
		 for (Class<? extends Action> type : listedesclasses){ 
		
			try { 
				Action action = type.newInstance(); 
				liste.add(action); 
			} catch (InstantiationException e) { 
				// TODO Auto-generated catch block 
				e.printStackTrace(); 
			} catch (IllegalAccessException e) { 
				// TODO Auto-generated catch block 
				e.printStackTrace(); 
			} 
			 
		 } 
		 //création d'un comparateur pour trier par Id ma liste
		 Comparator<Action> comparator = new Comparator<Action>() { 
			 	public int compare(Action o1, Action o2) { 
			 		return o1.getId().compareTo(o2.getId()); 
			 	} 
		 };
		Collections.sort(liste, comparator); 
		 
//		for (Action instance : liste) 
//		{ 
//			System.out.println(instance.getId().toString() +" "+ instance.getMenu()); 
//		} 
		 
		 
		 
		 
//		for (Action instance : liste ) 
//		{ 
//			if (choix == instance.getId()) 
//			{ 
//				instance.execute(); 
//			} 
//		} 
//		sc.close();
		
		while(true){
			
			System.out.println("***Bankonet!client***");
			System.out.println("");
			for (Action instance : liste){ 
			
 			System.out.println(instance.getId().toString() +" "+ instance.getMenu()); 
			}

			System.out.println("choisir une option");
			Integer input = sc.nextInt();
			System.out.println("");
			liste.get(Integer.valueOf(input)).execute();
		}
	}

}

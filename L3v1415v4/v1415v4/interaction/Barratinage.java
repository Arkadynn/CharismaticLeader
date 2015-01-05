/**
 * 
 */
package interaction;

import interfaceGraphique.VueElement;

import java.rmi.RemoteException;
import java.util.Hashtable;

import serveur.IArene;

/**
 * @author Quentin
 *
 */
public class Barratinage extends Actions {

	/**
	 * @param ve
	 * @param voisins
	 */
	public Barratinage(VueElement ve, Hashtable<Integer, VueElement> voisins) {
		super(ve, voisins);
	}
	
	
}

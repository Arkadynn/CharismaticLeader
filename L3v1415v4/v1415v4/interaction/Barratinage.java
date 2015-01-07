/**
 * 
 */
package interaction;

import java.rmi.RemoteException;

import serveur.IArene;
import controle.IConsole;
import element.Personnage;


/**
 * @author Quentin
 *
 */
public class Barratinage implements IDuel {
	
	/**
	 * Arene (pour retrouver la reference du leader.
	 */
	private IArene arene;

	/**
	 * Reference de l'attaquant.
	 */
	private IConsole attaquant; 
	/**
	 * Reference du defenseur.
	 */
	private IConsole defenseur;
	
	public Barratinage(IArene arene, IConsole attaquant, IConsole defenseur) {
		super();
		this.arene = arene;
		this.attaquant = attaquant;
		this.defenseur = defenseur;
	}

	@Override
	public boolean memeLeader(IConsole per1, IConsole per2)
			throws RemoteException {
		return ((Personnage) per1.getElement()).getLeader() != -1 
				&& ((Personnage) per1.getElement()).getLeader() == ((Personnage) per2.getElement()).getLeader();
	}

	@Override
	public boolean isLeader(IConsole per1, IConsole per2)
			throws RemoteException {
		return ((Personnage) per2.getElement()).getLeader() == per1.getRefRMI();
	}

	@Override
	public void realiserCombat() throws RemoteException {
		Personnage pAtt = (Personnage) attaquant.getElement();
		Personnage pDef = (Personnage) defenseur.getElement();
	
		int attCharisme = pAtt.getCharisme();
		int defCharisme = pDef.getCharisme();
	
		System.out.print("Duel entre " + attaquant.getRefRMI() + " et " + defenseur.getRefRMI() + " : ");
	
		try {
			if(memeLeader(attaquant, defenseur) || isLeader(attaquant, defenseur)) {
				// s'ils ont le meme leader ou que le defenseur est dans l'equipe de l'attaquant, rien ne se passe
				System.out.println("On est dans le même équipe");
				
			} else if (isLeader(defenseur, attaquant)) {
				if(attCharisme > defCharisme) {
					// coup d'etat
					System.out.println(attaquant.getRefRMI() + " barratine " + defenseur.getRefRMI());
				} else {
					// coup d'etat echoue
					// TODO Fuire
				}
			}
		} catch (RemoteException e) {
			System.out.println("Erreur lors d'un duel :");
			e.printStackTrace();
		}
	}

}

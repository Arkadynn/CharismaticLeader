package element.personnage;

import java.rmi.RemoteException;

import element.Element;
import element.IPersonnage;

public class Alien extends Element implements IPersonnage {

	public Alien(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setLeader(int ref) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void clearLeader() throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void ajouterEquipe(int ref) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void enleverEquipe(int ref) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void enleverTouteEquipe() throws RemoteException {
		// TODO Auto-generated method stub

	}

}

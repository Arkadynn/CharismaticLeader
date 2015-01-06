package element.personnage;

import element.Personnage;

public class Ghost extends Personnage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Ghost(String nom) {
		super(nom, 1000, 1000);
		this.setVie(-1);
	}

}

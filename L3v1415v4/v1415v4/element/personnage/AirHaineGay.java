package element.personnage;

import java.util.Random;

import element.Personnage;


public class AirHaineGay extends Personnage {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int rand = new Random().nextInt(300);
	 
	public AirHaineGay(String nom, int force, int charisme) {
		super(nom, rand, 300 - rand);
	}

}

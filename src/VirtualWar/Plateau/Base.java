package VirtualWar.Plateau;
import VirtualWar.Unites.Robot;

public class Base extends Cellule {
	
	
	
	/**
	 *utilise le constructeur herite de cellule pour initialiser les coordonn�es de la base et definir l'equipe � laquelle elle appartient.
	 * @param x abscisse de la case contenant la base.
	 * @param y ordonn�e de la contenant la base.
	 * @param equipe entier qui caracterise l'equipe.
	 */
	 
	public Base(int x, int y, int equipe){
		super(x,y);
		super.base = equipe;
	}

	@Override
	public void videCase() {
		// TODO Auto-generated method stub
		
	}

	@Override
	/**
	 * ajoute une equipe � une base existante.
	 */
	public void ajoute(int equipe) {
		super.base = equipe;
	}

	@Override
	public void deplaceSur(Robot robot) {
		// TODO Auto-generated method stub
		
	}

}

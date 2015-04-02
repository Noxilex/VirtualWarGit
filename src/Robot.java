
abstract public class Robot {
	private int equipe;
	private int portee;
	private int depMax;
	private int coutDep;
	private int energie;
	private int energieInitiale;
	private int regenBase;
	private int coutTir;
	private int degats;
	private Vue vue;
	
	public Robot(Vue vue, int X, int Y, int equipe){
		this.vue = vue;
		this.equipe = equipe;
	}
	
	/**
	 * Toutes les cases sont à 0, sauf les bases
	 * @return
	 */
	public boolean estSurBase(){
		return cellule.estBase() != 0;
	}
	
	/**
	 * 
	 * @param X
	 * @param Y
	 */
	public void setCoordonnees(int X, int Y){
		cellule = new Cellule(X,Y);
	}
	/**
	 * 
	 * @return
	 */
	public Coordonnees getCoordonnees(){
		return cellule.getCoordonnees();
	}
	/**
	 * Renvoie true si le robot peut tirer: a assez d'énergie
	 * @return
	 */
	abstract public boolean peutTirer();
}	

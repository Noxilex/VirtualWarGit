
abstract public class Cellule {
	protected int mine;
	protected int base;
	public String image;
	private Coordonnees coord;
	private Robot robot;
	
	public Cellule(int X, int Y){
		coord = new Coordonnees(X,Y);
	}
	/**
	 * Renvoie 0 si il n'y a pas de mine, 
	 * 1 pour une mine de l'équipe 1,
	 * 2 pour une mine de l'équipe 2
	 * @return
	 */
	public int contientMine(){
		return mine;
	}
	
	/**
	 * Renvoie 0 si la case n'est pas une base,
	 * 1 si c'est la base de l'équipe 1
	 * 2 si c'est la base de l'équipe 2
	 * @return
	 */
	public int estBase(){
		return base;
	}

	public Coordonnees getCoordonnees(){
		return coord;
	}
	
	abstract public void videCase();
}

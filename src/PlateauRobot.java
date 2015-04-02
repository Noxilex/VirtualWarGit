import java.util.ArrayList;


public class PlateauRobot{
	Cellule[][] plateau;
	ArrayList<Integer[]> cases;
	int hauteur;
	int largeur;
	
	PlateauRobot(){
	}
	
	PlateauRobot(int hauteur, int largeur){
		plateau = new Cellule[hauteur][largeur];
		this.hauteur = hauteur*2+1;
		this.largeur = largeur*2+1;
	}
	
	public void initialiser(){
		for(Cellule[] c : plateau){
			for(Cellule c1: c){
				c1.videCase();
			}
		}
	}
	
	public void ajouterUneMachine(int x, int y, Robot machine){
		cellule[x][y] = machine;
	}
	
	public String toString(){
		String res = "";
		for(String[] l: plateau){
			for(String c: l){			
					res += c;
			}
			res += "\n";
		}
		return res;
	}
}

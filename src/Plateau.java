import java.util.ArrayList;


public class Plateau{
	String[][] plateau;
	ArrayList<Integer[]> cases;
	int hauteur;
	int largeur;
	
	Plateau(){
	}
	
	Plateau(int hauteur, int largeur){
		plateau = new String[hauteur*2+1][largeur*2+1];
		this.hauteur = hauteur*2+1;
		this.largeur = largeur*2+1;
	}
	
	public void initialiser(){
		for(int l = 0; l < hauteur; l++){
			for(int c = 0; c < largeur; c++){
				if(l%2 == 0 && c%2 == 0 )
					plateau[l][c] = "+";
				else if(l%2 == 0 && c%2 != 0)
					plateau[l][c] = "---";
				else if(c%2 == 0 && l%2 != 0)
					plateau[l][c] = "|";
				else
					plateau[l][c] = "   ";
			}
		}
	}
	
	public void ajouterUneMachine(int x, int y, String machine){
		plateau[x*2+1][y*2+1] = " " + machine + " ";
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

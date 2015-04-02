import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
public class TestPlateau {

	public static void main(String[] args) {

		Plateau p = new Plateau(10,10);
		p.initialiser();
		p.ajouterUneMachine(0, 0, "H");
		p.ajouterUneMachine(0, 1, "E");
		p.ajouterUneMachine(0, 2, "L");
		p.ajouterUneMachine(0, 3, "L");
		p.ajouterUneMachine(0, 4, "O");
		p.ajouterUneMachine(1, 0, "I");
		p.ajouterUneMachine(1, 1, "'");
		p.ajouterUneMachine(1, 2, "M");
		p.ajouterUneMachine(2, 0, "F");
		p.ajouterUneMachine(2, 1, "R");
		p.ajouterUneMachine(2, 2, "I");
		p.ajouterUneMachine(2, 3, "E");
		p.ajouterUneMachine(2, 4, "N");
		p.ajouterUneMachine(2, 5, "D");
		p.ajouterUneMachine(2, 6, "L");
		p.ajouterUneMachine(2, 7, "Y");
		System.out.println(p);

	}

}

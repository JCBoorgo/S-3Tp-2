package modele;



/**
 * Classe abstraite qui gère les formes
 * @author Jean-Christophe Bourgault
 * @version 0.0.0
 */
import exception.FormeException;
import javafx.scene.paint.Color;

abstract public class Forme  {
	public static final int MIN_VAL = 1;
	public static final int MAX_VAL = 2000;
	public static final Color COULEUR_DEFAUT = Color.RED;

	private String nom = null;
	private Color couleur = null;

	/**
	 * Constructeur des formes
	 * 
	 * @param nom
	 * @throws FormeException
	 */
	public Forme(String nom) throws FormeException {
		this.setCouleur(COULEUR_DEFAUT);
		this.nom = nom;
	}

	

	/**
	 * Change la couleur de la forme
	 * 
	 * @param black
	 */
	public void setCouleur( Color black) {
		this.couleur = black;
	}

	/**
	 * Donne le nom de la forme
	 * 
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	
	public Color getCouleur() {
		return couleur;
	}



	/**
	 * Retourne le nom et la couleur de la forme
	 */
	@Override
	public String toString() {
		return (getNom() + " " + getCouleur());
	}
}


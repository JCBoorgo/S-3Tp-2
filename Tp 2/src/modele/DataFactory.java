package modele;

import exception.FormeException;
import javafx.scene.paint.Color;

public class DataFactory {
	private int largeur = 0;
	private int hauteur = 0;
	private int coteC = 0;
	private Color couleur = null;
	private int posX = 0;
	private int posY = 0;
	private FormeEnum type = null;

	public DataFactory(int largeur, int hauteur, Color couleur, int posX, int posY, FormeEnum type) {
		new DataFactory(largeur, hauteur, 0, couleur, posX, posY, type);
	}

	public DataFactory(int largeur, int hauteur, int coteC, Color couleur, int posX, int posY, FormeEnum type) {
		setLargeur(largeur);
		setHauteur(hauteur);
		setCoteC(coteC);
		setCouleur(couleur);
		setPosX(posX);
		setPosY(posY);
		setType(type);
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public int getHauteur() {
		return hauteur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

	public int getCoteC() {
		return coteC;
	}

	public void setCoteC(int coteC) {
		this.coteC = coteC;
	}

	public Color getCouleur() {
		return couleur;
	}

	public void setCouleur(Color couleur) {
		this.couleur = couleur;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public FormeEnum getType() {
		return type;
	}

	public void setType(FormeEnum type) {
		this.type = type;
	}

	public Forme envoyerForme(FormeEnum type) throws FormeException {
		Forme retour = null;
		switch (type) {
		case LIGNE:
			retour = new Ligne(getLargeur(), getHauteur());
			break;
		case OVALE:
			retour = new Ovale(getLargeur(), getHauteur());
			break;
		case RECTANGLE:
			retour = new Rectangle(getLargeur(), getHauteur());
			break;
		case TRIANGLE:
			retour = new Triangle(getLargeur(), getHauteur(), getCoteC());
			break;
		default:
			break;
		}
		return retour;
	}

}

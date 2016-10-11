package vue;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
public class VueDialogue {

	Alert alert;
	private Scene scene;

	public VueDialogue() {

	}

	/**
	 * Crée la fenêtre d'alerte, selon la String passée en paramètre
	 * @param ex - Dicte l'explication à afficher
	 */
	public void creationfenetre(String ex) {
		if (ex.equals("Dessin")) {

			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Erreur de forme");
			alert.setHeaderText(null);
			alert.setContentText("La forme ne sait pas comment être valide?");

			alert.showAndWait();
		} else if (ex.equals("Erreur de zone de dessin")) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error");
			alert.setHeaderText(null);
			alert.setContentText("La forme ne comprend pas comment rester dans les bordures?");
			alert.showAndWait();
		}

	}

	public Scene getScene() {
		return scene;
	}

}

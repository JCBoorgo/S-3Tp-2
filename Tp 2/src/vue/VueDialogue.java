package vue;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
public class VueDialogue {

	Alert alert;
	private Scene scene;

	public VueDialogue() {

	}

	public void creationfenetre(String ex) {
		if (ex.equals("Dessin")) {

			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error");
			alert.setHeaderText(null);
			alert.setContentText("La forme ne sait pas comment être valide?");

			alert.showAndWait();
		} else if (ex.equals("Zone")) {
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

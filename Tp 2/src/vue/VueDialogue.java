package vue;

import exception.FormeException;
import exception.ZoneDessinException;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class VueDialogue {
	private VBox vbox;
	private Label label;
	private Button butt;
	private Scene scene;
	
	public VueDialogue(){
		butt = new Button("Je note.");
	}

	public void creationfenetre(String ex) {
		if (ex.equals("Dessin")){
			label = new Label("La forme ne sait pas comment être valide?");
		} else if (ex.equals("Zone")) {
			label = new Label("La forme ne comprend pas comment rester dans les bordures?");
		}
		vbox = new VBox(label,butt);
		
		scene = new Scene(vbox, 350, 100);

	}

	public Scene getScene() {
		return scene;
	}
	
	public Button getBouton() {
		return butt;
	}

}

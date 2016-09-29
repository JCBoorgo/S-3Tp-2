package vue;

import exception.FormeException;
import exception.ZoneDessinException;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class VueDialogue {
	private VBox vbox;
	private Label label;
	private Button butt;
	private Scene scene;

	public void creationfenetre(Exception ex) {
		if (ex.equals(new FormeException())) {
			label = new Label("La forme ne sait pas comment exister?");
		} else if (ex.equals(new ZoneDessinException())) {
			label = new Label("La forme ne comprend pas le principe de bordure?");
		}
		butt = new Button("Je note.");
		
		vbox = new VBox(label,butt);
		
		scene = new Scene(vbox, 800, 600);

	}

	public Scene getScene() {
		return scene;
	}

}

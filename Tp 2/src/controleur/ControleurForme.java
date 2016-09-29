package controleur;


import javafx.application.Application;
import javafx.stage.Stage;
import modele.FormesFactory;
import vue.VueDialogue;
import vue.VueForme;

public class ControleurForme extends Application{

	private FormesFactory formes;
	private VueForme vueFormes;
	private VueDialogue vueDialogue;
	private Stage stage;

	public static void main(String[] args) {

		Application.launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		vueFormes = new VueForme();
		
	}
	

}

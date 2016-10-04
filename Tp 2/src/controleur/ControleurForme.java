package controleur;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import modele.FormesFactory;
import vue.VueDialogue;
import vue.VueForme;

public class ControleurForme extends Application {

	private FormesFactory formes;
	private VueForme vueFormes;
	private VueDialogue vueDialogue;

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		vueFormes = new VueForme();
		stage.setTitle("Logiciel de dessin");
		ajouterEcouteurs();
		stage.setScene(vueFormes.getScene());
		stage.show();
	}

	private void ajouterEcouteurs() {
		vueFormes.getBoutonGenerer().setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				genererForme();
			}
		});
		vueFormes.getBoutonReset().setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				resetAffichage();
			}
		});
		vueFormes.getBoutonShutdown().setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				shutdown();
			}
		});
		vueFormes.getCheckbox().setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				mettreEffet();
			}
		});
	}

	private void genererForme() {
		// TODO
		// Caller la méthode qui nous fait une forme

		//j'ai créer une forme avec les éléments présent dans les textfields de largeur et hauteur
		FormesFactory forme = new FormesFactory(Integer.parseInt(vueFormes.getTextFdata().getText()),
				Integer.parseInt(vueFormes.getTextF1data().getText()));

		// TEST -----V
		vueFormes.getBoutonGenerer().setText("LEL EVENT WORK");
		// GG WP
	}

	private void resetAffichage() {
		// TODO
		// Caller la méthode qui wipe les formes

		// TEST -----V
		vueFormes.getBoutonReset().setText("LEL EVENT WORK TOO");
		// GG WP AGAIN
	}

	private void shutdown() {
		// TODO - FAIT CR
		Stage stage = (Stage) vueFormes.getScene().getWindow();
		stage.close();
		// TEST -----V
		vueFormes.getBoutonShutdown().setText("Boutton foncitonne");
		// GG WP FINAL
	}

	private void mettreEffet() {
		// TODO
		// Caller la méthode qui va faire on/off sur l'effet
		if(vueFormes.getCheckbox().isSelected()) {
			.getStyleClass().add("effeton");
			//jai créer le css pour les effects faut juste trouver une façon de trouver les formes et de leur appliquer
		} else {
			// Case pas cochée, effet off
			.getStyleClass().add("effetoff");
		}
		// Ok wait le if va aller dans la vue... il est ici en attendant
	}
}

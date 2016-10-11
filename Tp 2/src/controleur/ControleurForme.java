package controleur;

import exception.FormeException;
import exception.ZoneDessinException;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import modele.DataFactory;
import modele.Forme;
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
		vueDialogue = new VueDialogue();
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
		vueFormes.getSlider().valueProperty().addListener(new ChangeListener<Number>() {
			public void changed(ObservableValue<? extends Number> obs, Number old, Number nv) {
				vueFormes.sliderUpdate();
			}
		});

	}

	private void genererForme() {
		// TODO
		// Caller la méthode qui nous fait une forme
		// Créer un data avec infos, formesfact avec data, data fait forme, tout
		// remonte
		DataFactory data = null;
		if (vueFormes.getListView().getSelectionModel().getSelectedItem().equals("Triangle")) {
			data = new DataFactory(Integer.parseInt(vueFormes.getTextFdata().getText()),
					Integer.parseInt(vueFormes.getTextF1data().getText()),
					Integer.parseInt(vueFormes.getTextF2data().getText()), vueFormes.getColorPicker().getValue(),
					Integer.parseInt(vueFormes.getTextF3data().getText()),
					Integer.parseInt(vueFormes.getTextF4data().getText()),
					vueFormes.getListView().getSelectionModel().getSelectedItem());
		} else {
			data = new DataFactory(Integer.parseInt(vueFormes.getTextFdata().getText()),
					Integer.parseInt(vueFormes.getTextF1data().getText()), vueFormes.getColorPicker().getValue(),
					Integer.parseInt(vueFormes.getTextF3data().getText()),
					Integer.parseInt(vueFormes.getTextF4data().getText()),
					vueFormes.getListView().getSelectionModel().getSelectedItem());
		}
		FormesFactory formesF = new FormesFactory(600, 600);
		try {
			Forme formedessin = formesF.getInstance(data);
			vueFormes.ajouterForme(data);
		} catch (FormeException e) {
			
			vueDialogue.creationfenetre("Dessin");

		} catch (ZoneDessinException e) {
			
			vueDialogue.creationfenetre("Zone");

		}
	}

	private void resetAffichage() {
		// TODO - fait
		// Caller la méthode qui wipe les formes
		vueFormes.viderAffichage();
	}

	private void shutdown() {
		// TODO - FAIT CR
		Stage stage = (Stage) vueFormes.getScene().getWindow();
		stage.close();
	}

	private void mettreEffet() {
		// TODO
		vueFormes.changerEffet();
	}

}

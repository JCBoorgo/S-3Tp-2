package vue;



import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import modele.DataFactory;
public class VueForme {

	private Scene scene;
	private BorderPane borderp;
	private Canvas canevas = new Canvas(600, 600);
	private GraphicsContext gc = canevas.getGraphicsContext2D();
	private VBox vbox;
	private VBox vbox1;
	private VBox vbox2;
	private VBox vbox3;
	private VBox vbox4;
	private VBox vbox5;
	private VBox vbox6;
	private VBox vbox7;
	private VBox vbox8;
	private VBox vbox9;
	private HBox hbox;
	private HBox hbox1;
	private HBox hbox2;
	private Label label;
	private Label label1;
	private Label label2;
	private Label label3;
	private Label label4;
	private Label label5;
	private Label label6;
	private Label label7;
	private Label label8;
	private TextField textf;
	private TextField textf1;
	private TextField textf2;
	private TextField textf3;
	private TextField textf4;
	private ListView<String> listv;
	private ColorPicker choiceb;
	private CheckBox checkb;
	private Slider slider;
	private Button butt1;
	private Button butt2;
	private Button butt3;
	private Circle circle;
	private Rectangle rectangle;
	private StackPane stackp;

	/**
	 * Constructeur appeler par le contrôleur
	 */
	public VueForme() {
		construireInterface();
	}

	/**
	 * Fonction appelée par le constructeur qui crée l'interface
	 */

	private void construireInterface() {
		borderp = new BorderPane();

		// Button du bas
		butt1 = new Button("Générer");
		butt1.getStyleClass().add("butt_bas");
		butt2 = new Button("Réinitialiser");
		butt2.getStyleClass().add("butt_bas");
		butt3 = new Button("Quitter");
		butt3.getStyleClass().add("butt_bas");
		hbox = new HBox();
		// ajout button bas
		hbox.getChildren().addAll(butt1, butt2, butt3);
		hbox.getStyleClass().add("hbox_bas");
		hbox.setPadding(new Insets(10));
		borderp.setBottom(hbox);

		// E3 les trois textfield des cotés
		label = new Label("Coté A");
		label.getStyleClass().add("label_blue");
		label1 = new Label("Coté B");
		label1.getStyleClass().add("label_blue");
		label2 = new Label("Coté C");
		label2.getStyleClass().add("label_blue");
		textf = new TextField();
		textf.setPrefWidth(0);
		textf1 = new TextField();
		textf1.setPrefWidth(0);
		textf2 = new TextField();
		textf2.setPrefWidth(0);
		// ajout dans boite
		vbox = new VBox(label, textf);
		vbox1 = new VBox(label1, textf1);
		vbox2 = new VBox(label2, textf2);
		// vboxz dans hbox
		hbox1 = new HBox(vbox, vbox1, vbox2);
		hbox1.setSpacing(10);

		// E3 textfield position
		label3 = new Label("Position X");
		label3.getStyleClass().add("label_blue");
		label4 = new Label("Position Y");
		label4.getStyleClass().add("label_blue");
		textf3 = new TextField();
		textf3.setPrefWidth(0);
		textf4 = new TextField();
		textf4.setPrefWidth(0);
		// ajout
		vbox3 = new VBox(label3, textf3);
		vbox4 = new VBox(label4, textf4);
		hbox2 = new HBox(vbox3, vbox4);
		hbox2.setSpacing(30);

		// E2 les vbox et leur contenu
		label5 = new Label("Formes");
		label5.getStyleClass().add("label_blue");
		listv = new ListView<String>();
		ObservableList<String> items = FXCollections.observableArrayList("Ovale", "Rectangle", "Triangle", "Ligne");
		listv.setItems(items);
		listv.setPrefHeight(140);
		vbox5 = new VBox(label5, listv);

		label6 = new Label("Couleur");
		label6.getStyleClass().add("label_blue");
		choiceb = new ColorPicker();
		vbox6 = new VBox(label6, choiceb);

		label7 = new Label("Effet");
		label7.getStyleClass().add("label_blue");
		checkb = new CheckBox();
		vbox7 = new VBox(label7, checkb);

		label8 = new Label("Opacité");
		label8.getStyleClass().add("label_blue");
		slider = new Slider(0, 1, 1);
		vbox8 = new VBox(label8, slider);

		// ajout dans la VBox Majeur situé sur la droite du BorderPane
		vbox9 = new VBox(vbox5, vbox6, vbox7, hbox2, hbox1, vbox8);
		vbox9.setSpacing(15);
		vbox9.setPadding(new Insets(20));
		borderp.setRight(vbox9);

		// Canevas
		stackp = new StackPane();
		stackp.getChildren().add(canevas);
		borderp.setCenter(stackp);
		stackp.getStyleClass().add("rect");
		borderp.setPadding(new Insets(20));

		scene = new Scene(borderp);
		scene.getStylesheets().add("/styles/style_forme.css");

	}

	public Scene getScene() {
		return scene;
	}

	public Button getBoutonGenerer() {
		return butt1;
	}

	public Button getBoutonReset() {
		return butt2;
	}

	public Button getBoutonShutdown() {
		return butt3;
	}

	public CheckBox getCheckbox() {
		return checkb;
	}

	public TextField getTextFdata() {
		return textf;
	}

	public TextField getTextF1data() {
		return textf1;
	}

	public TextField getTextF2data() {
		return textf2;
	}

	public TextField getTextF3data() {
		return textf3;
	}

	public TextField getTextF4data() {
		return textf4;
	}

	public ListView<String> getListView() {
		return listv;
	}

	public ColorPicker getColorPicker() {
		return choiceb;
	}

	public Slider getSlider() {
		return slider;
	}

	public void viderAffichage() {
		gc.clearRect(0, 0, 600, 600);
	}

	/**
	 * Méthode qui affiche la forme passée en paramètre
	 * @param data - la forme à créer
	 */
	public void ajouterForme(DataFactory data) {
		String forme = data.getType();
		switch (forme) {
		case "Ligne":
			gc.setStroke(data.getCouleur());
			gc.strokeLine(data.getPosX(), data.getPosY(), data.getPosX() + data.getLargeur(),
					data.getPosY() + data.getHauteur());
			break;
		case "Ovale":
			gc.setFill(data.getCouleur());
			gc.fillOval(data.getPosX(), data.getPosY(), data.getLargeur(), data.getHauteur());
			break;
		case "Rectangle":
			gc.setFill(data.getCouleur());
			gc.fillRect(data.getPosX(), data.getPosY(), data.getLargeur(), data.getHauteur());
			break;
		case "Triangle":
			gc.setFill(data.getCouleur());
			gc.fillPolygon(data.getPointsTriangleX(), data.getPointsTriangleY(), 3);
			break;
		default:
			break;
		}
	}

	/**
	 * Change l'opacité selon la valeur du slider
	 */
	public void sliderUpdate() {
		canevas.setOpacity(slider.getValue());
	}
	
	/**
	 * Active ou désactive l'effet selon l'état de la checkbox
	 */
	public void changerEffet(){
		if (this.getCheckbox().isSelected()) {
			gc.applyEffect(new DropShadow());
		} else {
			gc.setEffect(null);
		}
	}

}

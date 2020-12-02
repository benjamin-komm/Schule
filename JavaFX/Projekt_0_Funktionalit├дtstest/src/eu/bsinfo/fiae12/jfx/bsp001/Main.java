package eu.bsinfo.fiae12.jfx.bsp001;

import java.net.URL;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		try {
			URL fxml = getClass().getResource("Main.fxml");
			FXMLLoader fxmlLoader = new FXMLLoader(fxml);
			BorderPane root = (BorderPane) fxmlLoader.load();
			Scene scene = new Scene(root, 640, 480);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
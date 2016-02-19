package org.hnf.javafx.scenebuilderembeddedcontrols.basiccontrols;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.GridPane;

public final class CustomEmbeddedControl extends GridPane {

	
	public CustomEmbeddedControl() {

		final FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("custom-embedded-control.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);

		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}
	}

}

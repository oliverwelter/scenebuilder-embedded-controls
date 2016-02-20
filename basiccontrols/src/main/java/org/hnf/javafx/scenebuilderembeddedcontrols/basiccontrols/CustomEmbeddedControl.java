package org.hnf.javafx.scenebuilderembeddedcontrols.basiccontrols;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;

public final class CustomEmbeddedControl extends GridPane {

	@FXML
	private CheckBox checkbox;
	
	@FXML
	private Button button;
	
	public CustomEmbeddedControl() {
		
		final URL url = getClass().getResource("custom-embedded-control.fxml");

		if(url == null) {
			throw new IllegalStateException("dsfsdf");
		}
		
		final FXMLLoader fxmlLoader = new FXMLLoader(url);
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);
		
		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}
	}

}

package org.hnf.javafx.scenebuilderembeddedcontrols.extendedcontrols;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.GridPane;

public class ExtendedCustomControl2 extends GridPane {

	public ExtendedCustomControl2() {

		final URL url = getClass().getResource("extended-custom-control2.fxml");

		if (url == null) {
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

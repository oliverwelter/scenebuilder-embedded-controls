package org.hnf.javafx.scenebuilderembeddedcontrols.basiccontrols;

import org.hnf.javafx.scenebuilderembeddedcontrols.basiccontrols.CustomEmbeddedControl;
import org.junit.Test;
import org.testfx.framework.junit.ApplicationTest;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public final class CustomEmbeddedControlTest extends ApplicationTest {
	
	
	private Pane pane;
	
	private CustomEmbeddedControl testee;
	
	@Override
	public void start(Stage stage) throws Exception {
		pane = new Pane();
		testee = new CustomEmbeddedControl();
		final Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.show();
		
		pane.getChildren().add(testee);
		
	}
	
	@Test
	public void test() throws InterruptedException {
		Thread.sleep(5000);
	}

}

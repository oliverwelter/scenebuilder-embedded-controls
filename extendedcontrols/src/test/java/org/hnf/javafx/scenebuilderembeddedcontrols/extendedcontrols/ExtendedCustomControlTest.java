package org.hnf.javafx.scenebuilderembeddedcontrols.extendedcontrols;

import org.junit.Test;
import org.testfx.framework.junit.ApplicationTest;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public final class ExtendedCustomControlTest extends ApplicationTest {
	
	
	private Pane pane;
	
	private ExtendedCustomControl testee;
	
	@Override
	public void start(Stage stage) throws Exception {
		pane = new Pane();
		testee = new ExtendedCustomControl();
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

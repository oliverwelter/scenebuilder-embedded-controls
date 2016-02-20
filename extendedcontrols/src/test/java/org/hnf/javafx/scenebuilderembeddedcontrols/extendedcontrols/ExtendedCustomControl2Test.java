package org.hnf.javafx.scenebuilderembeddedcontrols.extendedcontrols;

import org.junit.Test;
import org.testfx.framework.junit.ApplicationTest;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public final class ExtendedCustomControl2Test extends ApplicationTest {
	
	
	private Pane pane;
	
	private ExtendedCustomControl2 testee;
	
	@Override
	public void start(Stage stage) throws Exception {
		pane = new Pane();
		testee = new ExtendedCustomControl2();
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

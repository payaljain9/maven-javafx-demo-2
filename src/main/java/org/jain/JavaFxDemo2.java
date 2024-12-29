package org.jain;
import java.awt.Font;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFxDemo2 extends Application{
	public static void main(String args[])
	{
		Application.launch();
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Stage stage=new Stage();
		
		stage.setTitle("First Window");
		
		Group actorgroup=new Group();
		
		Text actorText=new Text();
		actorText.setText("Hello World!");
		actorText.setFill(Color.BLACK);
		actorText.setX(50);
		actorText.setY(50);
		
		Line actorLine=new Line();
		actorLine.setStroke(Color.BLACK);
		actorLine.setStartX(60);
		actorLine.setStartY(60);
		actorLine.setEndX(370);
		actorLine.setEndY(60);
		
		Rectangle actorRect=new Rectangle();
		actorRect.setFill(Color.GREY);
		actorRect.setX(80);
		actorRect.setY(80);
		actorRect.setWidth(250);
		actorRect.setHeight(250);
		
		actorgroup.getChildren().add(actorText);
		actorgroup.getChildren().add(actorLine);
		actorgroup.getChildren().add(actorRect);
		
		Scene scene=new Scene(actorgroup, Color.ALICEBLUE);
		
		stage.setScene(scene);
		stage.show();
	}
}
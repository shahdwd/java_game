package view;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Catching {
	
	
	public static void CatchException(String title, ImageView Message){
		Stage window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL); //take care of this window first
		window.setTitle(title);
		window.setWidth(1500);
		window.setHeight(600);
		
		
//		Message.autosize();
		Button yesButton = new Button ("Got It!");
		
		yesButton.setOnAction(e -> {
			window.close();
		});
		
		
		
		VBox layout= new VBox(10);
		
		HBox kk= new HBox(10);
		kk.getChildren().add(Message);
		kk.setAlignment(Pos.CENTER);
		
		layout.getChildren().addAll(kk,yesButton);
		layout.setAlignment(Pos.CENTER);
		
		Image bg= new Image("A.jpg");
		BackgroundSize bgSize = new BackgroundSize(1.0, 1.0, true, true, false, false);
		BackgroundImage bg1= new BackgroundImage(bg, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
        BackgroundPosition.DEFAULT, bgSize);
		layout.setBackground(new Background(bg1));
		
		Scene scene= new Scene(layout);
		
		
		window.getIcons().add(new Image("gameIcon.png"));
		window.setScene(scene);
		window.showAndWait();
		
		
	}
}


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
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class ConfirmBox {
	
	static boolean answer;
	
	public static boolean display(String title, String message){
		Stage window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL); //take care of this window first
		window.setTitle(title);
		window.setWidth(900);
		window.setHeight(400);
		
		Label label = new Label();
		label.setText(message);
		
		Button yesButton = new Button ("Yes");
		Button noButton = new Button ("No");
		
		yesButton.setOnAction(e -> {
			answer = true;
			window.close();
		});
		
		noButton.setOnAction(e -> {
			answer = false;
			window.close();
		});
	
		Image tw= new Image("quit.png");
		ImageView twa= new ImageView(tw);
		
		VBox layout= new VBox(10);
		layout.getChildren().addAll(twa,yesButton,noButton);
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
		
		return answer;
	}
}

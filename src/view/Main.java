package view;
	

import java.io.File;

import model.characters.*;
import engine.Game;
import model.world.*;
import exceptions.*;
import model.collectibles.*;

import java.io.FileInputStream;
import java.net.URISyntaxException;
import java.util.ArrayList;

import model.characters.Character;
import model.characters.Direction;
import model.characters.Hero;
import model.characters.Zombie;
import model.world.Cell;
import model.world.CharacterCell;
import model.world.CollectibleCell;
import model.world.TrapCell;
import exceptions.InvalidTargetException;
import exceptions.MovementException;
import exceptions.NoAvailableResourcesException;
import exceptions.NotEnoughActionsException;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.TextAlignment;
import javafx.util.Duration;


public class Main extends Application {
	public static Game game;
	public static Stage window;
	public static Hero player;
	public static Hero StartPlayer;
	public static Character Target;
	Scene scene1, scene2, scene3,sceneE,sceneJ,sceneT,sceneR,sceneTO,sceneB,sceneD,sceneH ;
	public static Scene scenePlay;
	Scene Win;
	Scene Lose;
	public static ArrayList<Hero> availableHeroes1 = new ArrayList<Hero>();
	public static ArrayList<Hero> heroes1 = new ArrayList<Hero>();
	public static ArrayList<Zombie> zombies1 = new ArrayList<Zombie>();
	public static Cell[][] map1 = new Cell[15][15];
	public static HBox grid;
	
	public static void main(String[] args) {
		
		launch(args);
	}


	@Override
	public void start(Stage primaryStage) throws Exception {
		map1 = new Cell[15][15];
		game= new Game();
		availableHeroes1 = new ArrayList<Hero>();
		heroes1 = new ArrayList<Hero>();
		zombies1 = new ArrayList<Zombie>();
		String path = "tlos.wav";
		 Media media = new Media(new File(path).toURI().toString());
		 MediaPlayer mediaPlayer = new MediaPlayer(media);
		 mediaPlayer.setAutoPlay(true);
		
		try{
		Game.loadHeroes("Heroes.csv");
		} catch(Exception e){
			throw new Exception("check load hero location");
		}
		//check loading of heroes (Check)
//		System.out.println(Game.availableHeroes.toString());
		window=primaryStage;
		primaryStage.setTitle("The Last Of Us");
		//StackPane root = new StackPane();
		
		window.setOnCloseRequest(e -> {
			e.consume(); 
			closeProgram();
			});
		
		Image Title= new Image("The last of us title.png");
		ImageView Title1 = new ImageView(Title);
	

		Image StartButton= new Image("ButtonStart.png");
		ImageView StartButton1 = new ImageView(StartButton);
		
		Button Start = new Button();
//		Start.setGraphic(StartButton1);
//		Start.maxHeight(10);
//		Start.maxWidth(10);
		Start.setText("Start");
		Start.setOnAction(e -> { 
			window.setScene(scene3);
			mediaPlayer.setAutoPlay(true);
			window.setFullScreen(true); 
			});
		
		Button HowToPlay = new Button();
		HowToPlay.setText("How to play");
		HowToPlay.setOnAction(e ->{ 
			window.setScene(scene2);
			mediaPlayer.setAutoPlay(true);
			window.setFullScreen(true); 
			});

		
		
		Button Exit = new Button();
		Exit.setText("Exit");
		Exit.setOnAction(e-> closeProgram());
		
		
		
		VBox layout1= new VBox(20);
		layout1.getChildren().addAll(Title1,Start,HowToPlay,Exit);
		
		
		
		layout1.setAlignment(Pos.CENTER);
		scene1 = new Scene(layout1,1000,500);
		mediaPlayer.setAutoPlay(true);
		scene1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	

//		Media media = new Media(new File("/Game/src/Mozart - Lacrimosa.mp3").toURI().toString());  
//		MediaPlayer mediaPlayer = new MediaPlayer(media);  
//		mediaPlayer.setAutoPlay(true); 
		
//		Media media = new Media("soundd.mp3"); 
//		MediaPlayer mediaPlayer = new MediaPlayer(media); 
//		mediaPlayer.play();
//		mediaPlayer.setAutoPlay(true);  
		
//		String musicFile = "soundd.mp3";
//		Media sound = new Media(new File(musicFile).toURI().toString());
//		MediaPlayer mediaPlayer = new MediaPlayer(sound);
//		mediaPlayer.play();
		
		Image bg= new Image("A.jpg");
		BackgroundSize bgSize = new BackgroundSize(1.0, 1.0, true, true, false, false);
		BackgroundImage bg1= new BackgroundImage(bg, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
        BackgroundPosition.DEFAULT, bgSize);
		layout1.setBackground(new Background(bg1));
		
		Button ReturnMenu = new Button();
		ReturnMenu.setText("Back");
		ReturnMenu.setOnAction(e -> { 
			window.setScene(scene1);
			window.setFullScreen(true); 
			});
		Label help1 = new Label("You must collect enough people to be able to survive in the Zombie Apocolypse!!");
		Label help2 = new Label("To Attack a Zombie press A , Note!!!: You can only attack Zombies near you!!");
		Label help3 = new Label("To Cure a Zombie press C , Note!!!: You can only attack Zombies near you!!");
		Label help4 = new Label("To move, press up, down,left or right on your keyboard");
		Label help5 = new Label("BeCarfeul not to lose all your Heros, or else you'll lose");
		Label help6 = new Label("Collect all the vaccines and cure most zombies to Win the game and live safely in a communty against the Zombies");
		Label help7 = new Label("Keep in mind that Curing,Attacking and moving all cause ActionPoints");
		Label help8 = new Label("Each Hero also has a Special Action , so collect them all to see what's in store for you ;)");
		
		VBox layouthelp = new VBox(20);
		layouthelp.setAlignment(Pos.CENTER);
		layouthelp.getChildren().addAll(help1,help2,help3,help4,help5,help6,help7,help8,ReturnMenu);
		
		Label hto = new Label("How To Play");
		hto.getStyleClass().add("button-help");
		StackPane HTP = new StackPane();
		HTP.getChildren().addAll(hto);
		
		BorderPane panel1= new BorderPane();
		panel1.setTop(HTP);
		panel1.setCenter(layouthelp);
		//add setBottom(img gameplay);
		
		scene2 = new Scene(panel1,1000,500);
		scene2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		Image bg2= new Image("R.jpg");
		BackgroundSize bgSize1 = new BackgroundSize(1.0, 1.0, true, true, false, false);
		BackgroundImage bg3= new BackgroundImage(bg2, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
        BackgroundPosition.DEFAULT, bgSize1);
		panel1.setBackground(new Background(bg3));
		
		
		
		
		

		DropShadow drop = new DropShadow();  
        drop.setBlurType(BlurType.GAUSSIAN);  
        drop.setColor(Color.BLACK);  
        drop.setHeight(100);  
        drop.setWidth(150);  
        drop.setOffsetX(10);  
        drop.setOffsetY(10);  
        drop.setSpread(0.2);  
        drop.setRadius(10); 
        
        
        DropShadow undrop = new DropShadow();  
        drop.setOffsetX(0);  
        drop.setOffsetY(0);  
        drop.setSpread(0.2);  
        drop.setRadius(10); 
        
        
        Glow glow10 = new Glow();   
        glow10.setLevel(0.5);  
        
        
        Glow unglow = new Glow();   
        unglow.setLevel(0);  
		
		
		
		
		Image E= new Image("1.png");
		ImageView E1= new ImageView(E);
		E1.setFitWidth(337.5);
		E1.setFitHeight(350);
		E1.setEffect(drop);
//		E.setTranslateY(200);
//		E.setTranslateX(-600);
		
		
		
		Image J= new Image("5.png");
		ImageView J1= new ImageView(J);
		J1.setFitWidth(337.5);
		J1.setFitHeight(350);
		J1.setEffect(drop);
//		J1.setTranslateY(-200);
//		J1.setTranslateX(-600);
		
		Image T= new Image("6.png");
		ImageView T1= new ImageView(T);
		T1.setFitWidth(337.5);
		T1.setFitHeight(350);
		T1.setEffect(drop);
		
		Image R= new Image("7.png");
		ImageView R1= new ImageView(R);
		R1.setFitWidth(337.5);
		R1.setFitHeight(350);
		R1.setEffect(drop);
		
	
		
		
		Image TO= new Image("8.png");
		ImageView TO1= new ImageView(TO);
		TO1.setFitWidth(337.5);
		TO1.setFitHeight(350);
		TO1.setEffect(drop);
		
		Image B= new Image("2.png");
		ImageView B1= new ImageView(B);
		B1.setFitWidth(337.5);
		B1.setFitHeight(350);
		B1.setEffect(drop);
		
		Image D= new Image("4.png");
		ImageView D1= new ImageView(D);
		D1.setFitWidth(337.5);
		D1.setFitHeight(350);
		D1.setEffect(drop);
		
		Image H= new Image("3.png");
		ImageView H1= new ImageView(H);
		H1.setFitWidth(337.5);
		H1.setFitHeight(350);
		H1.setEffect(drop);
		
	
		
	
		
		
		
		
		
	
		
		
	
		
		GridPane mapGrid = new GridPane();
		mapGrid.setHgap(0);
		mapGrid.setVgap(0); 
		mapGrid.setPadding(new Insets(0,0,0,0));
		
//		Game.startGame(StartPlayer);
		
//		for(Cell[] innerArray : Game.map){
//			for(Cell c : innerArray){
//				
//				System.out.println(c);
//			}
//				view.mapp.createMap(mapGrid);
//	}
		
		

				
			
		
	
		
	
		
	
		
		grid = new HBox(50);
		grid.getChildren().add(mapGrid);	
		grid.setPrefSize(window.getMaxWidth(), window.getMaxHeight());
		
		VBox progress = new VBox(20);
		
//		Label ChoosePlayer = new Label("Choose the player");
//		progress.getChildren().add(ChoosePlayer);
		
		
		GridPane VaccineNum= new GridPane();
		
		GridPane SupplyNum = new GridPane();
		
		GridPane ActionPoint= new GridPane();
		
		
		GridPane available = new GridPane();
		available.setHgap(10);
		available.setVgap(10); 
		available.setPadding(new Insets(0,0,0,0));
		
		
		
		VBox controls = new VBox(20);
		Button SpecialAct= new Button("Use The Special Action");
		Button EndTurn = new Button("End Turn");
		SpecialAct.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		EndTurn.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		controls.getChildren().addAll(SpecialAct,EndTurn);
		
		GridPane Health = new GridPane();
		
		Image twaa= new Image("players.png");
		ImageView twaaaa= new ImageView(twaa);
		
		
		progress.getChildren().addAll(twaaaa,available,Health,ActionPoint,VaccineNum,SupplyNum,controls);
		grid.getChildren().add(progress);

		
		
		Scene scenePlay = new Scene(grid,2000,2000);
		
		
		
		
		
		
		
		E1.onMouseMovedProperty().set(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
            	E1.setEffect(glow10);
            
              
            }
        });

					
		
		E1.onMouseExitedProperty().set(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
            	E1.setEffect(unglow);
            	E1.setEffect(drop);
            }
        });
		
		
		Tooltip.install(E1, new Tooltip("ELLIE WILLIAMS"+"\n"
				+"- Special Action : MED"
				+"\n"+ "- MaxHp : 110"
				+"\n"+ "- MaxAction Points : 6"
				+"\n"+"- Attack Dmg : 15 "));
		
		
		J1.onMouseMovedProperty().set(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
            	J1.setEffect(glow10);

              
            }
        });
		
		J1.onMouseExitedProperty().set(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
            	J1.setEffect(unglow);
            	J1.setEffect(drop);
            }
        });
		
		
		Tooltip.install(J1, new Tooltip("JOEL MILLER"+"\n"
				+ "- Special Action : FIGH"
				+"\n"+ "- MaxHp : 140"
				+"\n"+ "- MaxAction Points : 5"
				+"\n"+"- Attack Dmg : 30 "));
		
		
		
		T1.onMouseMovedProperty().set(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
            	T1.setEffect(glow10);
            
              
            }
        });
		
		T1.onMouseExitedProperty().set(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
            	T1.setEffect(unglow);
            	T1.setEffect(drop);
            }
        });
		
		Tooltip.install(T1, new Tooltip("TESS"+"\n"
				+"- Special Action : EXP"
				+"\n"+ "- MaxHp : 80"
				+"\n"+ "- MaxAction Points : 6"
				+"\n"+"- Attack Dmg : 20 "));
		
		
		R1.onMouseMovedProperty().set(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
            	R1.setEffect(glow10);
          
              
            }
        });
		
		R1.onMouseExitedProperty().set(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
            	R1.setEffect(unglow);
            	R1.setEffect(drop);
            }
        });
		
		
		Tooltip.install(R1, new Tooltip("RILEY ABEL"+"\n"
				+"- Special Action : EXP"
				+"\n"+ "- MaxHp : 90"
				+"\n"+ "- MaxAction Points : 5"
				+"\n"+"- Attack Dmg : 25 "));
		
		
		E1.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() { 
			public void handle(MouseEvent event) {
				StartPlayer = (Hero)Game.availableHeroes.get(1);
				window.setScene(scenePlay);
				Image img = new Image("4.png");
				ImageCursor cursor = new ImageCursor(img, 30, 30);
				grid.setCursor(cursor);
	     		window.setFullScreen(true); 
	     		System.out.println(StartPlayer.getName());
				view.mapp.createMap(mapGrid);
				view.VaccineAndSuppliesUpdate.Updatehp(Health);
				view.UpdateChooseplayer.UpdatePlayerOptions(available);
				view.VaccineAndSuppliesUpdate.UpdateVacc(VaccineNum);
				view.VaccineAndSuppliesUpdate.UpdateSupp(SupplyNum);
				view.VaccineAndSuppliesUpdate.UpdateAP(ActionPoint);
				Match.equal2();
				mapGrid.setGridLinesVisible(false);
	     		
//				System.out.println(Game.heroes.get(0).getName());
				
		}
			
		});
		
		J1.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() { 
			public void handle(MouseEvent event) {
				StartPlayer = (Hero)Game.availableHeroes.get(0);
				window.setScene(scenePlay);
				Image img = new Image("4.png");
				ImageCursor cursor = new ImageCursor(img, 30, 30);
				grid.setCursor(cursor);
	     		window.setFullScreen(true); 
	     		System.out.println(StartPlayer.getName());
				view.mapp.createMap(mapGrid);
				view.VaccineAndSuppliesUpdate.Updatehp(Health);
				view.UpdateChooseplayer.UpdatePlayerOptions(available);
				view.VaccineAndSuppliesUpdate.UpdateVacc(VaccineNum);
				view.VaccineAndSuppliesUpdate.UpdateSupp(SupplyNum);
				view.VaccineAndSuppliesUpdate.UpdateAP(ActionPoint);
				Match.equal2();
				mapGrid.setGridLinesVisible(false);
				
		}
			
		});
		
		T1.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() { 
			public void handle(MouseEvent event) {
				StartPlayer = (Hero)Game.availableHeroes.get(2);
				window.setScene(scenePlay);
				Image img = new Image("4.png");
				ImageCursor cursor = new ImageCursor(img, 30, 30);
				grid.setCursor(cursor);
	     		window.setFullScreen(true); 
	     		System.out.println(StartPlayer.getName());
				view.mapp.createMap(mapGrid);
				view.VaccineAndSuppliesUpdate.Updatehp(Health);
				view.UpdateChooseplayer.UpdatePlayerOptions(available);
				view.VaccineAndSuppliesUpdate.UpdateVacc(VaccineNum);
				view.VaccineAndSuppliesUpdate.UpdateSupp(SupplyNum);
				view.VaccineAndSuppliesUpdate.UpdateAP(ActionPoint);
				Match.equal2();
				mapGrid.setGridLinesVisible(false);
				
		}
			
		});
		
		R1.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() { 
			public void handle(MouseEvent event) {
				StartPlayer = (Hero)Game.availableHeroes.get(3);
				window.setScene(scenePlay);
				Image img = new Image("4.png");
				ImageCursor cursor = new ImageCursor(img, 30, 30);
				grid.setCursor(cursor);
	     		window.setFullScreen(true); 
	     		System.out.println(StartPlayer.getName());
				view.mapp.createMap(mapGrid);
				view.VaccineAndSuppliesUpdate.Updatehp(Health);
				view.UpdateChooseplayer.UpdatePlayerOptions(available);
				view.VaccineAndSuppliesUpdate.UpdateVacc(VaccineNum);
				view.VaccineAndSuppliesUpdate.UpdateSupp(SupplyNum);
				view.VaccineAndSuppliesUpdate.UpdateAP(ActionPoint);
				Match.equal2();
				mapGrid.setGridLinesVisible(false);
				
		}
			
		});
		
		HBox choosecharacter1 = new HBox(20);
		choosecharacter1.setAlignment(Pos.CENTER);
		choosecharacter1.getChildren().addAll(E1,J1,T1,R1);
		

		TO1.onMouseMovedProperty().set(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
            	TO1.setEffect(glow10);
            
              
            }
        });
		
		TO1.onMouseExitedProperty().set(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
            	TO1.setEffect(unglow);
            	TO1.setEffect(drop);
            }
        });
		
		Tooltip.install(TO1, new Tooltip("TOMMY MILLER"+"\n"
				+"- Special Action : EXP"
				+"\n"+ "- MaxHp : 95"
				+"\n"+ "- MaxAction Points : 5"
				+"\n"+"- Attack Dmg : 25 "));
		
		B1.onMouseMovedProperty().set(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
            	B1.setEffect(glow10);
         
              
            }
        });
		
		B1.onMouseExitedProperty().set(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
            	B1.setEffect(unglow);
            	B1.setEffect(drop);
            }
        });
		
		
		Tooltip.install(B1, new Tooltip("BILL"+"\n"
				+"- Special Action : MED"
				+"\n"+ "- MaxHp : 100"
				+"\n"+ "- MaxAction Points : 7"
				+"\n"+"- Attack Dmg : 10 "));
		
		
		D1.onMouseMovedProperty().set(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
            	D1.setEffect(glow10);

              
            }
        });
		
		D1.onMouseExitedProperty().set(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
            	D1.setEffect(unglow);
            	D1.setEffect(drop);
            }
        });
		
		
		Tooltip.install(D1, new Tooltip("DAVID"+"\n"
				+"- Special Action : FIGH"
				+"\n"+ "- MaxHp : 150"
				+"\n"+ "- MaxAction Points : 4"
				+"\n"+"- Attack Dmg : 35 "));
		
		
		
		H1.onMouseMovedProperty().set(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
            	H1.setEffect(glow10);
        
              
            }
        });
		
		H1.onMouseExitedProperty().set(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
            	H1.setEffect(unglow);
            	H1.setEffect(drop);
            }
        });
		
		
		Tooltip.install(H1, new Tooltip("HENRY BURELL"+"\n"
				+"- Special Action : MED"
				+"\n"+ "- MaxHp : 105"
				+"\n"+ "- MaxAction Points : 6"
				+"\n"+"- Attack Dmg : 15 "));
		
		
		TO1.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() { 
			public void handle(MouseEvent event) {
				StartPlayer = (Hero)Game.availableHeroes.get(4);
				window.setScene(scenePlay);
				Image img = new Image("4.png");
				ImageCursor cursor = new ImageCursor(img, 30, 30);
				grid.setCursor(cursor);
	     		window.setFullScreen(true); 
	     		System.out.println(StartPlayer.getName());
				view.mapp.createMap(mapGrid);
				view.VaccineAndSuppliesUpdate.Updatehp(Health);
				view.UpdateChooseplayer.UpdatePlayerOptions(available);
				view.VaccineAndSuppliesUpdate.UpdateVacc(VaccineNum);
				view.VaccineAndSuppliesUpdate.UpdateSupp(SupplyNum);
				view.VaccineAndSuppliesUpdate.UpdateAP(ActionPoint);
				Match.equal2();
				mapGrid.setGridLinesVisible(false);
				
		}
			
		});
		
		B1.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() { 
			public void handle(MouseEvent event) {
				StartPlayer = (Hero)Game.availableHeroes.get(5);
				window.setScene(scenePlay);
				Image img = new Image("4.png");
				ImageCursor cursor = new ImageCursor(img, 30, 30);
				grid.setCursor(cursor);
	     		window.setFullScreen(true); 
	     		System.out.println(StartPlayer.getName());
				view.mapp.createMap(mapGrid);
				view.VaccineAndSuppliesUpdate.Updatehp(Health);
				view.UpdateChooseplayer.UpdatePlayerOptions(available);
				view.VaccineAndSuppliesUpdate.UpdateVacc(VaccineNum);
				view.VaccineAndSuppliesUpdate.UpdateSupp(SupplyNum);
				view.VaccineAndSuppliesUpdate.UpdateAP(ActionPoint);
				Match.equal2();
				mapGrid.setGridLinesVisible(false);
				
		}
			
		});
		
		D1.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() { 
			public void handle(MouseEvent event) {
				StartPlayer = (Hero)Game.availableHeroes.get(6);
				window.setScene(scenePlay);
				Image img = new Image("4.png");
				ImageCursor cursor = new ImageCursor(img, 30, 30);
				grid.setCursor(cursor);
	     		window.setFullScreen(true); 
	     		System.out.println(StartPlayer.getName());
				view.mapp.createMap(mapGrid);
				view.VaccineAndSuppliesUpdate.Updatehp(Health);
				view.UpdateChooseplayer.UpdatePlayerOptions(available);
				view.VaccineAndSuppliesUpdate.UpdateVacc(VaccineNum);
				view.VaccineAndSuppliesUpdate.UpdateSupp(SupplyNum);
				view.VaccineAndSuppliesUpdate.UpdateAP(ActionPoint);
				Match.equal2();
				mapGrid.setGridLinesVisible(false);
				
		}
			
		});
		
		H1.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() { 
			public void handle(MouseEvent event) {
				StartPlayer = (Hero)Game.availableHeroes.get(7);
				window.setScene(scenePlay);
				Image img = new Image("4.png");
				ImageCursor cursor = new ImageCursor(img, 30, 30);
				grid.setCursor(cursor);
	     		window.setFullScreen(true); 
	     		System.out.println(StartPlayer.getName());
				view.mapp.createMap(mapGrid);
				view.VaccineAndSuppliesUpdate.Updatehp(Health);
				view.UpdateChooseplayer.UpdatePlayerOptions(available);
				view.VaccineAndSuppliesUpdate.UpdateVacc(VaccineNum);
				view.VaccineAndSuppliesUpdate.UpdateSupp(SupplyNum);
				view.VaccineAndSuppliesUpdate.UpdateAP(ActionPoint);
				Match.equal2();
				mapGrid.setGridLinesVisible(false); 
				
		}
			
		});
		
		
		
		
		
		HBox choosecharacter2 = new HBox(20);
		choosecharacter2.setAlignment(Pos.CENTER);
		choosecharacter2.getChildren().addAll(TO1,B1,D1,H1);
		
		VBox choosecharacter3 = new VBox(20);
		choosecharacter3.setAlignment(Pos.CENTER);
		choosecharacter3.getChildren().addAll(choosecharacter1,choosecharacter2);
		
		Image chooseStart= new Image("ChooseHero.png");
		ImageView chooseStart1 = new ImageView(chooseStart);
		VBox chooseStart2= new VBox();
		chooseStart2.setAlignment(Pos.CENTER);
		chooseStart2.getChildren().add(chooseStart1);
		
		
		BorderPane panel2= new BorderPane();
		panel2.setTop(chooseStart2);
		panel2.setCenter(choosecharacter3);
		
		Image bg5= new Image("R.jpg");
		BackgroundSize bgSize2 = new BackgroundSize(1.0, 1.0, true, true, false, false);
		BackgroundImage bg6= new BackgroundImage(bg5, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
        BackgroundPosition.DEFAULT, bgSize2);
		panel2.setBackground(new Background(bg6));
		
		
		
		
		
        
        scene3=new Scene(panel2,1000,500);
		scene3.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		
		
		
		
		
		
		
		
		
		
		scenePlay.setOnKeyPressed(new EventHandler<KeyEvent>() {

	        public void handle(KeyEvent ke) {
	            if (ke.getCode() == KeyCode.UP) {
	                try {
//	                	Match.equal1();
	                	//System.out.print(Game.heroes.get(0).getName());
						player.move(Direction.UP);
//						Match.equal2();
						int x= player.getLocation().x;
						int y = player.getLocation().y;
						if (Game.map[x][y] instanceof TrapCell) {
							Image tw= new Image("trapcellwarn.png");
							ImageView twa= new ImageView(tw);
							Exc("Ouch!",twa);
						}
						view.UpdateMap.UpdatenewMap(mapGrid);
						SupplyNum.getChildren().clear();
						VaccineNum.getChildren().clear();
						ActionPoint.getChildren().clear();
						view.VaccineAndSuppliesUpdate.UpdateVacc(VaccineNum);
						view.VaccineAndSuppliesUpdate.UpdateSupp(SupplyNum);
						view.VaccineAndSuppliesUpdate.UpdateAP(ActionPoint);
						window.setScene(scenePlay);
						
					} catch (MovementException e) {
						int x= player.getLocation().x+1;
						int y = player.getLocation().y;
						if (x>14){
							Image tw= new Image("exp2.png");
							ImageView twa= new ImageView(tw);
							Exc("BeCarefull!",twa);
						}
						else{
							Image tw= new Image("exp1.png");
							ImageView twa= new ImageView(tw);
							Exc("BeCarefull!",twa);
						}
//						e.printStackTrace();
					} catch (NotEnoughActionsException e) {
						Image tw= new Image("exp3.png");
						ImageView twa= new ImageView(tw);
						Exc("BeCarefull!",twa);
//						e.printStackTrace();
					}
	            }
	            if (ke.getCode() == KeyCode.DOWN) {
	                try {
//	                	Match.equal1();
	                	//System.out.print(Game.heroes.get(0).getName());
						player.move(Direction.DOWN);
//						Match.equal2();
						int x= player.getLocation().x;
						int y = player.getLocation().y;
						if (Game.map[x][y] instanceof TrapCell) {
							Image tw= new Image("trapcellwarn.png");
							ImageView twa= new ImageView(tw);
							Exc("Ouch!",twa);
						}
						view.UpdateMap.UpdatenewMap(mapGrid);
						SupplyNum.getChildren().clear();
						VaccineNum.getChildren().clear();
						ActionPoint.getChildren().clear();
						view.VaccineAndSuppliesUpdate.UpdateVacc(VaccineNum);
						view.VaccineAndSuppliesUpdate.UpdateSupp(SupplyNum);
						view.VaccineAndSuppliesUpdate.UpdateAP(ActionPoint);
						window.setScene(scenePlay);
						
	                } catch (MovementException e) {
						int x= player.getLocation().x-1;
						int y = player.getLocation().y;
						if (x<0){
							Image tw= new Image("exp2.png");
							ImageView twa= new ImageView(tw);
							Exc("BeCarefull!",twa);
						}
						else{
							Image tw= new Image("exp1.png");
							ImageView twa= new ImageView(tw);
							Exc("BeCarefull!",twa);
						}
//						e.printStackTrace();
					} catch (NotEnoughActionsException e) {
						Image tw= new Image("exp3.png");
						ImageView twa= new ImageView(tw);
						Exc("BeCarefull!",twa);
//						e.printStackTrace();
					}
	            }
	            if (ke.getCode() == KeyCode.LEFT) {
	                try {
//	                	Match.equal1();
	                	//System.out.print(Game.heroes.get(0).getName());
						player.move(Direction.LEFT);
//						Match.equal2();
						int x= player.getLocation().x;
						int y = player.getLocation().y;
						if (Game.map[x][y] instanceof TrapCell) {
							Image tw= new Image("trapcellwarn.png");
							ImageView twa= new ImageView(tw);
							Exc("Ouch!",twa);
						}
						view.UpdateMap.UpdatenewMap(mapGrid);
						SupplyNum.getChildren().clear();
						VaccineNum.getChildren().clear();
						ActionPoint.getChildren().clear();
						view.VaccineAndSuppliesUpdate.UpdateVacc(VaccineNum);
						view.VaccineAndSuppliesUpdate.UpdateSupp(SupplyNum);
						view.VaccineAndSuppliesUpdate.UpdateAP(ActionPoint);
						window.setScene(scenePlay);
						
	                } catch (MovementException e) {
						int x= player.getLocation().x;
						int y = player.getLocation().y-1;
						if (y<0){
							Image tw= new Image("exp2.png");
							ImageView twa= new ImageView(tw);
							Exc("BeCarefull!",twa);
						}
						else{
							Image tw= new Image("exp1.png");
							ImageView twa= new ImageView(tw);
							Exc("BeCarefull!",twa);
						}
//						e.printStackTrace();
					} catch (NotEnoughActionsException e) {
						Image tw= new Image("exp3.png");
						ImageView twa= new ImageView(tw);
						Exc("BeCarefull!",twa);
//						e.printStackTrace();
					}
	            }
	            if (ke.getCode() == KeyCode.RIGHT) {
	                try {
//	                	Match.equal1();
	                	//System.out.print(Game.heroes.get(0).getName());
						player.move(Direction.RIGHT);
						int x= player.getLocation().x;
						int y = player.getLocation().y;
						if (Game.map[x][y] instanceof TrapCell) {
							Image tw= new Image("trapcellwarn.png");
							ImageView twa= new ImageView(tw);
							Exc("Ouch!",twa);
						}
//						Match.equal2();
						view.UpdateMap.UpdatenewMap(mapGrid);
						SupplyNum.getChildren().clear();
						VaccineNum.getChildren().clear();
						ActionPoint.getChildren().clear();
						view.VaccineAndSuppliesUpdate.UpdateVacc(VaccineNum);
						view.VaccineAndSuppliesUpdate.UpdateSupp(SupplyNum);
						view.VaccineAndSuppliesUpdate.UpdateAP(ActionPoint);
						window.setScene(scenePlay);
						
	                } catch (MovementException e) {
						int x=( player.getLocation().x);
						int y =( player.getLocation().y)+1;
						if (y>14){
							Image tw= new Image("exp2.png");
							ImageView twa= new ImageView(tw);
							Exc("BeCarefull!",twa);
						}
						else{
							Image tw= new Image("exp1.png");
							ImageView twa= new ImageView(tw);
							Exc("BeCarefull!",twa);
						}
//						e.printStackTrace();
					} catch (NotEnoughActionsException e) {
						Image tw= new Image("exp3.png");
						ImageView twa= new ImageView(tw);
						Exc("BeCarefull!",twa);
//						e.printStackTrace();
					}
	            }
	            if (ke.getCode() == KeyCode.A) {
	            	try {
//	            		player.setTarget(Target);
						player.attack();
						player.setTarget(null);
//						System.out.println(player.getTarget().getName());
//						Match.equal1();
						if(Game.checkWin()){
							window.setScene(Win);
						}
						else if(Game.checkGameOver()){
							window.setScene(Lose);
						}
						
						else{
							
							 
							Health.getChildren().clear();
							ActionPoint.getChildren().clear();
							view.VaccineAndSuppliesUpdate.Updatehp(Health);
							view.VaccineAndSuppliesUpdate.UpdateAP(ActionPoint);
							view.UpdateMap.UpdatenewMap(mapGrid);
//						int p;
//						if(player.getTarget()==null){
//							 p = 1;
//						}
//						else { p =2;}
//						System.out.println(p);
//						Match.equal2();
						window.setScene(scenePlay);}
						
						
					} catch (NotEnoughActionsException e) {
						Image tw= new Image("exp4.png");
						ImageView twa= new ImageView(tw);
						Exc("BeCarefull!",twa);
//						e.printStackTrace();
					} catch (InvalidTargetException e) {
						if(player.getTarget() == null){
							Image tw= new Image("exp5.png");
							ImageView twa= new ImageView(tw);
							Exc("BeCarefull!",twa);
						}
						else if(player.getTarget() instanceof Hero){
							Image tw= new Image("exp6.png");
							ImageView twa= new ImageView(tw);
							Exc("BeCarefull!",twa);
						}
						else {
							Image tw= new Image("exp7.png");
							ImageView twa= new ImageView(tw);
							Exc("BeCarefull!",twa);
						}
						
//						e.printStackTrace();
					}
	            	
	            	
	            }
	            if (ke.getCode() == KeyCode.C) {
	            	try {
						player.cure();
						player.setTarget(null);
						if(Game.checkWin()){
							window.setScene(Win);
						}
						else if(Game.checkGameOver()){
							window.setScene(Lose);
						}
						else{view.UpdateMap.UpdatenewMap(mapGrid);
						VaccineNum.getChildren().clear();
						ActionPoint.getChildren().clear();
						view.UpdateChooseplayer.UpdatePlayerOptions(available);
						view.VaccineAndSuppliesUpdate.UpdateVacc(VaccineNum);
						view.VaccineAndSuppliesUpdate.UpdateAP(ActionPoint);
						window.setScene(scenePlay);}
					} catch (NoAvailableResourcesException e) {
						Image tw= new Image("exp8.png");
						ImageView twa= new ImageView(tw);
						twa.setFitWidth(800);
						Exc("BeCarefull!",twa);
//						e.printStackTrace();
					} catch (InvalidTargetException e) {
						if(!(player.getTarget() instanceof Zombie)){
							Image tw= new Image("exp9.png");
							ImageView twa= new ImageView(tw);
							Exc("BeCarefull!",twa);
						}
						else if(player.getTarget() == null) {
							Image tw= new Image("exp10.png");
							ImageView twa= new ImageView(tw);
							Exc("BeCarefull!",twa);
						}
						else{
							Image tw= new Image("exp11.png");
							ImageView twa= new ImageView(tw);
							Exc("BeCarefull!",twa);
						}
//						e.printStackTrace();
					} catch (NotEnoughActionsException e) {
						Image tw= new Image("exp12.png");
						ImageView twa= new ImageView(tw);
						twa.setFitWidth(800);
						Exc("BeCarefull!",twa);
//						e.printStackTrace();
					}
	            }
	        }
	    });
		
		
		EndTurn.setOnAction(e -> {
			try {
				Game.endTurn();
				if(Game.checkWin()){
					window.setScene(Win);
				}
				else if(Game.checkGameOver()){
					window.setScene(Lose);
				}
				else{
				Health.getChildren().clear();
				available.getChildren().clear();
				view.VaccineAndSuppliesUpdate.Updatehp(Health);	
				view.VaccineAndSuppliesUpdate.UpdateAP(ActionPoint);
				view.UpdateMap.UpdatenewMap(mapGrid);
				view.UpdateChooseplayer.UpdatePlayerOptions(available);
				window.setScene(scenePlay);}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		
		
		
		});
		
		Image bg4444= new Image("bckgrnd3.jpg");
		BackgroundSize bgSize44 = new BackgroundSize(1.0, 1.0, true, true, false, false);
		BackgroundImage bg444= new BackgroundImage(bg4444, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
        BackgroundPosition.DEFAULT, bgSize44);
		grid.setBackground(new Background(bg444));
		
		SpecialAct.setOnAction(e -> { 
			Match.equal1();
			player.setSpecialAction(true);
//			System.out.println(player.isSpecialAction());
			try {
				player.useSpecial(); 
			} catch (Exception e1) {
				if(player instanceof Medic && Target==null){
					Image tw= new Image("exp14.png");
					ImageView twa= new ImageView(tw);
					twa.setFitWidth(800);
					Exc("BeCarefull!",twa);
				}
				else{
					Image tw= new Image("exp13.png");
				ImageView twa= new ImageView(tw);
				twa.setFitWidth(800);
				Exc("BeCarefull!",twa);}
//				e1.printStackTrace();
			}
			Match.equal2();
			Health.getChildren().clear();
			available.getChildren().clear();
			view.VaccineAndSuppliesUpdate.Updatehp(Health);
			view.UpdateChooseplayer.UpdatePlayerOptions(available);
			view.UpdateMap.UpdatenewMap(mapGrid);
			SupplyNum.getChildren().clear();
			view.VaccineAndSuppliesUpdate.UpdateSupp(SupplyNum);
			window.setScene(scenePlay);
			});
		
	        

		VBox winn = new VBox(50);
		winn.setAlignment(Pos.CENTER);
		
		
		
		
		Button Exit3 = new Button();
		Exit3.setText("Exit");
		Exit3.setOnAction(e-> closeProgram());
		
		Image WinLabel= new Image("winlabel.png");
		ImageView YouWon= new ImageView(WinLabel);
		
		Image backg= new Image("tlou2.jpg");
		BackgroundSize bgSize45 = new BackgroundSize(1.0, 1.0, true, true, false, false);
		BackgroundImage bg445= new BackgroundImage(backg, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
        BackgroundPosition.DEFAULT, bgSize45);
		winn.setBackground(new Background(bg445));
		
		winn.getChildren().addAll(YouWon,Exit3);
		
		Win=new Scene(winn,1000,500);
		Win.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		
		
		VBox losee = new VBox(50);
		losee.setAlignment(Pos.CENTER);
		
		
		
		
		Button Exit4 = new Button();
		Exit4.setText("Exit");
		Exit4.setOnAction(e-> closeProgram());
		
		Image LoseLabel= new Image("loselabel.png");
		ImageView YouLost= new ImageView(LoseLabel);
		
		Image backg3= new Image("tlou2.jpg");
		BackgroundSize bgSize453 = new BackgroundSize(1.0, 1.0, true, true, false, false);
		BackgroundImage bg4453= new BackgroundImage(backg3, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
        BackgroundPosition.DEFAULT, bgSize453);
		losee.setBackground(new Background(bg4453));
		
		losee.getChildren().addAll(YouLost,Exit4);
		
		Lose=new Scene(losee,1000,500);
		Lose.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		
		
		
		
		window.getIcons().add(new Image("gameIcon.png"));
		window.setFullScreen(true);
		window.setScene(scene1);
		window.setTitle("The Last Of Us");
		mediaPlayer.setAutoPlay(true);
		window.show();
		}
		
	private void closeProgram(){
		Boolean answer = ConfirmBox.display("Closing request", "Are you sure you want to close the game?");
		if(answer)
			window.close();
	}
	private void Exc(String Title, ImageView Message){
		Catching.CatchException(Title, Message);
		
	}
	}
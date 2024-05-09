package view;

import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import model.characters.Character;
import model.characters.Zombie;
import model.world.CharacterCell;
import model.world.CollectibleCell;
import engine.Game;
import model.characters.*;
import model.collectibles.Supply;
import model.collectibles.Vaccine;
import view.Main;

public class mapp {
	public static Hero player;
	public static void createMap(GridPane mapGrid){
	//Game.map=Main.map1;
		Game.startGame(Main.StartPlayer);
		Main.player= Game.heroes.get(0);
//		System.out.println(Main.player.getName());
		//ColumnConstraints cc = new ColumnConstraints(10);
		//RowConstraints rc = new RowConstraints(10);
		
		int k=0;
		for (int i = 0; i < Game.map.length; i++) {
			
//			mapGrid.getColumnConstraints().add(cc);
//			mapGrid.getRowConstraints().add(rc);
			
			for (int j = 0; j < Game.map[i].length; j++) {
				int o =i;
				int u =j;
				
				if(!(Game.map[i][j].isVisible())){
					Image NotVisible = new Image("invisibleCell (22).png",71.25,71.25,false,false);
				    ImageView NotVisible1 = new ImageView(NotVisible);
					mapGrid.add(NotVisible1, j, 14-i);
				}
				else{
				if(Game.map[i][j] instanceof CollectibleCell ){
					if(((CollectibleCell) Game.map[i][j]).getCollectible() instanceof Vaccine){
					Image vaccine2 = new Image("vaccineF.png",71.25,71.25,false,false);
					ImageView Vaccine1 = new ImageView(vaccine2);
					mapGrid.add(Vaccine1, j, 14-i);}
					if(((CollectibleCell) Game.map[i][j]).getCollectible() instanceof Supply){
						Image supply = new Image("supplyF.png",71.25,71.25,false,false);
						ImageView supply1 = new ImageView(supply);
						mapGrid.add(supply1, j, 14-i);}
						
					
				}
				else if (Game.map[i][j] instanceof CharacterCell &&((CharacterCell)Game.map[i][j]).getCharacter()!=null ){
					String q = new String (((CharacterCell) Game.map[i][j]).getCharacter().getName());
					int p = j;
					int t= i;
					
					if(((CharacterCell) Game.map[i][j]).getCharacter() instanceof Zombie){
						Image Zombie = new Image("ZombieCell.png", 71.25, 71.25, false, false);
						ImageView Zombie1 = new ImageView(Zombie);
						mapGrid.add(Zombie1, j, 14-i);
						Zombie1.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() { 
							public void handle(MouseEvent event) {
								Main.Target=(Character)((CharacterCell) Game.map[o][u]).getCharacter();
								Main.player.setTarget(Main.Target);
								Image Zombie = new Image("Ztarget.png", 71.25, 71.25, false, false);
								ImageView Zombie1 = new ImageView(Zombie);
								mapGrid.add(Zombie1, p, 14-t);
						}
							
						});
					}
					else if(q.equals("Joel Miller")){
						Image c1 = new Image("joelF.png",71.25,71.25,false,false);
						ImageView v = new ImageView(c1);
						mapGrid.add(v, j, 14-i);
						v.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() { 
							public void handle(MouseEvent event) {
								Main.Target=(Character)((CharacterCell) Game.map[o][u]).getCharacter();
								Main.player.setTarget(Main.Target);
								Image c1 = new Image("JTarget.png",71.25,71.25,false,false);
								ImageView v = new ImageView(c1);
								mapGrid.add(v, p, 14-t);
						}
							
						});
						
						
						
					}
					else if(q.equals("Ellie Williams")){
						Image c1 = new Image("ellieF.png",71.25,71.25,false,false);
						ImageView v = new ImageView(c1);
						mapGrid.add(v, j, 14-i);
						v.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() { 
							public void handle(MouseEvent event) {
								Main.Target=(Character)((CharacterCell) Game.map[o][u]).getCharacter();
								Main.player.setTarget(Main.Target);
								Image c1 = new Image("ETarget.png",71.25,71.25,false,false);
								ImageView v = new ImageView(c1);
								mapGrid.add(v, p, 14-t);
						}
							
						});
						
					}
					else if(q.equals("Tess")){
						Image c1 = new Image("tessF.png",71.25,71.25,false,false);
						ImageView v = new ImageView(c1);
						mapGrid.add(v, j, 14-i);
						
						v.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() { 
							public void handle(MouseEvent event) {
								Main.Target=(Character)((CharacterCell) Game.map[o][u]).getCharacter();
								Main.player.setTarget(Main.Target);
								
								Image c1 = new Image("TTarget.png",71.25,71.25,false,false);
								ImageView v = new ImageView(c1);
								mapGrid.add(v, p, 14-t);
						}
							
						});
					
					}
					else if(q.equals("Riley Abel")){
						Image c1 = new Image("rileyF.png",71.25,71.25,false,false);
						ImageView v = new ImageView(c1);
						mapGrid.add(v, j, 14-i);
						v.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() { 
							public void handle(MouseEvent event) {
								Main.Target=(Character)((CharacterCell) Game.map[o][u]).getCharacter();
								Main.player.setTarget(Main.Target);
								
								Image c1 = new Image("RTarget.png",71.25,71.25,false,false);
								ImageView v = new ImageView(c1);
								mapGrid.add(v, p, 14-t);
						}
							
						});
						
					}
					else if(q.equals("Tommy Miller")){
						Image c1 = new Image("tommyF.png",71.25,71.25,false,false);
						ImageView v = new ImageView(c1);
						mapGrid.add(v, j, 14-i);
						
						v.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() { 
							public void handle(MouseEvent event) {
								Main.Target=(Character)((CharacterCell) Game.map[o][u]).getCharacter();
								Main.player.setTarget(Main.Target);
								
								Image c1 = new Image("TomTarget.png",71.25,71.25,false,false);
								ImageView v = new ImageView(c1);
								mapGrid.add(v, p, 14-t);
						}
							
						});
						
					}
					else if(q.equals("Bill")){
						Image c1 = new Image("billF.png",71.25,71.25,false,false);
						ImageView v = new ImageView(c1);
						mapGrid.add(v, j, 14-i);
						
						v.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() { 
							public void handle(MouseEvent event) {
								Main.Target=(Character)((CharacterCell) Game.map[o][u]).getCharacter();
								Main.player.setTarget(Main.Target);
								
								Image c1 = new Image("BTarget.png",71.25,71.25,false,false);
								ImageView v = new ImageView(c1);
								mapGrid.add(v, p, 14-t);
						}
							
						});
						
					}
					else if(q.equals("David")){
						Image c1 = new Image("davidF.png",71.25,71.25,false,false);
						ImageView v = new ImageView(c1);
						mapGrid.add(v, j, 14-i);
						
						v.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() { 
							public void handle(MouseEvent event) {
								Main.Target=(Character)((CharacterCell) Game.map[o][u]).getCharacter();
								Main.player.setTarget(Main.Target);
								
								Image c1 = new Image("DTarget.png",71.25,71.25,false,false);
								ImageView v = new ImageView(c1);
								mapGrid.add(v, p, 14-t);
						}
							
						});
						
					}
					else if(q.equals("Henry Burell")){
						Image c1 = new Image("henryF.png",71.25,71.25,false,false);
						ImageView v = new ImageView(c1);
						mapGrid.add(v, j, 14-i);
						
						v.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() { 
							public void handle(MouseEvent event) {
								Main.Target=(Character)((CharacterCell) Game.map[o][u]).getCharacter();
								Main.player.setTarget(Main.Target);
								
								Image c1 = new Image("HTarget.png",71.25,71.25,false,false);
								ImageView v = new ImageView(c1);
								mapGrid.add(v, p, 14-t);
						}
							
						});
						
					}
					
					
				}else{
					Image Visible = new Image("visibleF.png", 71.25, 71.25, false, false);
					ImageView Visible1 = new ImageView(Visible);
//					Rectangle rec = new Rectangle();
//					rec.setHeight(25);
//					rec.setWidth(25);
//					rec.setFill(Visible1);
					mapGrid.add(Visible1, j, 14-i);
				}}

		}}}
	
}
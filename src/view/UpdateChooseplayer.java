package view;

import model.characters.Hero;
import javafx.event.EventHandler;
import javafx.scene.ImageCursor;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.TextAlignment;
import engine.Game;

public class UpdateChooseplayer {

	public static void UpdatePlayerOptions(GridPane available){
    available.getChildren().clear();
	int w = Game.heroes.size();
	if (Main.player.getName().equals("Joel Miller"))
	{
		Image img = new Image("figh.png",200,200,false,false);
		ImageCursor cursor = new ImageCursor(img, 70, 70);
		Main.grid.setCursor(cursor);
		
	}
	if (Main.player.getName().equals("Ellie Williams"))
	{
		Image img = new Image("med.png");
		ImageCursor cursor = new ImageCursor(img, 70, 70);
		Main.grid.setCursor(cursor);
	}
	if (Main.player.getName().equals("Tess"))
	{
		Image img = new Image("exp.png");
		ImageCursor cursor = new ImageCursor(img, 100, 100);
		Main.grid.setCursor(cursor);
	}
	if (Main.player.getName().equals("Riley Abel"))
	{
		Image img = new Image("exp.png");
		ImageCursor cursor = new ImageCursor(img, 30, 30);
		Main.grid.setCursor(cursor);
	}
	if (Main.player.getName().equals("Tommy Miller"))
	{
		Image img = new Image("exp.png");
		ImageCursor cursor = new ImageCursor(img, 30, 30);
		Main.grid.setCursor(cursor);
	}
	if (Main.player.getName().equals("Bill"))
	{
		Image img = new Image("med.png");
		ImageCursor cursor = new ImageCursor(img, 30, 30);
		Main.grid.setCursor(cursor);
	}
	if (Main.player.getName().equals("David"))
	{
		Image img = new Image("figh.png");
		ImageCursor cursor = new ImageCursor(img, 30, 30);
		Main.grid.setCursor(cursor);
	}
	if (Main.player.getName().equals("Henry Burell"))
	{
		Image img = new Image("med.png");
		ImageCursor cursor = new ImageCursor(img, 30, 30);
		Main.grid.setCursor(cursor);
	}
	for(int i = 0; i<w ;i++){
		if(Game.heroes.get(i).getCurrentHp()==0){
		   
		}
		
		if(Game.heroes.get(i).getName().equals("Joel Miller")){
			Image Joel= new Image("selectedJoel.png",150,150,false,false);
			ImageView Joel1= new ImageView(Joel);
			
			Button bu = new Button();
			bu.setMinWidth(150);
			bu.setMaxWidth(150);
			bu.setGraphic(Joel1);
			available.add(bu, i, 0);
			if(Game.heroes.get(i).getCurrentHp()==0){
				   bu.setVisible(false);
			}
			else{
				bu.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() { 
					public void handle(MouseEvent event) {
						for(int k = 0; k<w ;k++){
							Hero h = Game.heroes.get(k);
							if(h.getName().equals("Joel Miller")){
								Main.player=h;

								Image img = new Image("figh.png",200,200,false,false);
								ImageCursor cursor = new ImageCursor(img, 30, 30);
								Main.grid.setCursor(cursor);
								
							}
						}
						
						
				}
					
				});
			}
			Tooltip tooltip1 = new Tooltip("- Special Action : FIGH"
			+"\n"+ "- MaxHp : 140"
			+"\n"+ "- MaxAction Points : 5"
			+"\n"+"- Attack Dmg : 30 ");

			bu.setTooltip(tooltip1);
			tooltip1.setTextAlignment(TextAlignment.LEFT);
		}
		
		if(Game.heroes.get(i).getName().equals("Ellie Williams")){
			Image Ellie= new Image("selectedEllie.png",150,150,false,false);
			ImageView Ellie1= new ImageView(Ellie);
			Button bu = new Button();
			bu.setMinWidth(150);
			bu.setMaxWidth(150);
			bu.setGraphic(Ellie1);
			available.add(bu, i, 0);
			if(Game.heroes.get(i).getCurrentHp()==0){
				   bu.setVisible(false);
			}
			else{
				bu.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() { 
					public void handle(MouseEvent event) {
						for(int k = 0; k<w ;k++){
							Hero h = Game.heroes.get(k);
							if(h.getName().equals("Ellie Williams")){
								Main.player=h;

								Image img = new Image("med.png");
								ImageCursor cursor = new ImageCursor(img, 30, 30);
								Main.grid.setCursor(cursor);
							}
						}
						
						
				}
					
				});
			}
			Tooltip tooltip1 = new Tooltip("- Special Action : MED"
					+"\n"+ "- MaxHp : 110"
					+"\n"+ "- MaxAction Points : 6"
					+"\n"+"- Attack Dmg : 15 ");

			bu.setTooltip(tooltip1);
			tooltip1.setTextAlignment(TextAlignment.LEFT);
		}
		
		if(Game.heroes.get(i).getName().equals("Tess")){
			Image Tess= new Image("selectedTess.png",150,150,false,false);
			ImageView Tess2= new ImageView(Tess);
			Button Tess1 = new Button();
			Tess1.setMinWidth(150);
			Tess1.setMaxWidth(150);
			Tess1.setGraphic(Tess2);
			available.add(Tess1, i, 0);
			if(Game.heroes.get(i).getCurrentHp()==0){
				   Tess1.setVisible(false);
			}
			else{
				Tess1.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() { 
					public void handle(MouseEvent event) {
						for(int k = 0; k<w ;k++){
							Hero h = Game.heroes.get(k);
							if(Game.heroes.get(k).getName().equals("Tess")){
								Main.player=h;
								Image img = new Image("exp.png");
								ImageCursor cursor = new ImageCursor(img, 30, 30);
								Main.grid.setCursor(cursor);
							}
						}
						
						
				}
					
				});
			}
			Tooltip tooltip1 = new Tooltip("- Special Action : EXP"
					+"\n"+ "- MaxHp : 80"
					+"\n"+ "- MaxAction Points : 6"
					+"\n"+"- Attack Dmg : 20 ");

			Tess1.setTooltip(tooltip1);
			tooltip1.setTextAlignment(TextAlignment.LEFT);
		}
		
		if(Game.heroes.get(i).getName().equals("Riley Abel")){
			Image Riley= new Image("selectedRiley.png",150,150,false,false);
			ImageView Riley1= new ImageView(Riley);
			Button reily = new Button();
			reily.setMinWidth(150);
			reily.setMaxWidth(150);
			reily.setGraphic(Riley1);
			available.add(reily, i, 0);
			if(Game.heroes.get(i).getCurrentHp()==0){
				   reily.setVisible(false);
			}
			else{
				reily.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() { 
					public void handle(MouseEvent event) {
						for(int k = 0; k<w ;k++){
							Hero h = Game.heroes.get(k);
							if(h.getName().equals("Riley Abel")){
								Main.player=h;
								Image img = new Image("exp.png");
								ImageCursor cursor = new ImageCursor(img, 30, 30);
								Main.grid.setCursor(cursor);
							}
						}
						
						
				}
					
				});
			}
			Tooltip tooltip1 = new Tooltip("- Special Action : EXP"
					+"\n"+ "- MaxHp : 90"
					+"\n"+ "- MaxAction Points : 5"
					+"\n"+"- Attack Dmg : 25 ");

			reily.setTooltip(tooltip1);
			tooltip1.setTextAlignment(TextAlignment.LEFT);
		}
		
		if(Game.heroes.get(i).getName().equals("Tommy Miller")){
			Image Tommy= new Image("selectedTommy.png",150,150,false,false);
			ImageView Tommy1= new ImageView(Tommy);
			Button Tommy2 = new Button();
			Tommy2.setMinWidth(150);
			Tommy2.setMaxWidth(150);
			Tommy2.setGraphic(Tommy1);
			available.add(Tommy2,i,0);
			if(Game.heroes.get(i).getCurrentHp()==0){
				   Tommy2.setVisible(false);
			}
			
			else{
				Tommy2.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() { 
					public void handle(MouseEvent event) {
						for(int k = 0; k<w ;k++){
							Hero h = Game.heroes.get(k);
							if(h.getName().equals("Tommy Miller")){
								Main.player=h;
								Image img = new Image("exp.png");
								ImageCursor cursor = new ImageCursor(img, 70, 70);
								Main.grid.setCursor(cursor);
							}
						}
						
						
				}
					
				});
			}
			Tooltip tooltip1 = new Tooltip("- Special Action : EXP"
					+"\n"+ "- MaxHp : 95"
					+"\n"+ "- MaxAction Points : 5"
					+"\n"+"- Attack Dmg : 25 ");

			Tommy2.setTooltip(tooltip1);
			tooltip1.setTextAlignment(TextAlignment.LEFT);
		}
		
		
		if(Game.heroes.get(i).getName().equals("Bill")){
			Image Bill= new Image("selectedBill.png",150,150,false,false);
			ImageView Bill1= new ImageView(Bill);
			Button bu = new Button();
			bu.setMinWidth(150);
			bu.setMaxWidth(150);
			bu.setGraphic(Bill1);
			available.add(bu, i, 0);
			if(Game.heroes.get(i).getCurrentHp()==0){
				   bu.setVisible(false);
			}
			else{
				bu.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() { 
					public void handle(MouseEvent event) {
						for(int k = 0; k<w ;k++){
							Hero h = Game.heroes.get(k);
							if(h.getName().equals("Bill")){
								Main.player=h;
								Image img = new Image("med.png");
								ImageCursor cursor = new ImageCursor(img, 70, 70);
								Main.grid.setCursor(cursor);
							}
						}
						
						
				}
					
				});
			}
			
			Tooltip tooltip1 = new Tooltip("- Special Action : MED"
					+"\n"+ "- MaxHp : 100"
					+"\n"+ "- MaxAction Points : 7"
					+"\n"+"- Attack Dmg : 10 ");

			bu.setTooltip(tooltip1);
			tooltip1.setTextAlignment(TextAlignment.LEFT);
		}
		
		if(Game.heroes.get(i).getName().equals("David")){
			Image David= new Image("selectedDavid.png",150,150,false,false);
			ImageView David1= new ImageView(David);
			Button bu = new Button();
			bu.setMinWidth(150);
			bu.setMaxWidth(150);
			bu.setGraphic(David1);
			available.add(bu, i, 0);
			if(Game.heroes.get(i).getCurrentHp()==0){
				   bu.setVisible(false);
			}
			else{
				bu.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() { 
					public void handle(MouseEvent event) {
						for(int k = 0; k<w ;k++){
							Hero h = Game.heroes.get(k);
							if(h.getName().equals("David")){
								Main.player=h;
								Image img = new Image("figh.png");
								ImageCursor cursor = new ImageCursor(img, 30, 30);
								Main.grid.setCursor(cursor);
							}
						}
						
						
				}
					
				});
			}
			Tooltip tooltip1 = new Tooltip("- Special Action : FIGH"
					+"\n"+ "- MaxHp : 150"
					+"\n"+ "- MaxAction Points : 4"
					+"\n"+"- Attack Dmg : 35 ");

			bu.setTooltip(tooltip1);
			tooltip1.setTextAlignment(TextAlignment.LEFT);
		}
		
		if(Game.heroes.get(i).getName().equals("Henry Burell")){
			Image Henry= new Image("selectedHenry.png",150,150,false,false);
			ImageView Henry1= new ImageView(Henry);
			Button bu = new Button();
			bu.setMinWidth(150);
			bu.setMaxWidth(150);
			bu.setGraphic(Henry1);
			available.add(bu, i, 0);
			if(Game.heroes.get(i).getCurrentHp()==0){
				   bu.setVisible(false);
			}
			
			else{
				bu.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() { 
					public void handle(MouseEvent event) {
						for(int k = 0; k<w ;k++){
							Hero h = Game.heroes.get(k);
							if(h.getName().equals("Henry Burell")){
								Main.player=h;
								Image img = new Image("med.png");
								ImageCursor cursor = new ImageCursor(img, 30, 30);
								Main.grid.setCursor(cursor);
							}
						}
						
						
				}
					
				});
			}
			Tooltip tooltip1 = new Tooltip("- Special Action : MED"
					+"\n"+ "- MaxHp : 105"
					+"\n"+ "- MaxAction Points : 6"
					+"\n"+"- Attack Dmg : 15 ");

			bu.setTooltip(tooltip1);
			tooltip1.setTextAlignment(TextAlignment.LEFT);
		}
		
	}}
	
	
}
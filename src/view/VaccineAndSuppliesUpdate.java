package view;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class VaccineAndSuppliesUpdate {
 
	public static void UpdateVacc(GridPane VaccineNum){
		
		if(Main.player.getVaccineInventory().size()==0){
			Image Vacc= new Image("0.png");
			ImageView Vacc0= new ImageView(Vacc);
			VaccineNum.add(Vacc0, 0, 0);
//			System.out.println(0);
		}
		 if(Main.player.getVaccineInventory().size()==1){
			Image Vacc= new Image("1vac.png");
			ImageView Vacc1= new ImageView(Vacc);
			VaccineNum.add(Vacc1, 0, 0);
//			System.out.println(1);
		}
		 if(Main.player.getVaccineInventory().size()==2){
			Image Vacc= new Image("2vac.png");
			ImageView Vacc2= new ImageView(Vacc);
			VaccineNum.add(Vacc2, 0, 0);
		}
		 if(Main.player.getVaccineInventory().size()==3){
			Image Vacc= new Image("3vac.png");
			ImageView Vacc3= new ImageView(Vacc);
			VaccineNum.add(Vacc3, 0, 0);
		}
		 if(Main.player.getVaccineInventory().size()==4){
			Image Vacc= new Image("4vac.png");
			ImageView Vacc4= new ImageView(Vacc);
			VaccineNum.add(Vacc4, 0, 0);
		}
		 if(Main.player.getVaccineInventory().size()==5){
			Image Vacc= new Image("5vac.png");
			ImageView Vacc5= new ImageView(Vacc);
			VaccineNum.add(Vacc5, 0, 0);
		}
	}
	
	public static void UpdateVaccnull(GridPane VaccineNum){
		VaccineNum.getChildren().clear();
	}
	
	public static void UpdateSuppnull(GridPane SupplyNum){
		SupplyNum.getChildren().clear();
	}
	
	public static void Updatehp(GridPane Health){
		String hp = Main.player.getCurrentHp() +"";
		
		
		if(Main.player.getMaxHp()==140){
			if(Main.player.getCurrentHp() >112){
				Image heart = new Image("Hp100.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
			if(Main.player.getCurrentHp()<=112 && Main.player.getCurrentHp()>84){
				Image heart = new Image("Hp80.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
			if(Main.player.getCurrentHp()<=84 && Main.player.getCurrentHp()>56){
				Image heart = new Image("Hp60.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
			if(Main.player.getCurrentHp()<=56 && Main.player.getCurrentHp()>28){
				Image heart = new Image("Hp40.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
			if(Main.player.getCurrentHp()<=28){
				Image heart = new Image("Hp20.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
		}	
		
		if(Main.player.getMaxHp()==110){
			if(Main.player.getCurrentHp() >88){
				Image heart = new Image("Hp100.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
			if(Main.player.getCurrentHp()<=88 && Main.player.getCurrentHp()>66){
				Image heart = new Image("Hp80.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
			if(Main.player.getCurrentHp()<=66 && Main.player.getCurrentHp()>44){
				Image heart = new Image("Hp60.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
			if(Main.player.getCurrentHp()<=44 && Main.player.getCurrentHp()>22){
				Image heart = new Image("Hp40.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
			if(Main.player.getCurrentHp()<=22){
				Image heart = new Image("Hp20.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
		}	
		
		if(Main.player.getMaxHp()==80){
			if(Main.player.getCurrentHp() >64){
				Image heart = new Image("Hp100.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
			if(Main.player.getCurrentHp()<=64 && Main.player.getCurrentHp()>48){
				Image heart = new Image("Hp80.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
			if(Main.player.getCurrentHp()<=48 && Main.player.getCurrentHp()>32){
				Image heart = new Image("Hp60.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
			if(Main.player.getCurrentHp()<=32 && Main.player.getCurrentHp()>16){
				Image heart = new Image("Hp40.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
			if(Main.player.getCurrentHp()<=16){
				Image heart = new Image("Hp20.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
		}	
		
		if(Main.player.getMaxHp()==90){
			if(Main.player.getCurrentHp() >72){
				Image heart = new Image("Hp100.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
			if(Main.player.getCurrentHp()<=72 && Main.player.getCurrentHp()>54){
				Image heart = new Image("Hp80.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
			if(Main.player.getCurrentHp()<=54 && Main.player.getCurrentHp()>36){
				Image heart = new Image("Hp60.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
			if(Main.player.getCurrentHp()<=36 && Main.player.getCurrentHp()>18){
				Image heart = new Image("Hp40.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
			if(Main.player.getCurrentHp()<=18){
				Image heart = new Image("Hp20.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
		}	
		
		if(Main.player.getMaxHp()==95){
			if(Main.player.getCurrentHp() >76){
				Image heart = new Image("Hp100.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
			if(Main.player.getCurrentHp()<=76 && Main.player.getCurrentHp()>57){
				Image heart = new Image("Hp80.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
			if(Main.player.getCurrentHp()<=57 && Main.player.getCurrentHp()>38){
				Image heart = new Image("Hp60.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
			if(Main.player.getCurrentHp()<=38 && Main.player.getCurrentHp()>19){
				Image heart = new Image("Hp40.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
			if(Main.player.getCurrentHp()<=19){
				Image heart = new Image("Hp20.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
		}	
		
		if(Main.player.getMaxHp()==100){
			if(Main.player.getCurrentHp() >80){
				Image heart = new Image("Hp100.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
			if(Main.player.getCurrentHp()<=80 && Main.player.getCurrentHp()>60){
				Image heart = new Image("Hp80.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
			if(Main.player.getCurrentHp()<=60 && Main.player.getCurrentHp()>40){
				Image heart = new Image("Hp60.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
			if(Main.player.getCurrentHp()<=40 && Main.player.getCurrentHp()>20){
				Image heart = new Image("Hp40.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
			if(Main.player.getCurrentHp()<=20){
				Image heart = new Image("Hp20.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
		}
		
		if(Main.player.getMaxHp()==150){
			if(Main.player.getCurrentHp() >120){
				Image heart = new Image("Hp100.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
			if(Main.player.getCurrentHp()<=120 && Main.player.getCurrentHp()>90){
				Image heart = new Image("Hp80.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
			if(Main.player.getCurrentHp()<=90 && Main.player.getCurrentHp()>60){
				Image heart = new Image("Hp60.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
			if(Main.player.getCurrentHp()<=60 && Main.player.getCurrentHp()>30){
				Image heart = new Image("Hp40.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
			if(Main.player.getCurrentHp()<=30){
				Image heart = new Image("Hp20.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
		}
		
		if(Main.player.getMaxHp()==105){
			if(Main.player.getCurrentHp() >84){
				Image heart = new Image("Hp100.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
			if(Main.player.getCurrentHp()<=84 && Main.player.getCurrentHp()>63){
				Image heart = new Image("Hp80.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
			if(Main.player.getCurrentHp()<=63 && Main.player.getCurrentHp()>42){
				Image heart = new Image("Hp60.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
			if(Main.player.getCurrentHp()<=42 && Main.player.getCurrentHp()>21){
				Image heart = new Image("Hp40.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
			if(Main.player.getCurrentHp()<=21){
				Image heart = new Image("Hp20.png");
				ImageView hearthp = new ImageView(heart);
				double w = heart.getWidth()/1.5;
		        double h = heart.getHeight()/1.5;
				hearthp.setFitWidth(w);
				hearthp.setFitHeight(h);
				hearthp.setPreserveRatio(true);
				Health.add(hearthp, 0, 0);
				Text t = new Text();
				t.setText("Current HP : "+ hp +"\n");
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				Health.add(t, 0, 1);
			}
		}
	}
	
	
	public static void UpdateSupp(GridPane SupplyNum){
		
		if(Main.player.getSupplyInventory().size()==0){
			Image Supp= new Image("0.png");
			ImageView Supp0= new ImageView(Supp);
			SupplyNum.add(Supp0, 0, 0);
//			System.out.println(0);
		}
		 if(Main.player.getSupplyInventory().size()==1){
			Image Supp= new Image("1supply.png");
			ImageView Supp1= new ImageView(Supp);
			SupplyNum.add(Supp1, 0, 0);
//			System.out.println(1);
		}
		 if(Main.player.getSupplyInventory().size()==2){
			Image Supp= new Image("2supply.png");
			ImageView Supp2= new ImageView(Supp);
			SupplyNum.add(Supp2, 0, 0);
		}
		 if(Main.player.getSupplyInventory().size()==3){
			Image Supp= new Image("3supply.png");
			ImageView Supp3= new ImageView(Supp);
			SupplyNum.add(Supp3, 0, 0);
		}
		 if(Main.player.getSupplyInventory().size()==4){
			Image Supp= new Image("4supply.png");
			ImageView Supp4= new ImageView(Supp);
			SupplyNum.add(Supp4, 0, 0);
		}
		 if(Main.player.getSupplyInventory().size()==5){
			Image Supp= new Image("5supply.png");
			ImageView Supp5= new ImageView(Supp);
			SupplyNum.add(Supp5, 0, 0);
		}
	}
	
	public static void UpdateAP(GridPane ActionPoint){
		String ap = Main.player.getActionsAvailable() +"";
		 if(Main.player.getActionsAvailable()==7){
			 Image Act= new Image("77.png");
				double w = Act.getWidth()/1.5;
		        double h = Act.getHeight()/1.5;
		        ImageView Act7= new ImageView(Act);
		        Act7.setFitWidth(w);
				Act7.setFitHeight(h);
				Act7.setPreserveRatio(true);

				ActionPoint.add(Act7, 0, 0);
				Text t = new Text();
				t.setText("Actions Available : " + ap);
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				ActionPoint.add(t, 0, 1);
		 }
		 if(Main.player.getActionsAvailable()==6){
			 Image Act= new Image("66.png");
			 double w = Act.getWidth()/1.5;
		        double h = Act.getHeight()/1.5;
		        ImageView Act7= new ImageView(Act);
		        Act7.setFitWidth(w);
				Act7.setFitHeight(h);
				Act7.setPreserveRatio(true);
				ActionPoint.add(Act7, 0, 0);
				Text t = new Text();
				t.setText("Actions Available : " + ap);
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				ActionPoint.add(t, 0, 1);
		 }
		 if(Main.player.getActionsAvailable()==5){
			 Image Act= new Image("55.png");
			 double w = Act.getWidth()/1.5;
		        double h = Act.getHeight()/1.5;
		        ImageView Act7= new ImageView(Act);
		        Act7.setFitWidth(w);
				Act7.setFitHeight(h);
				Act7.setPreserveRatio(true);
				ActionPoint.add(Act7, 0, 0);
				Text t = new Text();
				t.setText("Actions Available : " + ap);
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				ActionPoint.add(t, 0, 1);
		 }
		 if(Main.player.getActionsAvailable()==4){
			 Image Act= new Image("44.png");
			 double w = Act.getWidth()/1.5;
		        double h = Act.getHeight()/1.5;
		        ImageView Act7= new ImageView(Act);
		        Act7.setFitWidth(w);
				Act7.setFitHeight(h);
				Act7.setPreserveRatio(true);
				ActionPoint.add(Act7, 0, 0);
				Text t = new Text();
				t.setText("Actions Available : " + ap);
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				ActionPoint.add(t, 0, 1);
		 }
		 if(Main.player.getActionsAvailable()==3){
			 Image Act= new Image("33.png");
			 double w = Act.getWidth()/1.5;
		        double h = Act.getHeight()/1.5;
		        ImageView Act7= new ImageView(Act);
		        Act7.setFitWidth(w);
				Act7.setFitHeight(h);
				Act7.setPreserveRatio(true);
				ActionPoint.add(Act7, 0, 0);
				Text t = new Text();
				t.setText("Actions Available : " + ap);
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				ActionPoint.add(t, 0, 1);
		 }
		 if(Main.player.getActionsAvailable()==2){
			 Image Act= new Image("22.png");
			 double w = Act.getWidth()/1.5;
		        double h = Act.getHeight()/1.5;
		        ImageView Act7= new ImageView(Act);
		        Act7.setFitWidth(w);
				Act7.setFitHeight(h);
				Act7.setPreserveRatio(true);
				ActionPoint.add(Act7, 0, 0);
				Text t = new Text();
				t.setText("Actions Available : " + ap);
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				ActionPoint.add(t, 0, 1);
		 }
		 if(Main.player.getActionsAvailable()==1){
			 Image Act= new Image("11.png");
			 double w = Act.getWidth()/1.5;
		        double h = Act.getHeight()/1.5;
		        ImageView Act7= new ImageView(Act);
		        Act7.setFitWidth(w);
				Act7.setFitHeight(h);
				Act7.setPreserveRatio(true);
				ActionPoint.add(Act7, 0, 0);
				Text t = new Text();
				t.setText("Actions Available : " + ap);
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				ActionPoint.add(t, 0, 1);
		 }
		 if(Main.player.getActionsAvailable()==0){
//			 Image Act= new Image("0.png");
//			 double w = Act.getWidth()/1.5;
//		        double h = Act.getHeight()/1.5;
//		        ImageView Act7= new ImageView(Act);
//		        Act7.setFitWidth(w);
//				Act7.setFitHeight(h);
//				Act7.setPreserveRatio(true);
//				ActionPoint.add(Act7, 0, 0);
				Text t = new Text();
				t.setText("Actions Available : " + ap);
				t.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
				t.setFill(Color.WHITE);
				ActionPoint.add(t, 0, 1);
		 }
	}
	
	
}

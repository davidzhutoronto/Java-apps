package workshop6.task1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Task1 extends Application{

	public static void main (String[] args){
		launch(args);
	}
	
	
	@Override public void start(Stage ps) throws Exception{
		GridPane gp = new GridPane();
		gp.setAlignment(Pos.CENTER);
		gp.setHgap(5);
		gp.setVgap(5);
		
		gp.add(new Label("What's the price of your car?"), 0, 0);
		TextField price = new TextField();
		gp.add(price, 1,0);
		
		gp.add(new Label("Your down payment: "), 0, 1);
		TextField dp = new TextField();
		gp.add(dp, 1,1);
		
		gp.add(new Label("Interest rate in % "), 0, 2);
		TextField interest = new TextField();
		gp.add(interest, 1,2);
		
		Button calculate = new Button("Calculate");
		gp.add(calculate, 1, 3);
		
		
		
		calculate.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				gp.getChildren().clear();
				int priceI = Integer.parseInt(price.getText());
				int dpI = Integer.parseInt(dp.getText());
				double interestD = Double.parseDouble(interest.getText());
				double payment = 0.0;
				double principle = priceI-dpI;
				double r = interestD/100/12;
				
				
				for(int i = 2; i < 6; i++) {
					
					payment = principle*(r*Math.pow((1+r),i*12))/(Math.pow((1+r),i*12)-1);
					gp.add(new Label("Monthly payment for " + i*12 + " months: " + String.format("%.2f",payment)), 0, i+4);	
				}			
			}
		});
		
		
		Scene sc = new Scene(gp,500,500);
		ps.setScene(sc);
		ps.show();
		
	}
	
	
}

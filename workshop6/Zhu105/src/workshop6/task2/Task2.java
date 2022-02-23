package workshop6.task2;

import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Task2 extends Application{


	
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage ps) throws Exception {
		
		//Generate a random number
		Random rand = new Random();
		int randNumber = rand.nextInt(1000-1)+1;
		System.out.println(randNumber);
		
		GridPane gp = new GridPane();
		gp.setAlignment(Pos.CENTER);
		gp.setHgap(5);
		gp.setVgap(5);
		
		
		gp.add(new Label("I have a number between 1 and 1000. Can you gusee my number? "), 0, 0);
		gp.add(new Label("Please enter your first guess"), 0, 1);
		
		TextField inputNumber = new TextField();
		inputNumber.setMaxWidth(50);
		gp.add(inputNumber, 0,2);
		Button btnGuess = new Button("Guess");
		gp.add(btnGuess, 0, 8);
		
		btnGuess.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				int inputInt = 0;
				Label hint = new Label("");
			
				if(gp.getChildren().size() >= 6) {
					gp.getChildren().remove(5);
				}
				if(gp.getChildren().size() >= 5) {
					gp.getChildren().remove(4);
				}
				
				inputInt = Integer.parseInt(inputNumber.getText());
				if(inputInt > randNumber) {
						
					gp.setStyle("-fx-background-color: red;");
					hint.setText("Too big");
					
				}else if (inputInt < randNumber) {
				
					gp.setStyle("-fx-background-color: blue;");
					hint.setText("Too small");
					
				}else if(inputInt == randNumber) {
					gp.setStyle("-fx-background-color: null;");
					inputNumber.setEditable(false);
					hint.setText("Correct! Well Done!");
					Button btnPlay = new Button("Play again");
					gp.add(btnPlay, 0, 9);
					
					btnPlay.setOnAction(e->{
						try {
							restart(ps);
						} catch (Exception e1) {
							
							e1.printStackTrace();
						}
					});		
				}
				gp.add(hint, 0,3);	
			}
			
		});
	
		Scene sc = new Scene(gp,400,400);
		ps.setTitle("Task 2 - Guess the Number");
		ps.setScene(sc);
		ps.show();
		
		
	}
	
	public void restart(Stage ps) throws Exception {
		
		start(ps);
	}

}


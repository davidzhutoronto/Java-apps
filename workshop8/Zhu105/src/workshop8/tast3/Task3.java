package workshop8.tast3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Task3 extends Application{

	
	public static void main (String[] args){
		launch(args);
	}
	
	public void start(Stage ps) throws Exception{
		
		Map<String, String> countryCapital = new HashMap<>();
		countryCapital.put("Afghanistan", "Kabul");
		countryCapital.put("Australia", "Canberra");
		countryCapital.put("Bangladesh", "Dhaka");
		countryCapital.put("Belgium", "Brussels");
		countryCapital.put("Brazil", "Brasilia");
		countryCapital.put("Canada", "Ottawa");
		countryCapital.put("China", "Beijing");
		countryCapital.put("Egypt", "Cairo");
		countryCapital.put("Finland", "Helsinki");
		countryCapital.put("France", "Paris");
		countryCapital.put("Germany", "Berlin");
		countryCapital.put("Greece", "Athens");
		countryCapital.put("Iceland", "Reykjavik");
		countryCapital.put("Iran", "Tehran");
		countryCapital.put("Ireland", "Dublin");
		countryCapital.put("Italy", "Rome");
		countryCapital.put("Jamaica", "Kingston");
		countryCapital.put("Japan", "Tokyo");
		countryCapital.put("Mexico", "Mexico City");
		countryCapital.put("New Zealand", "Wellington");
		countryCapital.put("Portugal", "Lisbon");
		countryCapital.put("Singapore", "Singapore");
		countryCapital.put("Spain", "Madrid");
		countryCapital.put("United Kingdom", "London");
		
		
		GridPane gp = new GridPane();
		gp.setAlignment(Pos.CENTER);
		gp.setHgap(5);
		gp.setVgap(10);
		
		gp.add(new Label("Enter a country: "), 0, 0);
		TextField textCountry = new TextField();
		gp.add(textCountry, 1,0);
		
		
		Button btnCapital = new Button("Capital");
		gp.add(btnCapital, 0, 1);
		
		
		Button btnExit = new Button("Exit");
		gp.add(btnExit, 1, 1);
	
		Label displayMsg = new Label("                                                  ");
		gp.add(displayMsg, 0, 3);
		
		
		//event handler for exit btn
		btnExit.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.exit(0);
			}
			});
		//event handler for country btn
		btnCapital.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				
					String country = textCountry.getText().toString();
					if(countryCapital.containsKey(country)) {
						displayMsg.setText("The capital of " + country + " is: " + countryCapital.get(country));
					}else {
						displayMsg.setText("Can not find " + country);
					}
				}
			});
		
		
		
		
		Scene sc = new Scene(gp,500,500);
		ps.setScene(sc);
		ps.show();	
		
		
		/*Scanner scan = new Scanner(System.in);
		System.out.print("Enter a country: ");
		String country = scan.nextLine();
		  if(countryCapital.containsKey(country)) {
			System.out.println("The capital of " + country + " is: " + countryCapital.get(country));
		}else {
			System.out.println("Can not find " + country);
		}*/
		
	}

}

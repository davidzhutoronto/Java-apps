package workshop7.task1;

import java.io.File;
import java.io.FileNotFoundException;
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


public class Task1 extends Application{

	
	public static void main (String[] args){
		launch(args);
	}
	
	public void start(Stage ps) throws Exception{
		GridPane gp = new GridPane();
		gp.setAlignment(Pos.CENTER);
		gp.setHgap(5);
		gp.setVgap(10);
		
		gp.add(new Label("Enter the Year(2009-2018): "), 0, 0);
		TextField year = new TextField();
		gp.add(year, 1,0);
		
		gp.add(new Label("Enter the Gender: "), 0, 1);
		TextField gender = new TextField();
		gp.add(gender, 1,1);
		
		gp.add(new Label("Enter the Name: "), 0, 2);
		TextField name = new TextField();
		gp.add(name, 1,2);
		
		Button submit = new Button("Submit");
		gp.add(submit, 1, 3);
		
		Button exit = new Button("Exit");
		gp.add(exit, 2, 3);
		
		Label displayFound = new Label("                                                          ");
		gp.add(displayFound, 0, 4);
		
		Label displayMsg = new Label("                                                          ");
		gp.add(displayMsg, 0, 5);
		
		
		Button yes = new Button("Yes");
		gp.add(yes, 1, 6);
		yes.setVisible(false);
		
		Button no = new Button("No");
		gp.add(no, 2, 6);
		no.setVisible(false);
		
		exit.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.exit(0);
			}
			});
		
		submit.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				
				submit.setVisible(false);
				exit.setVisible(false);
				File file = new File("babynamesranking" + Integer.parseInt(year.getText())+ ".txt");
		        if (!file.exists()) {
		            System.out.println("No record for " + Integer.parseInt(year.getText()));
		           
		            System.exit(1);
		        }

		        int rank = 0;
		        boolean found = false;
		        try {
		            Scanner read = new Scanner(file);
		            while (read.hasNext()&&!found) {

		                String s = read.nextLine();
		                String[] temp = s.split("\\s+");
	
		                if (gender.getText().toString().equalsIgnoreCase("M") && temp[1].equals(name.getText().toString())) {
		                
		                	rank = Integer.parseInt(temp[0]);
		                			
		                	 System.out.println("rank"+rank);
		                	 found = true;
		                }
		                   
		                
		                else if (gender.getText().toString().equalsIgnoreCase("F") && temp[3].equals(name.getText().toString())) {
		                	rank = Integer.parseInt(temp[0]);
		                	found = true;
		                }              	                   
		            }
		        } catch (FileNotFoundException e) {
		            e.printStackTrace();
		        }

		        if (rank == 0) {
		        	displayFound.setText("The name "+name.getText().toString()+" is not ranked in year " + Integer.parseInt(year.getText()));
		        	System.out.println("The name "+name.getText().toString()+" is not ranked in year " + Integer.parseInt(year.getText()));
		        	displayMsg.setText("Do you want to search for another name?");
		        	yes.setVisible(true);
		        	no.setVisible(true);
		        	no.setOnAction(new EventHandler<ActionEvent>() {

		    			@Override
		    			public void handle(ActionEvent arg0) {
		    				System.exit(0);
		    			}
		    			});
		        	
		        	yes.setOnAction(e->{
						try {
							restart(ps);
						} catch (Exception e1) {
							
							e1.printStackTrace();
						}
					});		
		        } else {
		        	displayFound.setText(name.getText().toString()+" is ranked #"+ rank +" in year "+ Integer.parseInt(year.getText()));
		            System.out.println(name.getText().toString()+" is ranked #"+ rank +" in year "+ Integer.parseInt(year.getText()));
		            displayMsg.setText("Do you want to search for another name?");
		            yes.setVisible(true);
		            no.setVisible(true);
		            
		            no.setOnAction(new EventHandler<ActionEvent>() {

		    			@Override
		    			public void handle(ActionEvent arg0) {
		    				System.exit(0);
		    			}
		    			});
		            
		            yes.setOnAction(e->{
						try {
							restart(ps);
						} catch (Exception e1) {
							
							e1.printStackTrace();
						}
					});		
		        }
			}
			
		});	
		
		Scene sc = new Scene(gp,500,500);
		ps.setScene(sc);
		ps.show();		
	}

	public void restart(Stage ps) throws Exception {	
		start(ps);
	}
	
}

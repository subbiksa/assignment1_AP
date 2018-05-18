package application;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AddProfile extends Application  {
	Statement myst=null;
	Connection mycon=null;
    Profile p=new Profile();
    
	public void start(Stage primaryStage) throws SQLException{
		Button addbt = new Button ("Add profile in Mininet");
		addbt.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
		
		try {
    	// 1.connection  to database
    	   mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/mininet?autoReconnect=true&useSSL=false","root","root"); 
    	// 2.creation of stats
    	   myst = mycon.createStatement(); 
    	// 3. execution of sql 
    	   myst.executeUpdate("INSERT INTO PROFILE " + 
                   "VALUES ('Richa','22','Student-RMIT University','ric.png')"); 
               
               mycon.close(); 
    	  /*String mysql = "insert into profile"+"(name,age,job,image)"+"values+('Subbi',23,'Manager-McDonalds','sushi.jpeg')";
    	// 4. Insert the string  
          myst.executeUpdate(mysql);*/
          System.out.println("New Profile Added to the Network!");
	}
      catch(Exception e) {
    	  e.printStackTrace();
      }
		
			}
		});
		VBox root= new VBox();
		root.getChildren().addAll(addbt);
		Scene scene = new Scene(root,500,500);
		primaryStage.setTitle("Mininet-Social Network");
		primaryStage.setScene(scene);
		primaryStage.show();
	
	}
}
	
	
	
	
	
	


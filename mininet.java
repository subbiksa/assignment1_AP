package application;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class mininet extends Application {
	public static void main(String args[]) {
        launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Button viewbt = new Button("View Profile");
		Button closebt = new Button("Close Application");
		closebt.setOnAction(e -> System.exit(0));
		viewbt.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.println("List of people on Mininet");
			}
		});
		VBox root= new VBox();
		root.getChildren().addAll(viewbt,closebt);
		Scene scene = new Scene(root,500,500);
		primaryStage.setTitle("Mininet-Social Network");
		primaryStage.setScene(scene);
		primaryStage.show();
	} 

}

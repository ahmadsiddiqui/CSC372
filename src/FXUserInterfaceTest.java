import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FXUserInterfaceTest extends Application {
	Scene scene = null;
	private String colorString = "-fx-background-color: #001100";
	
	@Override	
	public void start(Stage stage){
		stage.setTitle("Demonstration");
		//set up the buttons and other UI elements for the view
		Button b1 = new Button("Date and Time");
		Button b2 = new Button("Print to File");
		Button b3 = new Button("Change Color");
		Button b4 = new Button("Exit");
		
		TextField tf = new TextField();
		
		//Gridpane object is used to control the layout
		GridPane gp = new GridPane();
		gp.setHgap(10);
		gp.setVgap(10);
		Insets padding = new Insets (10,10,10,10);
		gp.setPadding(padding);
		
		//add the buttons to the grid
		gp.add(b1, 0, 0, 1, 1);
		gp.add(b2, 1, 0, 1, 1);
		gp.add(b3, 2, 0, 1, 1);
		gp.add(b4, 3, 0, 1, 1);
		gp.add(tf, 0, 1, 1, 1);
		
		//event handlers to perform the button actions
		EventHandler<ActionEvent> dateAndTime = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				tf.setText(java.time.LocalDateTime.now().toString());
			}
			
		};
		EventHandler<ActionEvent> writeToFile = new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				String text = tf.getText();
				try(FileWriter w = new FileWriter("out.txt")) {
					w.write(text);
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		};
		EventHandler<ActionEvent> changeColor = new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				Random r = new Random();
				colorString = "-fx-background-color: #00"
						+randomHexCode()
						+"00";
				System.out.println(colorString);
				gp.setStyle(colorString);
			}
		};
		EventHandler<ActionEvent> exit = new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				stage.close();
			}
		};
		
		//bind the event actions to the buttons	
		b1.setOnAction(dateAndTime);
		b2.setOnAction(writeToFile);
		b3.setOnAction(changeColor);
		b4.setOnAction(exit);
		
		//set the color to the gridpane, and add the gridpane to the scene
		gp.setStyle(colorString);
		scene = new Scene(gp,500,500);
		stage.setScene(scene);
		stage.show();
	}
	
	//helper function for randomizing the color of the window
	private String randomHexCode() {
		Random random = new Random();
		String s = (String.format("%02x",random.nextInt(256)));
		//System.out.println("S = " + s);
		return s;
	}
	
	//driver function
	public static void main(String[] args) {
		launch(args);
	}

}
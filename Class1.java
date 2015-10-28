import java.util.Random;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class runpath extends Application{

	public PathAlgorithm robotmove;
	private BorderPane g;
	

	public void start(Stage stage) throws Exception {


		//create a border pane that will include all the nodes and the maze
		g = new BorderPane();
		//create a game scene where the game will be displayed
		Scene game = new Scene(new PathAlgorithm());

		
		stage.setScene(game);
		stage.setResizable(false);
		stage.setTitle("Robot Simulation");
		stage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}

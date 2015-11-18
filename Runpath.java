import java.util.Random;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Description: Creates the GUI that will show a visual representation of our project
 */
public class Runpath extends Application{

	public PathAlgorithm robotmove;
	private BorderPane g;


	public void start(Stage stage) throws Exception {

		System.out.println("Starting!");

		/**
		 * Create a border pane that will include all the nodes and the maze
		 */
		//g = new BorderPane();
		/**
		 * Create a game scene where the game will be displayed
		 */
		Scene game = new Scene(new PathAlgorithm());


		stage.setScene(game);
		stage.setResizable(false);
		stage.setTitle("Robot Simulation");
		System.out.printf("Fun shiz: %.1f %.1f", game.getWidth(), game.getHeight());
		stage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}

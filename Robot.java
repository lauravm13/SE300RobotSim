

/**
 * @author mayorl, strelowa
 * @version 1.0
 * @created 07-Oct-2015 5:06:34 PM
 * Description: This class gets an image of the robot and displays it in a StackPane
 */
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;


public class Robot extends StackPane {

	public Robot(){
		//open the robot image
		ImageView robot = new ImageView(new Image("robotpic.jpg", 30,30 , false, true));
		//add the object to the pane
		getChildren().add(robot);
	}
}




/**
 * @author mayorl
 * @version 1.0
 * @created 07-Oct-2015 5:06:34 PM
 * Description: This class gets an image of the robot and displays it in a StackPane
 */
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;


public class People extends StackPane {

	public People(){
		//open the robot image
		ImageView person = new ImageView(new Image("personpic.jpg", 30,30, true, true));
		//add the object to the pane
		getChildren().add(person);
	}
}
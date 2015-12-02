
/**
 * @author mayorl
 * @version 1.0
 * @created 07-Oct-2015 5:06:34 PM
 * Description: This class gets an image of the robot and displays it in a StackPane
 */
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class People extends TileThing {

	public People(){
		//open the robot image
		ImageView person = new ImageView(new Image(IMG_DIR + "personpic.jpg", 30,30, true, true));
		//add the object to the pane
		getChildren().add(person);
	}
}
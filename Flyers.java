
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

/**
 * @author Laura Mayor
 * @version 1.0
 * created 11/8/2015
 * Description: This class will open up a flyer image and display it 
 */
public class Flyers extends StackPane{

	public Flyers(){
		//open up the flyer image
		ImageView flyer = new ImageView(new Image("Flyer.jpg", 30,30 , false, true));
		//add the flyer to the class
		getChildren().add(flyer);
		}
	}


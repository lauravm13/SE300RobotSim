import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * @author Hannah Theis
 * @version 1.0
 * created 11/8/2015
 * Description: As the robot interacts with people, it will hand them a flyer. 
 * Once it gives out a flyer, the robot will say a thank you message
 */
public class Flyers {

public Flyers(){
 
 
//must hold 16 flyers
for (int numFlyers = 16; numFlyers >=0; numFlyers--){
	
	ImageView flyer = new ImageView(new Image("Flyer.png", 25,25 , false, true));
	//the image needs to be added to a pane
	
 
 
 
//display number of flyers left
System.out.println("The number of flyers left is: " + numFlyers);
 
//when giving out flyers, says thank you message
System.out.println("Thank you for accepting this information about our programs! ");

}
}
}//end Flyers

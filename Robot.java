

/**
 * @author mayorl, strelowa
 * @version 1.0
 * @created 07-Oct-2015 5:06:34 PM
 * Description: The main focus of the project, this class creates the robot which uses the other classes
 * to define how it moves and interacts with its' surroundings.
 */
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Robot extends StackPane {

	public Robot(){


		Circle robot;


		/**
		 * create the object robot
		 */
		robot = new Circle(12.5);
		robot.setFill(Color.BLACK);
		getChildren().add(robot);
	}


}



/**
 * Define rules for how the robot will move and interact with people/obstacles
 */


/*public class Robot {

	public int Move;
	private double rx, ry;        // position
    private double vx, vy;        // velocity
    private final double radius;  // radius


	public Robot(){
		rx = 0.0;   //inititialze x position
        ry = 0.0;	//inititialze y position 
        vx     = 0.015 - Math.random() * 0.03;
        vy     = 0.015 - Math.random() * 0.03;
        radius = 0.025 + Math.random() * 0.05;

	}
	 // bounce off vertical wall by reflecting x-velocity
    private void bounceOffVerticalWall() {
        vx = -vx;
    }

    // bounce off horizontal wall by reflecting y-velocity
    private void bounceOffHorizontalWall() {
        vy = -vy;
    }
    public void move() {
        if (Math.abs(rx + vx) + radius > 1.0) bounceOffVerticalWall();
        if (Math.abs(ry + vy) + radius > 1.0) bounceOffHorizontalWall();
        rx = rx + vx;
        ry = ry + vy;
    }


	public void finalize() throws Throwable {

	}
	public int Move(){
		return 0;
	}
}//end Robot
 
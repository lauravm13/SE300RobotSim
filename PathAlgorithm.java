import java.util.Arrays;
import java.util.Random;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * @authors Laura Mayor & Adriana Strelow
 * @version 1.0
 * @created 07-Oct-2015 5:06:31 PM
 * Description: Algorithm the robot will utilize to determine its' path around each room
 */
public class PathAlgorithm extends GridPane{

	private BorderPane g;
	public Robot robot;
	public Circle obs;
	public Rectangle obsT;


	/**
	 *	Create a mock up of the room by creating an array, 
	 *	the 1's in the array represent sample obstacles
	 */	
	int[][] array = {{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	};

	/**
	 * Initial location of the robot
	 * @param locCol Defines robot's horizontal postion
	 * @param locRow Defines robot's vertical position
	 */
	int locCol = 9;
	int locRow = 1;

	public static final int SQUARESIZE = 25;


	/** 
	 *Create the obstacles
	 */
	Rectangle rectangle;

	public PathAlgorithm() {		


		/**
		 * Place a square where there is a 1 on the array
		 */

		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j]==0){
					rectangle = new Rectangle(SQUARESIZE, SQUARESIZE);
					//rectangle.setFill(Color.BLUE);
					add(rectangle,j,i);
				}
			}
		}
		
		//hardcode a number of obstacles (it will be provided by the user)
		//Number of people
		int NumPeople = 15; 
		//number of chairs
		//int NumChairs=10;
		//number of tables
		//int NumTables=10;
		
		int nObs = 0;
		//add the people to the room
		/*while(nObs < NumPeople){
		// get random location
			Random random = new Random();
			int RanRow = random.nextInt(20);
			int RanCol = random.nextInt(20);
			// if loc = 0 or empty, put a person there 
			if (array[RanRow][RanCol]==0){
				obs = new People(RanRow, RanCol);
				add(obs,RanCol,RanRow);
				//put a 2 in the array where the obstacle is 
				array[RanRow][RanCol]=2;
				obs.centerXProperty();
				obs.centerYProperty();
				//.add(Fruit);
				//nObs++;
			}
		}*/
		
	/*	//add the chair
		while(nObs < NumChairs){
			// get random location
				Random random = new Random();
				int RanRow = random.nextInt(20);
				int RanCol = random.nextInt(20);
				// if loc = 0 or empty, put a person there 
				if (array[RanRow][RanCol]==0){
					obs = new Chair(RanRow, RanCol);
					add(obs,RanCol,RanRow);
					//put a 1 in the array where the obstacle is 
					array[RanRow][RanCol]=1;
					obs.centerXProperty();
					obs.centerYProperty();
					//.add(Fruit);
					//nObs++;
				}
			}*/
			
		
	/*	while(0 < NumTables){
			// get random location
				Random random = new Random();
				int RanRow = random.nextInt(20);
				int RanCol = random.nextInt(20);
				// if loc = 0 or empty, put a person there 
				if (array[RanRow][RanCol]==0){
					obsT = new Table(RanRow, RanCol);
					add(obsT,RanCol,RanRow);
					//put a 2 in the array where the obstacle is 
					array[RanRow][RanCol]=2;
					//obsT.centerXProperty();
					//obsT.centerYProperty();
					//.add(Fruit);
					//nObs++;
				}
			}*/
			
		//print out array to check
		System.out.print(Arrays.deepToString(array));
		
		robot = new Robot();

		add(robot, locCol, locRow);

		/**
		 * algorithm for path finding:
		 *if number is 1 move up, if 2 move down, if 3 move left, and if 4 move right
		 */

		Timeline animation = new Timeline(
				new KeyFrame(Duration.millis(200),
						e -> moveRobot()));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();
		

	}
	/** 
	 *determine if person or obstacle
	 *if person, give flyer
	 *choose direction randomly (up, down, left, right) and move
	 */

	/**
	 * Move the player when down arrow is pressed
	 */
	public void movePlayerDown() {
		/**
		 * Check to see if the robot is on the edge
		 */

		if (locRow < array.length - 1){
			/**
			 * Check to see if the next position is blocked
			 */
			if (array[locRow+1][locCol]==0){
				locRow++;
				PathAlgorithm.setRowIndex(robot, locRow);
			}
		}
	}
	/**
	 * Move the player up arrow is pressed
	 */
	public void movePlayerUp() {
		/**
		 * Check to see if the robot is on the edge
		 */
		if (locRow > 1){
			/**
			 * Check to see if the next position is blocked
			 */
			if (array[locRow-1][locCol]==0){
				locRow--;
				PathAlgorithm.setRowIndex(robot, locRow);
			}
		}
	}
	/**
	 * Move the player when left arrow is pressed
	 */
	public void movePlayerLeft() {
		/**
		 * Check to see if the robot is on the edge
		 */
		if (locCol > 0){
			/**
			 * Check to see if the next position is blocked
			 */
			if (array[locRow][locCol-1]==0){
				locCol--;
				PathAlgorithm.setColumnIndex(robot, locCol);
			}
		}
	}

	/**
	 * More the player when right array is pressed
	 */
	public void movePlayerRight() {
		/**
		 * Check to see if the robot is on the edge
		 */
		if (locCol < array[1].length -1){
			/**
			 * Check to see if the next position is blocked
			 */
			if (array[locRow][locCol+1]==0){
				locCol++;
				PathAlgorithm.setColumnIndex(robot, locCol);
			}
		}
	}



	public void finalize() throws Throwable {

	}

	public void moveRobot(){
		/**
		 * Generate a random number to choose where the robot will be moving
		 * @param actmove
		 */
		Random movenum = new Random();
		int actmove = movenum.nextInt(4) + 1;
		//System.out.println(actmove);


		/**
		 * Switch to make the robot move automatically
		 */

		switch(actmove){
		case 1:
			movePlayerUp();
			break;
		case 2:
			movePlayerDown();
			break;
		case 3:
			movePlayerLeft();
			break;
		case 4:
			movePlayerRight();
			break;
		default:
			break;
		}

	}

}//end PathAlgorithm
 
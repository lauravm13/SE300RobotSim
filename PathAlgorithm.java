import java.util.Random;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * @author mayorl
 * @version 1.0
 * @created 07-Oct-2015 5:06:31 PM
 */
public class PathAlgorithm extends GridPane{

	private BorderPane g;
	public Robot robot;


	//create a mock up of the room by creating an array 
	//the 1 in the array represent sample obstacles
	int[][] array = {{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0},
			{0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0},
			{0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0},
			{0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0},
			{0,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	};

	// robot location
	int locCol = 9;
	int locRow = 1;

	public static final int SQUARESIZE = 25;


	//create the obstacles 

	Rectangle rectangle;

	public PathAlgorithm() {		


		//place a square where there is a 1 on the array
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j]==0){
					rectangle = new Rectangle(SQUARESIZE, SQUARESIZE);
					rectangle.setFill(Color.BLUE);
					add(rectangle,j,i);
				}
			}
		}


		robot = new Robot();

		add(robot, locCol, locRow);

		//if number is 1 move up, if 2 move down, if 3 move left, and if 4 move right

	/*	//generate a random number to choose where the robot will be moving
		Random movenum = new Random();
		int actmove = movenum.nextInt(4) + 1;
		System.out.println(actmove);


		//make the robot move automatically

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

		//algorithm for path finding


	}
	//if there is obstacle
	//determine if person or chair/table
	//if person, give flyer
	//choice direction randomly (up, down, left, right) and move

	//move the player when down arrow is pressed
	public void movePlayerDown() {
		// Check to see if it's on the edge
		if (locRow < array.length - 1){
			// Check to see if the next position is blocked
			if (array[locRow+1][locCol]!=0){
				locRow++;
				PathAlgorithm.setRowIndex(robot, locRow);
			}
		}
	}
	//move the player up arrow is pressed
	public void movePlayerUp() {
		// Check to see if it's on the edge
		if (locRow > 0){
			// Check to see if the next position is blocked
			if (array[locRow-1][locCol]!=0){
				locRow--;
				PathAlgorithm.setRowIndex(robot, locRow);
			}
		}
	}
	//move the player when left arrow is pressed
	public void movePlayerLeft() {
		// Check to see if it's on the edge
		if (locCol > 0){
			// Check to see if the next position is blocked
			if (array[locRow][locCol-1]!=0){
				locCol--;
				PathAlgorithm.setColumnIndex(robot, locCol);
			}
		}
	}

	//more the player when right array is pressed
	public void movePlayerRight() {
		// Check to see if it's on the edge
		if (locCol < array[1].length -1){
			// Check to see if the next position is blocked
			if (array[locRow][locCol+1]!=0){
				locCol++;
				PathAlgorithm.setColumnIndex(robot, locCol);
			}
		}
	}*/



	public void finalize() throws Throwable {

	}

}//end PathAlgorithm
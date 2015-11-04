import java.util.Random;

/**
 * @author Dan
 * @version 1.0
 * @created 07-Oct-2015 5:06:30 PM
 * Description: Obstacles class containing the three obstacles.
 */
//public class Obstacles {
	/**
	 * This method creates the x and y coordinates for obstacles to be placed
	 * @param X Creates the x coordinate
	 * @param Y Creates the y coordinate
	 */

/*	//private int Position X;
	//private int Position Y;

	public Obstacles(){

		*//**
		 *	First obstacle  
		 *//*
		//door[][] = new Obstacles[1][2];

		*//**
		 *	Second obstacle  
		 *//*		
		//chair[][] = new Obstacles[2][2];

		*//**
		 *	Third obstacle  
		 *//*
		//table[][] = new Obstacles[3][2];



	}
	*//**
	 *	Method that will place the obstacles in various locations  
	 *@param x First int value
	 *@param y Second int value
	 *//*
	//public int position (int x = Position X, int y = Position Y){

	//}

	public void finalize() throws Throwable {

	}
}//end Obstacles*/
	
	
	/*//code to get the obstacles to generate in random places within the array and give back the location
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
	};	*/
	
	

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

//this class create a circle that will be each fruit with a specified size and color
public class Obstacles extends Circle {

	@SuppressWarnings("unused")
	private final int row;
	@SuppressWarnings("unused")
	private final int col;
	
	//set each fruit to a radius of 7.5 and red
	public Obstacles(int row, int col){
		super(7.5);
		setFill(Color.RED);
		this.row = row;
		this.col = col;
	}
	/*//hardcode a number of obstacles (it will be provided by the user)
	public int NumObstacles = 10; 
	
	int nObs = 0;
	while(nObs < NumObstacles){
	// get random location
		Random random = new Random();
		int RanRow = random.nextInt(20);
		int RanCol = random.nextInt(20);
		// if loc = 0, put a fruit there and increment nFruit
		if (array[RanRow][RanCol]==0){
			obsta = new Fr(RanRow, RanCol);
			add(fruit,RanCol,RanRow);
			fruit.centerXProperty();
			fruit.centerYProperty();
			//.add(Fruit);
			nFruit++;*/
}
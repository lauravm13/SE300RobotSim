
import java.util.Random;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * @author mayorl
 * @version 1.0
 * @created 07-Oct-2015 5:06:31 PM
 */
public class PathAlgorithm extends GridPane{
	
private BorderPane g;
	
	public void start(Stage stage) throws Exception {

		
		//create a border pane that will include all the nodes and the maze
		g = new BorderPane();
		//create a game scene where the game will be displayed
		Scene game = new Scene(g);
	
	
	stage.setScene(game);
	stage.show();
	
	 
	    }
	
	
	
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
	
						 
		
		public static final int SQUARESIZE = 25;
		//create the object robot
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
			
		}
			
			//generate a random number to choose where the robot will be moving
			//Random movenum = new Random();
			//int actmove = movenum.nextInt(4) + 1;
			//System.out.println(actmove);
			
			//if number is 1 move up, if 2 move down, if 3 move left, and if 4 move right
			
		//make the robot move automatically
			/*
			switch(actmove){
			case 1:
				mazePane.movePlayerUp();
				break;
			case 2:
				mazePane.movePlayerDown();
				break;
			case 3:
				mazePane.movePlayerLeft();
				break;
			case 4:
				mazePane.movePlayerRight();
				break;
			default:
				break;
			}*/
			
		//algorithm for path finding
			//if there is obstacle
			//determine if person or chair/table
				//if person, give flyer
			//choice direction randomly (up, down, left, right) and move
		public static void main(String[] args) {
	      
	    }
	
	

	public void finalize() throws Throwable {

	}
	
}//end PathAlgorithm
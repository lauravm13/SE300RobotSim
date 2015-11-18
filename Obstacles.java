

/**
 * @author Daniel D.
 * @version 32.47
 * @created 07-Oct-2015 5:06:30 PM
 */



// All dimensions are referencing an "X" x "Y" coordinate array
/* Method List:
 * -addHorizDoorToArray
 * -addVerticDoorToArray
 * -addCOBTableToArray
 * -addTableToArray
 * -addChairToArray
 * -addPersonToArray
 * -addHallwayWallHoriz
 * -addWallHorizontal
 * -addWallVertical
 * 
*/


public class Obstacles {
	

	// Method that adds door to array ( 2 x 1)
	public static void addHorizDoorToArray(int countx, int county, int[][] array){ // changes the values of the array to be either 1 x 2 or 2 x 1. the value of a door is "4".
		array[countx][county] = 4;
		array[countx + 1][county] = 4;
		// change value of next arrays "x" space to 4,change array space 1 below "x" space to 4.


	}
	// Method that adds door to array ( 1 x 2)
	public static void addVerticDoorToArray(int countx, int county, int[][] array){ // changes the values of the array to be either 1 x 2 or 2 x 1. the value of a door is "4".
		array[countx][county] = 4;
		array[countx + 1][county] = 4;

	}
	// Method adds A COB sized Table to array ( 4 x 2 )
	public static void addCOBTableToArray(int countX, int countY, int[][] array){ // method for adding a table in the COB, the value for a table is 2. size = 2 x 4
		array[countX][countY] = 2;
		array[countX + 1][countY] = 2;
		array[countX + 2][countY] = 2;
		array[countX + 3][countY] = 2;
		array[countX][countY + 1] = 2;
		array[countX + 1][countY + 1] = 2;
		array[countX + 2][countY + 1] = 2;
		array[countX + 3][countY + 1] = 2;
		
	}
	// Method add a normal table to array ( 2 x 2)
	public static void addTableToArray(int countX, int countY, int[][] array){
		
		
	}
	
	// Method for adding chair to array ( 1 x 1 )
	public static void addChairToArray(int countX, int countY, int[][] array){ 
		array[countX][countY] = 3;
	
	}
	
	public static void addPersonToArray(int countX, int countY, int[][] array){ // a person has a vlaue of 5, is has a size of 1 x 1
		array[countX][countY] = 5;
	}
	public static void addHallwayWallHoriz(int countX, int countY, int[][] array){ // The value of a wall is 1, the size of one is 7 x 20
		
		for(int i = 0; i < array[1].length; i++  ){
			
		array[countX][countY] = 1; // x space 1
		array[countX + 1][countY] = 1;
		array[countX + 2][countY] = 1;
		array[countX + 3][countY] = 1;
		array[countX + 4][countY] = 1;
		array[countX + 5][countY] = 1;
		array[countX + 6][countY] = 1;
		}
		// x space 7
		}
		//reiterate this block per the numer of the y dimersion size of the array
		
	// Method for placing A Horizontal Normall Wall	
	public static void addWallHorizontal(int countX, int countY, int[][] array){
		
		
	}
	
	// Method for placing A Vertical Normall Wall
	public static void addWallVertical(int countX, int countY, int[][] array){
		
		
	}
	
	

		// take array and scan for boundaries, if object lies outside of boundaries scan for new position.
		// if object falls within boundaries set array values starting from the top left corner, change to the value of that obejct. 

	public void finalize() throws Throwable {

	}
}//end Obstacles
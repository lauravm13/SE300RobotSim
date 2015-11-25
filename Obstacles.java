
/**
 * @author Daniel DeQuarto
 * @version Final
 * @created 07-Oct-2015 5:06:30 PM
 * Lasted edited: 11-11
 */

/*
 * Legend:
 * All dimensions are referencing an "X" x "Y" coordinate array
 * Method List:               VALUE on array        What obstacle?
 * -addHorizDoorToArray         1                   Horizontal Door ( 2 x 1 ) 
 * -addVerticDoorToArray        2                   Vertical Door ( 1 x 2 )
 * -addCOBTableToArray          3                   COB125 sized Table ( 4 x 2 )      
 * -addTableToArray             4                   Regular sized table ( 2 x 2 )  
 * -addChairToArray             5                   Normal sized chair ( 1 x 1 )    
 * -addPersonToArray            6                   Person ( 1 x 1 )    red circle
 * -addHallwayWallHoriz         7                   Horizontal Hallway Wall ( 4 x UserInput )    
 * -addWallHorizontal           8                   Normal Horizontal Wall ( 2 x UserInput)      
 * -addWallVertical             8                   Normal Vertical Wall ( 2 x UserInput )       
 * 
 */

public class Obstacles {
	
	/** Represents a person in the Obstacle array */
	public static final int COBTABLE = 3;
	public static final int TABLE = 4;
	public static final int CHAIR = 5;
	public static final int PERSON = 6;
	public static final int WALL = 8;

	// Method that adds door to array ( 2 x 1 )    Value is   "1"
	public static boolean addHorizDoorToArray(int countx, int county, int[][] array){ 
		return addObstacle(county, countx, array, 1, 2, 1);
	}
	
	// Method that adds door to array ( 1 x 2)     Value is     " 2 "
	public static boolean addVerticDoorToArray(int countx, int county, int[][] array){ 
		return addObstacle(countx, county, array, 2, 1, 2);
	}
	
	// Method that adds a COB sized table to array ( 4 x 2 )  Value is   " 3 "
	public static boolean addCOBTableToArray(int countX, int countY, int[][] array){
		return addObstacle(countX, countY, array, COBTABLE, 4, 2);
	}

	// Method add a normal table to array ( 2 x 2)     Value   is " 4 "
	/**
	 * @return true if successful; false otherwise
	 */
	public static boolean addTableToArray(int countX, int countY, int[][] array){
		return addObstacle(countX, countY, array, TABLE, 2, 2);
	}	

	// Method for adding chair to array ( 1 x 1 )  Value is " 5 "
	public static boolean addChairToArray(int countX, int countY, int[][] array){ 
		return addObstacle(countX, countY, array, CHAIR, 1, 1);
	}
	
	// Method for adding a person to the array, is has a size of 1 x 1     Value is "6"
	public static boolean addPersonToArray(int countX, int countY, int[][] array){ 
		return addObstacle(countX, countY, array, PERSON, 1, 1);
	}

	// Method for adding a Horizontal Hallway wall    Value is " 7 "
	public static boolean addHallwayWallHoriz(int countX, int countY, int[][] array){ // The value of a wall is 1, the size of one is 4 x UserInput
		return addObstacle(countX, countY, array, 7, array.length, 1);
	}

	// Method for placing A Horizontal Normal Wall	    Value is " 8 "
	public static boolean addWallHorizontal(int countX, int countY, int[][] array){
		return addObstacle(countX, countY, array, WALL, array.length - 1 - countY, 1);
	}

	// Method for placing A Vertical Normal Wall   Vale is " 8 "
	public static boolean addWallVertical(int countX, int countY, int[][] array){
		return addObstacle(countX, countY, array, WALL, 1, array.length - countX);		
	}

	private static boolean addObstacle(int countX, int countY, int[][] array, int obstacleValue,
			int obstHeight, int obstWidth){
		
		try{
		// See if table area is empty
		int sum = 0;
		for( int lol = 0 ; lol < obstWidth ; lol++){
			for(int rotfl = 0; rotfl < obstHeight ; rotfl++){
				sum += array[countX + lol][countY + rotfl]; 
			}
		}
		if (sum > 0){
			return false;
		}
		
		// Place values on the array
		for( int lol = 0 ; lol < obstWidth ; lol++){
			for(int rotfl = 0; rotfl < obstHeight ; rotfl++){
				array[countX + lol][countY + rotfl] = obstacleValue; 
			}
		}
		return true;
		} catch(ArrayIndexOutOfBoundsException e){
			return false;
		}
	}
	
	public void finalize() throws Throwable {

	}
}//end Obstacles
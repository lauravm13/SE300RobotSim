/*package App;
import App.PathAlgorithim;
import java.util.Random;

*//**
 * @author Daniel D. & Nick H.
 * @version 1.0
 * @created 07-Oct-2015 5:06:35 PM
 * Description: Creates the various rooms the actual robot would be used in for demonstation
 *//*
public class Room {
	int userinputX = 20; // change to 0 when implemantation is done
	int userinputY = 20; 
	*//**
	 * Creates the room objects
	 *//*
	public static void main(String[] args) { //Temporary main method for running
		COB125();
		//Atrium;
		//Hallway();
	}


	*//**
	 * Add borders/dimensions to each room
	 * @param COB125
	 * @return Displays the array using COB125's dimensions/obstacles
	 *//*
	public static void COB125(){ //  addd inputs here when ready

		int userinputX = 20; // get rid of when implemantation is done
		int userinputY = 20; 
		int numberOfTables = 8; // all are user inputs
		int numberOfChairs = 4;
		int numberOfPeople = 10;


		//random number betweem 1 and 10 of people
		// random number between 1 5 chairs
		// 8 long tables in cob 125
		int[][] COB125 =  new Array[userinputX][userinputY]
				int arrayFlag = 0;
		int i = 0;
		int k = 0;
		int randomX;
		int randomY;
		int cobTableX, cobTableY;
		int totalArraySpaces = userinputX * userinputY;
		int Flag = totalArraySpaces + 1;
		// runs throuigh the array and places obstacles randomly
		while(arrayFlag < totalArraySpaces){
			randomX = randomGenerator.nextInt(userinputX);
			randomY = randomGenerator.nextInt(userinputY);

			while(i < userinputX + 1){
				while(k < userinputY + 1){


					// mod have a random x varaible and random y varaible replace thise varraible with x adn y in the if statement
					/// random will be done gen a number wiht in the size of the array for x and y, if x is for isntance > (userinputx - 4)(x dimension of cob stable) for a cob table call the random function again(while loop)
					if((i == 0 && k == 0) && Array[i][k] == 0){ // Place door in top left
						Array[i][k]= Obstacles.addVerticDoorToArray();
					}
					if( (randomX < userinputX - 4 && randomY < userinputY - 2) && Array[i][k] == 0){ // place cobtable randmly in array      this needs to changed to fit the teh array,the value is changing ht ecurrent possition not 
						Array[i][k] = Obstacles.addCOBTableToArray();
					}

					// add vertical door to top left of
					k++;
				}
				i++;
			}
			arrayFlag == Flag;
		}


		for (int[] is : COB125) {
			for (int i : is) {
				System.out.print(i + ", ");
			}
			System.out.println(""); // instead of printng add an action even for gui here to change color of a block.
		}
	}
	// random number between 1 & userinputx and vice versa. place a person there, make a person varaible that is inputed from user, subtract 1 everytime a value is changed. when value is equal to 1. stop for loop. place a person there.

	*//**
	 * Add borders/dimensions to each room
	 * @param Atrium
	 * @return Displays the array using the Atrium's dimensions/obstacles
	 *//*
	public static void Atrium(){ //  Method that mods array to fit dimensions of the Lehman Building Atrium.
		PathAlgorithim Path2 = new PathAlgorithim();
		int[][] Atrium = Path2.returnArray();
		for (int[] is : Atrium){
			for(int i : is) {
				System.out.print(i + ",");
			}
			System.out.println("");
		}
		// THERE ARE NO TABLES IN THE ATRIUM or doors , just walls
	}

	*//**
	 * Add borders/dimensions to each room
	 * @param Hallway
	 * @return Displays the array using the Hallway's dimensions/obstacles
	 *//*
	public static void Hallway(){ //  Method that mods array to fit dimensions of a Hallway.
		PathAlgorithim Path3 = new PathAlgorithim();
		int[][] Hallway = Path3.returnArray();

		Obstacles.addHallwayWallHoriz(0, 0, Hallway);
		for (int[] is : Hallway){
			for(int i : is) {
				System.out.print(i + ",");
			}
			System.out.println("");
		}
		// There are just walls in the hallway
	}


	// make all these methods,each method will modify the path algorthims array, such as 0 would be the wall and the actual building,
	// while 1's would be a position the robot could travel, and 2's,3's,4's could be the actaul obstacles that the robot could not move to. and the 
	// robot would be the value 5. 

	public void finalize() throws Throwable {
	}

}//end Room*/
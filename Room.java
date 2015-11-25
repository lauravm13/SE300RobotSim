import java.util.Random;

/**
 * @author Daniel DeQuarto
 * @version 1.0
 * @created 07-Oct-2015 5:06:35 PM
 * Description: Creates the various rooms the actual robot would be used in for demonstration
 */
public class Room {

	// Random Coordinates
	static int randomX = 0;
	static int randomY = 0;

	static Random randomGenerator = new Random();
	
	// Method for crating the COB 125
	public static int[][] COB125(int x, int y, int obsC, int obsT, int people){

		int userinputX = x;
		int userinputY = y; 
		int numberOfTables = obsT; // all are user inputs
		int numberOfChairs = obsC;
		int numberOfPeople = people;

		// Create Specific Room Array based on User inputs
		int[][] COB125 =  new int[userinputX][userinputY];

		// Loop for placing Door on array
		// By using a loop instead of using numbers in place for i and k when referencing the COB125 array, multiple doors can be placed in need be.
		Obstacles.addVerticDoorToArray(0, 0, COB125);

		Obstacles.addWallVertical(2, 0, COB125);					// Left wall
		Obstacles.addWallVertical(0, userinputY - 1, COB125);		// Right
		Obstacles.addWallHorizontal(0, 1, COB125);					// Top
		Obstacles.addWallHorizontal(userinputX - 1, 1, COB125);		// Bottom

		// Loop for placing table
		int tableCounter = 0;
		while(tableCounter < numberOfTables){
			// Generate 2 random numbers to form random coordinate
			randomX = randomGenerator.nextInt(userinputX);
			randomY = randomGenerator.nextInt(userinputY);
			// while loop insures that the randoms leave enough room to place table..
			while(randomX > userinputX - 4 || randomY > userinputY - 1){
				randomX = randomGenerator.nextInt(userinputX);
				randomY = randomGenerator.nextInt(userinputY);
			}
			Obstacles.addCOBTableToArray(randomX ,randomY, COB125);
			tableCounter++;
		}

		// Loop for placing a certain number of chairs on the array
		int chairCounter = 0;
		while(chairCounter < numberOfChairs){
			// Generate 2 random numbers to form random coordinate
			randomX = randomGenerator.nextInt(userinputX);
			randomY = randomGenerator.nextInt(userinputY);
			Obstacles.addChairToArray(randomX ,randomY, COB125);
			chairCounter++;
		}

		// Loop for placing People on Array
		int peopleCounter = 0;
		while(peopleCounter < numberOfPeople){
			// Generate 2 random numbers to form random coordinate
			randomX = randomGenerator.nextInt(userinputX);
			randomY = randomGenerator.nextInt(userinputY);
			// Place people
			Obstacles.addPersonToArray(randomX ,randomY, COB125);
			peopleCounter++;
		}

		for (int[] is : COB125) {
			for (int i : is) {
				System.out.print(i + ", ");
			}
			System.out.println(""); // instead of printng add an action even for gui here to change color of a block.
		}

		return COB125;
	}
	//  Method for creating the Atrium
	public static int[][] Atrium(int x, int y, int obsC, int obsT, int people){ 
		
		int userinputX = x;
		int userinputY = y; 
		int numberOfTables = obsT; // all are user inputs
		int numberOfChairs = obsC;
		int numberOfPeople = people;
		// Creates main array
		int[][] Atrium =  new int[userinputX][userinputY];

		Obstacles.addWallHorizontal(0, 0, Atrium);

		Obstacles.addWallVertical(userinputX - 1, 0, Atrium);

		// Loop for placing table
		int tableCounter = 0;
		while(tableCounter < numberOfTables){
			// Generate 2 random numbers to form random coordinate
			randomX = randomGenerator.nextInt(userinputX);
			randomY = randomGenerator.nextInt(userinputY);
			// while loop insures that the randoms leave enough room to place table..
			while(randomX > userinputX - 2 || randomY > userinputY - 1){
				randomX = randomGenerator.nextInt(userinputX);
				randomY = randomGenerator.nextInt(userinputY);
			}
			if(Obstacles.addTableToArray(randomX, randomY, Atrium)){ // make sure random is one less than the maximum
				tableCounter++;
			}
		}

		// Loop for placing a certain number of chairs on the array
		int chairCounter = 0;
		while(chairCounter < numberOfChairs){
			// Generate 2 random numbers to form random coordinate
			randomX = randomGenerator.nextInt(userinputX);
			randomY = randomGenerator.nextInt(userinputY);
			if(Obstacles.addChairToArray(randomX, randomY, Atrium)){ // make sure random is one less than the maximum
				chairCounter++;
			}
		}

		for (int[] is : Atrium){
			for(int i : is) {
				System.out.print(i + ",");
			}
			System.out.println("");
		}
		// THERE ARE NO TABLES IN THE ATRIUM or doors , just walls
		
		return Atrium;
	}
	// Method for creating the Hallway
	//  Method that mods array to fit dimensions of a Hallway.
	public static int[][] Hallway(int x, int y, int obsC, int obsT, int people){ 
		
		int userinputX = x;
		int userinputY = y; 
		int numberOfTables = obsT; // all are user inputs
		int numberOfChairs = obsC;
		int numberOfPeople = people;
		
		int[][] Hallway =  new int[userinputX][userinputY];

		Obstacles.addHallwayWallHoriz(0, 0, Hallway);
		Obstacles.addHallwayWallHoriz(Hallway.length - 1, 0, Hallway);

		// Loop for placing table
		int tableCounter = 0;
		while(tableCounter < numberOfTables){
			// Generate 2 random numbers to form random coordinate
			randomX = randomGenerator.nextInt(userinputX);
			randomY = randomGenerator.nextInt(userinputY);
			// while loop insures that the randoms leave enough room to place table..
			while(randomX > userinputX - 2 || randomY > userinputY - 1){
				randomX = randomGenerator.nextInt(userinputX);
				randomY = randomGenerator.nextInt(userinputY);
			}
			if(Obstacles.addChairToArray(randomX, randomY, Hallway)){ // make sure random is one less than the maximum
				tableCounter++;
			}
		}

		// Loop for placing a certain number of chairs on the array
		int chairCounter = 0;
		while(chairCounter < numberOfChairs){
			// Generate 2 random numbers to form random coordinate
			randomX = randomGenerator.nextInt(userinputX);
			randomY = randomGenerator.nextInt(userinputY);
			if(Obstacles.addChairToArray(randomX, randomY, Hallway)){ // make sure random is one less than the maximum
				chairCounter++;
			}
		}

		// Loop for placing People on Array
		int peopleCounter = 0;
		while(peopleCounter < numberOfPeople){
			// Generate 2 random numbers to form random coordinate
			randomX = randomGenerator.nextInt(userinputX);
			randomY = randomGenerator.nextInt(userinputY);
			// Place people
			if(Obstacles.addChairToArray(randomX, randomY, Hallway)){ // make sure random is one less than the maximum
				peopleCounter++;
			}
		}


		for (int[] is : Hallway){
			for(int i : is) {
				System.out.print(i + ",");
			}
			System.out.println("");
		}
		
		return Hallway;
	}

	public void finalize() throws Throwable {
	}

}//end Room
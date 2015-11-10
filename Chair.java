

/**
 * @author mayorl
 * @version 1.0
 * @created 07-Oct-2015 5:06:21 PM
 * Description: Obstacle that the robot must avoid
 */
/*public class Chair extends Obstacles {

	public Chair(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end Chair*/

import javafx.scene.paint.Color;
		import javafx.scene.shape.Circle;

		//this class create a circle that will be each fruit with a specified size and color
		public class Chair extends Circle {

			@SuppressWarnings("unused")
			private final int row;
			@SuppressWarnings("unused")
			private final int col;
			
			//set each fruit to a radius of 7.5 and red
			public Chair(int row, int col){
				super(10);
				setFill(Color.BROWN);
				this.row = row;
				this.col = col;
			}
	

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end People
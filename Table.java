

/**
 * @author mayorl
 * @version 1.0
 * @created 07-Oct-2015 5:06:39 PM
 * Description: Obstacle that the robot must avoid.
 */
/*public class Table extends Obstacles {

	public Table(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end Table*/

import javafx.scene.paint.Color;
		import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

		//this class create a circle that will be each fruit with a specified size and color
		public class Table extends Rectangle {

			@SuppressWarnings("unused")
			private final int row;
			@SuppressWarnings("unused")
			private final int col;
			
			//set each fruit to a radius of 7.5 and red
			public Table(int row, int col){
				super(10,5);
				setFill(Color.BROWN);
				this.row = row;
				this.col = col;
			}
	

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end People
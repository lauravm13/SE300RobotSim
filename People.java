

/**
 * @author mayorl
 * @version 1.0
 * @created 07-Oct-2015 5:06:33 PM
 * Description: People class used to represent the visitors that the robot will interact with,
 * hand flyers to and play messages for.
 */
//public class People extends Obstacles {

//	public People(){

		
		import javafx.scene.paint.Color;
		import javafx.scene.shape.Circle;

		//this class create a circle that will be each fruit with a specified size and color
		public class People extends Circle {

			@SuppressWarnings("unused")
			private final int row;
			@SuppressWarnings("unused")
			private final int col;
			
			//set each fruit to a radius of 7.5 and red
			public People(int row, int col){
				super(7.5);
				setFill(Color.RED);
				this.row = row;
				this.col = col;
			}
	

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end People
 
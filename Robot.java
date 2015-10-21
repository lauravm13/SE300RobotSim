

/**
 * @author mayorl, strelowa
 * @version 1.0
 * @created 07-Oct-2015 5:06:34 PM
 */
public class Robot {

	public int Move;
	private double rx, ry;        // position
    private double vx, vy;        // velocity
    private final double radius;  // radius


	public Robot(){
		rx = 0.0;   //inititialze x position
        ry = 0.0;	//inititialze y position 
        vx     = 0.015 - Math.random() * 0.03;
        vy     = 0.015 - Math.random() * 0.03;
        radius = 0.025 + Math.random() * 0.05;

	}
	 // bounce of vertical wall by reflecting x-velocity
    private void bounceOffVerticalWall() {
        vx = -vx;
    }

    // bounce of horizontal wall by reflecting y-velocity
    private void bounceOffHorizontalWall() {
        vy = -vy;
    }
    public void move() {
        if (Math.abs(rx + vx) + radius > 1.0) bounceOffVerticalWall();
        if (Math.abs(ry + vy) + radius > 1.0) bounceOffHorizontalWall();
        rx = rx + vx;
        ry = ry + vy;
    }


	public void finalize() throws Throwable {

	}
	public int Move(){
		return 0;
	}
}//end Robot

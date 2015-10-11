

/**
 * @author mayorl
 * @version 1.0
 * @created 07-Oct-2015 5:06:37 PM
 */
public class SE300RobotProject extends Class1 {

	public Flyers m_Flyers;
	public Audio m_Audio;
	public PathAlgorithm m_PathAlgorithm;
	public Room m_Room;
	public Robot m_Robot;

	public SE300RobotProject(){
		
		//here we create all of the panes for the gui 
		
		//panes for the home menu
		//this is the container pane that will pull in all the other panes for the home menu
		VBox homemenu = new VBox() ; 
		//this is the pane that will hold the title 
		VBox homemenu_titles = new VBox() ; 
		//this is the pane that will hold the buttons that will let the user choose which sim they run 
		HBox homemenu_simButtons = new HBox() ; 
		//this is the pane that holds the about button and the questions/how to button 
		HBox homemenu_information = new HBox() ; 
		
		//panes for the lehman atrium sim 
		//this is the container pane that will pull in all the other panes for the lehman atrium sim 
		VBox lehmanAtriumSim = new VBox() ;
		//This is the pane that will hold the titles 
		VBox lehmanAtriumSim_titles = new VBox() ; 
		//this is the pane that will hold lehmanAtriumSim_simulation and lehmanAtriumSim_userInput 
		HBox lehmanAtriumSim_content = new HBox() ; 
		//This is the pane that will hold the actual simulation that the user will watch 
		VBox lehmanAtriumSim_simulation = new VBox() ; 
		//this is the pane that will hold the user inputs and the run button 
		VBox lehmanAtriumSim_userInput = new VBox() ; 
		//this is the pane that will hold the back button, the about button, and the how to button
		HBox lehmanAtriumSim_information = new HBox() ; 
		
		//panes for the ecsse hallway sim
		//this is the container pane that will pull in all the other panes for the ecsse hallway sim
		VBox ecsseHallwaySim = new VBox() ;
		//This is the pane that will hold the titles 
		VBox ecsseHallwaySim_titles = new VBox() ; 
		//this is the pane that will hold ecsseHallwaySim_simulation and ecsseHallwaySim_userInput 
		HBox ecsseHallwaySim_content = new HBox() ; 
		//This is the pane that will hold the actual simulation that the user will watch 
		VBox ecsseHallwaySim_simulation = new VBox() ; 
		//this is the pane that will hold the user inputs and the run button 
		VBox ecsseHallwaySim_userInput = new VBox() ; 
		//this is the pane that will hold the back button, the about button, and the how to button
		HBox ecsseHallwaySim_information = new HBox() ; 
		
		//panes for the cob room sim 
		//this is the container pane that will pull in all the other panes for the cob room sim 
		VBox cob125Sim = new VBox() ;
		//This is the pane that will hold the titles 
		VBox cob125Sim_titles = new VBox() ; 
		//this is the pane that will hold lehmanAtriumSim_simulation and lehmanAtriumSim_userInput 
		HBox cob125Sim_content = new HBox() ; 
		//This is the pane that will hold the actual simulation that the user will watch 
		VBox cob125Sim_simulation = new VBox() ; 
		//this is the pane that will hold the user inputs and the run button 
		VBox cob125Sim_userInput = new VBox() ; 
		//this is the pane that will hold the back button, the about button, and the how to button
		HBox cob125Sim_information = new HBox() ; 

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end SE300RobotProject
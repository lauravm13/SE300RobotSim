import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author mayorl
 * @version 1.0
 * @created 07-Oct-2015 5:06:37 PM
 */
public class SE300RobotProject extends Application {

	public Flyers m_Flyers;
	public Audio m_Audio;
	public PathAlgorithm m_PathAlgorithm;
	public Room m_Room;
	public Robot m_Robot;
	
	
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
	
	//create all of the text for the gui 
	//text for the home menu
	//this is the title for the home menu 
	Text homemenu_title = new Text("ECSSE Robot Simulation") ;
	//this is the  subtitle for the home menu
	Text homemenu_subtitle = new Text("SE300 Fall 2015 Project") ; 
	//text for the lehman atrium
	//this text is the title for the lehman atrium simulation 
	Text lehmanAtriumSim_title = new Text("Lehman Atrium Simulation") ; 
	//text for ecsse hallways 
	Text ecsseHallwaySim_title = new Text("ECSSE Hallway Simulation") ; 
	//this is the text that is for the cob simulation 
	Text cob125Sim_title = new Text("COB Room 125 Simulation") ; 
	//create all the buttons for the gui
	//buttons for the lehman atrium
	//this button will take you to the screen for the lehman atrium simulation from the home menu 
	Button lehmanAtriumSim_button = new Button("Lehman Atrium Simulation") ; 
	//this button will take you to some info about the sim (at this point user is at the lehman sim page)
	Button lehmanAtriumSim_infobutton = new Button("info") ;
	//this button will take you to the screen for the ECSSE Hallway simulation from the home menu
	Button ecsseHallwaySim_button = new Button("ECSSE Hallway Simulation") ; 
	//this button will take you to some infor about the sim (at this point the user is at ECSSE hallway sim)
	Button ecsseHallwaySim_infobutton = new Button("info") ;
	//this is the button that will talk you to the cob simulation from the home menu
	Button cob125Sim_button = new Button("COB Room 125 Simulation") ;
	//this button will take you to some info about the sim (at this point the user is at COB125 hallway sim)
	Button cob125Sim_infobutton = new Button("info") ;


	public SE300RobotProject(){
	}

	//making the GUI work! yay! 
	@Override
	public void start(Stage primaryStage) throws Exception {
	//this is the exciting part where we put panes where they should go :) 
		
	//information box for the home menu 
		homemenu_information.getChildren().addAll(lehmanAtriumSim_infobutton) ; 
	//button box for the home menu
		homemenu_simButtons.getChildren().addAll(lehmanAtriumSim_button, ecsseHallwaySim_button, cob125Sim_button) ;
	//title box
		homemenu_titles.getChildren().addAll(homemenu_title, homemenu_subtitle) ;
	//pulling together our home menu 
		homemenu.getChildren().addAll(homemenu_titles, homemenu_simButtons, homemenu_information) ; 
		
		//make the gui work	
		Scene scene = new Scene(homemenu,500,350) ;
		primaryStage.setScene(scene);
		primaryStage.setTitle("SE300 Project") ;
		primaryStage.show();
	}
	
	//because eclipse is special
	public static void main(String[] args) {
	SE300RobotProject.launch(args);
		}
	}//end SE300RobotProject
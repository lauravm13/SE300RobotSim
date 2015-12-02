import javax.swing.JOptionPane;

import com.sun.glass.ui.Screen;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author Rebecca
 * @version 1.0
 * @created 07-Oct-2015 5:06:37 PM
 * Description: The central class within the project, this class brings together everything else and
 * runs the actual program.
 */
public class SE300RobotProject extends Application {

	/*public Flyers m_Flyers;
public Audio m_Audio;
public PathAlgorithm m_PathAlgorithm;
public Room m_Room;
public Robot m_Robot;*/


	VBox homemenu = new VBox() ; 
	VBox homemenu_titles = new VBox() ; 
	HBox homemenu_simButtons = new HBox() ; 
	HBox homemenu_information = new HBox() ; 

	private Scene scene;

	// Room menu to input dimensions
	VBox roommenu = new VBox();

	//getting the dimensions of the room
	Label dimensionX = new Label("Y Dimension: ");
	Label dimensionY = new Label("X Dimension: ");
	TextField xText = new TextField();
	TextField yText = new TextField();
	HBox roommenu_dimension = new HBox();


	//getting the number of obstacles: chairs and tables
	Label obsChair = new Label("Number of chairs: ");
	TextField numObsChair = new TextField();

	Label obsTable = new Label("Number of tables: ");
	TextField numObsTable = new TextField();

	//getting the number of people
	Label people = new Label("Number of people: ");
	TextField numPeople = new TextField();


	//Submit button
	Button submit_button = new Button("submit");

	
	RoomConst selectedRoom;

	VBox lehmanAtriumSim = new VBox() ;
	VBox lehmanAtriumSim_titles = new VBox() ; 
	HBox lehmanAtriumSim_content = new HBox() ; 
	VBox lehmanAtriumSim_simulation = new VBox() ; 
	VBox lehmanAtriumSim_userInput = new VBox() ; 
	HBox lehmanAtriumSim_information = new HBox() ; 
	VBox ecsseHallwaySim = new VBox() ;
	VBox ecsseHallwaySim_titles = new VBox() ; 
	HBox ecsseHallwaySim_content = new HBox() ; 
	VBox ecsseHallwaySim_simulation = new VBox() ; 
	VBox ecsseHallwaySim_userInput = new VBox() ; 
	HBox ecsseHallwaySim_information = new HBox() ; 
	VBox cob125Sim = new VBox() ;
	VBox cob125Sim_titles = new VBox() ; 
	HBox cob125Sim_content = new HBox() ; 
	VBox cob125Sim_simulation = new VBox() ; 
	VBox cob125Sim_userInput = new VBox() ; 
	HBox cob125Sim_information = new HBox() ; 
	Text homemenu_title = new Text("ECSSE Robot Simulation") ;
	Text homemenu_subtitle = new Text("SE300 Fall 2015 Project") ; 
	Text lehmanAtriumSim_title = new Text("Lehman Atrium Simulation") ; 
	Text lehmanAtriumSim_uiTitle = new Text("Please input values into the text box. Valid input parameters are: "
			+ "\nY Dimension- 1-infinite"
			+ "\nX Dimension- 1-infinite"
			+ "\nNumber of Chairs- 0-10"
			+ "\nNumber Tables- 0-10"
			+ "\nNumber of People- 0-10"
			+ "\nIf you input an invalid parameter the program will not run and you will have to restart the program.") ;

	Text ecsseHallwaySim_title = new Text("ECSSE Hallway Simulation") ; 
	Text ecsseHallwaySim_uiTitle = new Text("Please input values into the text box. Valid input parameters are: "
			+ "\nY Dimension- 1-infinite"
			+ "\nX Dimension- 1-infinite"
			+ "\nNumber of Chairs- 0-10"
			+ "\nNumber Tables- 0-10"
			+ "\nNumber of People- 0-10"
			+ "\nIf you input an invalid parameter the program will not run and you will have to restart the program.") ;

	Text cob125Sim_title = new Text("COB Room 125 Simulation") ;
	Text cob125Sim_uiTitle = new Text("Please input values into the text box. Valid input parameters are: "
			+ "\nY Dimension- 1-infinite"
			+ "\nX Dimension- 1-infinite"
			+ "\nNumber of Chairs- 0-10"
			+ "\nNumber Tables- 0-10"
			+ "\nNumber of People- 0-15"
			+ "\nIf you input an invalid parameter the program will not run and you will have to restart the program.") ;

	Button lehmanAtriumSim_button = new Button("Lehman \nAtrium \nSimulation") ; 
	Button ecsseHallwaySim_button = new Button("ECSSE \nHallway \nSimulation") ; 
	Button cob125Sim_button = new Button("COB \nRoom 125 \nSimulation") ;
	
	public SE300RobotProject(){
	}

	/**
	 * creates the main menu
	 */
	@Override
	
	public void start(Stage primaryStage) throws Exception {

		//here human factors plays with color and size :) 
		final String IEEE_ORANGE = "#E37222";
		final String IEEE_BLUE = "#006699" ; 
		
		homemenu_title.setFont(new Font("Arial", 36));
		homemenu_title.setFill(Color.web(IEEE_ORANGE));
		
		homemenu_subtitle.setFont(new Font("Arial", 28));
		homemenu_subtitle.setFill(Color.web(IEEE_ORANGE));
		
		lehmanAtriumSim_title.setFont(new Font("Arial", 24)); 
		lehmanAtriumSim_title.setFill(Color.web(IEEE_BLUE));
		//lehmanAtriumSim_simTitle.setFont(new Font("Arial", 14));
		lehmanAtriumSim_uiTitle.setFont(new Font("Arial", 16));
		lehmanAtriumSim_uiTitle.setFill(Color.web(IEEE_ORANGE)); 
		
		ecsseHallwaySim_title.setFont(new Font("Arial", 24)); 
		ecsseHallwaySim_title.setFill(Color.web(IEEE_BLUE));
		//ecsseHallwaySim_simTitle.setFont(new Font("Arial", 18));
		ecsseHallwaySim_uiTitle.setFont(new Font("Arial", 16));
		ecsseHallwaySim_uiTitle.setFill(Color.web(IEEE_ORANGE)); 
		
		cob125Sim_title.setFont(new Font("Arial", 24)); 
		cob125Sim_title.setFill(Color.web(IEEE_BLUE));
		cob125Sim_uiTitle.setFont(new Font("Arial", 16));
		cob125Sim_uiTitle.setFill(Color.web(IEEE_ORANGE));
		
		final String BUTTON_STYLE = "-fx-font: 22 arial; -fx-base: #006699; -fx-padding: 8 15 15 15; "
				+ "-fx-background-insets: 0, 0 0 5 0, 0 0 6 0, 0 0 7 0; -fx-background-radius: 24; -fx-effect: dropshadow( gaussian, rgba(0, 0, 0, 0.75), 15, 0, 0, 1);";
		lehmanAtriumSim_button.setStyle(BUTTON_STYLE) ; 
		ecsseHallwaySim_button.setStyle(BUTTON_STYLE) ; 
		cob125Sim_button.setStyle(BUTTON_STYLE);
		
		submit_button.setStyle("-fx-font: 14 arial; -fx-base: #008542; -fx-padding:  8 15 15 15; "
				+ "-fx-background-insets: 0, 0 0 5 0, 0 0 6 0, 0 0 7 0; -fx-background-radius: 24; -fx-effect: dropshadow( gaussian, rgba(0, 0, 0, 0.75), 15, 0, 0, 1);"); 

		homemenu_simButtons.getChildren().addAll(lehmanAtriumSim_button, ecsseHallwaySim_button, cob125Sim_button) ;
		homemenu_titles.getChildren().addAll(homemenu_title, homemenu_subtitle) ;
		homemenu.getChildren().addAll(homemenu_titles, homemenu_simButtons, homemenu_information) ; 


		//add all items to room menu
		roommenu.getChildren().addAll(dimensionX, xText, dimensionY, yText, obsChair,numObsChair,obsTable,numObsTable, people, numPeople, submit_button);
		lehmanAtriumSim_userInput.getChildren().addAll(lehmanAtriumSim_uiTitle) ; 
		lehmanAtriumSim_content.getChildren().addAll(lehmanAtriumSim_simulation, lehmanAtriumSim_userInput) ; 
		lehmanAtriumSim_titles.getChildren().addAll(lehmanAtriumSim_title) ; 
		lehmanAtriumSim.getChildren().addAll(lehmanAtriumSim_titles, lehmanAtriumSim_content, lehmanAtriumSim_information) ; 
		ecsseHallwaySim_userInput.getChildren().addAll(ecsseHallwaySim_uiTitle) ; 
		ecsseHallwaySim_content.getChildren().addAll(ecsseHallwaySim_simulation, ecsseHallwaySim_userInput) ; 
		ecsseHallwaySim_titles.getChildren().addAll(ecsseHallwaySim_title) ; 
		ecsseHallwaySim.getChildren().addAll(ecsseHallwaySim_titles, ecsseHallwaySim_content, ecsseHallwaySim_information) ; 
		cob125Sim_userInput.getChildren().addAll(cob125Sim_uiTitle) ; 
		cob125Sim_content.getChildren().addAll(cob125Sim_simulation, cob125Sim_userInput) ; 
		cob125Sim_titles.getChildren().addAll(cob125Sim_title) ; 
		cob125Sim.getChildren().addAll(cob125Sim_titles, cob125Sim_content, cob125Sim_information) ; 


		scene = new Scene(homemenu, Screen.getMainScreen().getWidth(), Screen.getMainScreen().getHeight());


		
		 //Taking user to the Lehman atrium sim when button is clicked
		 
		lehmanAtriumSim_button.setOnAction(e -> {
			scene.setRoot(lehmanAtriumSim);
			lehmanAtriumSim.getChildren().add(roommenu);
			selectedRoom = RoomConst.ATRIUM;

		});

		
		 //Taking user to the ECSSE hallway sim when button is clicked 
		
		ecsseHallwaySim_button.setOnAction(e -> {
			scene.setRoot(ecsseHallwaySim);
			ecsseHallwaySim.getChildren().add(roommenu);
			selectedRoom = RoomConst.HALLWAY;
		});

		
		 //Taking the user to the COB125 sim when button is clicked
		 
		cob125Sim_button.setOnAction(e -> {
			scene.setRoot(cob125Sim);
			cob125Sim.getChildren().add(roommenu);
			selectedRoom = RoomConst.COB;
		});


		submit_button.setOnAction(new SubmitHandler());
		
		
		primaryStage.setResizable(false);
		//primaryStage.setFullScreen(true);
		primaryStage.setScene(scene);
		primaryStage.setTitle("SE300 Project") ;
		primaryStage.show();
	}
/** 
 * Main methods that runs the program
 * @param args
 */
	public static void main(String[] args) {
		SE300RobotProject.launch(args);
	}
	
	/**
	 * Gets the value from the user input and returns it to room class to display the correct
	 * amount of obstacles
	 * @author lauravm_13
	 *
	 */
	class SubmitHandler implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent event) {
			//get textfield input from user
			String xtext = xText.getText();
			int x = Integer.parseInt(xtext); //convert string to int
			String ytext = yText.getText();
			int y = Integer.parseInt(ytext);//convert string to int
			String numObsC = numObsChair.getText();
			int obsC = Integer.parseInt(numObsC);//convert string to int
			String numObsT = numObsTable.getText();
			int obsT = Integer.parseInt(numObsT);//convert string to int
			String numPeop = numPeople.getText();
			int people = Integer.parseInt(numPeop);//convert string to int

			//once submit button is pressed check to make sure input 
			//fields meet all requirements in order to go to the room.


			if(x <0){

				JOptionPane frame = new JOptionPane();
				JOptionPane.showMessageDialog(frame, "Please enter a positive x integer");
			}

			if(y <0){
				JOptionPane frame = new JOptionPane();
				JOptionPane.showMessageDialog(frame, "Please enter a positive y integer");

			}

			if(obsC < 0){
				JOptionPane frame = new JOptionPane();
				JOptionPane.showMessageDialog(frame, "Please enter a positive integer for number of obstacles");
			}
			if(obsC > 10){
				JOptionPane frame = new JOptionPane();
				JOptionPane.showMessageDialog(frame, "Number of obstacles cannot exceed 10");
			}

			if(people <0){
				JOptionPane frame = new JOptionPane();
				JOptionPane.showMessageDialog(frame, "Please enter a positive integer for number of people");
			}

			if(people > 15){
				JOptionPane frame = new JOptionPane();
				JOptionPane.showMessageDialog(frame, "Number of people cannot exceed 10");
			}
			if(obsT < 0){
				JOptionPane frame = new JOptionPane();
				JOptionPane.showMessageDialog(frame, "Please enter a positive integer for number of obstacles");
			}

			if(obsT > 10){
				JOptionPane frame = new JOptionPane();
				JOptionPane.showMessageDialog(frame, "Number of obstacles cannot exceed 10");
			}

			int[][] array;
			
			switch(selectedRoom){
			case ATRIUM:
				array = Room.Atrium(x, y, obsC, obsT, people);
				break;
			case COB:
				array = Room.COB125(x, y, obsC, obsT, people);
				break;
			case HALLWAY:
				array = Room.Hallway(x, y, obsC, obsT, people);
				break;
			default: // This will never be encountered because enums
				array = null;
				break;
			}

			scene.setRoot(new PathAlgorithm(array));
		}
		
	}
	
	enum RoomConst {
		ATRIUM, HALLWAY, COB;
	}
	
}//end SE300RobotProject
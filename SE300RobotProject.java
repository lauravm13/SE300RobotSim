import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
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


/**
* Here we create all of the panes for the GUI
*/

/**
* Panes for the home menu
*/
/**
* This is the container pane that will pull in all the other panes for the home menu
*/
VBox homemenu = new VBox() ; 
/**
* This is the pane that will hold the title
*/
VBox homemenu_titles = new VBox() ; 
/**
* This pane will hold the buttons that let the user choose which sim to run
*/
HBox homemenu_simButtons = new HBox() ; 
/**
* This pane holds the about and questions/how to buttons
*/
HBox homemenu_information = new HBox() ; 
 
 
 
// Room menu to input dimensions
VBox roommenu = new VBox();
 
//getting the dimensions of the room
Label dimensionX = new Label("X Dimension: ");
Label dimensionY = new Label("Y Dimension: ");
TextField xText = new TextField();
TextField yText = new TextField();
HBox roommenu_dimension = new HBox();
 
 
//getting the number of obstacles
Label obstacles = new Label("Number of obstacles: ");
TextField numObstacles = new TextField();
 
//getting the number of people
Label people = new Label("Number of people: ");
TextField numPeople = new TextField();
 
 
//Submit button
Button submit = new Button("submit");
 
 
 

/**
* panes for the Lehman atrium sim 
*This container pane will pull in the other panes for the Lehman atrium sim
*/
VBox lehmanAtriumSim = new VBox() ;
/**
* This pane will hold the titles
*/
VBox lehmanAtriumSim_titles = new VBox() ; 
/**
* This pane will hold lehmanAtriumSim_simulation and lehmanAtriumSim_userInput
*/
HBox lehmanAtriumSim_content = new HBox() ; 
/**
* This pane will hold the actual simulation for the user to watch
*/
VBox lehmanAtriumSim_simulation = new VBox() ; 
/**
* This pane will hold the user inputs and the run button
*/
VBox lehmanAtriumSim_userInput = new VBox() ; 
/**
* This pane will hold the back, about button, and how to buttons
*/
HBox lehmanAtriumSim_information = new HBox() ; 

/**
* panes for the ecsse hallway sim
*This container pane will pull in the other panes for the ECSSE hallway sim
*/
VBox ecsseHallwaySim = new VBox() ;
/**
* This pane that will hold the titles
*/
VBox ecsseHallwaySim_titles = new VBox() ; 
/**
* This pane that will hold ecsseHallwaySim_simulation and ecsseHallwaySim_userInput
*/
HBox ecsseHallwaySim_content = new HBox() ; 
/**
* This pane will hold the actual simulation for the user to watch
*/
VBox ecsseHallwaySim_simulation = new VBox() ; 
/**
* This pane that will hold the user inputs and the run button
*/
VBox ecsseHallwaySim_userInput = new VBox() ; 
/**
* This pane will hold the back, the about, and the how to buttons
*/
HBox ecsseHallwaySim_information = new HBox() ; 

/**
* panes for the COB room sim 
*This container pane will pull in the other panes for the COB room sim
*/
VBox cob125Sim = new VBox() ;
/**
* This pane that will hold the titles
*/
VBox cob125Sim_titles = new VBox() ; 
/**
* This pane will hold lehmanAtriumSim_simulation and lehmanAtriumSim_userInput
*/
HBox cob125Sim_content = new HBox() ; 
/**
* This pane will hold the actual simulation for the user to watch
*/
VBox cob125Sim_simulation = new VBox() ; 
/**
* This pane will hold the user inputs and the run button
*/
VBox cob125Sim_userInput = new VBox() ; 
/**
* This pane will hold the back, the about, and the how to buttons
*/
HBox cob125Sim_information = new HBox() ; 

/**
* Create all of the text for the GUI 
//Text for the home menu
//This is the title for the home menu 
*/
Text homemenu_title = new Text("ECSSE Robot Simulation") ;
/**
* This is the  subtitle for the home menu
*/
Text homemenu_subtitle = new Text("SE300 Fall 2015 Project") ; 

/**
* This text is the title for the Lehman atrium simulation
*/
Text lehmanAtriumSim_title = new Text("Lehman Atrium Simulation") ; 
/**
* Text title  for the lehman atrium simulation
*/
Text lehmanAtriumSim_simTitle = new Text("Simulation") ; 
/**
* Text title for the lehman atrium user input
*/
Text lehmanAtriumSim_uiTitle = new Text("This is where the user input will be") ;

/**
* Text for ECSSE hallways
*/
Text ecsseHallwaySim_title = new Text("ECSSE Hallway Simulation") ; 
/**
* Text title for the ECSSE hallway sim
*/
Text ecsseHallwaySim_simTitle = new Text("Simulation") ;
/**
* Text title for the ex hallway simulation input
*/
Text ecsseHallwaySim_uiTitle = new Text("This is where user input will be") ; 

/**
* This is the text that is for the COB simulation
*/
Text cob125Sim_title = new Text("COB Room 125 Simulation") ;
/**
* Text title for the COB sim
*/
Text cob125Sim_simTitle = new Text("Simulation") ; 
/**
* Text title for the COB GUI
*/
Text cob125Sim_uiTitle = new Text("This is where user input will be") ; 


/**
* Create all the buttons for the GUI
*/

/**
* Buttons for the home menu
*/
Button homemenu_infobutton = new Button("info") ; 
 
//Create dialog box containing parameters for dimensions and the max amount of people/ obstacles that can be entered

/**
* Buttons for the Lehman atrium
*/
/**
*This button will take you to the Lehman atrium simulation screen from the home menu 
*/
Button lehmanAtriumSim_button = new Button("Lehman Atrium Simulation") ; 
/**
* This button will take you to some info about the sim (at this point user is at the Lehman sim page)
*/
Button lehmanAtriumSim_infobutton = new Button("info") ;
/**
* This button will take you to the screen for the ECSSE Hallway simulation from the home menu
*/
Button ecsseHallwaySim_button = new Button("ECSSE Hallway Simulation") ; 
/**
* This button will take you to some infor about the sim (at this point the user is at ECSSE hallway sim)
*/
Button ecsseHallwaySim_infobutton = new Button("info") ;
/**
* This is the button that will talk you to the cob simulation from the home menu
*/
Button cob125Sim_button = new Button("COB Room 125 Simulation") ;
/**
* This button will take you to some info about the sim (at this point the user is at COB125 hallway sim)
*/
Button cob125Sim_infobutton = new Button("info") ;


public SE300RobotProject(){
}

/**
* making the GUI work! yay!
*/
@Override
public void start(Stage primaryStage) throws Exception {
 
/**
* This is the exciting part where we put panes where they should go :)
*/

/**
* Information box for the home menu
*/
homemenu_information.getChildren().addAll(lehmanAtriumSim_infobutton) ; 
/**
* Button box for the home menu
*/
homemenu_simButtons.getChildren().addAll(lehmanAtriumSim_button, ecsseHallwaySim_button, cob125Sim_button) ;
/**
* Title box
*/
homemenu_titles.getChildren().addAll(homemenu_title, homemenu_subtitle) ;
/**
* Pulling together our home menu
*/
homemenu.getChildren().addAll(homemenu_titles, homemenu_simButtons, homemenu_information) ; 


//add all items to room menu
roommenu.getChildren().addAll(dimensionX, xText, dimensionY, yText, obstacles,numObstacles, people, numPeople, submit);

 
 
 
/**
* Information box for Lehman atrium sim
*/
lehmanAtriumSim_information.getChildren().addAll(homemenu_infobutton) ; 
/**
* Content for the simulation
* Pulling content into the simulation
*/ 
lehmanAtriumSim_simulation.getChildren().addAll(lehmanAtriumSim_simTitle) ;
/**
* put actual sim context here 
*pulling in content for user input
*/
lehmanAtriumSim_userInput.getChildren().addAll(lehmanAtriumSim_uiTitle) ; 
/**
* put in user input here for sprint 2 
*pull sim and ui into content pane
*/
lehmanAtriumSim_content.getChildren().addAll(lehmanAtriumSim_simulation, lehmanAtriumSim_userInput) ; 
/**
* Sim title
*/
lehmanAtriumSim_titles.getChildren().addAll(lehmanAtriumSim_title) ; 
/**
* Pull everything into the container GUI!!
*/
lehmanAtriumSim.getChildren().addAll(lehmanAtriumSim_titles, lehmanAtriumSim_content, lehmanAtriumSim_information) ; 



/**
* Pulling together ecsse hallway
*/
ecsseHallwaySim_information.getChildren().addAll(ecsseHallwaySim_infobutton) ; 
/**
* Content for the simulation
* Pulling content into the simulation
*/
// 
ecsseHallwaySim_simulation.getChildren().addAll(ecsseHallwaySim_simTitle) ;
/**
* Put actual sim context here 
* Pulling in content for user input
*/
ecsseHallwaySim_userInput.getChildren().addAll(ecsseHallwaySim_uiTitle) ; 
/**
* Put in user input here for sprint 2 
* Pull sim and ui into content pane 
*/
ecsseHallwaySim_content.getChildren().addAll(ecsseHallwaySim_simulation, ecsseHallwaySim_userInput) ; 
/**
* Sim title
*/
ecsseHallwaySim_titles.getChildren().addAll(ecsseHallwaySim_title) ; 
/**
* Pull everything into the container GUI!!
*/
ecsseHallwaySim.getChildren().addAll(ecsseHallwaySim_titles, ecsseHallwaySim_content, ecsseHallwaySim_information) ; 



/**
* Pulling together ECSSE hallway
*/
cob125Sim_information.getChildren().addAll(cob125Sim_infobutton) ; 
/**
* Content for the simulation 
* Pulling content into the simulation
*/
cob125Sim_simulation.getChildren().addAll(cob125Sim_simTitle) ;
/**
* Put actual sim context here
* Pulling in content for user input
*/ 
cob125Sim_userInput.getChildren().addAll(cob125Sim_uiTitle) ; 
/**
* Put in user input here for sprint 2 
* Pull sim and ui into content pane
*/
cob125Sim_content.getChildren().addAll(cob125Sim_simulation, cob125Sim_userInput) ; 
/**
* Sim title
*/
cob125Sim_titles.getChildren().addAll(cob125Sim_title) ; 
/**
* Pull everything into the container GUI!!
*/
cob125Sim.getChildren().addAll(cob125Sim_titles, cob125Sim_content, cob125Sim_information) ; 


Scene scene = new Scene(homemenu,800,400) ;


/**
* Taking user to the Lehman atrium sim when button is clicked
*/
lehmanAtriumSim_button.setOnAction(e -> {
scene.setRoot(lehmanAtriumSim);
lehmanAtriumSim.getChildren().add(roommenu);

 
 
 
//lehmanAtriumSim.getChildren().add(new PathAlgorithm());
});

/**
* Taking user to the ECSSE hallway sim when button is clicked 
*/
ecsseHallwaySim_button.setOnAction(e -> {
scene.setRoot(ecsseHallwaySim);
ecsseHallwaySim.getChildren().add(roommenu);
 
 
 
 
});

/**
* Taking the user to the COB125 sim when button is clicked
*/
cob125Sim_button.setOnAction(e -> {
scene.setRoot(cob125Sim);
cob125Sim.getChildren().add(roommenu);
 
 
 
});

submit.setOnAction(e -> {

//get textfield input from user
String xtext = xText.getText();
int x = Integer.parseInt(xtext); //convert string to int
String ytext = yText.getText();
int y = Integer.parseInt(ytext);//convert string to int
String numObs = numObstacles.getText();
int obs = Integer.parseInt(numObs);//convert string to int
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
 
if(obs < 0){
JOptionPane frame = new JOptionPane();
JOptionPane.showMessageDialog(frame, "Please enter a positive integer for number of obstacles");
}
 
if(people <0){
JOptionPane frame = new JOptionPane();
JOptionPane.showMessageDialog(frame, "Please enter a positive integer for number of people");
}
 
if(people > 10){
JOptionPane frame = new JOptionPane();
JOptionPane.showMessageDialog(frame, "Number of people cannot exceed 10");
}
 
if(obs > 10){
JOptionPane frame = new JOptionPane();
JOptionPane.showMessageDialog(frame, "Number of obstacles cannot exceed 10");
}
 
 
});
 
/**
* Makes the GUI work
*/
primaryStage.setScene(scene);
primaryStage.setTitle("SE300 Project") ;
primaryStage.show();
}

public static void main(String[] args) {
SE300RobotProject.launch(args);
}
}//end SE300RobotProject
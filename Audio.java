import java.io.PrintWriter;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;

/**
 * @author mayorl
 * @version 1.0
 * @created 07-Oct-2015 5:06:18 PM
 * Description: Audio file that will play messages about the different majors
 * code adapted from :http://www.java2s.com/Code/Java/Development-Class/AnexampleofloadingandplayingasoundusingaClip.htm 
 * and https://wiki.eclipse.org/FAQ_How_do_I_prompt_the_user_to_select_a_file_or_a_directory%3F
 * 
 */
public class Audio {

	public Audio(){
		//create files for each program 
		//electrical computer software and systems engineering
		String message1 = "Message one ";
		PrintWriter.outputStream = new PrintWriter(message1);
		
		
	}
		// specify the sound to play
		// (assuming the sound can be played by the audio system)
		//File soundFile = new File{  FileDialog dialog = new FileDialog(shell, SWT.OPEN);
		//dialog.setFilterExtensions(new String [] {"*.mp3"});
		//dialog.setFilterPath("c:\\temp");
		//String result = dialog.open();}

		//AudioInputStream sound = AudioSystem.getAudioInputStream(soundFile);

		// load the sound into memory (a Clip)
		//DataLine.Info info = new DataLine.Info(Clip.class, sound.getFormat());
		//Clip clip = (Clip) AudioSystem.getLine(info);
		//clip.open(sound);

		// due to bug in Java Sound, explicitly exit the VM when
		// the sound has stopped.
		//clip.addLineListener(new LineListener() {
			//public void update(LineEvent event) {
				//if (event.getType() == LineEvent.Type.STOP) {
					//event.getLine().close();
					//System.exit(0);
				//}

				public void finalize() throws Throwable {

				}
				/**
				 * @param Play
				 * @return false
				 */
				public boolean Play(){
					return false;
				}
			}//end Audio
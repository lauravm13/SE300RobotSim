import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * @author Theish, Halln,SeanH
 * @version 1.0
 * created 07-Oct-2015 5:06:18 PM
 * Description: Audio file that will play messages about the different majors
 * code adapted from :http://www.java2s.com/Code/Java/Development-Class/AnexampleofloadingandplayingasoundusingaClip.htm 
 * and https://wiki.eclipse.org/FAQ_How_do_I_prompt_the_user_to_select_a_file_or_a_directory%3F
 * 
 */
public class Audio {

	public Audio(){

		// specify the sound to play
		// (assuming the sound can be played by the audio system)
		File soundFile = new File("success.wav");
		// System.out.println(soundFile.getAbsolutePath());
		AudioInputStream sound;
		try {
			sound = AudioSystem.getAudioInputStream(soundFile);


			// load the sound into memory (a Clip)
			Clip clip = AudioSystem.getClip();
			clip.open(sound);

			// play the sound clip
			clip.start();    

			// due to bug in Java Sound, explicitly exit the VM when
			// the sound has stopped.
			clip.addLineListener(new LineListener() {
				public void update(LineEvent event) {
					if (event.getType() == LineEvent.Type.STOP) {
						event.getLine().close();
						//System.exit(0);
					}
				}
			});

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR WITH SOUND");
		} catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			System.out.println("Unsupported Audio File");
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			System.out.println("line unavailable ");
		}
	}

}//end Audio
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
 */
public class Audio {

	public Audio(){
		// specify the sound to play
		// (assuming the sound can be played by the audio system)
		File soundFile = new File(   FileDialog dialog = new FileDialog(shell, SWT.OPEN);
		dialog.setFilterExtensions(new String [] {"*.html"});
		dialog.setFilterPath("c:\\temp");
		String result = dialog.open(););

		AudioInputStream sound = AudioSystem.getAudioInputStream(soundFile);

		// load the sound into memory (a Clip)
		DataLine.Info info = new DataLine.Info(Clip.class, sound.getFormat());
		Clip clip = (Clip) AudioSystem.getLine(info);
		clip.open(sound);

		// due to bug in Java Sound, explicitly exit the VM when
		// the sound has stopped.
		clip.addLineListener(new LineListener() {
			public void update(LineEvent event) {
				if (event.getType() == LineEvent.Type.STOP) {
					event.getLine().close();
					System.exit(0);
				}

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
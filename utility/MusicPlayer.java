package utility;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MusicPlayer {
  
  public MusicPlayer() {
    // do nothing
  } // constructor

  public void play(String filePath) {
    try {
      // Load the audio file
      File musicFile = new File(filePath);
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(musicFile);
      Clip clip = AudioSystem.getClip();
      clip.open(audioStream);
      
      // Loop the music continuously
      clip.loop(Clip.LOOP_CONTINUOUSLY);
      clip.start();

      // Keep the thread alive while music is playing
      Thread.sleep(clip.getMicrosecondLength() / 1000);

    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException elvis) {
      System.out.println("Error playing music: " + elvis.getMessage());
    }
  } // play
} // class
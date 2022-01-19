package Main_Code;

import javafx.scene.media.AudioClip;

import java.io.File;

public class Sounds implements SoundFx{


    public void SendSound() {
        try {
        /*String musicFile = "ding-sound-effect_2.wav";

        Media sound = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();*/
            AudioClip soundMyNoise = new AudioClip(new File("E:\\OOP\\JavaFX\\ChatBot\\Sounds\\ding-sound-effect_2.wav").toURI().toString());
            soundMyNoise.play();
        } catch (Exception e) {
            System.out.println("No error!");
        }
    }
    public void ErrorSound(){
        try {
        /*String musicFile = "ding-sound-effect_2.wav";

        Media sound = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();*/
            AudioClip soundMyNoise = new AudioClip(new File("E:\\OOP\\JavaFX\\ChatBot\\Sounds\\error.wav").toURI().toString());
            soundMyNoise.play();
        } catch (Exception e) {
            System.out.println("No error!");
        }
    }
}

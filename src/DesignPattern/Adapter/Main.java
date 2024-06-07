package DesignPattern.Adapter;

public class Main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new VLCPlayerAdapter(new VLCPlayer());
        mediaPlayer.play("vlc", "sample.vlc");
    }
}
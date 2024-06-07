package DesignPattern.Adapter;

class VLCPlayerAdapter implements MediaPlayer {
    private VLCPlayer vlcPlayer;

    public VLCPlayerAdapter(VLCPlayer vlcPlayer) {
        this.vlcPlayer = vlcPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            vlcPlayer.playVLC(fileName);
        }
    }
}

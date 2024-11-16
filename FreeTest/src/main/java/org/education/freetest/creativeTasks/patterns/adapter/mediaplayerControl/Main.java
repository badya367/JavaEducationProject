package org.education.freetest.creativeTasks.patterns.adapter.mediaplayerControl;

public class Main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new VideoPlayerAdapter(new VideoPlayer());
        mediaPlayer.play("SOAD - lonely day");
    }
}

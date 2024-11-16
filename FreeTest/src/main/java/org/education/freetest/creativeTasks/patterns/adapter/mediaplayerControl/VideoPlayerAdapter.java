package org.education.freetest.creativeTasks.patterns.adapter.mediaplayerControl;

public class VideoPlayerAdapter implements MediaPlayer{
    VideoPlayer videoPlayer;

    public VideoPlayerAdapter(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void play(String fileName) {
        System.out.println("Включаю адаптер");
        videoPlayer.playVideo(fileName);
    }
}

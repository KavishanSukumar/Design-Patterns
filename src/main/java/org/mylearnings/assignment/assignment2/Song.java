package org.mylearnings.assignment.assignment2;

public  class Song implements Icomponent {
    String songName;
    String artist;
    float speed=1;

    public Song(String songName, String artist) {
        this.songName = songName;
        this.artist = artist;

    }

    @Override
    public void play() {

    }

    @Override
    public void setPlaybackSpeed(Float speed) {
        this.speed=speed;
    }

    @Override
    public String getName() {
        return this.songName;
    }

    public String getArtist() {
        return artist;
    }
}

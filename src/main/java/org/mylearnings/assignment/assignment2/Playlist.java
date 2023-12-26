package org.mylearnings.assignment.assignment2;

import java.util.ArrayList;

public class Playlist implements Icomponent{
    String playListName;
    ArrayList<Icomponent> playList=new ArrayList<>();

    public Playlist(String playListName){
        this.playListName=playListName;
    }

    @Override
    public void play() {

    }

    @Override
    public void setPlaybackSpeed(Float speed) {

    }

    @Override
    public String getName() {
        return this.playListName;
    }
    public void add(Icomponent component){
        this.playList.add(component);
    }
    public void remove(Icomponent icomponent){
        this.playList.remove(icomponent);
    }
}

package com.gz.design.facade;

public class HomeThreaterfacade {
    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    private Projector projector;
    private Screen screen;
    private Stereo stereo;

    public HomeThreaterfacade() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
    }

    public void ready() {
        dvdPlayer.on();
        popcorn.on();
        projector.on();
        screen.on();
        stereo.on();
    }

    public void play() {
        dvdPlayer.play();
        popcorn.play();
        projector.play();
        screen.play();
        stereo.play();
    }

    public void end() {
        dvdPlayer.off();
        popcorn.off();
        projector.off();
        screen.off();
        stereo.off();
    }

    public static void main(String[] args) {

    }

}

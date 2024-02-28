package edu.iu.dcrispin.remotecontroller.model;

public class Stereo {
    String location = "";

    public Stereo(String location) {
        this.location = location;
    }

    public String on() {
        this.setCd();
        this.setVolume(8);
        return location + " stereo is on";
    }

    public String off() {
        return location + " stereo is off";
    }

    public String setCd() {
        return location + " set to play CD";
    }

    public String setDvd() {
        return location + " set to play DVD";
    }

    public String setRadio() {
        return location + " set to play Radio";
    }

    public String setVolume(int volume) {
        return location + " set volume to " + volume;
    }

}

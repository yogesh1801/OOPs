package com.yogesh.principlesIPEA.inheritence;

public class BoxVolume extends BoXweight {
    int volume;

    public BoxVolume(){
        this.volume = -1;
    }
    public BoxVolume(double l, double h, double w, double weight, int volume) {
        super(l, h, w, weight);
        this.volume = volume;
    }

    public BoxVolume(BoXweight other, int volume) {
        super(other);
        this.volume = volume;
    }

    public BoxVolume(int volume) {
        this.volume = volume;
    }

}

// multilevel inheritence

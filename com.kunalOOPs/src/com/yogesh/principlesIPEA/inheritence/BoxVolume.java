package com.yogesh.principlesIPEA.inheritence;

public class BoxVolume extends BoXweight {
    int volume;

    public BoxVolume(double l, double h, double w, double weight, int volume) {
        super(l, h, w, weight);
        this.volume = volume;
    }
}

// multilevel inheritence

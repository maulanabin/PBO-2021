package com.maulana.polimorfisme.tugas2;

public class TelevisiModern extends Elektronik {

    private String modelInput;

    public TelevisiModern() {
        this.modelInput = "HDMI";
    }
    public String getModelInput() {
        return this.modelInput;
    }
}

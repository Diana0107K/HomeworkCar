package com.company;

import java.util.HashSet;
import java.util.Set;

public class Car {
    protected ColourE colour;
    protected final ModelE model;
    protected final int year;
    protected WheelSizeE wheelSize;
    protected final EngineVolE engineVol;
    protected Set<OptionE> options;

    public Car(ColourE colour,
               ModelE model,
               int year,
               WheelSizeE wheelSize,
               EngineVolE engineVol,
               Set<OptionE> options) {
        this.colour = colour;
        this.model = model;
        this.year = year;
        this.wheelSize = wheelSize;
        this.engineVol = engineVol;
        this.options = options;
        if (options == null) {
            this.options = new HashSet<>();
        } else {
            this.options = options;
        }
    }

    public Car(ColourE colour,
               ModelE model,
               int year,
               WheelSizeE wheelSize,
               EngineVolE engineVol) {
        this.colour = colour;
        this.model = model;
        this.year = year;
        this.wheelSize = wheelSize;
        this.engineVol = engineVol;
        this.options = new HashSet<>();
    }

    public void setColour(ColourE colour) {
        this.colour = colour;
    }

    public void setWheelSize(WheelSizeE wheelSize) {
        this.wheelSize = wheelSize;
    }

    public void setOptions(Set<OptionE> options) {
        this.options = options;
    }

    public void addOption(OptionE option) {
        this.options.add(option);
    }

    public void deliteOption(OptionE option) {
        this.options.remove(option);
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour=" + colour +
                ", model=" + model +
                ", year=" + year +
                ", wheelSize=" + wheelSize +
                ", engineVol=" + engineVol +
                ", options=" + options +
                '}';
    }
}
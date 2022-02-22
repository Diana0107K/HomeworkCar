package com.company;

import java.util.Set;

public class PassengerCar extends Car {
    private final int seat;

    public PassengerCar(ColourE colour, ModelE model, int year, WheelSizeE wheelSize, EngineVolE engineVol, Set<OptionE> options, int seat) {
        super(colour, model, year, wheelSize, engineVol, options);
        this.seat = seat;
    }

    public PassengerCar(ColourE colour, ModelE model, int year, WheelSizeE wheelSize, EngineVolE engineVol, int seat) {
        super(colour, model, year, wheelSize, engineVol);
        this.seat = seat;
    }

    public int getSeat() {
        return seat;
    }

    @Override
    public String toString() {
        return super.toString() +
                "PassengerCar{" +
                "seat=" + seat +
                '}';
    }
}


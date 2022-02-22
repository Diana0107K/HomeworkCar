package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Factory {
    private final Service service;

    private static final int YEAR = 2022;
    private final ModelE[] models = ModelE.values();
    private final EngineVolE[] engines = EngineVolE.values();
    private final ColourE[] colours = ColourE.values();
    private final WheelSizeE[] wheelSizes = WheelSizeE.values();
    private final Car[] storage = new Car[2];

    public Factory(Service service) {
        this.service = service;
        storage[0] = new Car(
                ColourE.GREEN,
                ModelE.MODEL_1,
                YEAR,
                WheelSizeE.BIG,
                EngineVolE.NORMAL
        );

        Set<OptionE> options = new HashSet<>();
        options.add(OptionE.ABS);
        options.add(OptionE.CONDITION);

        storage[1] = new Car(
                ColourE.RED,
                ModelE.MODEL_2,
                YEAR,
                WheelSizeE.MEDIUM,
                EngineVolE.RACING,
                options
        );
    }

    public void print() {
        System.out.println(
                Arrays.toString(models) +
                Arrays.toString(colours) +
                Arrays.toString(wheelSizes) +
                Arrays.toString(engines)
        );
    }

    public Car createCar(ColourE colour,
                          ModelE model,
                          WheelSizeE wheelSize,
                          EngineVolE engineVol,
                          Set<OptionE> options) {
        Car car = getFromStorage(colour, model, wheelSize, engineVol, options);
        if (car == null) {
            return new Car(colour, model, YEAR, wheelSize, engineVol, options);
        }
        return car;
    }

    public Car getFromStorage(ColourE colour,
                              ModelE model,
                              WheelSizeE wheelSize,
                              EngineVolE engineVol,
                              Set<OptionE> options) {
        return null;
    }
}

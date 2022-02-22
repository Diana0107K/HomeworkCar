package com.company;

import java.util.Set;

public class TruckCar extends Car{
    private final TonnageE tonnage;
    public TruckCar(ColourE colour, ModelE model, int year, WheelSizeE wheelSize, EngineVolE engineVol, Set<OptionE> options, TonnageE tonnage) {
        super(colour, model, year, wheelSize, engineVol, options);
        this.tonnage = tonnage;
    }

    public TruckCar(ColourE colour, ModelE model, int year, WheelSizeE wheelSize, EngineVolE engineVol, TonnageE tonnage) {
        super(colour, model, year, wheelSize, engineVol);
        this.tonnage = tonnage;
    }

    public TonnageE getTonnageE() {
        return tonnage;
    }
    @Override
    public String toString() {
        return super.toString()+
                "TruckCar{" +
                "tonnageE=" + tonnage +
                '}';
    }
}

package com.company;

import java.util.Set;

public class RoadConstructionCar extends Car{
    private final EquipmentE equipment;

    public EquipmentE getEquipment() {
        return equipment;
    }

    public RoadConstructionCar(ColourE colour, ModelE model, int year, WheelSizeE wheelSize, EngineVolE engineVol, Set<OptionE> options, EquipmentE equipment) {
        super(colour, model, year, wheelSize, engineVol, options);
        this.equipment = equipment;
    }

    public RoadConstructionCar(ColourE colour, ModelE model, int year, WheelSizeE wheelSize, EngineVolE engineVol, EquipmentE equipment) {
        super(colour, model, year, wheelSize, engineVol);
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return super.toString()+
                "RoadConstructionCar{" +
                "equipment=" + equipment +
                '}';
    }
}

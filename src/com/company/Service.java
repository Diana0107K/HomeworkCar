package com.company;

public class Service {
    public Service() {
    }

    public void changeColour(Car car, ColourE colour){
        car.setColour(colour);
    }

    public void changeWheel(Car car, WheelSizeE wheelSize){
        car.setWheelSize(wheelSize);
    }

    public void addOption(Car car, OptionE option){
        car.addOption(option);
    }

    public void deliteOption(Car car, OptionE option){
        car.deliteOption(option);
    }
}

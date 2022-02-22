package com.company;

import java.time.Year;
import java.util.Collections;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    Car car1 = new Car(ColourE.RED, ModelE.MODEL_2, 2022, WheelSizeE.BIG, EngineVolE.NORMAL, Collections.singleton(OptionE.CONDITION));
    System.out.println(car1);

    Service service = new Service();
    Factory factory = new Factory(service);
    Shop shop = new Shop(factory, service);
    factory.print();

    TruckCar car2 = new TruckCar(ColourE.RED, ModelE.MODEL_1, 2022, WheelSizeE.BIG, EngineVolE.RACING, TonnageE.UPTO5TONS);
    System.out.println(car2);

    PassengerCar car3 = new PassengerCar(ColourE.GREEN, ModelE.MODEL_1, 2022, WheelSizeE.SMALL, EngineVolE.NORMAL, Collections.singleton(OptionE.NAVIGATION), 5);
    System.out.println(car3);

    RoadConstructionCar car4 = new RoadConstructionCar(ColourE.GREEN, ModelE.MODEL_2, 2022, WheelSizeE.BIG, EngineVolE.NORMAL, Collections.singleton(OptionE.CONDITION), EquipmentE.JACKHAMMER);
    System.out.println(car4);




  }
}

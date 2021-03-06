package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_2.by.yurachel.ag_and_com_2.main;

import programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_2.by.yurachel.ag_and_com_2.entity.Car;
import programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_2.by.yurachel.ag_and_com_2.entity.Engine;
import programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_2.by.yurachel.ag_and_com_2.entity.Wheel;

public class RunnerCar {
    public static void main(String[] args) {

        // Создаем машину.

        Car car = new Car("BMW", "X-6", 50, 500, new Wheel(4, true), new Engine(2.2, false));
        System.out.println("Car brand and mark: " + car.getBrand() + " " + car.getMark());

        // Машина движется.

        System.out.println("\n*******************************\n");
        car.move();

        // Проблема в колесах.Устроняем проблему.

        System.out.println("\n*******************************\n");

        car.getWheels().setWhole(false);
        car.isNeedWheelRepair();
        car.move();
        System.out.println("\n*******************************\n");
        car.refuel();
        System.out.println("Current amount of cash: " + car.getAmountOfCash());
        System.out.println("Current amount of gasoline: " + car.getAmountOfGasoline());

    }
}

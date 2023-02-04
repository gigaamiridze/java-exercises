package ge.giga.helper;

import ge.giga.models.Car;

import java.util.*;

public class CarHelper {

    public static List<Car> sortCarsBySpeed(List<Car> cars) {
        List<Car> carList = new ArrayList<>(cars);
        carList.sort(new CarSpeedComparator());
        return carList;
    }

    public static List<Car> sortCarsByWeight(List<Car> cars) {
        List<Car> carList = new ArrayList<>(cars);
        Collections.sort(carList, new CarWeightComparator());
        return carList;
    }

    public static Map<Car, List<Car>> getMap(List<Car> cars) {
        Map<Car, List<Car>> map = new HashMap<>();
        for (Car car : cars) {
            List<Car> carsWithLessWeight = new ArrayList<>();
            for (Car otherCar : cars) {
                if (otherCar.getWeight() < car.getWeight()) {
                    carsWithLessWeight.add(otherCar);
                }
            }
            map.put(car, carsWithLessWeight);
        }
        return map;
    }
}

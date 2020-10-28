package com.rakovets.course.javabasics.practice.jcf.map.garage;

import java.util.*;

public class Garage {

    private Map<String, List<? extends Car>> map = new HashMap<>();

    public void park(Car car) {
        String key = car.getBrand() + car.getModel();
        List list = new ArrayList();
        if (map.containsKey(key))
            list = map.get(key);
        list.add(car);
        map.put(key, list);
    }

    public void leave(Car car) {
        String key = car.getBrand() + car.getModel();
        if (map.containsKey(key)) {
            List list = map.get(key);
            list.remove(car);
            if (list.isEmpty())
                map.remove(key);
            else map.put(key, list);
        }
    }

    public int getCount(String brand, String model) {
        String key = brand + model;
        return map.get(key).size();
    }

    public boolean isExist(String registrationNumber) {
        for (List<? extends Car> cars : map.values()) {
                for (Car car : cars) {
                    if (car.getRegistrationNumber().equals(registrationNumber))
                        return true;
                }
            }
        return false;
    }

    public boolean isExist(String brand, String model, String registrationNumber) {
        for (List<? extends Car> cars : map.values()) {
            for (Car car : cars) {
                if (car.getRegistrationNumber().equals(registrationNumber)
                && car.getBrand().equals(brand)
                && car.getModel().equals(model)
                )
                    return true;
            }
        }
        return false;
    }

    public Car getByRegistrationNumber(String registrationNumber) {
        for (List<? extends Car> cars : map.values()) {
            for (Car car : cars) {
                if (car.getRegistrationNumber().equals(registrationNumber))
                    return car;
            }
        }
        return null;
    }
}

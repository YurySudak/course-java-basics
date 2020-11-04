package com.rakovets.course.javabasics.practice.jcf.map;

import com.rakovets.course.javabasics.practice.jcf.map.garage.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GarageTest {

    @Test
    void testGarage() {
        Garage garage = new Garage();
        garage.park(new Sedan("Toyota", "Corolla", "black", 2015, "1020 AB-1"));
        garage.park(new Sedan("Toyota", "Camry", "white", 2016, "1121 AB-2"));
        garage.park(new Hatchback("Toyota", "Yaris", "blue", 2017, "1222 AB-3"));
        garage.park(new Hatchback("Toyota", "Prius", "red", 2018, "1323 AB-4"));
        garage.park(new Van("Honda", "Odyssey", "black", 2014, "1424 AB-5"));
        garage.park(new Van("Honda", "Odyssey", "black", 2013, "1626 AB-7"));
        garage.park(new Truck("Mercedes-Benz", "Axor", "gray", 2013, "1525 AB-6"));
        assertEquals(2, garage.getCount("Honda", "Odyssey"));
        assertTrue(garage.isExist("1626 AB-7"));
        assertTrue(garage.isExist("1222 AB-3"));
        assertFalse(garage.isExist("0000 AB-7"));
        assertTrue(garage.isExist("Toyota", "Prius", "1323 AB-4"));
        assertFalse(garage.isExist("Toyota", "Prius", "1111 AB-4"));
        assertFalse(garage.isExist("Honda", "Prius", "1323 AB-4"));
        garage.leave(new Truck("Mercedes-Benz", "Axor", "gray", 2013, "1525 AB-6"));
        assertFalse(garage.isExist("Mercedes-Benz"));
        assertEquals("brand: Toyota, model: Corolla, color: black, yearManufacture: 2015, registrationNumber: 1020 AB-1", garage.getByRegistrationNumber("1020 AB-1").toString());
        assertEquals("Odyssey", garage.getByRegistrationNumber("1424 AB-5").getModel());
        assertTrue(garage.getByRegistrationNumber("1424 AB-5").equals(garage.getByRegistrationNumber("1626 AB-7")));

    }
}

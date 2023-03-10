package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    public CustomList MockCityList() {
        list = new CustomList(null, new ArrayList<>());
        return list;
    }
    @Test
    public void addCityTest() {
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize+1);
    }

    @Test
    public void hasCityTest() {
        list = MockCityList();
        assertEquals(list.hasCity(new City("Edmonton", "AB")), false);
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(list.hasCity(new City("Edmonton", "AB")), true);
    }
    @Test
    public void deleteCityTest() {
        list = MockCityList();
        list.addCity(new City("Edmonton", "AB"));
        list.deleteCity(new City("Edmonton", "AB"));
        assertEquals(list.hasCity(new City("Edmonton", "AB")), false);
    }

}

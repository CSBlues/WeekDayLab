package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestMain {

   @Test
   public void testMonday()
   {
       String mon = Main.dayOfWeek(9,28,2020);
       assertEquals("Monday", mon);
   }

   @Test
    public void testTuesday()
    {
        String tues = Main.dayOfWeek(9,29,2020);
        assertEquals("Tuesday", tues);
    }

    @Test
    public void testWednesday()
    {
        String wed = Main.dayOfWeek(9,30,2020);
        assertEquals("Wednesday", wed);
    }

    @Test
    public void testThursday()
    {
        String thur = Main.dayOfWeek(10,1,2020);
        assertEquals("Thursday", thur);
    }
    @Test
    public void testFriday()
    {
        String fri = Main.dayOfWeek(10,2,2020);
        assertEquals("Friday", fri);
    }
    @Test
    public void testSaturday()
    {
        String sat = Main.dayOfWeek(10,3,2020);
        assertEquals("Saturday", sat);
    }
    @Test
    public void testSunday()
    {
        String sun = Main.dayOfWeek(10,4,2020);
        assertEquals("Sunday", sun);
    }
}

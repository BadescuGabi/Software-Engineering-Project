package com.agira.Agira;

import java.util.Calendar;
import java.util.Random;

public class Service {

    static public String  colorGame()
    {
        // create object of Random class
        Random obj = new Random();
        int rand_num = obj.nextInt(0xffffff + 1);
        // format it as hexadecimal string and print
        return String.format("#%06x", rand_num);
    }

}


package com.progacademystart.lectures;

import java.util.Calendar;
import java.util.Date;

public class Lecture7b {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        int day = calendar.get(Calendar.MONTH);
        System.out.println(day+1);

//        calendar.set(1981, Calendar.OCTOBER, 23);

        calendar.add(Calendar.DAY_OF_MONTH, -57);

        Date date = calendar.getTime();
        System.out.println(date);

        System.out.println(calendar.getTimeInMillis());
    }
}

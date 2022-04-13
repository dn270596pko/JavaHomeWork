package com.progacademy.lectures;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class Lecture7a {
    public static void main(String[] args) {

        Date date = new Date();

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd MMMM yyyy", Locale.CANADA);
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

        String myDay = "27/05/1996";

        try {
            date = sdf2.parse(myDay);
        } catch (ParseException e) {
            System.out.println("Error date format");
        }

        String text = sdf1.format(date);
        System.out.println(text);

        text = sdf2.format(date);
        System.out.println(text);

        System.out.println(date.getTime());
    }

}
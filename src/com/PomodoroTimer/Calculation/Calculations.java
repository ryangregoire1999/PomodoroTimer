package com.PomodoroTimer.Calculation;

public class Calculations {

    public int getHours(int a) {

        return 60 * a;
    }



    public static int Days(int a) {
        short days = 0;
        short seconds = 0;
        days += 7;
        seconds += (short) ((short) (short)days * 24 * a * 60);

        return seconds;
    }
}


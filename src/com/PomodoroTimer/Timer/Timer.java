package com.PomodoroTimer.Timer;
import com.PomodoroTimer.Calculation.Calculations;
import java.awt.*;
import java.util.Scanner;

public class Timer {
    public static Scanner scan = new Scanner(System.in);
    public static Calculations m = new Calculations();
    public static void main(String[] args) throws Exception{

        System.out.println("Enter Minutes to Start: ");
        int minutes = scan.nextInt();

        System.out.println("Enter Minutes to Stop: ");
        int continueMinutes = scan.nextInt();

        int i = 1;
        while(i > 0) {
            i += 1;
            try {
                Thread.sleep(1000);
                System.out.println(i);

                if (minutes == m.getHours(continueMinutes)) {
                    Toolkit.getDefaultToolkit().beep();
                    System.out.println("Timer... Done");

                }
                minutes += continueMinutes;

            } catch( Exception ce) {
                System.out.println(ce.getMessage());
            }

        }



    }
}

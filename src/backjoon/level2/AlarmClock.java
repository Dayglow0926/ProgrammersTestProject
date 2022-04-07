package backjoon.level2;

import solution_interface.Solution_Interface;

import java.util.Scanner;

public class AlarmClock implements Solution_Interface {
    @Override
    public void code_start() {
        Scanner in = new Scanner(System.in);

        int hour = in.nextInt();
        int minute = in.nextInt();

        int total_min = 0;

        total_min = ((hour*60) + minute) - 45;

        if(total_min < 0) total_min = 1440 + total_min;
        if(total_min >= 1440) total_min = total_min - 1440 ;

        hour = total_min/60;
        minute = total_min%60;

        System.out.println(hour+" "+minute);
    }
}

package backjoon.level4;

import solution_interface.Solution_Interface;

import java.util.Scanner;

public class Remain implements Solution_Interface {

    @Override
    public void code_start() {

        Scanner in = new Scanner(System.in);
        String temp = "";
        int diff = 0;

        for(int i=0; i<10; i++) {
            String remain = "/"+(in.nextInt()%42)+"/";
            if(temp.indexOf(remain)<0) diff ++;
            temp += remain;
        }

        System.out.println(diff);

    }
}

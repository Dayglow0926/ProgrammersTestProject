package backjoon.level7;

import solution_interface.Solution_Interface;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Honeycomb implements Solution_Interface {

    @Override
    public void code_start() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int start_number = 1;
            int number = Integer.parseInt(br.readLine());
            int group_number = 1;

            while(true) {

                if(number <= start_number) {
                    break;
                }
                start_number += (6*group_number);
                group_number ++;


            }

            System.out.println(group_number);

        }catch(Exception e) {}


    }

}

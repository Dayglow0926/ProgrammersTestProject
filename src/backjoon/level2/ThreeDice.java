package backjoon.level2;

import solution_interface.Solution_Interface;

import java.util.Scanner;

public class ThreeDice implements Solution_Interface {

    @Override
    public void code_start() {
        Scanner in = new Scanner(System.in);

        int first_num = in.nextInt();
        int second_num = in.nextInt();
        int third_num = in.nextInt();

        int reward = 0;

        if( first_num == second_num && second_num == third_num){
            reward = 10000 + (first_num * 1000);
        }else if(first_num == second_num || first_num == third_num){
            reward = 1000 + first_num * 100;
        }else if(second_num == third_num){
            reward = 1000 + second_num * 100;
        }else{
            if(first_num > second_num && first_num > third_num){
                reward = first_num * 100;
            }else if(second_num > first_num && second_num > third_num){
                reward = second_num * 100;
            }else{
                reward = third_num * 100;
            }
        }

        System.out.println(reward);
    }
}

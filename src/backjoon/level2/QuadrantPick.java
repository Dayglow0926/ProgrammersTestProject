package backjoon.level2;

import solution_interface.Solution_Interface;

import java.util.Scanner;

public class QuadrantPick implements Solution_Interface {

    @Override
    public void code_start() {
        Scanner scan = new Scanner(System.in);

        int first_num = scan.nextInt();
        int second_num = scan.nextInt();

        if( first_num > 0){
            if(second_num > 0 ) System.out.println(1);
            else System.out.println(4);
        }else{
            if(second_num > 0 ) System.out.println(2);
            else System.out.println(3);
        }
    }


}

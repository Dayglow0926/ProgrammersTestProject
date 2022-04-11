package backjoon.level3;

import solution_interface.Solution_Interface;

import java.util.Scanner;

public class APlusB implements Solution_Interface {
    @Override
    public void code_start() {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();

        int[] number = new int[count];

        for(int i=0; i<count; i++){
            int first = in.nextInt();
            int second = in.nextInt();

            number[i] = first + second;
        }

        for(int num : number){
            System.out.println(num);
        }

    }


}

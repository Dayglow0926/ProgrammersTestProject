package backjoon.level3;

import solution_interface.Solution_Interface;

import java.util.Scanner;

public class APlusBSeven implements Solution_Interface {
    @Override
    public void code_start() {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();

        for(int i=1; i<=count; i++){

            int first = in.nextInt();
            int second = in.nextInt();

            System.out.println("Case #"+i+": "+(first+second));

        }
    }
}

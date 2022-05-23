package backjoon.level7;

import solution_interface.Solution_Interface;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BreakEventPoint implements Solution_Interface {
    @Override
    public void code_start() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            String[] product_info = br.readLine().split(" ");
            int benefit = Integer.parseInt(product_info[2]) - Integer.parseInt(product_info[1]);

            if(benefit<=0) {
                System.out.println(-1);
                return;
            }

            int break_even_point = Integer.parseInt(product_info[0])/benefit + 1;

            System.out.println(break_even_point);



        }catch(Exception e) {}

    }
}

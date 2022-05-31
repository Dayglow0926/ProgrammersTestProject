package backjoon.level7;

import solution_interface.Solution_Interface;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SnailsWantToGoUp implements Solution_Interface {
    @Override
    public void code_start() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] val = br.readLine().split(" ");
            double len = Integer.parseInt(val[2]) - Integer.parseInt(val[0]);
            if(len <= 0) {
                System.out.println("1");
                return ;
            }
            double climbing = Integer.parseInt(val[0]) - Integer.parseInt(val[1]);
            if(climbing <= 0) {
                System.out.println("0");
                return ;
            }
            int result = (int) (Math.ceil(len/climbing) + 1);
            System.out.println(result);
        }catch(Exception e) {}
    }
}

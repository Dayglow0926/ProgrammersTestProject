import level1.*;
import solution_interface.Solution_Interface;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){

        //Solution_Interface solution = new Commodity_Support();
        //solution.code_start();`

        Scanner in = new Scanner(System.in);
        int first_number = in.nextInt();
        int next_number = in.nextInt();

        System.out.println(first_number*(next_number%10));
        System.out.println(first_number*((next_number%100)/10));
        System.out.println(first_number*(next_number/100));
        System.out.println(first_number*(next_number));

    }
}

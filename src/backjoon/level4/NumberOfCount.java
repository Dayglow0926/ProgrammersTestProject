package backjoon.level4;

import solution_interface.Solution_Interface;

import java.util.Scanner;

public class NumberOfCount implements Solution_Interface {
    @Override
    public void code_start() {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        String total = String.valueOf(a*b*c);
        System.out.println(total);
        int[] number_count = new int[10];

        for(String str : total.split("")){
            int num = Integer.parseInt(str);
            switch (num){
                case 0 : number_count[num]++;
                    break;
                case 1 : number_count[num]++;
                    break;
                case 2 : number_count[num]++;
                    break;
                case 3 : number_count[num]++;
                    break;
                case 4 : number_count[num]++;
                    break;
                case 5 : number_count[num]++;
                    break;
                case 6 : number_count[num]++;
                    break;
                case 7 : number_count[num]++;
                    break;
                case 8 : number_count[num]++;
                    break;
                case 9 : number_count[num]++;
            }
        }

        for(int num : number_count){
            System.out.println(num);
        }
    }
}

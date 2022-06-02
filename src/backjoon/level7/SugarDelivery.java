package backjoon.level7;

import solution_interface.Solution_Interface;

import java.util.Scanner;

public class SugarDelivery implements Solution_Interface {
    @Override
    public void code_start() {
        Scanner scan = new Scanner(System.in);
        int suga = scan.nextInt();
        int five = suga/5;
        int num = suga%5;
        int result = five;
        if(num!=0){
            while(five>0){
                if(num%3==0){
                    result = five+(num/3);
                    break;
                }else{
                    five--;
                    num+=5;
                }
            }
            if(num%3==0){
                result = five+(num/3);
            }else{
                result = -1;
            }
        }
        System.out.println(result);
    }
}

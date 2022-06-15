package backjoon.level9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Factorial {

    public static void main(String[] args){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            int number = Integer.parseInt(br.readLine());

            System.out.println(factorial(number));

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static int factorial(int number){
        if(number > 1) return number * factorial(number-1);
        return 1;
    }

}

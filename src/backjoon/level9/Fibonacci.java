package backjoon.level9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fibonacci {

    public static void main(String[] args){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{

            int[] numberList = fibonacci(Integer.parseInt(br.readLine()));
            System.out.println(numberList[1]);

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static int[] fibonacci(int inputNumber){
        int[] result = {0,inputNumber};
        if(inputNumber>1) {
            result = fibonacci(inputNumber-1);

            int temp = result[0];
            result[0] = result[1];
            result[1] += temp;
        }
        return result;
    }

}

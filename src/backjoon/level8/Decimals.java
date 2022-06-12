package backjoon.level8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Decimals {

    public static void main(String[] args){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{

            int min = Integer.parseInt(br.readLine());
            int max = Integer.parseInt(br.readLine());

            int min_decimal = -1;
            int result = 0;

            for (; min<=max ; min++){
                int number = checkDecimals(min);
                if(min_decimal==-1 && number!=0) min_decimal = number;
                result += number;
            }

            if(result != 0) System.out.println(result);

            System.out.println(min_decimal);

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static int checkDecimals(int number){

        if( number == 1 || (number%2==0 && number != 2) ) return 0;
        for (int i=3; i<number; i+=2){
            if(number%i == 0) return 0;
        }
        return number;
    }

}

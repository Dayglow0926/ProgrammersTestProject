package backjoon.level10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Decomposition {

    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            String input_number = br.readLine();
            int number_len = input_number.length();
            int int_number = Integer.parseInt(input_number);
            int result = 0;

            for(int i = (int_number - (number_len * 9)); i < int_number; i++) {
                int number = i;
                int sum = 0;

                while(number != 0) {
                    sum += number % 10;
                    number /= 10;
                }
                if(sum + i == int_number) {
                    result = i;
                    break;
                }
            }

            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace();
        }


    }

}


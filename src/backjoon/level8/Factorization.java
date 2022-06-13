package backjoon.level8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Factorization {

    public static void main(String[] arg){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{

            int number = Integer.parseInt(br.readLine());
            int result = number;

            for(int i=2; i<=result;){
                if(result%i == 0){
                    System.out.println(i);
                    result/=i;
                }else{
                    i++;
                }
            }

            if(number == result && number!=1) System.out.println(result);

        }catch (Exception e){
            e.printStackTrace();
        }


    }

}

package backjoon.level8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class FindDecimals {

    public static int decimal_count = 0;

    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{

            int count = Integer.parseInt(br.readLine());
            Stream<String> numberList = Arrays.stream(br.readLine().trim().split(" "));

            numberList
                    .map( a -> Integer.parseInt(a) )
                    .filter( a -> a==2 || a%2 != 0 && a > 1)
                    .forEach( a -> findDecimal(a) );

            System.out.println(decimal_count);

        }catch (Exception e){}

    }

    /*
        소수는 1과 자기 자신이 아닌 수에 나눠지지 않는다.
        소수는 홀수이다.
        1은 소수가 아니다
     */
    public static void findDecimal(int number){

        for(int i=3; i<number ; i=i+2){
            if(number%i==0) return;
        }

        decimal_count++;
    }

}

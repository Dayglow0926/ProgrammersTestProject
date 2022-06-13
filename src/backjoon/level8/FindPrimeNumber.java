package backjoon.level8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//에라토스테네스의 체 사용
public class FindPrimeNumber {

    public static void main(String[] args){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{

            String[] numbers = br.readLine().split(" ");

            int min = Integer.parseInt(numbers[0]);
            int max = Integer.parseInt(numbers[1]);

            boolean[] check = new boolean[max+1];
            check[0] = check[1] = true;

            for(int i = 2; i <= max; i++){
                if(check[i] == false){
                    if(i >= min)
                        System.out.println(i);
                    for(int j = i+i; j <= max; j+=i)
                        check[j] = true;
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}

package backjoon.level8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GoldbachConjecture {

    private static boolean[] primeNumber = new boolean[10001];

    public static void main(String[] args){

        findPrimeNumber();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int count = Integer.parseInt(br.readLine());

            for (int i=0; i<count; i++){
                findPrimeNumber(Integer.parseInt(br.readLine()));
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void findPrimeNumber(int number){

        int prime_number_min = 0;
        int prime_number_max = 5000;

        for (int i=2; i<=number/2; i++){
            int num = number - i;
            if(!primeNumber[num]&&!primeNumber[i]){
                if(num - i < prime_number_max - prime_number_min){
                    prime_number_max = num;
                    prime_number_min = i;
                }
            }
        }

        System.out.println(prime_number_min+" "+prime_number_max);

    }

    public static void findPrimeNumber(){

        primeNumber[0] = primeNumber[1] = true;
        for(int i=2; i<=5000 ; i++){
            if(!primeNumber[i]){
                for (int j=i+i; j<=10000; j+=i){
                    primeNumber[j] = true;
                }
            }
        }

    }
}

package backjoon.level8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BertAndGongjun {

    private static boolean[] primeNumber = new boolean[246913];

    public static void main(String[] args){
        findPrimeNumber();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            while(true){
                int number = Integer.parseInt(br.readLine());
                if(number==0) break;
                int count = 0;

                for (int i=number+1; i<=number*2; i++){
                    if(!primeNumber[i]) count++;
                }

                System.out.println(count);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void findPrimeNumber(){

        primeNumber[0] = primeNumber[1] = true;
        for(int i=2; i<=123456 ; i++){
            if(!primeNumber[i]){
                for (int j=i+i; j<=246913; j+=i){
                    primeNumber[j] = true;
                }
            }
        }

    }

}

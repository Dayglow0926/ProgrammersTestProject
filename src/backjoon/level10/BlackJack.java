package backjoon.level10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BlackJack {

    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            String[] role = br.readLine().split(" ");
            int[] card =
                    Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int max = Integer.parseInt(role[1]);
            int result = 0;

            for (int i=0;i<= card.length-3; i++){
                for (int j=i+1; j<=card.length-2; j++){
                    for (int n=j+1; n<=card.length-1; n++){
                        int sum = card[i]+card[j]+card[n];
                        int check = max-sum;
                        if(check>=0 && check <max-result) result = sum;
                    }
                }
            }
            System.out.println(result);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

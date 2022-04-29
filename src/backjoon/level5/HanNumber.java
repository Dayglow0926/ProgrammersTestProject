package backjoon.level5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HanNumber {

    public static void main(String[] args){

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(han_num(Integer.parseInt(br.readLine())));
        }catch(Exception e) {

        }

    }

    private static int han_num(int number) {

        int count=0;

        for(int i=1; i<=number; i++) {
            count += checkHanNumber(i);
        }

        return count;

    }



    private static int checkHanNumber(int number) {

        if(number<100) return 1;

        String[] s_number = String.valueOf(number).split("");

        int pre = 0;
        int next = 0;

        for(int i=1; i<s_number.length; i++) {
            pre = next;
            next = Integer.parseInt(s_number[i-1]) - Integer.parseInt(s_number[i]);

            if(i>1 && pre != next) return 0;

        }

        return 1;

    }

}

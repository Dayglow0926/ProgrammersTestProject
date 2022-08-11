package programmers.level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class AlphabetSort {

    public static void main(String[] str){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String s = br.readLine();

            String[] sList = s.split("");
            Arrays.sort(sList, Collections.reverseOrder());

            System.out.println(String.join("",sList));

        }catch (Exception e){}
    }

}

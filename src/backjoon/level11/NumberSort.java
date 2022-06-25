package backjoon.level11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberSort {

    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            int count = Integer.parseInt(br.readLine());
            List<Integer> numbers = new ArrayList<>();

            for (int i=0; i<count; i++){
                numbers.add(Integer.parseInt(br.readLine()));
            }

            Collections.sort(numbers);

            numbers.stream().forEach(a -> System.out.println(a));

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

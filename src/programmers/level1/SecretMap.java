package programmers.level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class SecretMap {

    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            int[] arr1 = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            int[] arr2 = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();

            String[] answer = new String[n];

            for(int i=0; i<n; i++){
                answer[i] = String.format("%"+n+"s",
                        Integer.toBinaryString(arr1[i]|arr2[i])
                        .replaceAll("1","#")
                        .replaceAll("0"," "));

                System.out.println(answer[i]);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
/**
 * 문제 풀면서 배운점
 * 2진수의 계산은 String 상태에서 | & 로 비트 연산이 가능하다.
 * 문자를 채울땐 String.format 을 사용하면 편하다!
 * */


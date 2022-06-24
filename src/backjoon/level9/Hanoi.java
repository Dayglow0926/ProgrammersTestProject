package backjoon.level9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hanoi {

    static StringBuilder result = new StringBuilder();

    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            int N = Integer.parseInt(br.readLine());
            System.out.println(hanoi_move(N, '1', '2', '3'));
            System.out.println(result.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    static int hanoi_move(int num, char from, char by, char to) {

        int count = 1;
        if (num == 1) { // 재귀의 탈출 조건: 이동할 원반 수가 1개라면
            result.append(from + " " + to+"\n");
        } else {
            count += hanoi_move(num - 1, from, to, by);
            result.append(from + " " + to+"\n");
            count += hanoi_move(num - 1, by, from, to);
        }

        return count;
    }

}

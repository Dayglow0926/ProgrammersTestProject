package backjoon.level4;

import solution_interface.Solution_Interface;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OXQuiz implements Solution_Interface {

    @Override
    public void code_start() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = 0;

        try {

            test_case = Integer.parseInt(br.readLine());

            for(int i=0; i<test_case; i++) {
                oxScore(br.readLine());
            }

        }catch(Exception e) {

        }
    }

    public static void oxScore(String oxList) {

        int now_score = 0;
        int score = 0;
        int total_score = 0;

        for(String ox : oxList.split("")) {

            if(ox.equals("O")) now_score += ++score ;
            else {
                total_score += now_score;
                now_score = 0;
                score = 0;
            }
        }

        total_score += now_score;

        System.out.println(total_score);

    }
}

package backjoon.level4;

import solution_interface.Solution_Interface;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Im_sure_the_average_is_right implements Solution_Interface {

    @Override
    public void code_start() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = 0;

        try {

            test_case = Integer.parseInt(br.readLine());

            for(int i=0; i<test_case; i++) {
                averageScore(br.readLine());
            }

        }catch(Exception e) {

        }
    }

    public static void averageScore(String str) {

        String[] scoreList = str.split(" ");
        int count = Integer.parseInt(scoreList[0]);
        double[] doubleScoreList = new double[count];
        double totalScore = 0.000;

        for(int i=1; i<= count ; i++) {
            doubleScoreList[i-1] = Double.parseDouble(scoreList[i]);
            totalScore += doubleScoreList[i-1];
        }

        double average = totalScore/count;
        double averageOver = 0;

        for(int i=0; i< count ; i++) {
            if( doubleScoreList[i] > average ) averageOver++;
        }

        System.out.println(String.format("%.3f", averageOver/count*100)+"%");

    }

}

package backjoon.level6;

import solution_interface.Solution_Interface;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringRepeat implements Solution_Interface {

    @Override
    public void code_start() {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int count = Integer.parseInt(br.readLine());
            for(int i=0; i<count; i++){
                stringPrint(br.readLine());
                System.out.println();
            }
        }catch (Exception e){}

    }

    private void stringPrint(String testCase){

        String[] list = testCase.split(" ");
        int count = Integer.parseInt(list[0]);
        String[] testcase = list[1].split("");

        for(String str : testcase) {
            for (int i = 0; count > i; i++) {
                System.out.print(str);
            }
        }

    }

}

package backjoon.level6;

import solution_interface.Solution_Interface;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GroupWordChecker implements Solution_Interface {
    @Override
    public void code_start() {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int count = Integer.parseInt(br.readLine());
            int groupWordCount = 0;

            for(int i=0; count>i; i++) {

                if(groupWord(br.readLine())) {
                    groupWordCount++;
                }

            }

            System.out.println(groupWordCount);
        }catch(Exception e) {}

    }

    public static boolean groupWord(String word) {

        boolean result = true;

        String before = "";
        String memory = "";

        for(String s : word.split("")) {
            if(memory.indexOf(s)>-1) {
                result = false;
                break;
            }
            if(!before.equals(s)) {
                memory += before;
                before = s;
            }
        }

        return result;
    }
}

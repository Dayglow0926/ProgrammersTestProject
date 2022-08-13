package programmers.level1;

import java.util.*;

public class KNumber {

    public static void main(String[] args){
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int start = commands[i][0]-1;
            int end = commands[i][1];
            List<Integer> checkList = new ArrayList<>();

            for (;start!=end; start++){
                checkList.add(array[start]);
            }
            Collections.sort(checkList);
            answer[i] = checkList.get(commands[i][2]-1);
        }

        System.out.println(answer);
    }
}

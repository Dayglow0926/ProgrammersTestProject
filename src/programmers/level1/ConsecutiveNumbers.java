package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class ConsecutiveNumbers {
    public static void main(String[] str){
        int[] arr = {1,1,3,3,0,1,1};
        List<Integer> list = new ArrayList<>();
        int prev = arr[0];

        for(int i=1; i<arr.length; i++){
            if(prev != arr[i]){
                list.add(prev);
                prev = arr[i];
            }
        }
        list.add(arr[arr.length-1]);

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();

    }
}

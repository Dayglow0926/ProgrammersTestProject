package backjoon.level5;

import java.util.*;

public class SelfNumber {

    private static int temp_number = 0;
    private static List<Integer> not_self_number_list = new ArrayList<>();

    public static void main(String[] args){
        for(int i=1; i<10000; i++) {
            check_self_number(i);
        }
        for(int i=1; i<10000; i++) {
            self_number(i);
        }

    }


    public static void check_self_number(int num) {
        not_self_number_list.add(not_self_number(num));

    }

    public static void self_number(int num) {
        if(!not_self_number_list.contains(num)) {
            System.out.println(num);
        }
    }

    public static int not_self_number(int num) {
        String s_num = String.valueOf(num);
        return num + number_seat_sum(s_num);
    }

    public static int number_seat_sum(String s_num) {
        int total_s_num = 0;
        for(String str : s_num.split("")) {
            total_s_num += Integer.parseInt(str);
        }
        return total_s_num;

    }
}
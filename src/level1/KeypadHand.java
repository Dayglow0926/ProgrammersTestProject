package level1;

import solution_interface.Solution_Interface;

/**
 * 숫자 키패드 문제
 *
 * 경우의 수 설계 미흡으로 인한 재 설계가 필요함
 *
 * 필요 조건
 * 1. 왼손과 오른손의 위치
 * 2. 현재 위치와 다음 위치에 대한 거리
 *
 */
public class KeypadHand implements Solution_Interface {

    @Override
    public void code_start() {

    }

    public String solution(int[] numbers, String hand){
        String answer = "";
        int left_now = 0;
        int right_now = 0;

        for(int i : numbers){

            // 왼손
            if(i == 1 || i == 4 || i == 7) {
                answer += "L";
            //오른손
            }else if(i == 3 || i == 6 || i == 9) {
                answer += "R";
            }

        }

        return answer;
    }

    public int keypad_number_length(int now, int next_number){
        if(now == 1 || now == 3){
            if(next_number == 0) return 4;
            if(next_number == 8) return 3;
            if(next_number == 5) return 2;
            if(next_number == 2) return 1;
        }else if(now == 4 || now == 6){
            if(next_number == 0) return 3;
            if(next_number == 8) return 2;
            if(next_number == 5) return 1;
            if(next_number == 2) return 2;
        }else if(now == 7 || now == 9){
            if(next_number == 0) return 2;
            if(next_number == 8) return 1;
            if(next_number == 5) return 2;
            if(next_number == 2) return 3;
        }else if(now == 7 || now == 9){
            if(next_number == 0) return 2;
            if(next_number == 8) return 1;
            if(next_number == 5) return 2;
            if(next_number == 2) return 3;
        }

        return 0;
    }
}

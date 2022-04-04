package level1;

import solution_interface.Solution_Interface;

import java.util.Arrays;


public class Commodity_Support implements Solution_Interface {

    @Override
    public void code_start() {

        int[] d = {1,3,2,5,4};
        int budget = 9;

        System.out.println(solution(d,budget));

    }

    public int solution(int[] d, int budget){
        int answer = 0;
        int total = 0;

        // 입력된 부서별 신청금액을 오름차순으로 정렬
        Arrays.sort(d);

        for(int i : d){
            total += i;
            if(total>budget) break;
            answer++;
        }

        return answer;
    }
}

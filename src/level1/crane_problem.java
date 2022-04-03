package level1;

import solution_interface.Solution_Interface;

public class crane_problem implements Solution_Interface {

    public void code_start(){
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        System.out.println(solution(board,moves));
    }

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int basket[] = new int[moves.length+1];
        int now_location = 1;

        for(int i : moves){
            for(int[] mini_board : board){
                System.out.println(mini_board[i-1]);
                int doll = mini_board[i-1];

                if(doll != 0){
                    if(basket[now_location-1] == doll){
                        answer++;
                    }
                    System.out.println(now_location);
                    basket[now_location] = doll;
                    now_location++;
                }
            }
        }

        return answer;
    }

}

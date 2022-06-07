package backjoon.level7;

import solution_interface.Solution_Interface;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WomenPresident implements Solution_Interface {

    public int[][] apartment = new int[15][15];

    @Override
    public void code_start() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        downstairsPeople();
        try{

            int count = Integer.parseInt(br.readLine());

            for (int i=0; count>i; i++){
                int floor = Integer.parseInt(br.readLine());
                int ho = Integer.parseInt(br.readLine());

                System.out.println(apartment[floor][ho]);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void downstairsPeople(){

        for(int i=1; i<15; i++){
            apartment[0][i] = i;
        }

        for(int i=1; i<15; i++){
            for (int j=1; j<15; j++){
                if(j == 1)
                    apartment[i][j] = 1;
                else
                    apartment[i][j] = apartment[i-1][j] + apartment[i][j - 1];
            }
        }
    }

}

package backjoon.level7;

import solution_interface.Solution_Interface;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindFountain implements Solution_Interface {
    @Override
    public void code_start() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int count = Integer.parseInt(br.readLine());
            int x=1, y=1;

            for(int i=1; i <count ; i++) {

                if(x==1 && y==1) y++;
                else if( (x+y)%2 == 1  ) {
                    x++;
                    if(y!=1) y--;
                }else if( (x+y)%2 != 1 ) {
                    y++;
                    if(x!=1) x--;
                }
            }

            System.out.println(x+"/"+y);

        }catch(Exception e) {}

    }
}

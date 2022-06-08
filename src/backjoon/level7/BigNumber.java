package backjoon.level7;

import solution_interface.Solution_Interface;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BigNumber implements Solution_Interface {

    @Override
    public void code_start() {

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            BigInteger A = new BigInteger(st.nextToken());
            BigInteger B = new BigInteger(st.nextToken());

            A = A.add(B);

            System.out.println(A.toString());

        }catch (Exception e){
            e.printStackTrace();
        }


    }

}

package backjoon.level6;

import solution_interface.Solution_Interface;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ASCIICode implements Solution_Interface {

    @Override
    public void code_start() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String code = br.readLine();
            System.out.println((int)code.charAt(0));
        }catch (Exception e){
        }

    }
}

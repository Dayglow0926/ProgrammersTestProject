package backjoon.level6;

import solution_interface.Solution_Interface;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindAlphabet implements Solution_Interface {

    private final char[] alphabetList = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    @Override
    public void code_start() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String work = br.readLine();

            for(char alphabet : alphabetList){
                System.out.print(work.indexOf(alphabet)+" ");
            }

        }catch (Exception e){}


    }

}

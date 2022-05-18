package backjoon.level6;

import java.io.*;
import solution_interface.Solution_Interface;

public class WordCount implements Solution_Interface {

    @Override
    public void code_start() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] words = br.readLine().trim().split(" ");
            int length = words.length;

            if(words[0].equals("")) length = 0;

            System.out.println(length);
        }catch(Exception e) {}
    }

}

package backjoon.level6;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import solution_interface.Solution_Interface;

public class Dial implements Solution_Interface {

    public static final String[] callWords = {"ABC:2","DEF:3","GHI:4","JKL:5","MNO:6","PQRS:7","TUV:8","WXYZ:9"};

    @Override
    public void code_start() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String callWord = br.readLine();
            int time = Arrays.stream(callWord.split("")).map( a -> callNumber(a) ).reduce(0,Integer::sum);

            System.out.println(time);


        }catch(Exception e) {}
    }

    public static int callNumber(String alphabet) {


        List<String> callWordList = Arrays.asList(callWords);
        int result = 1;

        result += Integer.parseInt( callWordList.stream().filter(a -> a.indexOf(alphabet)>-1 ).map(a -> a.split(":")[1]).collect(Collectors.joining()));

        return result;

    }

}

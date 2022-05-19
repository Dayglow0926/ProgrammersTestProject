package backjoon.level6;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import solution_interface.Solution_Interface;

public class SangSoo implements Solution_Interface {


    @Override
    public void code_start() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            List<String> numbers = Arrays.asList(br.readLine().split(" "));
            numbers = numbers.stream().map(a -> numberListReverse(a)).collect(Collectors.toList());

            Collections.sort(numbers,Collections.reverseOrder());

            System.out.println(numbers.get(0));

        }catch(Exception e) {}
    }

    public String numberListReverse(String number) {
        String[] numberList = number.split("");
        int numberLength = numberList.length;

        for(int i=0; i<numberLength/2; i++  ) {
            int j = numberLength-1;
            String tmp = numberList[j-i];
            numberList[j-i] = numberList[i];
            numberList[i] = tmp;
        }

        return Arrays.stream(numberList).collect(Collectors.joining());

    }


}

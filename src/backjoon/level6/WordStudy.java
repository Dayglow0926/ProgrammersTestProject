package backjoon.level6;

import solution_interface.Solution_Interface;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class WordStudy implements Solution_Interface {
    @Override
    public void code_start() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] line = br.readLine().toUpperCase().split("");
            String[] alpabat = Arrays.stream(line).distinct().toArray(String[]::new);
            String result = "";
            long max = 0;

            for(String s : alpabat) {

                Stream<String> stream = Stream.of(line);

                long count = stream.filter( a -> a.equals(s)).count();

                if(max < count ) {
                    max = count;
                    result = s;
                }else if(max == count) result = "?";
            }

            System.out.println(result);

        }catch(Exception e) {

        }
    }
}

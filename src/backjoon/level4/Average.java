package backjoon.level4;

import solution_interface.Solution_Interface;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Average implements Solution_Interface {

    @Override
    public void code_start() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double totalSubjects = 0;

        try {
            int numberOfSubjects =  Integer.parseInt(br.readLine());

            List<Double> record = new ArrayList<>();
            for( String str : br.readLine().split(" ")) {
                record.add(Double.parseDouble(str));
            }

            Collections.sort(record, Collections.reverseOrder());
            double m = record.get(0);

            for(int i=0; i<numberOfSubjects; i++) {
                totalSubjects += (record.get(i)/m)*100;
            }

            System.out.println(String.format("%.6f", totalSubjects/numberOfSubjects));

        }catch(Exception e) {

        }
    }

}

package backjoon.level6;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import solution_interface.Solution_Interface;

public class CrotiaAlphabet implements Solution_Interface {

    private static String regex = "(c=)|(ć)|(c-)|(dz=)|(d-)|(lj)|(nj)|(s=)|(z=)";

    @Override
    public void code_start() {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String croatia = br.readLine();
            croatia = croatia.replaceAll(regex, "1");

            System.out.println(croatia.length());


        }catch(Exception e) {}

    }
}

package programmers.level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringLengthCheck {

    public static void main(String[] arg){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean check = false;
        try{
            String str = br.readLine().replaceAll("\"","");
            System.out.println(str);

            int strLength = str.length();


            if(strLength==4 || strLength ==6){
                Integer.parseInt(str);
                check = true;
            }
        }catch (NumberFormatException nfe){
        }catch (Exception e){}

        System.out.println(check);

    }

}

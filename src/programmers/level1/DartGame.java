package programmers.level1;

import java.util.regex.Pattern;

public class DartGame {
    public static void main(String[] args){
        String dartResult = "1D#2S*3S";
        dartResult = dartResult.replaceAll("([^0-9])", "!"+"$1"+"!").replace("!!","!");
        String[] dartResultList = dartResult.split("!");

        double preScore = 0;
        double resultScore = 0;
        for(int i=0; i<dartResultList.length;){
            double score = 0 ;
            double defaultScore = Double.parseDouble(dartResultList[i]);
            String bonus = dartResultList[i+1];

            switch (bonus){
                case "S" : score = Math.pow(defaultScore,1);
                    break;
                case "D" : score = Math.pow(defaultScore,2);
                    break;
                case "T" : score = Math.pow(defaultScore,3);
                    break;
            }

            try{
                switch (dartResultList[i + 2]) {
                    case "*":
                        preScore *= 2;
                        score *= 2;
                        i += 3;
                        break;
                    case "#":
                        score *= -1;
                        i += 3;
                        break;
                    default:
                        i += 2;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                resultScore += preScore;
                preScore = score;
                break;
            }

            resultScore += preScore;
            preScore = score;

        }
        resultScore += preScore;

        System.out.println(new Double(resultScore).intValue());
    }
}

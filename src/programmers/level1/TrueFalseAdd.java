package programmers.level1;

public class TrueFalseAdd {

    public static void main(String[] arg){
        int[] absolutes = {1,2,3};
        boolean[] signs = {false,false,true};

        int answer = 0;

        for(int i=0; i<absolutes.length; i++){
            if(!signs[i]) absolutes[i] *= -1;
            answer += absolutes[i];
        }

        System.out.println(answer);
    }
}

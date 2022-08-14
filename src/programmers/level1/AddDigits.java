package programmers.level1;

public class AddDigits {
    public static void main(String[] args){
        int n = 987	;

        int answer = 0;
        for( String num : String.valueOf(n).split("")){
            answer += Integer.parseInt(num);
        }

        System.out.println(answer);

    }
}

package backjoon.level9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StarTakingPicture {

    static StringBuilder[] sb;

    public static void main(String[] args){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{

            int N = Integer.parseInt(br.readLine());
            String s = String.format("%" + N + "s", ' ').replace(' ', '*');
            sb = new StringBuilder[N];

            for (int i=0; i<N; i++) {
                sb[i] = new StringBuilder(s);
            }

            star(0,0,N,false);

            for (int i=0; i<N; i++){
                System.out.println(sb[i]);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    static void star(int x, int y, int N, boolean blank){

        if(blank){
            for (int i=x; i<x+N; i++){
                for (int j=y; j<y+N; j++){
                    sb[i].setCharAt(j,' ');
                }
            }
        }

        if (N <= 1) return;

        int size = N/3;
        int count = 0;

        for (int i=x; i<x+N; i+=size){
            for (int j=y; j<y+N; j+=size){
                count++;
                if(count==5){
                    star(i,j,size,true);
                }else{
                    star(i,j,size,false);
                }
            }
        }

    }



}

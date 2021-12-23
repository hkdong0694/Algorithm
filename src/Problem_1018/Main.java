package Problem_1018;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String arr[][] = new String[N][M];

        for(int i=0;i<N;i++) {
            String chess = br.readLine();
            for(int j = 0; j< M; j++) {
                arr[i][j] = String.valueOf(chess.charAt(j));
            }
        }

        int min = 0;

        for(int i=0; i< 2; i++) {
            int count = chessCheck(i, arr);
            if(min < count) min = count;
        }

        bw.write(min + "");
        bw.flush();
        bw.close();
        br.close();

    }

    private static int chessCheck(int i , String arr[][]) {
        int count = 0;
        String color = "";
        if(i == 0) color = "B";
        else color = "W";
        String prevColor = "";

        for(int k=0;k<arr.length;k++) {
            if( k > 0 ) prevColor = arr[k-1][0];
            else prevColor = color;
            for(int j = 0; j< arr[k].length; j++) {

            }
        }

        return count;
    }


}

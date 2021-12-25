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

        }

        bw.write(min + "");
        bw.flush();
        bw.close();
        br.close();

    }
}

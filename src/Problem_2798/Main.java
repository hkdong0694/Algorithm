package Problem_2798;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    // 블랙잭 [ 백준 2798 ]
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int arr[] = new int[count];

        st = new StringTokenizer(br.readLine());
        int len = arr.length;
        for(int i = 0; i < len; i++) arr[i] = Integer.parseInt(st.nextToken());

        int max = 0;

        // 모든 경우의 수를 돌려준다 ( 브루트 포스 )
        for(int i = 0; i< len; i++) {
            int j = i + 1;
            if(j > len) continue;
            for(; j< len; j++) {
                int z = j + 1;
                for(; z < len; z++) {
                    if(z > len) continue;
                    int sum = arr[i] + arr[j] + arr[z];
                    if(sum > M) continue;
                    if(sum > max) max = sum;
                }
            }
        }
        bw.write(max + "");
        bw.flush();
        bw.close();
        br.close();
    }
}

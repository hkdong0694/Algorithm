package Problem_7568;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    // 7568 덩치
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int test = Integer.parseInt(br.readLine());
        int arr[][] = new int[test][2];

        for(int i=0;i<arr.length;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int grade[] = new int[test];
        int i = 0;

        while(i != test) {
            int result = 0;
            for(int j=0;j<arr.length;j++) {
                if(i == j ) continue;
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    result++;
                }
            }
            grade[i++] = result+1;
        }
        for(int k=0;k<grade.length;k++) bw.write(grade[k] + " ");
        bw.flush();
        bw.close();
        br.close();
    }
}

package Problem_2309;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int arr[] = new int[9];
        int result[] = new int[7];
        int len = arr.length;
        for(int i = 0; i< len; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        boolean isCheck = true;
        // 9C7 -> 36 번만 돌리면 모두 검색 가능
        for(int i = 0; i < 3; i++) {
            for(int j = i+1; j < 4; j++) {
                for(int z = j+1; z < 5; z++) {
                    for( int k = z+1; k < 6; k++) {
                        for ( int q = k+1; q < 7; q++) {
                            for ( int e = q+1; e < 8; e++) {
                                for( int a = e+1; a < 9; a++) {
                                    int sum = arr[i] + arr[j] + arr[z] + arr[k] + arr[q] + arr[e] + arr[a] ;
                                    if(sum == 100) {
                                        result[0] = arr[i];
                                        result[1] = arr[j];
                                        result[2] = arr[z];
                                        result[3] = arr[k];
                                        result[4] = arr[q];
                                        result[5] = arr[e];
                                        result[6] = arr[a];
                                        isCheck = false;
                                        break;
                                    }
                                }
                                if(!isCheck) break;
                            }
                            if(!isCheck) break;
                        }
                        if(!isCheck) break;
                    }
                    if(!isCheck) break;
                }
                if(!isCheck) break;
            }
            if(!isCheck) break;
        }

        Arrays.sort(result);

        for(int i = 0; i< result.length; i++) {
            bw.write(result[i] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }

}

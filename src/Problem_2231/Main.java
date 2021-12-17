package Problem_2231;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());
        int resultNumber = 0;

        for(int i = 1; i <= number; i++) {
            int result = divideSum(i);
            if(result == number) {
                resultNumber = i;
                break;
            }
        }

        bw.write(resultNumber + "");
        bw.flush();
        bw.close();
        br.close();
    }

    private static int divideSum(int number) {
        int sum = 0;
        int result = number;
        while(result > 0) {
            sum += result % 10;
            result /= 10;
        }
        sum += number;
        return sum;
    }

}

package Problem_1065;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String number = br.readLine();

        int result = 99;

        if(Integer.parseInt(number) <= 99) {
            bw.write(number);
        } else if(Integer.parseInt(number) <= 110) {
            bw.write(result + "");
        } else {
            boolean ck;
            for(int i = Integer.parseInt(number); i >=111; i--) {
                ck = hansu(String.valueOf(i));
                if(ck) result++;
            }
            bw.write(result + "");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean hansu(String number) {
        boolean check;
        int i = 0;
        int arr[] = new int[2];
        while(i != 2) {
            arr[i] = Integer.parseInt(String.valueOf(number.charAt(i+1))) - Integer.parseInt(String.valueOf(number.charAt(i)));
            i++;
        }

        if(arr[0] == arr[1]) check = true;
        else check = false;

        return check;
    }

}
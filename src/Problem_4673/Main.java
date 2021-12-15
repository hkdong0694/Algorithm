package Problem_4673;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {

    private static boolean[] checkSelfNumber = new boolean[10000];

    // 셀프 넘버 [ 백준 4673 ]
    public static void main(String[] args) throws Exception {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 1; i< 10000; i++) {
            selfNumber(i);
        }

        int len = checkSelfNumber.length;
        for(int z = 0; z < len - 1; z++) {
            if(!checkSelfNumber[z]) bw.write((z + 1) + "\n");
        }
        bw.flush();
        bw.close();

    }

    private static void selfNumber(int number) {
        int result = 0;
        int divide = number;
        while( divide > 0 ) {
            int a = divide % 10;
            result += a;
            divide /= 10;
        }
        result += number;
        if(result < 10000) {
            checkSelfNumber[result - 1] = true;
        }
    }
}

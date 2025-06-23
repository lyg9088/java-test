package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11_MinValueFinder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[9];
//        int min = 0; // 입력되는 수가 모두 양수일 경우, if문 조건이 한번도 true가 안될수있다
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i=0; i<num.length; i++) {
            num[i] = Integer.parseInt(br.readLine());
            if (min > num[i]) {
                min = num[i];
                index = i;
            }
        }
        System.out.println(min);
        System.out.println(index+1); // 위치는 1부터 시작이므로 +1
    }
}

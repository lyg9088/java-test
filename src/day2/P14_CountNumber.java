package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P14_CountNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int multi = 1;
        for (int i=0; i<3; i++) {
            int num = Integer.parseInt(br.readLine());
            multi *= num;
        }
        int[] count = new int[10]; // 0~9 카운트용 배열
        String str = String.valueOf(multi); // int -> String
        // String str2 = Integer.toString(multi); // 이것도 int -> String

        for (char c : str.toCharArray()) {
            // 해당 char 숫자에 해당하는 인덱스를 1씩 더하는 구조 : count[숫자] -> 빈도수++;
            count[c - '0']++; // '0'의 아스키코드(48) 빼서 인덱스로 사용 (문자->숫자) : char는 내부적으로 정수(아스키코드) 값.
        }

        for (int i=0; i<10; i++) {
            System.out.println(count[i]);
        }


    }
}

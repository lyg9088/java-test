package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P16_ArrayElementCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 정수 N (1<=N<=100)

        StringTokenizer st = new StringTokenizer(br.readLine()); // 숫자들 한줄입력 받아서 공백 기준 분리
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i]= Integer.parseInt(st.nextToken()); // 공백으로 구분된 N개의 정수. nextToken()으로 하나씩 꺼냄.
        }
        int v = Integer.parseInt(br.readLine()); // 찾고자 하는 정수 v

        // count 세기
        int count = 0;
        for (int i=0; i<n; i++) {
            if (arr[i] == v) {
                count++;
            }
        }

        // count2 세기
        // Java8+ 에서 자주 사용되는 Stream API 표현
        long count2 = Arrays.stream(arr).filter(x -> x == v).count();

        System.out.println(count);
        System.out.println(count2);
    }
}

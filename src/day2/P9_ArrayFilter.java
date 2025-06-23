package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P9_ArrayFilter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()); // 두 번째 줄 입력 : 다시 StringTokenizer 초기화
        int[] array = new int[n];
        for (int i=0; i<n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
            if (array[i] < x) {
                System.out.print(array[i]+ " ");
            }
        }
    }
}

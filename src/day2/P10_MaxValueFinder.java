package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10_MaxValueFinder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        int max = 0;
        int index = 0;
        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }

        System.out.println(max+ "\n" +(index+1)); // 1-based index 출력
    }
}

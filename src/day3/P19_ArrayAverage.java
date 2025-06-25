package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P19_ArrayAverage {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        double sum = 0;

        for (int i=0; i<n; i++) {
            sum += Integer.parseInt(st.nextToken());
        }
        System.out.printf("%.2f", sum/n);
    }
}

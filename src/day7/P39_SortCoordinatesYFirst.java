package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class P39_SortCoordinatesYFirst {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            arr[i][0] =  Integer.parseInt(input[0]);
            arr[i][1] =  Integer.parseInt(input[1]);
        }

        Arrays.sort(arr, (o1, o2) ->{
            if (o1[1] == o2[1]) return Integer.compare(o1[0], o2[0]);
            return Integer.compare(o1[1],o2[1]);
        });

        for (int[] xy: arr) {
            System.out.println(xy[0] + " " + xy[1]);
        }
    }
}

package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P22_SimpleSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        for (int i=0; i<n; i++) {
            System.out.print(arr[i]+ " ");
        }

//        Arrays.stream(arr).sorted().forEach(x -> System.out.print(x +" "));
    }
}

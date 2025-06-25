package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class P18_ArrayReverse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // Stream 활용..
//        Integer[] boxed = Arrays.stream(arr).boxed().toArray(Integer[]::new);
//        Collections.reverse(Arrays.asList(boxed));
//        System.out.println(Arrays.toString(boxed));

        for (int i=n-1; i>=0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}

package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class P23_DescendingSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer[] arr = new Integer[n];
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // Collections.reverseOrder() -> int[] X, Integer[] 에서만 동작
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] +" ");
        }

        // 람다식 정리...
        Arrays.stream(arr) // arr 는 int[]가 아닌 Integer[]
                .sorted(Comparator.reverseOrder())
                .forEach(x-> System.out.print(x + " "));

//        Integer[] arr = Arrays.stream(br.readLine().split(" "))
//                .map(Integer::parseInt)
//                .toArray(Integer[]::new);
    }
}

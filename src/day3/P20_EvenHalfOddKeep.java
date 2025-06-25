package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P20_EvenHalfOddKeep {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 람다 + Stream 사용버전 (Java 8 이상)
//        int[] arr = Arrays.stream(br.readLine().split(" "))
//                .mapToInt(Integer::parseInt)
//                .map(x->(x%2==0? x/2 : x)) //람다 적용
//                .toArray();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i]%2==0) {
                arr[i] = arr[i]/2;
            }
        }

//        for (int x : arr) {
//            System.out.print(x + " ");
//        }

        for (int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

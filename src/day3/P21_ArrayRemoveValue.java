package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P21_ArrayRemoveValue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());

        // 람다식 통해 정수 배열 입력받기. 입력/변환
        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int t = Integer.parseInt(br.readLine());

        // 필터링/출력
        Arrays.stream(arr).filter(x -> x!=t ).forEach(x -> System.out.print(x+" "));

    }
}

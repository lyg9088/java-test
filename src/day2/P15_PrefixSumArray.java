package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P15_PrefixSumArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 정수갯수
        int m = Integer.parseInt(st.nextToken()); // 쿼리갯수
        int[] arr = new int[n+1]; // 누적합을 위한 배열 (1-based 인덱스)
        int[] prefixSum = new int[n+1]; // 1-based 인덱싱으로 구간합을 쉽게 계산하기 위해.. n+1로 선언
        // 1. prefixSum[0] = 0 사용 위해
        // 2. IndexOutOfBounds 방지 : 0부터 시작하면 -1 인덱스 문제가 발생할 수 있음..
        // prefixSum[right]-prefixSum[left-1]
        // 3. left가 1이어도 prefixSum[0]=0이 보장되서 코드가 안전하고 간결해짐

        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());
            sb.append(prefixSum[right]-prefixSum[left-1]).append(" ");
        }
        System.out.println(sb);

    }
}

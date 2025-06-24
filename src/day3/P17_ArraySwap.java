package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P17_ArraySwap {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];

      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int i=0; i<n; i++) {
          arr[i] = Integer.parseInt(st.nextToken());
      }
      st = new StringTokenizer(br.readLine());
      int i = Integer.parseInt(st.nextToken());
      int j = Integer.parseInt(st.nextToken());

      int temp = arr[i-1];
      arr[i-1] = arr[j-1];
      arr[j-1] = temp;

      for (int x : arr) {
          System.out.print(x+" ");
      }
      // 람다식은 stream API와 조합해서 자주 쓰임...
      // 아래처럼도 출력가능
      Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
    }
}

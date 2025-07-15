package day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class P32_SetContainsCheck { // 백준 1920번 - 수 찾기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        int M = Integer.parseInt(br.readLine());
        String[] findArr = br.readLine().split(" ");

        HashSet<Integer> hs = new HashSet<>();
        for (int i=0; i<N; i++) {
            hs.add(Integer.parseInt(strArr[i]));
        }

        for (int j=0; j<M; j++) {
            int num = Integer.parseInt(findArr[j]);
            if (hs.contains(num)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}

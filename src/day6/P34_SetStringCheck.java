package day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class P34_SetStringCheck {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int N = Integer.parseInt(str[0]); // 집합 S에 포함된 문자열 개수
        int M = Integer.parseInt(str[1]); // 검사해야 할 문자열의 개수

        HashSet<String> hs = new HashSet<>();
        for (int i=0; i<N; i++) {
            hs.add(br.readLine());
        }

        StringBuilder sb = new StringBuilder();
        for (int j=0; j<M; j++) {
            String checkNum = br.readLine();
            if (hs.contains(checkNum)) {
                sb.append("1\n");
//                System.out.println("1");
            } else {
                sb.append("0\n");
//                System.out.println("0");
            }
        }
        System.out.println(sb);
    }
}

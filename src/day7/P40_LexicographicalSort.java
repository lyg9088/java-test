package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P40_LexicographicalSort { // 백준 1181번 - 단어 정렬
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Set<String> hashSet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            hashSet.add(br.readLine());
        }
        List<String> inputList = new ArrayList<>(hashSet);

        // 조건 1 : 길이 오름차순, 조건 2 : 길이 같으면 사전순 정렬
        Collections.sort(inputList, (o1, o2) -> {
            if (o1.length() != o2.length()) {
                return Integer.compare(o1.length(), o2.length());
            } else {
                return o1.compareTo(o2); // 사전순 비교
            }
        });

        StringBuilder sb = new StringBuilder();
        for (String s : inputList) {
            sb.append(s).append("\n");
        }

        System.out.println(sb);
    }
}

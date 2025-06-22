package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P5_FilteredSetSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int wordCount = Integer.parseInt(st.nextToken());
        int wordLength = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>(); // Set : 중복제거
        for (int i=0; i<wordCount; i++) {
            String word = br.readLine();
            if (word.length() >= wordLength) { // 길이 조건 필터링
                set.add(word);
            }
        }
        List<String> list = new ArrayList<>(set);
        Collections.sort(list, (a, b) -> {
           if (a.length()!=b.length()) {
               return b.length()-a.length(); // 내림차순 : 길이가 긴것부터 정렬
           }
           return a.compareTo(b); // 오름차순 : 알파벳 순으로 정렬
        });

        for (String str: list) {
            System.out.println(str);
        }
    }
}

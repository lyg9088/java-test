package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P6_DuplicateWordCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<n; i++) {
            String word = br.readLine();
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((a,b) -> {
            if (!a.getValue().equals(b.getValue())) {
                return b.getValue()-a.getValue(); // 등장 횟수(값) 기준으로 내림차순
            }
            return a.getKey().compareTo(b.getKey()); // 등장횟수 값으면 알파벳 숫으로 오름차순
        });

        for (Map.Entry<String, Integer> str : entryList) {
            System.out.println(str.getKey() + " " + str.getValue());
        }
    }
}

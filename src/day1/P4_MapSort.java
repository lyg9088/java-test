package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P4_MapSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<n; i++) {
            String word = br.readLine();
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        List<Map.Entry<String,Integer>> entryList = new ArrayList<>(map.entrySet());

        // 정렬: 1순위 - 값 내림차순, 2순위 - 키 오름차순(알파벳순)
        entryList.sort((a,b) -> {
           if (!a.getValue().equals(b.getValue())) {
               return b.getValue() - a.getValue(); // 값 기준 내림차순
           }
           return a.getKey().compareTo(b.getKey()); // 키 기준 오름차순
        });
    }
}

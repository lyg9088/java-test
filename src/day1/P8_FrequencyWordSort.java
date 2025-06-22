package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P8_FrequencyWordSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 단어를 map에 저장하면서 빈도수 세기
        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<n; i++) {
            String word = br.readLine();
            map.put(word, map.getOrDefault(word, 0) +1);
        }
        List<Map.Entry<String,Integer>> entryList = new ArrayList<>(map.entrySet());

        entryList.sort((a,b) ->{
            // 1순위 : 빈도 내림차순
            if (!a.getValue().equals(b.getValue())) {
                return b.getValue()-a.getValue();
            }
            // 2순위 : 알파벳 오름차순
            return  a.getKey().compareTo(b.getKey());
        });
        for (Map.Entry<String, Integer> str : entryList) {
            System.out.println(str.getKey() +" "+ str.getValue());
        }
    }
}

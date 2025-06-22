package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P2_MapCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()); // 숫자 입력 받음

        Map<String, Integer> map = new HashMap<>();

        for (int i=0; i<num; i++) {
            String word = br.readLine();
            map.put(word, map.getOrDefault(word, 0)+1);
        }

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByKey());

        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P7_UniqueWordLengthSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();
        for (int i=0; i<n; i++) {
            set.add(br.readLine());
        }
        List<String> list = new ArrayList<>(set);
        list.sort((a,b) -> {
            if (a.length()!=b.length()) {
                return a.length()-b.length(); // 길이가 짦은 단어부터 (오름차순)
            }
            return a.compareTo(b); // 길이가 같으면 사전순으로 (알파벳순, 오름차순)
        });

        for (String str: list) {
            System.out.println(str);
        }
    }
}

package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P26_StringSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        for (int i=0; i<n; i++) {
            String word = br.readLine();
            set.add(word); // 중복제거
        }

        List<String> list = new ArrayList<>(set);
        list.sort((a,b) -> {
            if (a.length()!=b.length()) {
                return a.length()-b.length();
            }
            return a.compareTo(b);
        });

        for (String str : list) {
            System.out.println(str);
        }
    }
}

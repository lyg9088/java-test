package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P3_SetSortCustom {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();
        for (int i=0; i<n; i++) {
            String word = br.readLine();
            list.add(word);
        }
        Set<String> set = new HashSet<>(list);
        list = new ArrayList<>(set);

        Collections.sort(list, (a, b) -> {
           if (a.length() != b.length()) {
               return a.length()-b.length();
           }
           return a.compareTo(b);
        });
        for (String str : list) {
            System.out.println(str);
        }
    }
}

package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1_SetListSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()); // 5 입력받을 수 있음

        List<String> list = new ArrayList<>();

        for ( int i=0; i<num; i++ ) {
            list.add(br.readLine()); // num 만큼 단어 입력받음
        }
        Set<String> set = new HashSet<>(list); // 중복제거 : Set
        list = new ArrayList<>(set); // 정렬준비 : List 변환

        // 길이순 정렬, 길이 같으면 알파벳순 정렬
        Collections.sort(list, (a, b) -> {
           if (a.length() != b.length()) {
               return a.length() - b.length();
           }
           return a.compareTo(b);
        });

        for (String str : list) {
            System.out.println(str);
        }
    }
}

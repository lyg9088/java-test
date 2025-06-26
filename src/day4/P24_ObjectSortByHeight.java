package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class P24_ObjectSortByHeight {
    static class Student {
        String name;
        int score;

        Student(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Student> list = new ArrayList<>();
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int score = Integer.parseInt(st.nextToken());
            list.add(new Student(name, score));
        }

        list.sort((a,b) -> {
           if (a.score != b.score) {
               return a.score-b.score; // 점수 오름차순
           }
           return a.name.compareTo(b.name); // 이름 사전순
        });

        for (Student li: list) {
            System.out.println(li.name+" "+li.score);
        }
    }
}

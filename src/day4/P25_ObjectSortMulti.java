package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P25_ObjectSortMulti {
    static class Student {
        String name;
        int age;
        int score;

        Student(String name, int age, int score) {
            this.name = name;
            this.age = age;
            this.score = score;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Student> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
            int score = Integer.parseInt(st.nextToken());
            list.add(new Student(name, age, score));
        }

        // 다중 조건 정렬 (성적 내림차순, 나이 오름차순, 이름 사전순)
        list.sort((a,b) ->{
           if (b.score!=a.score) {
               return b.score-a.score;
           }
           if (a.age!=b.age) {
               return a.age-b.age;
           }
           return a.name.compareTo(b.name);
        });

        for (Student st: list ) {
            System.out.println(st.name+" "+st.age+" "+st.score);
        }
    }
}

package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P38_SortStudentsBySubjects { // 백준 10825번
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Student[] students = new Student[N];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            String name = input[0];
            int korean = Integer.parseInt(input[1]);
            int english = Integer.parseInt(input[2]);
            int math = Integer.parseInt(input[3]);

            students[i] = new Student(name, korean, english, math);
        }

        Arrays.sort(students); // Comparable 기준대로 정렬

        StringBuilder sb = new StringBuilder();
        for (Student s : students) {
            sb.append(s.name).append("\n");
        }
        System.out.println(sb);
    }
}

class Student implements Comparable<Student> {
    String name;
    int korean, english, math;

    // 생성자
    public Student(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    @Override
    public int compareTo(Student o) {
        if (this.korean != o.korean) return o.korean - this.korean;
        if (this.english != o.english) return this.english - o.english;
        if (this.math != o.math) return o.math - this.math;
        return this.name.compareTo(o.name);
    }
}
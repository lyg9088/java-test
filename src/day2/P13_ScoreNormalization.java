package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P13_ScoreNormalization {
    public static void main(String[] args) throws IOException {
        /*
          한 학생이 시험을 봤고, 과목별 점수들이 주어진다.
          이 학생의 점수 중 최댓값을 M이라 할 때, 모든 점수를 (점수 ÷ M × 100) 으로 고친다.
          이후 이 새로운 점수들의 평균을 출력하라.
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[count];
        int max = 0;
        double sum = 0;
        double avr = 0;

        for (int i=0; i<count; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
        }

        for (int i=0; i<count; i++) {
            sum += (double) arr[i]/max * 100;
        }

        avr = sum /count;
        System.out.println(avr);
    }
}

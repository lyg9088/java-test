package day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class P33_SetOperation { // 백준 11723번 - 집합
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // 결과 모을 곳

        int N = Integer.parseInt(br.readLine());
        HashSet<Integer> hs = new HashSet<>();

        for (int i=0; i<N; i++) {
            String[] arr = br.readLine().split(" ");
            int x = 0;
            if (arr.length == 2) {
                x = Integer.parseInt(arr[1]);
            }

            if (arr[0].equals("add")) {
                hs.add(Integer.valueOf(arr[1]));
            } else if (arr[0].equals("check")) {
                if (hs.contains(x)) {      // 같은 단어 전체 선택 : Cmd + Atrl + G -> 윈도우에선, Ctrl + Alt + Shift + J 였음
                    sb.append("1\n"); // 결과 저장
//                    System.out.println("1");
                } else {
                    sb.append("0\n"); // 결과 저장
//                    System.out.println("0");
                }
            } else if (arr[0].equals("toggle")) {
                if (hs.contains(x)) {
                    hs.remove(x);
                } else {
                    hs.add(Integer.valueOf(arr[1]));
                }
            } else if ((arr[0]).equals("all")) {
                for(int j=1; j<=20; j++) {
                    hs.add(j);
                }
            } else if ((arr[0]).equals("empty")) {
                hs.clear();
            } else if (arr[0].equals("remove")) {
                hs.remove(x);
            }
        }
        System.out.println(sb); // 한 번에 출력
    }
}

// 문자열 비교는 "==" 말고 equals() tkdyd
// HashSet은 contains()에서 객체 타입이 맞아야 작동함
// clear()를쓰면 removeAll()보다 더 직관적임
package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P37_SortCoordinates { // 백준 11650
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 점의 개수

        int[][] coords = new int[N][2];

        for (int i=0; i<N; i++) {
            String[] input = br.readLine().split(" ");
            coords[i][0] = Integer.parseInt(input[0]);
            coords[i][1] = Integer.parseInt(input[1]);
        }

        // Comparator 인터페이스를 람다식으로 구현한 방식 ( Comparator 사용 +  람다식 )
        Arrays.sort(coords, (o1, o2) ->{
            // o1[1] - o2[1] 방식은 일반적으로 정수 오름차순에서 잘 동작하지만, 오버플로우 위험이 있다.
           if (o1[0] == o2[0]) return o1[1] - o2[1]; // x 같으면 y 오름차순 // Integer.compare(o11[1], o2[1]);
           return o1[0] - o2[0]; // Integer.compare(o1[0], p2[0]); -> 오버플로우 없이 안전하게 비교해줌
        });

        for (int[] xy: coords) {
            System.out.println(xy[0] +" "+ xy[1]);
        }
    }
}

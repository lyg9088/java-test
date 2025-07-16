package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P39_SortCoordinatesYFirst2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<MyPoint> points = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            points.add(new MyPoint(x, y));
        }

        points.sort((p1, p2) -> {
            if (p1.y == p2.y) return Integer.compare(p1.x, p2.x);
            return Integer.compare(p1.y, p2.y);
        });

        for (MyPoint p : points) {
            System.out.println(p.x +" "+ p.y);
        }
    }
}

class MyPoint {
    int x, y;
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
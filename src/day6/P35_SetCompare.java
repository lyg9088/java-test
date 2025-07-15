package day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P35_SetCompare { // 백준 1822번 – 차집합
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int aCount = Integer.parseInt(str[0]);
        int bCount = Integer.parseInt(str[1]);

        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < aCount; i++) {
            setA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < bCount; j++) {
            setB.add(Integer.parseInt(st.nextToken()));
        }

        setA.removeAll(setB); // 차집합 A-B

        List<Integer> result = new ArrayList<>(setA);
        Collections.sort(result);


        System.out.println(result.size());
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

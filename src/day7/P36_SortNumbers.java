package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P36_SortNumbers { // 백준 2750번
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

//        TreeSet<Integer> ts = new TreeSet<>();
//        int[] arrNums = new int[N];
        List<Integer> list = new ArrayList<>();

        for (int i=0; i<N; i++) {
//            ts.add(Integer.valueOf(br.readLine()));
//            arrNums[i] = Integer.parseInt(br.readLine());
            list.add(Integer.parseInt(br.readLine()));
        }

//        for (int i : ts) {
//            System.out.println(i);
//        }
//        Arrays.sort(arrNums);
//        for (int i : arrNums) {
//            System.out.println(i);
//        }
        Collections.sort(list);
        for (int num : list) {
            System.out.println(num);
        }
    }
}

// 엇.. 오름차순 정렬이어서 TreeSet에 넣어서 출력했는데, 집합은 어제였고, 오늘은 정렬단원이라
// Arrays.sort(); 쓰면 되는거였네..
// 그리고, TreeSet은 중복을 없애기 때문에 위험요소가 있다.

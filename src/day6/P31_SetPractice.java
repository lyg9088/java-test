package day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class P31_SetPractice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 정수 N

        HashSet<Integer> hs = new HashSet<>(); // 중복제거 가능!
        String[] nums = br.readLine().split(" ");
        for (int i=0; i<N; i++) {
            hs.add(Integer.parseInt(nums[i]));
        }
        System.out.println(hs.size());

    }
}

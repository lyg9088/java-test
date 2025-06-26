package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P30_Queue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String inputWord = st.nextToken();
            if (inputWord.equals("push")) {
                queue.offer(Integer.parseInt(st.nextToken()));
            } else if (inputWord.equals("peek")) {
                System.out.println(queue.isEmpty()? -1 : queue.peek());
            } else if (inputWord.equals("pop")) {
                System.out.println(queue.isEmpty()? -1 : queue.poll());
            } else if (inputWord.equals("size")) {
                System.out.println(queue.size());
            } else if (inputWord.equals("empty")) {
                System.out.println(queue.isEmpty()? 1 : 0);
            }
        }
    }
}

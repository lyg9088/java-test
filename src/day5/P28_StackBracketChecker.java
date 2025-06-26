package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.Stack;
import java.util.StringTokenizer;

public class P28_StackBracketChecker {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        String str = br.readLine();

        for (char s : str.toCharArray()) {
            if (s=='(') {
                stack.push(s);
            } else if (s == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    System.out.println("NO");
                    return;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}

package com.java;

import java.util.*;

public class JavaDequeue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    Deque dq = new ArrayDeque();
    HashSet s = new HashSet();
    int n = sc.nextInt();
    int m = sc.nextInt();
    int max = 0;
    for (int i = 0; i < n; i++) {
        int tmp = sc.nextInt();
        dq.add(tmp);
        s.add(tmp);

        if (dq.size() == m) {
            max = Math.max(s.size(), max);
            int item = (int) dq.remove();
            if (!dq.contains(item)) {
                s.remove(item);
            }
        }
    }
    System.out.println(max);
    sc.close();
    }
}


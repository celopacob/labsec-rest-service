package org.company.utils;

import java.util.HashMap;
import java.util.Map;


public class LabSeq {

    private static final Map<Integer, Integer> memo = new HashMap<>();

    public static int calculateLabSeq(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 0;
        } else if (n == 3) {
            return 1;
        } else {

            if (memo.containsKey(n)) {
                return memo.get(n);
            }

            int result = calculateLabSeq(n - 4) + calculateLabSeq(n - 3);
            memo.put(n, result);
            return result;
        }
    }
}
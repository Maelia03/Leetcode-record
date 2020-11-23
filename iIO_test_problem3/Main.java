package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s1 = "aaaabbbb";
        System.out.println(solution(s1));
        String s2 = "ccaaffddecee";
        System.out.println(solution(s2));
        String s3 = "eeee";
        System.out.println(solution(s3));
        String s4 = "example";
        System.out.println(solution(s4));
    }
    public static int solution (String S) {
        HashMap<Character, Integer> count_map = new HashMap<Character, Integer>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < S.length(); i++) {
            Character ch = S.charAt(i);
            if (count_map.containsKey(ch)) {
                Integer cur_count = count_map.get(ch);
                count_map.put(ch, cur_count+1);
            } else {
                count_map.put(ch, 1);
            }
        }
        for (HashMap.Entry<Character, Integer> entry: count_map.entrySet()) {
            arr.add(entry.getValue());
            Collections.sort(arr);
        }
        int res = 0;
        for (int i = arr.size()-1; i>=0; i--) {
            if (arr.get(i) == 0) {
                continue;
            }
            for (int j = i - 1; j>=0; j--) {
                if (arr.get(j) != arr.get(i)) {
                    break;
                }
                if (arr.get(j) == 0) {
                    continue;
                } else {
                    arr.set(j, arr.get(j) - 1);
                    res++;
                }
            }
        }
        return res;
    }
}

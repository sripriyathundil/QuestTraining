package com.quest.practice_vars;

public class CharCount {
    public static void main(String[] args) {
        String s = "hello";
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s.indexOf(ch) == i) {
                int count = 0;
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == ch) {
                        count++;
                    }
                }
                System.out.println(ch + " - " + count);
            }
        }
    }
}




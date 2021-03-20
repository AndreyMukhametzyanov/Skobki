package com.exercises;
import java.util.Arrays;

    class StrAnalyzer {
        private MyStack stk;
        private final char[] leftChars = {'(', '{', '['};
        private final char[] rigthChars = {')', '}', ']'};

        public StrAnalyzer () {
            stk = new MyStack(10000);
        }

        public boolean isValid (String str) {
            char[] array = str.toCharArray();

            for(char c : array) {
                if(isEx(leftChars,c)) {stk.push(c);}

                if(isEx(rigthChars,c)) {if(stk.peek() == reverseChar(c)) {stk.pop();} else { return false; }}
            }
            return stk.isEmpty();
        }

    private char reverseChar(char c) {
        switch (c) {
            case '(':
                return ')';
            case ')':
                return '(';
            case '[':
                return ']';
            case ']':
                return '[';
            case '{':
                return '}';
            case '}':
                return '{';
            default:
                return ' ';
        }
    }

    public static boolean isEx(char[] massive, char elem) {
        for (Character c1 : massive) {
            if (c1 == elem) {
                return true;
            }
        }
        return false;
    }
}

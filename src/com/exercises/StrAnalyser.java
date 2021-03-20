package com.exercises;

import java.util.Arrays;

class StrAnalyzer {
    private MyStack stk = new MyStack(10000);
    private final char[] leftChars = new char[]{'(', '{', '['};
    private final char[] rigthChars = new char[]{')', '}', ']'};

    public StrAnalyzer() {
    }

    public boolean isValid(String str) {
        char[] array = str.toCharArray();
        char[] var3 = array;
        int var4 = array.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            char c = var3[var5];
            if (Arrays.asList(array).contains(this.leftChars)) {
                this.stk.push(c);
            }

            if (Arrays.asList(array).contains(this.rigthChars)) {
                if (this.stk.peek() != this.reverseChar(c)) {
                    return false;
                }

                this.stk.pop();
            }
        }

        return this.stk.isEmpty();
    }

    private char reverseChar(char c) {
        switch(c) {
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
}

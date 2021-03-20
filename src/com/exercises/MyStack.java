package com.exercises;

class MyStack {
    char[] massiv;
    int max;
    int topIndex;

    public MyStack(int max) {
        this.max = max;
        this.massiv = new char[max];
        this.topIndex = -1;
    }

    public void push(char str) {
        this.massiv[++this.topIndex] = str;
    }

    public char pop() {
        return this.massiv[this.topIndex--];
    }

    public char peek() {
        return this.massiv[this.topIndex];
    }

    public boolean isEmpty() {
        return this.topIndex == -1;
    }
}
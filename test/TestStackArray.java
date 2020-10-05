package test;

import data.structure.StackArray;

public class TestStackArray {
    public static void main(String[] args) {
        StackArray s1 = new StackArray();
        s1.add(4);
        s1.add(7);
        s1.add(6);
        s1.add(98);
        s1.add(42);
        s1.showStack();
        System.out.println("dato del frente: " + s1.front());
    }
}

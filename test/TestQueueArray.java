package test;

import data.structure.QueueArray;

public class TestQueueArray {

    static void test(){
        QueueArray q1 = new QueueArray();
        q1.add(2);
        q1.add(7);
        q1.add(6);
        q1.add(3);
        q1.add(5);
        q1.showQueue();
        System.out.println("La cima actual es: " + q1.topQueue());
        q1.remove();
        q1.showQueue();
        System.out.println("La cima actual es: " + q1.topQueue());
    }

    public static void main(String[] args) {
        test();
    }
}

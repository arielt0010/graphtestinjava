package test;

import data.structure.LinkedList;


public class TestLinkedList {
    static void testAddHeadList(){
        LinkedList list = new LinkedList();
        list.addHead(2);
        list.addHead(3);
        list.addHead(4);
        list.addHead(5);
        list.addHead(6);
        System.out.println(list.toString());
    }
    static void testAddTailList(){
        LinkedList list = new LinkedList();
        list.addTail(2);
        list.addTail(3);
        list.addTail(4);
        list.addTail(5);
        list.addTail(6);
        System.out.println(list);
    }

    public static void main(String[] args){
        //testAddHeadList();
        testAddTailList();
    }
    
}

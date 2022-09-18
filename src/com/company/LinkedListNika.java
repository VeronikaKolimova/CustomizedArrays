package com.company;

public class LinkedListNika<E> {
    private Node<E> head ;
    private Node<E> tail;

    private int size = 0;

    static class Node<E>{
        Node<E> next;
        E value;
        Node(E value){
            this.value = value;
        }
    }

    public void addAtFirst(E val){
        Node<E> temp = new Node(val);
        temp.next = head;
        head = temp;
        if(tail == null){
            tail = temp;
        }
        size++;
    }

    public void addAtLast(E val){
        if(tail==null){
            addAtFirst(val);
            return;
        }

        Node<E> temp = new Node<>(val);
        tail.next = temp;
        tail = temp;
        size++;
    }


    public String toString(){
        StringBuilder builder = new StringBuilder();
        Node<E> temp = head;
        while(temp!=null){
            builder.append(temp.value).append("->");
            if(temp==tail) builder.append("End");
            temp = temp.next;
        }
        return builder.toString();

    }

    public int getSize() {

        return size;
    }

}

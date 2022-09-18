package com.company;


public class Main {

    public static void main(String[] args) {


        LinkedListNika<String> arr1 = new LinkedListNika<>();
        arr1.addAtFirst("hi there");
        arr1.addAtLast("bye-bye");
        arr1.addAtLast("i ll come back");
        arr1.addAtFirst("hello");
        System.out.println("My LinkedListNika size is " + arr1.getSize());
        System.out.println("Выведем LinkedListNika: \n" + arr1);

        System.out.println("************************");
        System.out.println("************************");


        ArrayListNika<Integer> list = new ArrayListNika<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);


        list.display();
        System.out.println("");
        System.out.println("Элемент по индексу: " + 1 + " в ArrayListNika  = " + list.get(1));


        System.out.println("Удален элемент с индексом " + 1 + " = "
                + list.remove(1));

        System.out.println("Выведем ArrayListNika после удаления элемента по индексу " +1);

        list.display();
    }
}

package com.company;

import java.util.Arrays;

class ArrayListNika<E> {

    private static final int INITIAL_CAPACITY = 10;
    private int size = 0;
    private Object elementData[] = {};


    public ArrayListNika() {
        elementData = new Object[INITIAL_CAPACITY];
    }


    public void add(E e) {
        if (size == elementData.length) {
            ensureCapacity();
            // double.
        }
        elementData[size++] = e;
    }
    public void remove(E e) {
        if (size == elementData.length) {
            ensureCapacity();
        }
        elementData[size++] = e;
    }

    public E get(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size "
                    + index);
        }
        return (E) elementData[index];
    }


    public Object remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size "
                    + index);
        }

        Object removedElement = elementData[index];
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        size--; 
        return removedElement;
    }


    private void ensureCapacity() {
        int newIncreasedCapacity = elementData.length * 2;
        elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
    }


    public void display() {
        System.out.print("Displaying list : ");
        for (int i = 0; i < size; i++) {
            System.out.print(elementData[i] + " ");
        }
    }

}





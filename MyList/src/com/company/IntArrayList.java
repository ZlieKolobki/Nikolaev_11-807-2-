package com.company;

public class IntArrayList implements IntList {
    private int[] elements; //массив элементов листа
    private static final int DEFAULT_CAPACITY = 10; //базовый размер листа
    private int capacity;
    private int count = 0;
    private static final double EXTENSION_COEF = 1.5; //коэфицент увеличения листа



    public IntArrayList(){
        elements = new int[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
    }
    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean contains(int e) {
        for (int i = 0; i < capacity; i++) {
            if (e == elements[i]){
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(int e) {
        if (capacity == count){
            grow();
        }
        elements[count++] = e;
    }

    private void grow(){
        int newCapacity = (int) (capacity * EXTENSION_COEF);
        int[] newElements = new int[newCapacity];
        for ( int i = 0; i < capacity; i++) {
            newElements[i] = elements[i];
        }
        capacity = newCapacity;
        elements = newElements;
    }
    @Override
    public int get(int index) {
         if (index < 0 || index >= count)
             throw new IllegalArgumentException("No such index");
         return elements[index];
    }

    @Override
    public void remove(int index) {
    /*    if (capacity == count){
            grow();
        }*/
        for (int i = index; i < count; i++ ){
            elements[i] = elements[i+1];
        }
        count--;
    }

    @Override
    public void sort() {
        int n = elements.length;
        for (int i = 0; i < n; i++) {
            int indexOfMax = 0;
            for (int j = 0; j < n - i; j++) {
                if (elements[indexOfMax] < elements[j]) {
                    indexOfMax = j;
                }
            }
            int buf = elements[indexOfMax];
            elements[indexOfMax] = elements[n - 1 - i];
            elements[n - 1 - i] = buf;
        }
    }

    @Override
    public void addAll(IntList intList) {
        for (int i = count; i < size() +intList.size(); i++) {
            if (capacity == count){
                grow();
            }
            elements[count++] = intList.get(i);
        }
    }

    @Override
    public int[] toArray() {
        int[] ListToArray = new int[count];
        for (int i = 0; i < count; i++) {
            ListToArray[i] = elements[i];
        }
        return ListToArray;
    }

    @Override
    public int indexOf(int value) {
        int i = 0;
        if (contains(value) == true){
            while(elements[i]!= value){
                i++;
            }return i;
        }
        return -1;
    }

    public Iterator iterator(){
        return new MyIter();
    }
    class MyIter implements Iterator{
        private int currentIndex;

        public MyIter(){
            currentIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }

        @Override
        public int next() {
            //return elements[currentIndex++];
            int val = elements[currentIndex];
            currentIndex++;
            return val;
        }
    }
}

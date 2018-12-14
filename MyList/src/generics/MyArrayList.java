package generics;
import java.util.Iterator;

public class MyArrayList<T> implements Iterable<T> {
    private T[] elements;
    private int count = 0;
    private static final int DEFAULT_CAPACITY = 10; //базовый размер листа
    private int capacity;
    private static final double EXTENSION_COEF = 1.5; //коэфицент увеличения листа


    public MyArrayList() {
        this.elements = (T[]) new Object[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
    }

    private void grow(){
        int newCapacity = (int) (capacity * EXTENSION_COEF);
        T[]newElements =(T[]) new Object[newCapacity];
        for ( int i = 0; i < capacity; i++) {
            newElements[i] = elements[i];
        }
        capacity = newCapacity;
        elements = newElements;
    }

    public void add(T e) {
        if (capacity == count){
            grow();
        }
        elements[count++] = e;
    }

    public T get(int index) {
        return elements[index];
    }

    //число элементов в списке
    int size() {
        return count;
    }

    //есть ли в списке такой элемент
    boolean contains(T value) {
        for (int i = 0; i < count; i++) {
            if (elements[i].equals(value)){
                return true;
            }
        }
        return false;
    }

    //удаление элемента по индекс (со смещением элементов влево)
    void remove(int index) {
        for (int i = index; i < count; i++ ){
            elements[i] = elements[i+1];
        }
        count--;
    }

    //возвращает все элементы из списка в виде массива
    T[] toArray() {
        T[] ListToArray = (T[]) new Object[count];
        for (int i = 0; i < count; i++) {
            ListToArray[i] = elements[i];
        }
        return ListToArray;
    }

    //добавление всех элементов из списка list в данный список(в конец)
    void addAll(MyArrayList<T> list) {
        for (int i = count; i < size() +list.size(); i++) {
            if (capacity == count){
                grow();
            }
            elements[count++] = list.get(i);
        }
    }

    //добавление всех элементов из списка list в данный список
    //начиная с позиции index
    void addAll(MyArrayList<T> list, int index) {
    }

    public Iterator<T> iterator() {
        return new MyIter();
    }

    public class MyIter implements Iterator<T> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }

        @Override
        public T next() {
            return elements[currentIndex++];
        }
    }
}
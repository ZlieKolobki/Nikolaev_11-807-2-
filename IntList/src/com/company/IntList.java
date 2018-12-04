package com.company;

public interface IntList {
    //возвращает кол-во эелментов
    int size();

    //возвращает true, если такой элемент есть в списке
    boolean contains(int e);

    //добавляет новый элемент в конец списка
    void add(int e);   //+

    //возвращает элемент по индексу
    int get(int index);     //+

    //удалает эл-т по индексу
    void remove(int index);

    //сортирует эл-ты по возрастанию
    void sort();

    //добавляет в конец все эл-ты из данного списка
    void addAll(IntList intList);

    //возвращает содержимаое списка в виде массиваt
    int[] toArray();

    //возвращает индекс элемента
    int indexOf(int value);
}

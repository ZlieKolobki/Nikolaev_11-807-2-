package com.company;

public class Main {

    public static void main(String[] args) {
	    IntList List = new IntArrayList();
	    List.add(42);
        System.out.println(List.get(0));
        IntList list2 = new IntArrayList();
        list2.add(43);
        list2.add(44);
        list2.add(45);
        list2.addAll(list2);
    }
}

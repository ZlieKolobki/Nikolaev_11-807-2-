package LinkedList;

public class MyLinkedList<T> {
    private Node<T> head;
    private int count = 0;
    private Node<T> tail;

    //добавление в конец
    public void add(T e) {
        Node<T> newNode = new Node();
        newNode.setValue(e);
        newNode.setNext(null);
        if (head != null) {
            Node<T> current = head;
            //по итогу цикла в current записана ссылка на последнюю Ноду
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
            tail = current.getNext();
        } else {
            head = newNode;
        }
        count++;
    }
    public  int size(){
        return count;
    }
    public T get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index: " + index + " вне границ");
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }

    public void remove(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index: " + index + " вне границ");
        }
        if (index == 0) {
            head = head.getNext();
        } else {
            Node beforeRemovable = head;
            for (int i = 0; i < index - 1; i++) {
                beforeRemovable = beforeRemovable.getNext();
            }
            Node nodeToRemove = beforeRemovable.getNext();
            beforeRemovable.setNext(nodeToRemove.getNext());
        }
        count--;
    }

    public T[] ToArray(){
        T[] array = (T[]) new Object[count];
        Node<T> current = head;
        for (int i = 0; i < count; i++) {
            array[i] = current.getValue();
            current = current.getNext();
        }
        return  array;
    }

    public void AddAll(MyLinkedList<T> linkedList){
        T[] array = linkedList.ToArray();
        for (int i = 0; i < linkedList.size(); i++) {
            Node<T> buf = new Node();
            buf.setValue(array[i]);
            tail.setNext(buf);
            tail = tail.getNext();
        }
    }
    public void AddAll(MyLinkedList<T> list, int index){
        Node<T> current = head;
        Node<T> buf;
        int n = 0;
        while (n < index){
            current = current.getNext();
            n++;
        }
        buf = current.getNext();
        T[] array = list.ToArray();
        for (int i = 0; i < list.size(); i++) {
            Node<T> buf2 = new Node();
            buf2.setValue(array[i]);
            current.setNext(buf2);
            current = current.getNext();
        }
        current.setNext(buf);
    }
}

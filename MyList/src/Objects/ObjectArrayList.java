package Objects;

public class ObjectArrayList {
    private Object[] elements;
    private static final int DEFAULT_CAPACITY = 10; //базовый размер листа
    private int capacity;
    private int count = 0;

    public ObjectArrayList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    void add(Object e){
        elements[count++] = e;
    }

    Object get(int index){
        return elements[index];
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
        public Object next() {
            return elements[currentIndex++];
        }
    }
}

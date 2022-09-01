package itish.generics;

import java.util.Arrays;

public class CustomeGenArrList <T>{

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    public CustomeGenArrList() {
        data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index) {
        return (T)data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

        public static void main(String[] args) {
//        ArrayList list  = new ArrayList();
//        list.add(45);
//        list.remove(0);
//        list.get(0);
//        list.set(1,458);
//        list.size();
//        list.isEmpty();

            CustomeGenArrList<Number> list = new CustomeGenArrList<>();

            list.add(3);
            list.add(5);
            list.add(9);
            for (int i = 0; i < 14; i++) {
                list.add(2*i);
            }

            System.out.println(list);
            // 1.Type Safety
            // 2. homogenous element
            // 3.you only add Classes
            // 4. can't add primitive datatype

//        ArrayList<Integer> list1 = new ArrayList<>();
//        ArrayList<String> list1 = new ArrayList<>();
//        list1.add(3);
        }

}

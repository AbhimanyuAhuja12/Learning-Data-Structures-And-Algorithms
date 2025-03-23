package Generics;

import java.util.Arrays;

public class CustomGenericArrayList<T> {
    private  Object[] data;
    private static int  DEFAULT_SIZE=10;
    int size=0;



    public CustomGenericArrayList() {
        this.data=new Object[DEFAULT_SIZE];
    }

    public boolean add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
        return true;
    }

    private void resize() {
        Object[] temp= new Object[2*data.length];
        for (int i = 0; i <size; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean isFull() {
        return size==data.length;
    }

    public T remove(){
        T removed_item= (T) data[--size];

        return removed_item;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public int size(){
        return size;
    }
    public T get(int index) throws MyException {
        if (index >= size || index < 0) {
            throw new MyException("Index out of range");
        }
        return (T) data[index];
    }

    public void set(int index, T value) throws MyException {
        if (index >= size || index < 0) {
            throw new MyException("Index out of range");
        }
        data[index] = value;
    }
}

package Generics;

import java.util.Arrays;

public class CustomArrayList {
     private int [] data;
      private static int  DEFAULT_SIZE=10;
     int size=0;

    public CustomArrayList() {
        this.data=new int[DEFAULT_SIZE];
    }

    public boolean add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
        return true;
    }

    private void resize() {
        int[] temp= new int[2*data.length];
        for (int i = 0; i <size; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean isFull() {
        return size==data.length;
    }

    public int remove(){
       int removed_item=data[--size];

       return removed_item;
    }


//    public String toString() {
//        for (int i = 0; i < size; i++) {
//
//        }
//        return Arrays.toString(data);
//    }


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
    public int get(int index) throws MyException {
        if (index >= size || index < 0) {
            throw new MyException("Index out of range");
        }
        return data[index];
    }

    public void set(int index, int value) throws MyException {
        if (index >= size || index < 0) {
            throw new MyException("Index out of range");
        }
        data[index] = value;
    }
}


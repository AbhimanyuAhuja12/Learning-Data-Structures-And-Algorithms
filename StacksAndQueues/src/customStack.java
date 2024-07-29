public class customStack {
    public int[] data;
    private static final int DEFAULT_SIZE = 10;

    private int ptr = -1;


    public customStack() {
        this(DEFAULT_SIZE);
    }

    public customStack(int size) {
        this.data = new int[size];
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public boolean isfull(){
        return ptr==data.length-1;
    }

    public boolean push(int item){
        if(isfull()){
            System.out.println(("Stack is full"));
        }
        ptr++;
        data[ptr]=item;
        return true;
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw  new Exception("Cannot pop from empty stack");
        }
        int removedItem=data[ptr];
        ptr--;
        return removedItem;    // return data[ptr--];
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw  new Exception("Cannot peek from empty stack");
        }
        return data[ptr];
    }


}

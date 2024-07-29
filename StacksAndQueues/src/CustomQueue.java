public class CustomQueue {
    private int[] data;
    int end=0;

    final static int DEFAULT_SIZE=10;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){
        this.data=new int[size];
    }

    public boolean isFull(){
        return end==data.length;
    }

    public boolean isEmpty(){
        return end==0;
    }

    public boolean insert(int item){
        if(isFull()){
            System.out.println("Queue is Full");
            return false;
        }

        data[end++]=item;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("You can't remove item from Empty Queue");
        }
        int removedItem=data[0];

        //shifting towards left
         for(int i=1;i<end;i++){
             data[i-1]=data[i];
         }
         end--;

        return removedItem;
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[0];
    }

    public void display(){
        for(int i=0;i<end;i++){
            System.out.print(data[i]+"<-");
        }
        System.out.println("End");
    }

}

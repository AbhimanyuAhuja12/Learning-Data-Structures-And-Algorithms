public class CircularQueue {
    final static int DEFAULT_SIZE=10;
    int front=0;
    int end=0;

    int size=0;

    protected int[]data;

    private CircularQueue(){
        this(DEFAULT_SIZE);
    }

    private CircularQueue(int size){
        this.data=new int[size];
    }

    public boolean isFull(){
        return size==data.length;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean insert(int item){
        if(isFull()){
            System.out.println("Queue is Full");
            return false;
        }
        data[end++]=item;
        end=end%data.length;
        size++;
        return true;

    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removedItem=data[front++];

        front =front%data.length;
        size--;

        return removedItem;
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Can't peek from empty Queue");
        }
        return data[front];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        int i=front;
        do{
            System.out.print(data[i]+"<-");
            i++;
            i%=data.length;
        }while(i!=end);
        System.out.println("End");
    }
}

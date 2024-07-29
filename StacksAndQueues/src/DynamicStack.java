public class DynamicStack extends customStack {


    public DynamicStack(){
        super();  // it will call customStack()
    }

    public DynamicStack(int size){
        super(size);  // it will call customStack(int size)
    }

    public boolean push(int item){
        if(this.isfull()){
            int[] temp=new int[data.length*2];

            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        return super.push(item);
    }
}

import java.util.Stack;
public class DeleteMiddle {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

       deleteMidWithRecursion(stack,4,0);
        System.out.println(stack);
    }

public void deleteMid(Stack<Integer> s, int sizeOfStack) {
    // code here
    int mid = sizeOfStack/2;
    Stack<Integer> helper = new Stack<>();
    for(int i=0;i<mid;i++){
        helper.push(s.pop());
    }
    s.pop();

    while(!helper.isEmpty()){
        s.push(helper.pop());
    }
}

    public static void deleteMidWithRecursion(Stack<Integer> s, int sizeOfStack,int current) {
        if(current==sizeOfStack/2+1){
           return;
        }
         int x=s.pop();
        deleteMidWithRecursion(s,sizeOfStack,current+1);
        if(current!=sizeOfStack/2) {
            s.push(x);
        }

    }
}

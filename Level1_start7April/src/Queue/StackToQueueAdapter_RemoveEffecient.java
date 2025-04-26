package Queue;
import java.util.Stack;
public class StackToQueueAdapter_RemoveEffecient {
    Stack<Integer> MainStack;
    Stack<Integer> HelperStack;
    public StackToQueueAdapter_RemoveEffecient(){
        MainStack = new Stack<>();
        HelperStack = new Stack<>();
    }

    public void push(int val){
        while(!MainStack.isEmpty()){
            HelperStack.push(MainStack.pop());
        }

        MainStack.push(val);

        while(!HelperStack.isEmpty()){
            MainStack.push(HelperStack.pop());
        }

    }

    public int pop(){
        return MainStack.pop();
    }

    public int peek(){
        return MainStack.peek();
    }

    public int size(){
        return MainStack.size();
    }

    public boolean Empty(){
        return MainStack.isEmpty();
    }
}

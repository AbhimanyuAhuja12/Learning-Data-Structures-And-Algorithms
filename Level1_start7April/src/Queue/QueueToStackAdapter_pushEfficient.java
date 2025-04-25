package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueToStackAdapter_pushEfficient {
    Queue<Integer> MainQ = new ArrayDeque<>();
    Queue<Integer> helperQ = new ArrayDeque<>();

    public void push(int val) {
        MainQ.add(val);
    }

    public int pop() {
       while(MainQ.size()!=1){
           helperQ.add(MainQ.remove());
       }
       int val = MainQ.remove();
       while(!helperQ.isEmpty()){
           MainQ.add(helperQ.remove());
       }
       return val;
    }

    public int top() {
        while(MainQ.size()!=1){
            helperQ.add(MainQ.remove());
        }
        int val = MainQ.peek();
        while(!helperQ.isEmpty()){
            MainQ.add(helperQ.remove());
        }
        return val;
    }

    public int size() {
        return MainQ.size();
    }
}

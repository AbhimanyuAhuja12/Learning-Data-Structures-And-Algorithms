package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueToStackAdapter {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(5);
        System.out.println(queue);
//        queue.poll();
        queue.peek();
        System.out.println(queue);
    }


    Queue<Integer> queue;
    Queue<Integer> helperQueue;

        public QueueToStackAdapter() {
             queue = new ArrayDeque<>();
            helperQueue = new ArrayDeque<>();
        }
//
//        public void push(int x) {
//            // queue.add(x);
//            helperQueue.add(x);
//
//            int size = helperQueue.size()-1;
//            while(size>0){
//                helperQueue.add(helperQueue.poll());
//                size--;
//            }
//
//        }
//
//        public int pop() {
//            return helperQueue.poll();
//        }
//
//        public int top() {
//            return helperQueue.peek();
//        }
//
//        public boolean empty() {
//            return helperQueue.isEmpty();
//        }

    public void push(int val) {
        while (!queue.isEmpty()) {
            helperQueue.add(queue.poll());
        }
        queue.add(val);

        while (!helperQueue.isEmpty()) {
            queue.add(helperQueue.poll());
        }
    }

    public int pop() {
        if (size() == 0) {
            System.out.println("Stack underflow");
            return -1;
        }
        return queue.remove();
    }

    public int top() {
        if (size() == 0) {
            System.out.println("Stack underflow");
            return -1;
        }
        return queue.peek();
    }

    public int size() {
        return queue.size();
    }
}



import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();

        que.add(56);
        que.add(45);

        que.add(6);
        que.add(5);
        que.add(50);
        que.add(459);
        que.add(565);
        que.add(4545);
        que.remove();
        LinkedList <Integer> list = new LinkedList<>();
        list.add(5);
        list.add(67);
        que.addAll(list);
        System.out.println(que);
//        System.out.println(que.peek());
//        System.out.println(que.poll());



    }
}

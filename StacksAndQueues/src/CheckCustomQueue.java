public class CheckCustomQueue {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue();
        queue.insert(5);
        queue.insert(10);
        queue.insert(15);
        queue.insert(20);
        queue.insert(25);
        queue.insert(30);
        queue.insert(35);

        System.out.println(queue.remove());

        queue.display();
    }
}

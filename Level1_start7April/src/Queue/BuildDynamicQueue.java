package Queue;

public class BuildDynamicQueue {
    public static class CustomDynamicQueue {
        private int[] data = new int[20];
        private int front = 0;
        private int size = 0;

        public void add(int value) {
            if (size == data.length) {
                int[] newArr = new int[data.length * 2];
                for (int i = 0; i < size; i++) {
                    int temp = (front + i) % data.length;
                    newArr[i] = data[temp];
                }
                data = newArr;
                front = 0;

                int idx = (front + size) % data.length;
                data[idx] = value;
                size++;

            } else {
                int idx = (front + size) % data.length;
                data[idx] = value;
                size++;
            }
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            int value = data[front];
            front = (front + 1) % data.length;
            size--;
            return value;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return data[front];
        }

        public void display() {
            System.out.print("Queue: ");
            for (int i = 0; i < size; i++) {
                int temp = (front + i) % data.length;
                System.out.print(data[temp] + ",");
            }
            System.out.println();
        }

        public int size() {
            return size;
        }
    }

    public static void main(String[] args) {
        CustomDynamicQueue queue = new CustomDynamicQueue();
//        queue.add(23);
//        queue.add(3);
//        queue.add(2);
//        queue.add(233);
//        queue.add(113);
//        queue.add(2003);
//        queue.display();
//        System.out.println();
//        queue.remove();
//        queue.remove();
//        System.out.println(queue.remove());
//        queue.display();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        //for testing purposes
        assert queue.peek() == 1;
        assert queue.remove() == 1;
        assert queue.size() == 2;
    }

}

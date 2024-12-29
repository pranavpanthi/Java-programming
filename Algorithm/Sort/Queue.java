public class Queue {
    int arr[];
    int size;
    int front = -1;
    int rear = -1;

    public Queue(int size) {
        arr = new int[size];
        this.size = size;
    }

    boolean isFull() {
        if (rear == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (front == -1 && rear == -1) {
            return true;
        } else {
            return false;
        }
    }

    void iQ(int data) {
        if (isFull()) {
            System.out.println("Q is full");
            return;
        } else if (front == -1 && rear == -1) {
            front = rear = 0;
        } else {
            rear++;
            arr[rear] = data;
        }
    }

    void dQ() {
        if (isEmpty()) {
            System.out.println("Q is Empty");
        } else if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }
    }

    void printQueue() {
        for (int i = front; i <= rear; i++) {
            System.out.println(arr[i]);
        }
    }

    void checkFirst() {
        System.out.println("First data : " + arr[front]);
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.iQ(100);
        q.iQ(200);
        q.iQ(300);
        q.iQ(400);
        q.iQ(500);
        System.out.println("Full Q print");
        q.printQueue();
        q.dQ();
        System.out.println("After dequeueing");
        q.printQueue();
        q.checkFirst();
    }
}

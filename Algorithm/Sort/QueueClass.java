public class QueueClass {
    NodeForQueue head;

    void enque(int element) {
        NodeForQueue insertion = new NodeForQueue(element);
        if (head == null) {
            head = insertion;
        } else {
            NodeForQueue current = head;
            while (current.succ != null) {
                current = current.succ;
            }
            current.succ = insertion;
        }
    }

    NodeForQueue deque() {
        return head = head.succ;
    }

    void printlQ() {
        NodeForQueue next = head;
        while (next != null) {
            System.out.println(next.data + " ");
            next = next.succ;
        }
    }

    public static void main(String[] args) {
        QueueClass q = new QueueClass();
        q.enque(100);
        q.enque(200);
        q.enque(300);
        q.enque(400);
        q.enque(500);
        q.printlQ();
        System.out.println("After Deque");
        q.deque();
        q.deque();
        q.printlQ();
    }
}

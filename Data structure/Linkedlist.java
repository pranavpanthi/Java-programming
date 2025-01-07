public class Linkedlist {
    Node head;

    boolean isEmpty() {
        return head == null;
    }

    void push(String str) {
        Node insertion = new Node(str);
        if (isEmpty()) {
            head = insertion; // inserts the string in head
        } else {
            insertion.succ = head;
            head = insertion;
        }
    }

    void pop() {
        head = head.succ; // element is taken out
    }

    void printStack() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.succ;
        }
    }

    public static void main(String[] args) {
        Linkedlist lstack = new Linkedlist();
        lstack.push("Orange box");
        lstack.push("Red box");
        lstack.push("Blue box");
        lstack.push("Yellow box");
        lstack.push("White box");
        lstack.pop();
        lstack.printStack();
    }
}
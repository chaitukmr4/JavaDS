public class LinkedListNode {
    LinkedListNode next = null;
    int data;

    public LinkedListNode() {
    }

    public LinkedListNode(int d) {
        data = d;
    }

    void addData(int d) {
        LinkedListNode newNode = new LinkedListNode(d);
        LinkedListNode current = this;
        while (current.next != null)
            current = current.next;

        current.next = newNode;
    }

    void addMore(LinkedListNode more) {
        this.next = more;
    }

}
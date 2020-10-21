public class FindKthFromLast {
    static int counter = 0;
    public static void main(String[] args) {
        int i = 0;
        LinkedListNode head = new LinkedListNode(i);
        while ( i < 10) {
            i ++;
            head.addData(i);
        }
        printKtoTheLast(head, 5);


    }

    static int printKtoTheLast(LinkedListNode head, int k) {
        System.out.println("In printKtoTheLast " + ++counter );
        if(head == null) return 0;
        int index = printKtoTheLast(head.next, k) + 1;
        if(index == k) System.out.println("The value "+ head.data);
        return index;
    }
}

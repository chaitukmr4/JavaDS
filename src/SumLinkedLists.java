//617 + 295 = 912

public class SumLinkedLists {

    public static void main(String[] args) {
        LinkedListNode l1 = new LinkedListNode(7);
        l1.addData(1);
        l1.addData(6);

        LinkedListNode l2 = new LinkedListNode(5);
        l2.addData(9);
        l2.addData(2);

        LinkedListNode result = addTwoLists(l1, l2, 0);
        System.out.print("The Final value is ");
        while (result != null){
            System.out.print(result.data);
            result = result.next;
        }



    }


    static LinkedListNode addTwoLists(LinkedListNode l1, LinkedListNode l2, int carry) {

        LinkedListNode result = new LinkedListNode();
        if (l1 == null && l2 == null && carry == 0)
            return null;
        int value = carry;
        // while(l1 != null || l2 != null) {
        if (l1 != null)
            value += l1.data;
        if (l2 != null)
            value += l2.data;

        System.out.println("The value is "+ value);

        result.data = value % 10;

        if (l1 != null || l2 != null)
            result.addMore(
                    addTwoLists(
                            l1 != null ? l1.next : null,
                            l2 != null ? l2.next : null,
                            value >= 10 ? 1 : 0
                    )
            );
        return result;
    }
}

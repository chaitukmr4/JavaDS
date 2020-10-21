public class QueueImplementation<T>{
    static class LinkedListNode<T> {
        LinkedListNode<T> next;
        T data;
        public LinkedListNode(T data) {
            this.data = data;
        }

        public void addData(T data) {
            LinkedListNode<T> newNode = new LinkedListNode<>(data);
            next = newNode;
        }
    }

    private LinkedListNode<Integer> first;
    private LinkedListNode<Integer> last;

    //add
    //delete

    public void add(int data) {
        LinkedListNode<Integer> newNode = new LinkedListNode<>(data);
        if(last != null)  {
            last.next = newNode;
        }
        last = newNode;
        if(first == null)
            first = last;
    }

    public Integer pop() throws  Exception{
        if(first == null) throw  new Exception("The Queue is empty");
        Integer data = first.data;
        first = first.next;
        return data;
    }
}
//241
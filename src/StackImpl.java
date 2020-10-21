import java.util.Scanner;

//Stack Implmentation using LinkedLists
public class StackImpl<T> {
    private static class LinkedListNode<T> {
        private LinkedListNode<T> next;
        private T data;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

    public LinkedListNode<T> top;

    public T pop() throws Exception {
        if(top == null) throw new Exception("Stack Empty");
        T returnValue = top.data;
        top = top.next;
        return returnValue;
    }


    public void push(T data) {
        LinkedListNode<T> newNode = new LinkedListNode<T>(data);
        newNode.next = top;
        top = newNode;
    }

    public T peek()  throws  Exception{
        if(top == null) throw new Exception("Stack is Empty");
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) throws  Exception {
        String charString = "{}[]()";
        String open = "{[(";
        String closing = "}])";
        char l_c_b = '(';
        char l_s_b = '[';
        char l_f_b = '{';
        char r_c_b = ')';
        char r_s_b = ']';
        char r_f_b = '}';
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String userInput = sc.nextLine();

        System.out.println("Checking if the entered String is balanced ...");
        StackImpl<Character> stack = new StackImpl<>();

        for(char c : userInput.toCharArray()) {
            if(charString.contains(String.valueOf(c))){
                if(open.contains(String.valueOf(c)))
                    stack.push(Character.valueOf(c));
                else {
                    if(stack.isEmpty())
                        break;
                    else if(
                            (c == r_c_b && l_c_b == stack.peek())
                                    || (c == r_s_b && l_s_b == stack.peek())
                                    || (c == r_f_b && l_f_b == stack.peek())
                    )
                        stack.pop();
                    else
                        break;;
                }

            }
        }
        if(stack.isEmpty())
            System.out.println("String is balanced");
        else
            System.out.println("The string is not balanced");
    }
}



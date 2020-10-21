import java.util.Objects;

public class Q1_Stack <T extends Object> {
    private static int size = 50; // default size of the stack
    private int top = -1; // default value for the top
    private T[] stackArray = (T[]) new Object[size]; // Array for the stack

    public static void main(String[] args) throws Exception {
        Q1_Stack<Long> stack = new Q1_Stack<Long>();
        stack.push(new Long(0));
        stack.push(new Long(1));
        for(int i = 2; i < size; i++) // add values to the stack
            stack.push(stack.getValue(i-1) + stack.getValue(i-2));

        for (int i = 0; i < size ; i++) {
            System.out.print(" "+stack.pop());
        }
    }


    //Check if the stack is empty
    public boolean isEmpty() {
        if(top < 0)
            return true;
        return false;
    }

    //adding the value to the stack
    public  void push(T value) {
        this.stackArray[++top] = value;

    }

    public T getValue(int index) {
        return this.stackArray[index];
    }
    //removing the value from the stack
    public  T pop() throws Exception {
        if(!isEmpty()) {
            T topValue = this.stackArray[top--];
            return topValue;
        } else  throw  new Exception("Stack is Empty"); // throw exception if the stack is empty
    }
}

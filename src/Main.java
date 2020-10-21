//import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
//
//import java.util.Objects;
//
public class Main<T extends Object> {
//    private int top = -1; // Top value
//    private int size = 50;
//    private T[] stackArray = (T[]) new Object[50]; //Stack size
//
//
//
//    public static void main(String[] args) throws Exception {
//        Main<String> main = new Main<String>();
//        main.push(""+0);
//        main.push(""+1);
//        main.fibonacci();
//
//
//
//
//    }
//
//    public  void fibonacci() throws Exception{
//
//
//        int sum  = 1;
//        for(int i = 2; i < 50; i++ ){
//            int value = Integer.sum(Integer.parseInt( stackArray[i-1]) ,  Integer.parseInt(main.stackArray[i-2]));
//            this.push(""+1);
//
//        }
//
//        for(int i = 0; i < 50; i ++){
//            System.out.println(main.pop());
//        }
//
//
//    }
//
//    public boolean isEmpty() {
//        if(top < 0)
//            return true;
//        return false;
//    }
//
//    //check if the stack is full, if full then increase it to double
//    public  void increaseStackIfFull(){
//        if(top == size - 1) {
//            T[] newStackArray = (T[]) new Object[size * 2];
//            for(int i = 0; i < size; i ++) {
//                newStackArray[i] = stackArray[i];
//            }
//            this.stackArray = newStackArray;
//            this.size = this.size * 2;
//        }
//    }
//
//    //adding the value to the stack
//    public  void push(T value) {
//        System.out.println("The value "+ value);
////        this.increaseStackIfFull();
//        this.stackArray[++top] = value;
//
//    }
//
//    //removing the value from the stack
//    public  T pop() throws Exception {
//        if(!isEmpty()) {
//            T topValue = this.stackArray[top--];
//            return topValue;
//        } else  throw  new Exception("Stack is Empty, Operation cannot be performed"); // throw exception if the stack is empty
//    }
//
//
//
}
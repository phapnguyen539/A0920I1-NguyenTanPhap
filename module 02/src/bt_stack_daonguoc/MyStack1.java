package bt_stack_daonguoc;

import java.util.Stack;

public class MyStack1 {
    public static void main(String[] args) {
        Stack<String> mystack1 = new Stack<>();
        mystack1.push("Tuấn");
        mystack1.push("Thành");
        mystack1.push("Quỳnh");
        mystack1.push("Như");
        System.out.println(mystack1.pop());
        System.out.println(mystack1);
    }
}
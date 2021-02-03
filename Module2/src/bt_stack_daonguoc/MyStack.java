package bt_stack_daonguoc;

import java.util.Stack;

public
class MyStack {
    public static void main(String[] args) {
        Stack<Integer> mystack = new Stack<>();
        Integer arr[] = {4, 5, 6, 7, 8};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            mystack.push(arr[i]);
        }
        while (!mystack.isEmpty()) {
            System.out.print(mystack.pop()+ " ");

        }
    }

}

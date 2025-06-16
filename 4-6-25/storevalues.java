import java.util.Stack;

public class Main {
    public static void pushBottom(Stack<Integer> stack, int ele) {
        if (stack.isEmpty()) {
            stack.push(ele);
            return;
        }

        int top = stack.pop();
        pushBottom(stack, ele);
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Original stack: " + stack);
        pushBottom(stack, 0);
        System.out.println("After pushing 0 at bottom: " + stack);
    }
}

public class StackWithArray {
    private int[] stack;
    private int top;
    private int capacity;
    public StackWithArray(int size) {
        stack = new int[size];
        capacity = size;
        top = -1; 
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot add " + item);
            return;
        }
        stack[++top] = item;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return stack[top--];
    }
    public int peek() {
        if (!isEmpty()) {
            return stack[top];
        }
        System.out.println("Stack is empty");
        return -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] initialElements = {1, 2, 3, 4, 5};
        StackWithArray stack = new StackWithArray(initialElements.length);

        for (int elem : initialElements) {
            stack.push(elem);
        }

        stack.printStack();   
        System.out.println("Popped element: " + stack.pop()); 
        System.out.println("Top element: " + stack.peek());   
    }
}

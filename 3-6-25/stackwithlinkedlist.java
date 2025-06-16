class StackWithLinkedList {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node top; 

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
    public int pop() {
        if (top == null) throw new RuntimeException("Stack is empty");
        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }
    public int peek() {
        if (top == null) throw new RuntimeException("Stack is empty");
        return top.data;
    }
    public boolean isEmpty() {
        return top == null;
    }
    public void printStack() {
        Node current = top;
        System.out.print("Stack (top to bottom): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackWithLinkedList stack = new StackWithLinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.printStack();  
    }
}

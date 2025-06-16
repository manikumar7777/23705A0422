class Tree {
    Node root;
    int index = -1;

    Tree(int[] nodes) {
        this.root = buildTreeUsingArray(nodes);
        System.out.println("Index after build: " + index);
    }

    public Node buildTreeUsingArray(int[] nodes) {
        index++;
        if (index >= nodes.length) {
            return null;
        }
        if (nodes[index] == -1) return null;

        Node newNode = new Node(nodes[index]);
        newNode.left = buildTreeUsingArray(nodes);
        newNode.right = buildTreeUsingArray(nodes);

        return newNode;
    }

    public void preOrder() {
        preOrderHelper(root);
    }

    private void preOrderHelper(Node temp) {
        if (temp == null) return;

        System.out.print(temp.data + " "); 
        preOrderHelper(temp.left);
        preOrderHelper(temp.right);  
    }

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}

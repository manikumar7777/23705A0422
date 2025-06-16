class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        this.root = null;
    }

    public static Node insertNode(Node root, int data) {
        if (root == null) {
            return new Node(data);  
        }

        if (data > root.data) {
            root.right = insertNode(root.right, data);
        } else if (data < root.data) {
            root.left = insertNode(root.left, data);
        } 
          return root;
    }
}
public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = BinaryTree.insertNode(tree.root, 50);
        tree.root = BinaryTree.insertNode(tree.root, 30);
        tree.root = BinaryTree.insertNode(tree.root, 70);
        tree.root = BinaryTree.insertNode(tree.root, 20);
        tree.root = BinaryTree.insertNode(tree.root, 40);
        tree.root = BinaryTree.insertNode(tree.root, 60);
        tree.root = BinaryTree.insertNode(tree.root, 80);
        inorder(tree.root);
    }
    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
}

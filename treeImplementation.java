import java.util.ArrayList;
import java.util.List;

// Binary Tree -> atmost 2 children having left less than and right greater than

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class treeImplementation {
    static Node root;
    // Traversing Tree storing it value in List of Array
    static List<Integer> inOrder = new ArrayList<>();
    static List<Integer> preOrder = new ArrayList<>();
    static List<Integer> postOrder = new ArrayList<>();
    static List<Integer> leftView = new ArrayList<>();
    static List<Integer> leftChild = new ArrayList<>();
    static List<Integer> mirrorView = new ArrayList<>();

    // Insert value and checking whether its root is null or not || root k left
    // value se bda h y chota

    public Node insertValue(int value) {
        return insertRecursively(root, value);
    }

    public Node insertRecursively(Node node, int val) {
        // It is first value so store it to root
        if (node == null) {
            return new Node(val);
        }

        // other than root value means in root there is value
        if (val < node.value) {
            node.left = insertRecursively(node.left, val);
        } else if (val > node.value) {
            node.right = insertRecursively(node.right, val);
        }
        return node;
    }

    // Traversing Method -> In Order

    public static List<Integer> traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            inOrder.add(node.value);
            traverseInOrder(node.right);

        }
        return inOrder;
    }

    // Traversing Method -> Pre Order
    public static List<Integer> traversePreOrder(Node node) {
        if (node != null) {
            preOrder.add(node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);

        }
        return preOrder;
    }

    // Traversing Method -> Post Order

    public static List<Integer> traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            postOrder.add(node.value);

        }
        return postOrder;
    }

    // Printing left child of whole tree
    public static List<Integer> leftChildTree(Node node) {
        if (node != null) {
            // leftView.add(node.value); // for only left view
            if (node.left != null) {
                leftChild.add(node.left.value);

            }
            leftChildTree(node.left);
            leftChildTree(node.right);

        }
        return leftChild;
    }

    // Printing left View of whole tree
    public static List<Integer> leftViewTree(Node node) {
        if (node != null) {
            leftView.add(node.value); // for only left view
            leftViewTree(node.left);

        }
        return leftView;
    }

    public static void swap(Node n) {
        Node temp = n.left;
        n.left = n.right;
        n.right = temp;
    }

    // Printing mirror view only of tree
    public static List<Integer> mirrorViewTree(Node node) {
        if (node != null) {
            swap(node);
            // Node temp = node.left;
            // node.left = node.right;
            // node.right = temp;
            mirrorViewTree(node.left);
            mirrorView.add(node.value);
            mirrorViewTree(node.right);

        }
        return mirrorView;
    }

    public static void main(String[] args) {
        treeImplementation binaryTree = new treeImplementation();
        binaryTree.root = new Node(45);
        binaryTree.root = binaryTree.insertValue(20); // left me jana chaiye
        binaryTree.insertValue(50); // right me jana chaiye
        binaryTree.insertValue(90);
        binaryTree.insertValue(10);
        binaryTree.insertValue(40);
        binaryTree.insertValue(5);
        binaryTree.insertValue(67);
        System.out.println("PreOrder will be ");
        System.out.println(traversePreOrder(root));

        System.out.println("Inorder will be ");
        System.out.println(traverseInOrder(root));

        System.out.println("PostOrder will be ");
        System.out.println(traversePostOrder(root));

        System.out.println("Left Child of  whole BST will be");
        System.out.println(leftChildTree(root));

        System.out.println("Left view of  whole BST will be");
        System.out.println(leftViewTree(root));

        System.out.println("Mirror View of BST will be");
        System.out.println(mirrorViewTree(root));
    }
}

/*
 * 
 * TREE WILL BE
 * 
 * -----------------------------------45-------------------------------------
 * -----------------------20---------------------50---------------------------
 * -----------------10---------40----------------------------90--------------
 * ------------5---------------------------------------67-------------------
 * 
 */
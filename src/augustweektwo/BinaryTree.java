package augustweektwo;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by IntelliJ IDEA.
 * User: Jbialon
 * Date: 8/12/2021
 * Time: 10:11 AM
 * Description: {Insert Description}
 */
public class BinaryTree {

    private Node root;

    public BinaryTree()
    {
        root = null;
    }

    void printLevelOrder()
    {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty())
        {

            Node tempNode = queue.poll();
            System.out.print(tempNode.getData() + " ");

            if (tempNode.getLeft() != null) {
                queue.add(tempNode.getLeft());
            }

            if (tempNode.getRight() != null) {
                queue.add(tempNode.getRight());
            }
        }
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

}

class Node {
    private int data;
    private Node left, right;
    public Node(int item)
    {
        data = item;
        left = right = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}

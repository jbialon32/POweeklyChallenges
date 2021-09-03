package septemberweekone;

/**
 * Created by IntelliJ IDEA.
 * User: Jbialon
 * Date: 9/1/2021
 * Time: 2:06 PM
 * Description: {Insert Description}
 */
public class BalancedTree {

    public BalancedTree() {}

    static Node root;

    Node arrayToBST(int arr[], int start, int end) {

        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);

        node.left = arrayToBST(arr, start, mid - 1);

        node.right = arrayToBST(arr, mid + 1, end);

        return node;
    }

    void printNode(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        printNode(node.left);
        printNode(node.right);
    }

    class Node {

        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

}

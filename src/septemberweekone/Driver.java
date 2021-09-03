package septemberweekone;

/**
 * Created by IntelliJ IDEA.
 * User: Jbialon
 * Date: 9/3/2021
 * Time: 9:18 AM
 * Description: {Insert Description}
 */
public class Driver {

    public static void main(String[] args) {
        BalancedTree sut = new BalancedTree();
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 9, 10, 11};
        int n = arr.length - 1;
        BalancedTree.Node root = sut.arrayToBST(arr, 0, n);
        sut.printNode(root);
    }

}

package augustweektwo;

/**
 * Created by IntelliJ IDEA.
 * User: Jbialon
 * Date: 8/12/2021
 * Time: 10:18 AM
 * Description: {Insert Description}
 */
public class Driver {
    public static void main(String args[])
    {
        BinaryTree tree = new BinaryTree();
        tree.setRoot(new Node(1));
        tree.getRoot().setLeft(new Node(2));
        tree.getRoot().setRight(new Node(3));
        tree.getRoot().getLeft().setLeft(new Node(4));
        tree.getRoot().getLeft().setRight(new Node(5));

        System.out.println("Level order traversal of binary tree is ");
                tree.printLevelOrder();
    }
}

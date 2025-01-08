public class Demo {

    static TreeNode root;

    TreeNode insert(TreeNode node, int elem) {
        if (node == null) {
            node = new TreeNode(elem);
            return node;
        }
        if (elem < node.elem) {
            node.left = insert(node.left, elem);
        } else {
            node.right = insert(node.right, elem);
        }
        return node;
    }

    void printBSTInOrder(TreeNode node) {
        if (node == null) {
            return;
        } else {
            printBSTInOrder(node.right);
            System.out.println(node.elem);
            printBSTInOrder(node.left);
        }
    }

    public static void main(String[] args) {
        Demo tree = new Demo();
        root = tree.insert(root, 100);
        tree.insert(root, 80);
        tree.insert(root, 110);
        tree.insert(root, 90);
        tree.insert(root, 45);
        tree.insert(root, 20);
        tree.printBSTInOrder(root);

    }
}

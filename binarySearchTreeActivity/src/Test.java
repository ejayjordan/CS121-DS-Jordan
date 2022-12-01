public class Test {
    public static void main(String[] args){
        BinarySearchTreeDemo tree = new BinarySearchTreeDemo();

        tree.addNode('A');
        tree.addNode('B');
        tree.addNode('C');
        tree.addNode('D');
        tree.addNode('E');
        tree.addNode('F');
        tree.addNode('G');

        System.out.println("preorder traversal:");
        tree.preOrderTraverse(tree.getRoot());
        System.out.println();

        System.out.println("inorder traversal:");
        tree.inOrderTraverse(tree.getRoot());
        System.out.println();

        System.out.println("postorder traversal:");
        tree.postOrderTraverse(tree.getRoot());
        System.out.println();
    }
}

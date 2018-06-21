public class Main {
    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(10);
        binaryTree.add(5);
        binaryTree.add(7);
        binaryTree.add(3);
        binaryTree.add(3);

        System.out.println(binaryTree.contains(5));
        System.out.println(binaryTree.contains(2));

        System.out.println("\nThe size of binary tree:");
        System.out.println(binaryTree.size());

        System.out.println("\nMax value of this binary tree:");
        System.out.println(binaryTree.maxValue());
    }
}

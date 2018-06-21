public class BinaryTree {

        private Node root;

        BinaryTree() {
            root = null;
        }

        public boolean contains(int data) {
            return containsRecursive(root, data);
        }

        private boolean containsRecursive(Node node, int data) {
            // Root node is null so tree is empty
            if(node == null)
                return false;

            if(data == node.value)
                return true;

            else if(data < node.value)
                return containsRecursive(node.left, data);

            else
                return containsRecursive(node.right, data);
        }


        public void add(int value) {
            root = addRecursive(root, value);
        }

        private Node addRecursive(Node node, int value) {
            // If root is null then tree is empty
            if(node == null)
                node = new Node(value);

            else {
                if(value <= node.value)
                    node.left = addRecursive(node.left, value);
                else
                    node.right = addRecursive(node.right, value);
            }

            return node;
        }

        public int size() {
            return sizeRecursive(root);
        }

        private int sizeRecursive(Node node) {
            if(node == null)
                return 0;
            else
                return sizeRecursive(node.left) + 1 + sizeRecursive(node.right);
        }


        public int maxDepth() {
            return maxDepthRecursive(root);
        }

        private int maxDepthRecursive(Node node) {
            if(node == null)
                return 0;
            else {
                int leftDepth = maxDepthRecursive(node.left);
                int rightDepth = maxDepthRecursive(node.right);

                return leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;
            }
        }

        public int minValue() {
            return minValueRecursive(root);
        }

        private int minValueRecursive(Node node) {
            if(node.left == null)
                return node.value;
            else
                return minValueRecursive(node.left);
        }

        public int maxValue() {
            return maxValueRecursive(root);
        }

        private int maxValueRecursive(Node node) {
            if(node.right == null)
                return node.value;
            else
                return maxValueRecursive(node.right);
        }
}

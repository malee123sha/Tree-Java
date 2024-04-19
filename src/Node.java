 class Node { //root
    Node left,right; //child s of root
    int value; //adding values
    public Node(int key) {
        value = key;
        left = right = null;
    }
}
class binaryTree {
    Node root;
    public void structure(Node node){
        if(node != null){ //!=  :-false
            structure(node.left);
            System.out.println(" "+node.value);
            structure(node.right);
        }
    }
    public static void main(String[] args) {
        binaryTree tree = new binaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        System.out.println("Binary Tree :- ");
        tree.structure(tree.root);
    }
}





package BinaryTree;

public class main {

    public static Node addLeaf(Node t1, int val){
        if(t1 == null){
            return new Node(val);
        }
        else if(val < t1.value){
            t1.left = addLeaf(t1.left, val);
        }
        else{
            t1.right = addLeaf(t1.right, val);
        }
        return t1;
    }

    public static void inOrder(Node tree){
        if(tree == null){
            return;
        }
        inOrder(tree.left);
        System.out.println(tree.value+" ");
        inOrder(tree.right);
    }

    public static void main(String[] args){

        Node tree = new Node(5);
        addLeaf(tree, 10);
        addLeaf(tree, 15);
        addLeaf(tree, 2);
        addLeaf(tree, 1);

        inOrder(tree);

    }

}

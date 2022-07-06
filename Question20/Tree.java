package Ontap.Question20;

public class Tree {
    private TreeNode root;

    public void insert(int value){
        if(root == null){
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }
    public void insertAll(int [] myValues){
        root = new TreeNode(myValues[0]);
        for (int i = 1; i < myValues.length; i ++){
            root.insert(myValues[i]);
        }
    }
    public void traverseInOrder(){
        if(root != null){
            root.traverseInOrder();
        }
    }
    public void traversePreOrder(){
        if(root != null){
            root.traversePreOrder();
        }
    }
    public TreeNode getRoot(){
        return root;
    }
    public void setRoot(TreeNode root){
        this.root = root;
    }
    public int min(){
        if (root == null){
            return Integer.MIN_VALUE;
        } else {
            return root.min();
        }
    }
    public int max(){
        if (root == null){
            return Integer.MAX_VALUE;
        } else {
            return root.max();
        }
    }
    public int countNode(TreeNode root){
        if (root == null){
            return 0;
        }
        return 1 + countNode(root.getLeftChild())+countNode(root.getRightChild());
    }
    public TreeNode binarySearch(TreeNode root, int value){
        if (root == null){
            return null;
        }
        if (root.getData() == value) {
            return root;
        }
        if (value < root.getData()){
            return (binarySearch(root.getLeftChild(), value));
        } else {
            return (binarySearch(root.getRightChild(), value));
        }
    }

}

package Ontap.Question20;

public class Main {
    public static void main(String []args){
        int [] arr = {15, 3, 7, 9, 8, 11, 6, 20, 19, 37, 25, 21, 5, 12};
        Tree tree = new Tree();
        tree.insertAll(arr);
        System.out.println(" Root: " + tree.getRoot().getData());
        tree.traverseInOrder();
        System.out.println(" Max: " + tree.max());
        System.out.println(" Min: " + tree.min());
        System.out.println(" Number of nodes: " + tree.countNode(tree.getRoot()));
        System.out.println(" " + tree.binarySearch(tree.getRoot(),15));
    }
}

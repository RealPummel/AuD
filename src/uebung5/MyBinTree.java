package uebung5;

import aud.util.*;        //to use DotViewer, SingleStepper
import aud.BinaryTree;    //to use BinaryTree<T>
import aud.Queue;         //to use Queue<T>

//------------------------------------------------------------------//
public class MyBinTree<T> extends BinaryTree<T> {
    //----------------------------------------------------------------//
    public MyBinTree(T data) {
        super(data);
    }

    //----------------------------------------------------------------//
    public MyBinTree(T data,MyBinTree<T> left,MyBinTree<T> right) {
        super(data, left, right);
    }

    //----------------------------------------------------------------//
    public int maxWidth() {
        // TODO:
        // - implement to return the maximum width of the binary tree
        // - you can use a queue for your solution

        if (this.getRoot() == null) {
            return 0;
        }

        Queue<MyBinTree<T>> queue = new Queue<>();
        queue.enqueue(this);

        int maxWidth = 0;

        while (!queue.is_empty()) {
            int levelWidth = 0;
            Queue<MyBinTree<T>> tempQueue = new Queue<>();

            while (!queue.is_empty()) {
                MyBinTree<T> node = queue.dequeue();
                levelWidth++;

                if (node.getLeft() != null) {
                    tempQueue.enqueue((MyBinTree<T>) node.getLeft());
                }
                if (node.getRight() != null) {
                    tempQueue.enqueue((MyBinTree<T>) node.getRight());
                }
            }

            queue = tempQueue;
            maxWidth = Math.max(maxWidth, levelWidth);
        }

        return maxWidth;
    }

    //---------------------------------------------------------------//
    public static void main(String[] args) {
        // TODO: test your code with appropriate examples
        MyBinTree<Integer> tree = new MyBinTree<>(1);
        tree.setLeft(new MyBinTree<>(2));
        tree.setRight(new MyBinTree<>(3));
        tree.getLeft().setLeft(new MyBinTree<>(4));
        tree.getLeft().setRight(new MyBinTree<>(5));
        tree.getRight().setRight(new MyBinTree<>(6));
        tree.getLeft().getRight().setLeft(new MyBinTree<>(7));

        System.out.println(tree.maxWidth());

        DotViewer.displayWindow(tree, "MyBinTree").setExitOnClose();
    }
}

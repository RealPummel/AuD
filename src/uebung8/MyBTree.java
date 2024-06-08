package uebung8;

import aud.BTree;
import aud.KTreeNode;
import aud.util.DotViewer;
import aud.util.SingleStepper;

import java.util.Random;

public class MyBTree<T extends Comparable<T>> extends BTree<T> {


    /**
     * create an empty tree of order 2*m+1
     *
     * @param m
     */
    public MyBTree(int m) {
        super(m);
    }

    public int getHeight() {
        KTreeNode<T> temp = this.root();
        int height = 0;
        while (temp != null) {
            height++;
            temp = temp.getChild(0);
        }
        return height;
    }


    public static void main(String[] args) {
        MyBTree<Integer> tree = new MyBTree<>(2);
        DotViewer viewer = DotViewer.displayWindow(tree, "BTree");
        SingleStepper stepper = new SingleStepper("Stepper");

        stepper.halt();
        tree.insert(6);
        viewer.display(tree);
        stepper.halt();
        tree.insert(18);
        viewer.display(tree);
        stepper.halt();
        tree.insert(22);
        viewer.display(tree);
        stepper.halt();
        tree.insert(3);
        viewer.display(tree);
        stepper.halt();
        tree.insert(11);
        viewer.display(tree);
        stepper.halt();
        tree.insert(16);
        viewer.display(tree);
        stepper.halt();
        tree.insert(7);
        viewer.display(tree);
        stepper.halt();
        tree.insert(10);
        viewer.display(tree);
        stepper.halt();
        tree.insert(1);
        viewer.display(tree);
        stepper.halt();
        tree.insert(8);
        viewer.display(tree);
        stepper.halt();
        tree.insert(12);
        viewer.display(tree);

        System.out.println(tree.getHeight());

        MyBTree<Integer> tree2 = new MyBTree<>(2);

        for (int i = 0; i < 1000000; i++) {
            tree2.insert(new Random().nextInt(1000000));
        }

        System.out.println(tree2.getHeight());

        viewer.setExitOnClose();
    }
}

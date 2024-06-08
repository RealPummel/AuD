package uebung6;

import aud.*;
import aud.example.expr.*;
import aud.example.expr.Number;
import aud.util.*;

//-----------------------------------------------------------------//

/**
 * Class which is able the compute the derivative of a given
 * `ExpressionTree` with respect to a user specified variable.
 */
public class Differentiation {
    //----------------------------------------------------------------//
    public static ExpressionTree differentiate(BinaryTree<AtomicExpression> t, String var) {
        if (t == null) {
            return null;
        }

        ExpressionTree tree = new ExpressionTree(t.getData().clone());


        if (t.getData().getType() == AtomicExpression.Type.OpPlus) {
            if (t.getLeft().getData().toString().equals(var)) {
                tree.setLeft(new ExpressionTree(new Number(0)));
            } else {
                tree.setLeft(differentiate(t.getLeft(), var));
            }

            if (t.getRight().getData().toString().equals(var)) {
                tree.setRight(new ExpressionTree(new Number(0)));
            } else {
                tree.setRight(differentiate(t.getRight(), var));
            }
        } else if (t.getData().getType() == AtomicExpression.Type.OpTimes) {

            tree.setData(new Plus());
            tree.setLeft(new BinaryTree<>(new Times(), differentiate(t.getLeft(), var), t.getRight()));
            tree.setRight(new BinaryTree<>(new Times(), differentiate(t.getRight(), var), t.getLeft()));

        } else if (t.getData().getType() == AtomicExpression.Type.TSymbol) {

            if (t.getData().toString().equals(var)) {
                t.setData(new Number(1));
            } else {
                t.setData(new Number(0));
            }
        }
        return tree;

    }

    //----------------------------------------------------------------//
    public static void main(String[] args) {

        // tree with x*y
        ExpressionTree tree = new ExpressionTree(new Times(), new ExpressionTree(new Symbol("x")), new ExpressionTree(new Symbol("y")));

        DotViewer.displayWindow(tree, "ExpressionTree").setExitOnClose();
        ExpressionTree differientatedTree = differentiate(tree, "x");
        DotViewer.displayWindow(differientatedTree, "Differentiated ExpressionTree").setExitOnClose();
        System.out.println(differientatedTree);
    }
}

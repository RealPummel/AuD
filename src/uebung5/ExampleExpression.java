package uebung5;

import aud.example.expr.ExpressionParser;
import aud.example.expr.ExpressionTree;
import aud.example.expr.Number;
import aud.example.expr.Plus;
import aud.example.expr.Times;
import aud.util.*;                    //to use DotViewer, SingleStepper


//------------------------------------------------------------------//
public class ExampleExpression  {
    //----------------------------------------------------------------//
    public static void main(String[] args) {
        // TODO: create an appropriate example which uses ExpressionParser
        //       and ExpressionTree

        ExpressionParser parser = new ExpressionParser();
        ExpressionTree tree = parser.parse("(1+2)*(3+4)/3");

        DotViewer.displayWindow(tree,"ExpressionTree").setExitOnClose();

        double result = tree.getValue();
        System.out.println("The result of the expression is: " + result);
 
        System.out.println(tree.preorder());
        System.out.println(tree.inorder());
        System.out.println(tree.postorder());
        System.out.println(tree.levelorder());

        // get the result of the expression

    }
}

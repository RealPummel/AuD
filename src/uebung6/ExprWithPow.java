package uebung6;

import aud.example.expr.*;

public class ExprWithPow extends ExpressionParser2 {

    @Override
    protected ExpressionTree product(int level) {
        verbose(level,"<product>");

        ExpressionTree left=pow(level+1);

        if (lookahead()==Tokenizer.TIMES) {
            nextToken();
            ExpressionTree right=product(level+1);
            return new ExpressionTree(new Times(),left,right);
        }
        else if (lookahead()==Tokenizer.DIVIDE) {
            nextToken();
            ExpressionTree right=product(level+1);
            return new ExpressionTree(new Divide(),left,right);
        }

        return left;
    }

    protected ExpressionTree pow(int level) {
        verbose(level,"<pow>");

        ExpressionTree left=factor(level+1);

        if (lookahead()==Tokenizer.POWER) {
            nextToken();
            ExpressionTree right=pow(level+1);
            return new ExpressionTree(new Power(),left,right);
        }

        return left;
    }

    public static void main(String[] args) {
        String input = "2*(3+4)**2";
        System.out.println("input = '" + input + "'");

        ExprWithPow p = new ExprWithPow();
        p.setVerbose(true);
        ExpressionTree tree = p.parse(input);

        System.out.println("output = '" + tree + "'");
        System.out.println(tree.postorder().toString());
    }

}
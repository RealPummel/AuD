package uebung11;

import aud.example.graph.*;
import aud.util.DotViewer;

//------------------------------------------------------------------//
public class MSTPrimDemo {
    //----------------------------------------------------------------//
    public static void main(String args[]) {
        //TODO: implement
        // Graph erstellen
        MyGraph g = new MyGraph(false);

        MyNode node0 = g.addNode();
        MyNode node1 = g.addNode();
        MyNode node2 = g.addNode();
        MyNode node3 = g.addNode();
        MyNode node4 = g.addNode();
        MyNode node5 = g.addNode();

        node0.setLabel("0");
        node1.setLabel("1");
        node2.setLabel("2");
        node3.setLabel("3");
        node4.setLabel("4");
        node5.setLabel("5");

        g.addEdge(node0, node1).setWeight(2);
        g.addEdge(node0, node2).setWeight(5);
        g.addEdge(node0, node3).setWeight(3);
        g.addEdge(node2, node3).setWeight(1);
        g.addEdge(node1, node5).setWeight(4);
        g.addEdge(node3, node5).setWeight(6);
        g.addEdge(node2, node5).setWeight(8);
        g.addEdge(node2, node4).setWeight(7);
        g.addEdge(node4, node5).setWeight(9);

        DotViewer display = DotViewer.displayWindow(g, "Graph");
        display.setExitOnClose();

        PrimMinimumSpanningTree prim = new PrimMinimumSpanningTree(g);
        prim.start(node0);

        display.display(g);



    }
}
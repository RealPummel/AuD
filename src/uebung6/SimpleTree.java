package uebung6;

//-----------------------------------------------------------------//
public class SimpleTree<T extends Comparable<T>> {
    //---------------------------------------------------------------//
    public class Node {
        // TODO: implement node class
        Node left_;
        Node right_;
        T data_;
    }

    //---------------------------------------------------------------//
    private Node root_;

    //---------------------------------------------------------------//
    public SimpleTree() {
        // TODO: implementation
        root_ = null;
    }

    //---------------------------------------------------------------//
    public void add(T obj) {
        Node newNode = new Node();
        newNode.data_ = obj;
        if (root_ == null) {
            root_ = newNode;
        } else {
            addRecursive(root_, newNode);
        }
    }

    private void addRecursive(Node current, Node newNode) {
        if (newNode.data_.compareTo(current.data_) < 0) {
            if (current.left_ == null) {
                current.left_ = newNode;
            } else {
                addRecursive(current.left_, newNode);
            }
        } else if (newNode.data_.compareTo(current.data_) > 0) {
            if (current.right_ == null) {
                current.right_ = newNode;
            } else {
                addRecursive(current.right_, newNode);
            }
        }
    }


    //---------------------------------------------------------------//
    public boolean contains(T obj) {
        // TODO: implementation

        return containsRecursive(root_, obj);
    }

    private boolean containsRecursive(Node current, T obj) {
        if (current == null) {
            return false;
        } else if (current.data_.equals(obj)) {
            return true;
        } else if (obj.compareTo(current.data_) < 0) {
            return containsRecursive(current.left_, obj);
        } else {
            return containsRecursive(current.right_, obj);
        }
    }

    //---------------------------------------------------------------//
    public String toString() {
        // TODO: implementation

        StringBuilder sb = new StringBuilder();
        toStringRecursive(root_, sb);
        return sb.toString();
    }

    private void toStringRecursive(Node current, StringBuilder sb) {
        if (current != null) {
            toStringRecursive(current.left_, sb);
            sb.append(current.data_).append(" ");
            toStringRecursive(current.right_, sb);
        }
    }

    //---------------------------------------------------------------//
    public static void main(String[] args) {
        // TODO: test your code with appropriate examples

        SimpleTree<Integer> integerSimpleTree = new SimpleTree<>();

        integerSimpleTree.add(4);
        integerSimpleTree.add(2);
        integerSimpleTree.add(6);
        integerSimpleTree.add(1);
        integerSimpleTree.add(3);
        integerSimpleTree.add(5);
        integerSimpleTree.add(7);

        System.out.println(integerSimpleTree);

        System.out.println(integerSimpleTree.contains(8));
    }
}

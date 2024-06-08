package uebung3;

/**
 * MySList represents a single linked list, which holds elements of type
 * integer.
 */
public class MySList implements Iterable<Integer> {
    //-----------------------------------------------------------------//
    //------------- !!Do not change the following lines!! -------------//

    public boolean empty() {
        return head_ == null;
    }

    public String toString() {
        if (empty())
            return "[]";

        String rv = "[";
        Node node = head_;
        do {
            rv += node.data_;
            if (node.next_ != null)
                rv += ",";
            node = node.next_;
        } while (node != null);
        rv += "]";
        return rv;
    }

    //-----------------------------------------------------------------//
    //---------------- !!Insert your solution below!! -----------------//

    /**
     * Node represents a single element in the list.
     */
    class Node {
        int data_; //!! Do not change this line !!
        // TODO: further implementation of `Node`

        Node next_;

        public Node(int data, Node next) {
            data_ = data;
            next_ = next;
        }
    }

    Node head_;

    //----------------------------------------------------------------//
    public MySList() {
        // TODO: Constructor
        head_ = null;
    }

    //----------------------------------------------------------------//
    // TODO: implement (at least) a function to insert an element
    //       into MySList

    public void push_back(int obj) {
        if (head_ == null) {
            head_ = new Node(obj, null);
        } else {
            Node node = new Node(obj, null);
            Node current = head_;
            while (current.next_ != null) {
                current = current.next_;
            }
            current.next_ = node;
        }
    }

    public void backTraverse() {
        // TODO: implement a recursive method to print out reversed

        if (head_ == null) {
            return;
        } else {
            MySList.Node current = head_;
            while (current.next_ != null) {
                current = current.next_;
            }
            System.out.println(current.data_);
        }
    }

    //----------------------------------------------------------------//

    /**
     * Iterator is used to traverse odd elements in a list.
     */
    public class Iterator implements java.util.Iterator<Integer> {
        Node current;

        public Iterator() {
            current = head_;
            moveToNextOdd();
        }

        private void moveToNextOdd() {
            while (current != null && current.data_ % 2 == 0) {
                current = current.next_;
            }
        }

        public boolean hasNext() {
            return current != null;
        }

        public Integer next() {
            if (current == null) {
                return 0;
            }
            int data = current.data_;
            current = current.next_;
            moveToNextOdd();
            return data;
        }
    }

    //----------------------------------------------------------------//
    public Iterator iterator() {
        // TODO: implement this method, which returns a new iterator instance
        return new Iterator();
    }

    //----------------------------------------------------------------//
    public static void main(String[] args) {
        // TODO: test your code with appropriate examples

        MySList list = new MySList();
        list.push_back(1);
        list.push_back(2);
        list.push_back(3);
        list.push_back(4);
        list.push_back(5);
        list.push_back(6);
        list.push_back(7);
        list.push_back(8);
        list.push_back(9);
        list.push_back(10);

        list.backTraverse();

        for (Integer element : list) {
            if (element != null) {
                System.out.println(element);
            }
        }
    }
}

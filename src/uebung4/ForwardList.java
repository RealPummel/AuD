package uebung4;

import java.util.NoSuchElementException;

/**
 * ForwardList represents a list with single linked nodes, that do have
 * a next-pointer.
 */
public class ForwardList<T> implements Iterable<T> {
    //-----------------------------------------------------------------//
    //------------- !!Do not change the following lines!! -------------//
    public String toString() {
        if (is_empty())
            return "[]";
        String rv = "[";
        Node node = head_;
        do {
            rv += node.data_.toString();
            if (node.next_ != head_)
                rv += ",";
            node = node.next_;
        } while (node != null);
        rv += "]";
        return rv;
    }

    //-----------------------------------------------------------------//
    //---------------- !!Insert your solution below!! -----------------//
    // A Node is a single element in the list
    public class Node {
        //---------------------------------------------------------------//
        //    !!! Do not change the existing lines in class Node!!!      //
        //            !!! It is allowed to add new content !!!           //
        //       !!! It is not allowed to add a previous pointer !!!     //
        //---------------------------------------------------------------//
        public T data_;
        public Node next_ = null;

        public Node(T data, Node next) {
            data_ = data;
            next_ = next;
        }
    }

    //-----------------------------------------------------------------//
    public Node head_ = null;

    //-----------------------------------------------------------------//
    public ForwardList() {
        head_ = null;
    }

    //-----------------------------------------------------------------//
    public void push_front(T obj) {
        // TODO: implement adding elements to the front of the list
        head_ = new Node(obj, head_);
    }

    //-----------------------------------------------------------------//
    public boolean is_empty() {
        // TODO: should return `true` if the list is empty else `false`
        return head_ == null;
    }

    //-----------------------------------------------------------------//
    public void backTraverse(Node node) {
        // TODO: implement a recursive method to print out reversed

        if (node == null) {
            return;
        }
        backTraverse(node.next_);
        System.out.print(node.data_ + " ");
    }

    //-----------------------------------------------------------------//
    public class BackIterator implements java.util.Iterator<T> {
        // TODO: implement an iterator that provides a reveres iteration
        private Node current;

        public BackIterator(Node head) {
            // Create a reversed copy of the original list
            Node reversed = null;
            while (head != null) {
                reversed = new Node(head.data_, reversed);
                head = head.next_;
            }
            current = reversed;
        }

        public boolean hasNext() {
            return current != null;
        }

        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T data = current.data_;
            current = current.next_;
            return data;
        }
    }

    //-----------------------------------------------------------------//
    public BackIterator iterator() {
        // TODO: return an instance of the iterator
        return new BackIterator(head_);
    }

    //-----------------------------------------------------------------//
    public static void main(String[] args) {
        // TODO: test your code with appropriate examples
        ForwardList<Integer> list = new ForwardList<>();
        list.push_front(1);
        list.push_front(2);
        list.push_front(3);
        list.push_front(4);
        list.push_front(5);

        System.out.println(list);

        list.backTraverse(list.head_);
        System.out.println();

        ForwardList<Integer>.BackIterator it = list.iterator();
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}

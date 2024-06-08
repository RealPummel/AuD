package uebung3;

import java.util.NoSuchElementException;

public class MyCircle<T> {
    //-----------------------------------------------------------------//
    //------------- !!Do not change the following lines!! -------------//
    //A Node is a single element int the ring
    class Node {
        T data_ = null;
        Node next_ = null;
        Node prev_ = null;

        Node(T obj, Node prv, Node nxt) {
            data_ = obj;
            prev_ = prv;
            next_ = nxt;
        }
    }

    //--- class members
    protected Node head_ = null;

    //--- class methods
    public MyCircle() {
        head_ = null;
    }

    public T front() {
        return head_.data_;
    }

    public String toString() {
        if (empty())
            return "[]";
        String rv = "[";
        Node node = head_;
        do {
            rv += node.data_.toString();
            if (node.next_ != head_)
                rv += ",";
            node = node.next_;
        } while (node != head_);
        rv += "]";
        return rv;
    }

    //-----------------------------------------------------------------//
    //---------------- !!Insert your solution below!! -----------------//
    public int size() {
        // TODO: return the size of the ring buffer

        if (head_ == null) {
            return 0;
        }
        int size = 1;
        Node node = head_;
        while (node.next_ != head_) {
            size++;
            node = node.next_;
        }
        return size;

    }

    //-----------------------------------------------------------------//
    public boolean empty() {
        // TODO: return if the ring buffer is empty

        return head_ == null;

    }

    //-----------------------------------------------------------------//
    public void push_back(T obj) {
        // TODO: append an element at the 'end' of the end buffer
        if (head_ == null) {
            head_ = new Node(obj, null, null);
            head_.next_ = head_;
            head_.prev_ = head_;
        } else {
            Node newNode = new Node(obj, head_.prev_, head_);
            head_.prev_.next_ = newNode;
            head_.prev_ = newNode;
        }
    }

    //-----------------------------------------------------------------//
    public void pop_front() {
        // TODO: remove an element at the 'front' if the ring buffer
        if (head_ == null) {
            System.out.println("No circle to pop");
        } else if (head_.next_ == head_) {
            head_ = null;
        } else {
            Node nextNode = head_.next_;
            Node prevNode = head_.prev_;
            prevNode.next_ = nextNode;
            nextNode.prev_ = prevNode;
            head_ = nextNode;
        }
    }

    //-----------------------------------------------------------------//
    public static void main(String[] args) {
        // TODO: test your code with appropriate examples

        MyCircle<Integer> circle = new MyCircle<>();


        circle.push_back(1);
        circle.push_back(2);
        circle.push_back(3);

        System.out.println(circle.toString());

        circle.pop_front();

        System.out.println(circle.toString());
        System.out.println(circle.size());

    }
}

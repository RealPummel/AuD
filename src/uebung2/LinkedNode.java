package uebung2;

public class LinkedNode<T> {
    T data_ = null;
    LinkedNode<T> next_ = null;

    // TODO: constructors

    public LinkedNode(T data){
        this.data_ = data;
    }

    public LinkedNode(T data, LinkedNode<T> next){
        this.data_ = data;
        this.next_ = next;
    }

    // TODO: getters and setters

    public void setData_(T data){
        this.data_ = data;
    }

    public T getData(){
        return data_;
    }

    public void setNext_(LinkedNode<T> next){
        this.next_ = next;
    }

    public LinkedNode<T> getNext_(){
        return next_;
    }

    // Provide String-representation for list beginning at `this` node.
    @Override
    public String toString() {
        // TODO: show data_ from this to the end
        String result = "";
        LinkedNode<T> node = this;
        while (node != null){
            result += node.data_ + "-->";
            node = node.next_;
        }

        result += "null";

        return result;
    }

    public void deleteNode(LinkedNode<T> nodeToDelete) {
        if (nodeToDelete == null || nodeToDelete.getNext_() == null) {
            return;
        }
        LinkedNode<T> nextNode = nodeToDelete.getNext_();
        nodeToDelete.setData_(nextNode.getData());
        nodeToDelete.setNext_(nextNode.getNext_());
    }

    public void removeDuplicates() {
        LinkedNode<T> current = this;
        while (current != null) {
            LinkedNode<T> runner = current;
            while (runner.next_ != null) {
                if (runner.next_.data_.equals(current.data_)) {
                    runner.next_ = runner.next_.next_;
                } else {
                    runner = runner.next_;
                }
            }
            current = current.next_;
        }
    }

    // You must provide a main() method!
    public static void main(String[] args) {
        // TODO: Test
        LinkedNode<String> head = new LinkedNode<>("");
        LinkedNode<String> node1 = new LinkedNode<>("Montag");
        LinkedNode<String> node2 = new LinkedNode<>("Dienstag");
        LinkedNode<String> node3 = new LinkedNode<>("Mittwoch");
        LinkedNode<String> node4 = new LinkedNode<>("Mittwoch");
        LinkedNode<String> node5 = new LinkedNode<>("Freitag");
        LinkedNode<String> node6 = new LinkedNode<>("Samstag");
        LinkedNode<String> node7 = new LinkedNode<>("Sonntag");

        head.setNext_(node1);
        node1.setNext_(node2);
        node2.setNext_(node3);
        node3.setNext_(node4);
        node4.setNext_(node5);
        node5.setNext_(node6);
        node6.setNext_(node7);

        node1.removeDuplicates();

        System.out.println("Liste nach dem Entfernen von Duplikaten: " + node1);
    }
}

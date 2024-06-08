package uebung3;

import aud.DList;

public class MyDList<T> extends DList<T> {
    //-----------------------------------------------------------------//
    public MyDList() {
        super();
    }

    //-----------------------------------------------------------------//

    public void append(MyDList<T> li) {
        if (li.empty()) {
            return;
        }

        // Create a temporary copy of the list in the case that the list is appended to itself
        MyDList<T> temp = new MyDList<>();
        for (T item : li) {
            temp.push_back(item);
        }

        for (T item : temp) {
            this.push_back(item);
        }
    }

    //-----------------------------------------------------------------//
    public void insert(int n, MyDList<T> li) {
        // TODO: insert `li` into `this` list at position `n`

        if (li.empty()) {
            return;
        }

        if (n > this.size() || n < 0) {
            throw new IndexOutOfBoundsException();
        }

        MyDList<T> temp = new MyDList<>();
        for (T item : li) {
            temp.push_back(item);
        }

        for (T item : temp) {
            this.insert(n, item);
            n++;
        }

    }

    //-----------------------------------------------------------------//
    public static void main(String[] args) {
        // TODO: test your code with appropriate examples

        MyDList<Integer> list1 = new MyDList<>();
        MyDList<Integer> list2 = new MyDList<>();

        list1.push_back(1);
        list1.push_back(2);
        list1.push_back(3);

        list2.push_back(4);
        list2.push_back(5);
        list2.push_back(6);

        list1.append(list1);

        System.out.println(list1);

        MyDList<Integer> list3 = new MyDList<>();

        list3.push_back(7);
        list3.push_back(8);
        list3.push_back(9);

        list1.insert(4, list1);

        System.out.println(list1);
    }
}

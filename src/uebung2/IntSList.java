package uebung2;

import aud.SList;
import java.util.function.Predicate;

// This class "wraps" an instance of `SList<Integer>` (attribute
// `li`): Calls to `toString()` and `push_front()` are "delegated" to
// the instance.
// The additional method `filter()` applies a predicate and constructs
// a new list with all items for which the predicate evaluates to `true`.
//
public class IntSList {
    // Store list of integers as an SList.
    SList<Integer> li;

    public IntSList() {
        // TODO: Constructor

        li = new SList<>();
    }

    // delegate to SList
    @Override
    public String toString() {
        return li.toString();
    }

    // delegate to SList
    public void push_front(int obj){
        li.push_front(obj);
    }

    // Filter list by predicate `p` and return list of all items for
    // which predicate evaluates to `true`.
    // The order of items in the returned list may differ from the order
    // in `this` list (because we use always `push_front()`).
    //
    public IntSList filter(Predicate<Integer> p){
        // TODO: implementation

        IntSList plist = new IntSList();

        for (int i = 0; i < this.li.size(); i++) {
            if(p.test(this.li.at(i))) {
                plist.push_front(this.li.at(i));
            }
        }
        return plist;
    }

    // You must provide a main() method!
    public static void main(String[] args) {
        // TODO: test

        IntSList numlist = new IntSList();
        Predicate<Integer> p = (Integer i) -> i % 2 == 0;
        Predicate<Integer> p2 = (Integer i) -> i >= 42;

        numlist.push_front(0);
        numlist.push_front(8);
        numlist.push_front(42);
        numlist.push_front(69);
        numlist.push_front(140);
        numlist.push_front(187);
        numlist.push_front(404);
        numlist.push_front(333);
        numlist.push_front(420);
        numlist.push_front(1312);
        numlist.push_front(1337);
        numlist.push_front(9000);

        System.out.println(numlist);

        System.out.println(numlist.filter(p).toString());
        System.out.println(numlist.filter(p2).toString());
    }
}

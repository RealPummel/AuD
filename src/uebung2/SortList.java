package uebung2;

import aud.SList;

public class SortList<T extends Comparable<T>> {

    SList<T> li;

    public SortList() {
        this.li = new SList<T>();
    }

    public boolean insert(T obj) {
        if (obj == null) {
            return false;
        }

        if (li.empty() || obj.compareTo(li.back()) >= 0) {
            li.push_back(obj);
            return true;
        }

        return false;
    }
}

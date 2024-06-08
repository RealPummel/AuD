package uebung9;

//-----------------------------------------------------------------//

/**
 * simple Hashtable with linear/quadratic probing
 * capacity is big enough
 */

public class HashLinQuad {
    //---------------------------------------------------------------//
    private int[] table_;    // array of buckets or slots
    private int size_;       // current number of elements
    private int capacity_;

    // TODO: Constructor

    public HashLinQuad(int capacity) {
        this.capacity_ = capacity;
        this.table_ = new int[capacity];
        this.size_ = 0;
    }

    //---------------------------------------------------------------//
    public int addLin(int obj) {
        // linear probing
        // return number of collisions

        int collisions = 0;
        int index = obj % this.capacity_;
        while (this.table_[index] != 0) {
            index = (index + 1) % this.capacity_;
            collisions++;
        }
        this.table_[index] = obj;
        this.size_++;
        return collisions;
    }

    //---------------------------------------------------------------//
    public int addQuad(int obj) {
        // quadratic probing
        // return number of collisions

        int collisions = 0;
        int index = obj % this.capacity_;
        int i = 1;
        while (this.table_[index] != 0) {
            index = (index + i * i) % this.capacity_;
            collisions++;
            i++;
        }
        this.table_[index] = obj;
        this.size_++;
        return collisions;
    }

    //---------------------------------------------------------------//
    public String toString() {
        // TODO: implementation

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.capacity_; i++) {
            sb.append(this.table_[i]);
            sb.append(" ");
        }
        return sb.toString();
    }

    //---------------------------------------------------------------//
    public static void main(String[] args) {
        // TODO: test with hashtable-capacity of 1249 and 1000 random values

        HashLinQuad hashLin = new HashLinQuad(1249);
        HashLinQuad hashLinQuad = new HashLinQuad(1249);
        int sumLin = 0;
        int sumQuad = 0;
        for (int i = 0; i < 1000; i++) {
            sumLin += hashLin.addLin((int) (Math.random() * 10000));
        }
        for (int i = 0; i < 1000; i++) {
            sumQuad += hashLinQuad.addQuad((int) (Math.random() * 10000));
        }
        System.out.println("Linear: " + sumLin);
        System.out.println("Quadratic: " + sumQuad);
    }
}

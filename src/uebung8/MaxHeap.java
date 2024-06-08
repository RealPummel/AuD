package uebung8;

import java.util.*;

//-----------------------------------------------------------------//
public class MaxHeap<T extends Comparable<T>> {
    //-----------------------------------------------------------------//
    //------------- !!Do not change the following lines!! -------------//
    public String toString() {
        return heap_.toString();  // don't change because of backend
    }

    //---------------------------------------------------------------//
    //--------------- !!Insert your solution below!! ----------------//
    private ArrayList<T> heap_;  // or Vector

    //---------------------------------------------------------------//

    public MaxHeap() {
        heap_ = new ArrayList<>();
    }

    public MaxHeap(T[] arr) {
        heap_ = new ArrayList<>();
        heap_.addAll(Arrays.asList(arr));
        buildHeap(heap_);
    }

    public static <T extends Comparable<T>> void buildHeap(ArrayList<T> heap) {
        int i = heap.size() / 2;
        while (i >= 0) {
            downHeap(heap, i);
            i--;
        }
    }

    public List<T> getHeap() {
        return heap_;
    }

    public int getSize() {
        return heap_.size();
    }

    public boolean isEmpty() {
        return heap_.isEmpty();
    }

    public static <T extends Comparable<T>> void downHeap(ArrayList<T> heap, int n) {
        T temp = heap.get(n);
        while (n < heap.size() / 2) {
            int element = 2 * n + 1;
            if (element < heap.size() - 1 && heap.get(element).compareTo(heap.get(element + 1)) < 0) {
                element += 1;
            }
            if (temp.compareTo(heap.get(element)) >= 0) break;
            heap.set(n, heap.get(element));
            n = element;
        }
        heap.set(n, temp);
    }

    public void insert(T obj) {
        heap_.add(obj);
        upHeap(heap_.size() - 1);
    }

    public void swapMax() {
        if (heap_.size() > 1) {

            T temp = heap_.get(0);

            heap_.set(0, heap_.get(heap_.size() - 1));
            heap_.set(heap_.size() - 1, temp);
            heap_.remove(heap_.size() - 1);
            downHeap(heap_, 0);
        } else {
            heap_.remove(0);
        }
    }

    private void upHeap(int n) {
        T temp = heap_.get(n);
        while (n > 0 && temp.compareTo(heap_.get((n - 1) / 2)) > 0) {
            heap_.set(n, heap_.get((n - 1) / 2));
            n = (n - 1) / 2;
        }
        heap_.set(n, temp);
    }

    public static void main(String[] args) {

        MaxHeap<Integer> heap = new MaxHeap<>();
        heap.insert(1);
        heap.insert(2);
        heap.insert(3);
        heap.insert(4);
        heap.insert(5);
        heap.insert(6);
        heap.insert(7);

        Integer[] arr = {4, 5, 9, 23, 36, 2, 9};
        MaxHeap<Integer> heap2 = new MaxHeap<>(arr);

        System.out.println(heap.getHeap());
        System.out.println(heap.getSize());
        System.out.println(heap.isEmpty());
        System.out.println();
        System.out.println(heap2.getHeap());
        System.out.println(heap2.getSize());
        heap.swapMax();
        System.out.println(heap);
    }
}

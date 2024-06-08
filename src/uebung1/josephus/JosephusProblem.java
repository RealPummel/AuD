package uebung1.josephus;

public class JosephusProblem {

  // Solve the Josephus problem for a list of persons and a number k
  // of persons to be skipped. The solution should "simulate" the
  // counting-out and return a queue that contains all persons in the
  // order they were counted out.
  //
  public static Queue<String> solve(String[] persons, int k) {
    // TODO: implementation
    Queue<String> queue = new Queue<>();
    int length = persons.length;

    //add all persons to the queue

    for (int i = 0; i < length; i++) {
      queue.enqueue(persons[i]);
    }

    Queue<String> result = new Queue<>();


    // dequeue every k-th person and add them to the result queue until the queue is empty
    // take the k-th person and add them to the queue at the end and dequeue them from the beginning of the queue
    // add the first person of the queue to the result queue and dequeue them from the queue
    while (!queue.is_empty()) {
      for (int i = 0; i < k - 1; i++) {
        queue.enqueue(queue.dequeue());
      }
      result.enqueue(queue.dequeue());
    }

    return result;
  }

  public static void main(String[] args) {
    // TODO: test
    String[] persons = {
            "Euclid", // 1
            "Archimedes", // 2
            "Newton", // 3
            "Gauss", // 4
            "Euler", // 5
            "Josephus", // 6
            "Pythagoras", // 7
            "Lagrange", // 8
            "Hilbert", // 9
            "Leibniz", // 10
            "Laplace", // 11
            "Cantor", // 12
            "Wiles" // 13
    };
    System.out.println(solve(persons, 7));
  }
}

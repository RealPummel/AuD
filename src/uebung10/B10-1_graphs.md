1. Was ist ein Graph?

Ein Graph ist ein Konstrukt das aus Knoten und Kanten besteht. Die Knoten repräsentieren die Objekte, während die Kanten die Beziehungen zwischen den Objekten darstellen. Ein Graph kann gerichtet oder ungerichtet sein, je nachdem, ob die Kanten eine Richtung haben oder nicht.
Auch kann ein Graph gewichtet sein, d.h. die Kanten haben ein Gewicht, das die z.B. Stärke der Beziehung zwischen den Knoten angibt.

2. <img src="https://imgur.com/a/p1xi43q" alt="Graph" width="300"/>

3. Graph

Kantenliste:
[(1, 2), (1, 3), (1, 4), (1, 5), (2, 4), (2, 5), (3, 4), (4, 5)]

Knotenliste(LinkedList):
- 1 -> 2, 3, 4, 5
- 2 -> 1, 4, 5
- 3 -> 1, 4
- 4 -> 1, 2, 3, 5
- 5 -> 1, 2, 4

Adjazenzmatrix (2D-Array):
````
   1 2 3 4 5
1 [0 1 1 1 1]
2 [1 0 0 1 1]
3 [1 0 0 1 0]
4 [1 1 1 0 1]
5 [1 1 0 1 0]
````

Adjazenzliste(LinkedList):
1 -> 2, 3, 4, 5
2 -> 1, 4, 5
3 -> 1, 4
4 -> 1, 2, 3, 5
5 -> 1, 2, 4

Gib die Algorithmen (in Java) an, die die Überführung
einer Kantenliste in eine Adjazenzmatrix,
eine Kantenliste in eine Adjazenzliste
realisieren. Wie hoch ist jeweils der Aufwand in O-Notation?

Antwort:

1. Kantenliste in Adjazenzmatrix:
```java
public static int[][] edgeListToAdjMatrix(int[][] edgeList, int numVertices) {
    int[][] adjMatrix = new int[numVertices][numVertices];

    for (int[] edge : edgeList) {
        int i = edge[0];
        int j = edge[1];
        adjMatrix[i][j] = 1;
        adjMatrix[j][i] = 1;
    }
    return adjMatrix;
}
```
Der Aufwand beträgt O(n), wobei n die Anzahl der Kanten ist.

2. Kantenliste in Adjazenzliste:
```java
public static LinkedList<Integer>[] edgeListToAdjList(int[][] edgeList, int numVertices) {
    LinkedList<Integer>[] adjList = new LinkedList[numVertices];

    for (int i = 0; i < numVertices; i++) {
        adjList[i] = new LinkedList<>();
    }

    for (int[] edge : edgeList) {
        int i = edge[0];
        int j = edge[1];
        adjList[i].add(j);
        adjList[j].add(i);
    }
    return adjList;
}
```

Der Aufwand beträgt O(n), wobei n die Anzahl der Kanten ist.





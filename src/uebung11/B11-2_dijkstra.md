Bei dem Dijkstra-Algorithmus sucht man den kürzesten Weg von einem Startknoten zu allen anderen Knoten in einem Graphen, indem man
die Distanz zu allen Knoten auf unendlich setzt und dann die Distanz zu den Nachbarn des Startknotens auf die Länge der Kante setzt.
Man markiert den Startknoten als besucht und sucht den Knoten mit der kleinsten Distanz zu den Nachbarn des Startknotens.
Die Distanz zu den Nachbarn der Nachbarn wird dann auf die Länge der Kante plus der Distanz zum Startknoten gesetzt, wenn diese kleiner
ist als die bisherige Distanz. Dies wird solange wiederholt, bis alle Knoten besucht wurden.

0
0->1 (2)
0->3 (3)
0->3->2 (4)
0->2 (5) > 0->3->2 (4)
0->1->5 (6)
0->3->5 (9) > 0->1->5 (6)
0->3->2->4 (11)
0->2->4 (12) > 0->3->2->4 (11)
0->2->5 (13) > 0->1->5 (6)
0->2->4->5 (14) > 0->1->5 (6)

Kürzester Weg für alle Knoten von 0 aus
0: 0
1: 0->1 (2)
2: 0->3->2 (4)
3: 0->3 (3)
4: 0->3->2->4 (11)
5: 0->1->5 (6)

https://imgur.com/a/WUNf6Ss
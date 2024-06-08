Minheap
---
Ein Heap ist eine Struktur zum Speichern von Daten, welche die Eigenschaften eines Baumes erfüllt. Ein MinHeap ist ein vollständiger Binärbaum, bei dem die Werte der Elternknoten kleiner sind als die Werte der Kindknoten. Ein Heap kann als Array dargestellt werden, wobei die Indizes der Elemente die Positionen im Baum repräsentieren.

### Eigenschaften:
- Ein Heap ist ein vollständiger Binärbaum
- Die Werte der Elternknoten sind kleiner als die Werte der Kindknoten

```Beispiel
      10
     /  \
   20    100
  /  \
30    40

Index:  0   1   2   3   4
Wert:  [10, 20, 100, 30, 40]
```

Das größte Element eines Minheap befindet sich mit großer Wahrscheinlichkeit in den unteren Ebenen des Baumes, man kann jedoch nicht genau bestimmen, wo es sich befindet.

Ein Feld das in aufsteigend sortierter Reihenfolge sortiert ist, ist ein MinHeap. Der kleinste Wert befindet sich an der Wurzel des Baumes.


### Operationen:
5 und 19 tauschen
5 und 1 tauschen

O(log n) schlechtester Fall
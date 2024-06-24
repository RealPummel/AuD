### Tiefensuche

Bei der Tiefensuche im Graph wählt man einen Startknoten z.B. die 8 bei unserem Beispiel.
Von diesem aus geht man dann zum nächsten Nachbarknoten, der noch nicht besucht wurde. Bei mehreren Nachbarn kann man z.B. immer den Knoten mit der kleinsten Nummer wählen.
Das wäre bei uns die 1. Von der 1 aus geht es dann weiter zum nächsten Nachbarn, der noch nicht besucht wurde. Das wäre die 2. Von der 2 aus gibt es keine weiteren Nachbarn, die noch nicht besucht wurden.
Bei solch einem Fall geht man zurück zum Knoten zuvor und schaut, ob es noch weitere Nachbarn gibt, die noch nicht besucht wurden. Das wäre bei uns die 3. Von der 3 aus gibt es keine weiteren Nachbarn, die noch nicht besucht wurden.
Dies wiederholt man bis es keine weiteren Knoten gibt, die noch nicht besucht wurden.

8 -> 1 -> 2 -> 3 -> 6 -> 4 -> 5 -> 7

### Breitensuche

8 -> | 1 -> 2 -> 3 -> 5 | -> 7 -> 6 -> 4
          1-Kante           2-Kanten

Bei der Breitensuche im Graph wählt man einen Startknoten z.B. die 8 bei unserem Beispiel.
Von diesem aus markiert man alle Nachbarn, die noch nicht besucht wurden. Das wäre bei uns die 1, 2 und 3 und 5.
Von diesen Nachbarn geht man dann zum nächsten Nachbarn und markiert diese.
Dies wiederholt man bis es keine unmakierten Knoten mehr gibt.
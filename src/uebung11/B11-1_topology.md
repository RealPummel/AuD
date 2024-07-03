Man markiert Quellen und Senken in einem Graph. Dabei sind Quellen
Einträge welche keine eingehenden Kanten haben und Senken Einträge
welche keine ausgehenden Kanten haben. 

Man kann topologisch sortieren, indem man eine Quelle und alle ihre
ausgehenden Kanten entfernt und dann ausgibt. Dies wiederholt sich wieder,
da neue Quellen entstehen. Aussnahmen sind Zyklen, da diese nicht
topologisch sortiert werden können.

In die Stadt fahren -> Spülmittel Kaufen -> Mathebuch aus der Bibliothek holen
-> Cola kaufen -> Aus der Stadt zurückkommen -> Schuhe putzen -> Abwaschen
-> Müll rausbringen -> Computer aufbauen -> AuD-Übung vorbereiten -> AuD-Aufgaben bearbeiten
-> Computer am Netz anschließen -> Mathehausaufgaben machen -> Internet-Rechereche nach Musik
-> Partymusik bei Spotify / iTunes zusammenstellen -> Friend/Freundin vom Bahnhof abholen

B.

Bei Rock-Paper-Scissors-Lizard-Spock müsste man 3 Kanten entfernen, um
eine topologische Sortierung zu erhalten. Es kommt sonst zu einem Zyklus.

Die kannten die man entfernen muss sind:
- vom beliebigen Startknoten beide eingehenden Kanten
- nach dem löschen des Startknotens außerdem bei der nächstmögliche Quelle eine eingehende Kante

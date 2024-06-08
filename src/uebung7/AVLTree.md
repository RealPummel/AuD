### 1. AVL Bäume
````
1. AVL Bäume sind Bäume bei welchen der Betrag der Höhen zwischen den 
linken und rechten Teilbäumen nie größer als 1 ist.
Es ist erforderlich binäre Bäume so auszugleichen um die Effizienz von ihnen
aufrecht zu erhalten (O(log n)) und diese nicht zu Listen entarten zu lassen (O(n)).
````

### 2. AVL Bäume - Algorithmus
````
14, 15, 17, 7, 5, 10, 16
````
````
14
  \
   15
     \
      17
````
````
Rechtsüberhang = Linksrotation:
     15 
    /  \
   14   17
````
````   
         15 
        /  \
       14   17
      /
     7
    /
   5
````
````
Linksüberhang = Rechtsrotation:
         15 
        /  \
       7   17
      / \
     5  14
````
````
         15 
        /  \
       7   17
      / \
     5  14
        /
       10
````
````
Links-Rechtsüberhang = Links-Rechtsrotation:
         15 
        /  \
       14   17
      / \
     7  5
        /
       10
````
````
      14
     /  \
    7    15
   / \     \
  5  10    17
````
````
        14
     /     \
    7      16
   / \     / \
  5  10   15   17
             
````
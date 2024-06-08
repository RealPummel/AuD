input: rechenaufgabe
Polnische Notation mithilfe von Stack darstellen
====================================== <br>
input: Rechenaufgabe in infix Notation
Pseudocode:
``` plaintext
1. Erstelle einen Stack
2. Iteriere über die Rechenaufgabe von links nach rechts und füge die Zahlen in den Stack ein
3. Iteriere über die Rechenaufgabe von links nach rechts wenn ein Operator gefunden wird, entferne die obersten zwei Zahlen aus dem Stack und führe die Operation durch
4. Fahre fort bis alle Operatoren durchgegangen sind
5. Das Ergebnis ist die polnische Notation
```
output: Rechenaufgabe in polnischer Notation

3+4*5/6

```plaintext
+ 3 / * 4 5 6
```
```plaintext

3-4*6 = 21

3*4-6 = 6


3 4 6   - *

6 4 * 3 -

3 4 6    * -
6 4 - 3 *

6 4 -

splate(rm(a)) = spalte(b)

b = (rm(a))

Older(father(father(max), Peter)

father(max) = father(laura)
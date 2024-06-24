Menge M = {12, 44, 13, 88, 23, 94, 11, 39, 20, 16, 5}

h(i) = (2i + 5) mod 11

Verkettung der Überläufer:

h(12) = 29 mod 11 = 7
h(44) = 93 mod 11 = 5
h(13) = 31 mod 11 = 9
h(88) = 181 mod 11 = 4
h(23) = 51 mod 11 = 7
h(94) = 193 mod 11 = 6
h(11) = 27 mod 11 = 5
h(39) = 83 mod 11 = 7
h(20) = 45 mod 11 = 1
h(16) = 37 mod 11 = 4
h(5) = 15 mod 11 = 4

45
88 -> 16 -> 5
44 -> 11
94
12 -> 23 -> 39

Lineares Sondieren:

h(i) = (2i + 5) mod 11

h(12) = 29 mod 11 = 7
h(44) = 93 mod 11 = 5
h(13) = 31 mod 11 = 9
h(88) = 181 mod 11 = 4
h(23) = 51 mod 11 = 7 -> 8
h(94) = 193 mod 11 = 6
h(11) = 27 mod 11 = 5 -> 6 -> 7 -> 8 -> 9 -> 10
h(39) = 83 mod 11 = 7 -> 8 -> 9 -> 10 -> 0
h(20) = 45 mod 11 = 1
h(16) = 37 mod 11 = 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10 -> 0 -> 1 -> 2
h(5) = 15 mod 11 = 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10 -> 0 -> 1 -> 2 -> 3

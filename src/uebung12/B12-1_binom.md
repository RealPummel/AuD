````
binomial := 2D Array of size n+1 x k+1
for i in 0..n:
    for j in 0..min(i, k):
        if j == 0 or j == i:
            binomial[i][j] = 1
        else:
            binomial[i][j] = binomial[i-1][j-1] + binomial[i-1][j]
return binomial[n][k]
````

Komplexität: O(n*k), da innere Schleife von 0 bis min(i, k) und äußere Schleife von 0 bis n geht.

binomial(7, 5)
````
binomial[0][0] = 1
binomial[1][0] = 1 binomial[1][1] = 1
binomial[2][0] = 1 binomial[2][1] = 2 binomial[2][2] = 1
binomial[3][0] = 1 binomial[3][1] = 3 binomial[3][2] = 3 binomial[3][3] = 1
binomial[4][0] = 1 binomial[4][1] = 4 binomial[4][2] = 6 binomial[4][3] = 4 binomial[4][4] = 1
binomial[5][0] = 1 binomial[5][1] = 5 binomial[5][2] = 10 binomial[5][3] = 10 binomial[5][4] = 5 binomial[5][5] = 1
binomial[6][0] = 1 binomial[6][1] = 6 binomial[6][2] = 15 binomial[6][3] = 20 binomial[6][4] = 15 binomial[6][5] = 6 binomial[6][6] = 1
binomial[7][0] = 1 binomial[7][1] = 7 binomial[7][2] = 21 binomial[7][3] = 35 binomial[7][4] = 35 binomial[7][5] = 21 binomial[7][6] = 7 binomial[7][7] = 1

binomial[7][5] = 21
````

Man könnte die Rechenschritte reduzieren, indem man anstatt einer 2D-Array nur zwei 1D-Arrays benutzt.
Es wird nur das aktuelle und das vorherige Array benötigt, da die Werte nur von den vorherigen Werten abhängen.


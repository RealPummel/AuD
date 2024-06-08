5 * 4 + 3 + 2

<expression> ::= <sum>
<sum> ::= <sum> "+" <product> | <product> | <product> "-" <sum>
<product> ::= <factor> "*" <product> | <factor> | <factor> "/" <product>
<factor> ::= <number> | <symbom> | "-" <factor> | "+" <factor> | "(" <expression> ")"

1. Zeige an verschiedenen Beispielen wie arithmetische Ausdrücke anhand dieser BNF abgearbeitet werden können.

5 * 4
expression = sum
sum = product
product = factor * product
factor = number
number = 5
product = 5 * product
product = 5 * factor
factor = number
number = 4
product = 5 * 4

2. Was ist falsch an dieser BNF? Wie kann man sie beheben?

- Rechtsassoziativität von + und - ist nicht gegeben

<expression> ::= <sum>
<sum> ::= <sum> "+" <product> | <sum> "-" <product> | <product>
<product> ::= <product> "*" <factor> | <product> "/" <factor> | <factor>
<factor> ::= <number> | <symbol> | "-" <factor> | "+" <factor> | "(" <expression> ")"





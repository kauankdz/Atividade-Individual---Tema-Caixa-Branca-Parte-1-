# Atividade-Individual---Tema-Caixa-Branca-Parte-1-
AS406TSN1 - UX/UI e Testes de Software


O código foi devidamente documentado?
Não. Não há comentários nem explicações dentro do codigo e nem das classes/métodos/variáveis.

As variáveis e constantes possuem nomenclatura?
Parcialmente mas mesmo assim e dificil de entendimento, nomenclatura existe, mas não segue convenções e boas práticas.

Existem legibilidade e organização no código?
Com o código curto acaba sendo um pouco legivel, mas nao está organizado estruturadamente .

Todos os NullPointers foram tratados?
O objeto conn pode vir nulo e o código usa ele direto sem verificar. Isso pode causar erro. Precisa checar conn !=null antes de criar o statement.

As conexões utilizadas foram fechadas?
Não. Connection, Statement e ResultSet não são fechados.

---------------------------------------------------------------------------------------------------------------------------------------------------------------
Caminhos Básicos

Eu identifiquei 4 caminhos básicos possíveis:

Caminho 1: conexão funciona → SQL executa → rs.next() = falso → retorna false

Caminho 2: conexão funciona → SQL executa → rs.next() = verdadeiro → retorna true

Caminho 3: conexão falha → conn = null → cai no catch → retorna false

Caminho 4: SQL executa mas dá erro → cai no catch → retorna false

---------------------------------------------------------------------------------------------------------------------------------------------------------------
COMPLEXIDADE CICLOMÁTICA;
M = E – N + 2
decisões (if, try/catch) + 1

No código tem:

1 condição (if (rs.next()))

1 try/catch ( caminho alternativo)

Então:

M = 2 + 1
M = 3

Complexidade Ciclomática = 3

--------------------------------------------------------------------------------------------------------------------------------------------------------------

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

# 03 - Condicionais

As estruturas condicionais permitem que o programa tome decisões durante sua execução, verificando se uma determinada condição é verdadeira ou falsa.

## 📚 Resumo

**Estrutura `if`:** utilizada quando queremos executar um determinado bloco de código somente se uma condição for verdadeira.

**Estrutura `else`:** utilizada para executar outro bloco de código quando a condição do `if` for falsa.

**Estrutura `else if`:** permite verificar várias condições diferentes em sequência.

**Operadores relacionais:** são utilizados para comparar valores, como:
- `>` → maior que
- `<` → menor que
- `>=` → maior ou igual
- `<=` → menor ou igual
- `==` → igual
- `!=` → diferente

**Operadores lógicos:** permitem combinar condições:
- `&&` → E
- `||` → OU
- `!` → NÃO

**Operador ternário:** é uma forma mais curta de realizar uma decisão simples, utilizando uma condição seguida de duas possibilidades de resultado.

Exemplo:

```java
String resultado = idade >= 18 ? "Maior de idade" : "Menor de idade";
